package com.fustware.ddd.basic.poc.domain;

import com.fustware.ddd.basic.poc.domain.common.Item;
import lombok.Data;

import java.util.List;

@Data
public class SaleFiscalizationData extends FiscalizationData {

    private Long orderId;

    private Long taxName;

    private String currency;

    private List<Item> itemList;
}
