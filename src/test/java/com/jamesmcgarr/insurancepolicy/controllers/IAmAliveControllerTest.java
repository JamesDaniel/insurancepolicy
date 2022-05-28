package com.jamesmcgarr.insurancepolicy.controllers;

import com.jamesmcgarr.insurancepolicy.entity.AliveEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class IAmAliveControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testNoStatusForUserFound() throws Exception {
        this.mockMvc.perform(get("/api/v1/status/johndoe")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("")));
    }

    @Test
    public void testCreateAliveEventForUser() throws Exception {
        this.mockMvc.perform(post("/api/v1/iamalive")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"username\": \"johndoe\"}")
                        .characterEncoding("utf-8"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("")));
    }
}
