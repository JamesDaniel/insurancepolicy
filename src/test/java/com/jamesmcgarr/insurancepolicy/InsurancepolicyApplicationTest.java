package com.jamesmcgarr.insurancepolicy;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;

public class InsurancepolicyApplicationTest {

    @Test
    public void testMain() {
        try (MockedStatic<SpringApplication> springApplication = Mockito.mockStatic(SpringApplication.class)) {
            springApplication.when(() -> SpringApplication.run(InsurancepolicyApplication.class, new String[]{})).thenReturn(null);

            InsurancepolicyApplication.main(new String[]{});
        }

    }
}
