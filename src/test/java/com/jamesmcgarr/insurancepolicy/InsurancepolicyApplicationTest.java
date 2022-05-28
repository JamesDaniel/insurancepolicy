package com.jamesmcgarr.insurancepolicy;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsurancepolicyApplicationTest {

    @Test
    public void testMain() {
        try (MockedStatic<SpringApplication> springApplication = Mockito.mockStatic(SpringApplication.class)) {
            springApplication.when(() -> SpringApplication.run(InsurancepolicyApplication.class)).thenReturn(null);

            InsurancepolicyApplication.main(new String[]{});
        }

    }
}
