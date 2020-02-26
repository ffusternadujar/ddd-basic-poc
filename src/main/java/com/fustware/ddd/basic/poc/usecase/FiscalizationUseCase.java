package com.fustware.ddd.basic.poc.usecase;

import com.fustware.ddd.basic.poc.ddd.UseCase;

public interface FiscalizationUseCase extends UseCase<SaleFiscalizationRequest, SaleFiscalizationResponse> {

    void execute(SaleFiscalizationRequest request, SaleFiscalizationResponse response);
}
