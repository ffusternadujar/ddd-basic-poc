package com.fustware.ddd.basic.poc.usecase.fiscalization;

import com.fustware.ddd.basic.poc.ddd.Request;
import lombok.Data;

@Data
public class SaleFiscalizationRequest implements Request {

    private String status;
}
