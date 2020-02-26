package com.fustware.ddd.basic.poc.domain.common;

import lombok.Data;

@Data
public class Item {

    private Long itemId;

    private Amount amount;

    private String currency;
}
