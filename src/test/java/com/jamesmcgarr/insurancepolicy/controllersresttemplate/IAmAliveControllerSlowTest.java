package com.jamesmcgarr.insurancepolicy.controllersresttemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IAmAliveControllerSlowTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String postIAmAlive(String username) throws JSONException {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", username);
        HttpEntity<String> request = new HttpEntity<>(jsonObject.toString(), httpHeaders);
        return restTemplate.postForObject("http://localhost:" + port + "/api/v1/iamalive", request, String.class);
    }

    private String getStatusUsername(String username) {
        return restTemplate.getForObject("http://localhost:" + port + "/api/v1/status/"+ username, String.class);
    }

    @Test
    public void testCreateAliveEvent() throws Exception {
        String resultAsJsonStr = postIAmAlive("peter");

        assertNull(resultAsJsonStr);
    }

    @Test
    public void testGetAliveEvent_noEvents() throws Exception {
        String resultAsJsonStr = getStatusUsername("john");
        JsonNode root = objectMapper.readTree(resultAsJsonStr);

        assertNotNull(resultAsJsonStr);
        assertNotNull(root);
        assertEquals("Not Found", root.path("error").asText());
        assertEquals("404", root.path("status").asText());
    }

    @Test
    public void testGetAliveEvent_oneEvent() throws Exception {
        postIAmAlive("doe");

        String resultAsJsonStr = getStatusUsername("doe");
        JsonNode root = objectMapper.readTree(resultAsJsonStr);

        assertNotNull(resultAsJsonStr);
        assertNotNull(root);
        assertEquals("1", root.path("id").asText());
        assertEquals("doe", root.path("username").asText());
    }
}
