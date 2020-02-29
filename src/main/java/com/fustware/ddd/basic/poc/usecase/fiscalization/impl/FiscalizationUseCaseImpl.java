package com.fustware.ddd.basic.poc.usecase.fiscalization.impl;

import com.fustware.ddd.basic.poc.usecase.fiscalization.FiscalizationUseCase;
import com.fustware.ddd.basic.poc.usecase.fiscalization.SaleFiscalizationRequest;
import com.fustware.ddd.basic.poc.usecase.fiscalization.SaleFiscalizationResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FiscalizationUseCaseImpl implements FiscalizationUseCase {

    private static Logger LOGGER = LoggerFactory.getLogger(FiscalizationUseCaseImpl.class);

    @Override
    @Retryable(value = {RuntimeException.class}, maxAttempts = 4, backoff = @Backoff(1000))
    public void execute(SaleFiscalizationRequest request, SaleFiscalizationResponse response) {
        LOGGER.info("Retry retryTemplateExample {}", LocalDateTime.now().toString());
        if ("error".equals(request.getStatus())) {
            throw new RuntimeException("Error in fiscalization ");
        } else {
            response.setFiscalizationNumber("fisc-0001");
        }
    }

    @Recover
    private void recovery(RuntimeException e, SaleFiscalizationRequest request, SaleFiscalizationResponse response) {
        LOGGER.info("Retry Recovery - {}", e.getMessage());
        response.setFiscalizationNumber("NOT_APPPLY");
    }
}
