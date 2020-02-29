package com.fustware.ddd.basic.poc.usecase.fiscalization.impl;

import com.fustware.ddd.basic.poc.usecase.fiscalization.SaleFiscalizationRequest;
import com.fustware.ddd.basic.poc.usecase.fiscalization.SaleFiscalizationResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FiscalizationUseCaseImplTest {

    @Autowired
    private FiscalizationUseCaseImpl useCase;

    @Test
    public void retryExampleWithRecoveryTest() {
        SaleFiscalizationRequest request = new SaleFiscalizationRequest();
        request.setStatus("error");
        SaleFiscalizationResponse response = new SaleFiscalizationResponse();
        useCase.execute(request, response);

        Assertions.assertEquals("NOT_APPPLY", response.getFiscalizationNumber());
    }
}
