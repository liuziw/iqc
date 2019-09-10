package com.iqc.common.dao.dto;


import com.iqc.common.dao.enums.QueryTypeEnum2;

public class EqualsQueryItemDTO extends QueryItemDTO {
    public EqualsQueryItemDTO(String fieldName, Object value) {
        super(fieldName, QueryTypeEnum2.EQUAL_TO, value);
    }
}
