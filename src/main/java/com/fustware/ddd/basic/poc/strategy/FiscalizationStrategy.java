package com.fustware.ddd.basic.poc.strategy;

import com.fustware.ddd.basic.poc.domain.FiscalizationData;

public interface FiscalizationStrategy<T extends FiscalizationData> {

    void fiscalize(T data);
}
