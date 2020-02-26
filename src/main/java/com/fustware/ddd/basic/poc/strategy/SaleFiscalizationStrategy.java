package com.fustware.ddd.basic.poc.strategy;

import com.fustware.ddd.basic.poc.domain.SaleFiscalizationData;

public class SaleFiscalizationStrategy implements FiscalizationStrategy<SaleFiscalizationData> {

    @Override
    public void fiscalize(SaleFiscalizationData data) {
        setUp(data, "EUR");
    }

    private void setUp(SaleFiscalizationData data, String currency) {
        data.getItemList().forEach( item -> item.setCurrency(currency));
    }
}
