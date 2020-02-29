package com.fustware.ddd.basic.poc.usecase.fiscalization;

import com.fustware.ddd.basic.poc.ddd.Response;
import lombok.Data;

@Data
public class SaleFiscalizationResponse implements Response {

    private String fiscalizationNumber;
}
