package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonParser {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static Company parseCompanyJson(String json) throws IOException {
        return mapper.readValue(json, Company.class);
    }
}