package com.dafabet.automation.requests;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DefaultDataTableCellTransformer;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import io.cucumber.java.DefaultParameterTransformer;

import java.lang.reflect.Type;

public class TransfomerConfig {
    private final ObjectMapper objectMapper= new ObjectMapper();

    @DefaultParameterTransformer
    @DefaultDataTableCellTransformer
    @DefaultDataTableEntryTransformer
    public Object transformer(Object fromValue, Type toValueType)
    {
        return objectMapper.convertValue(fromValue,objectMapper.constructType(toValueType));
    }
}
