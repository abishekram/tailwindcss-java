package org.evera.tailwindcss;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class CssUtilityParser {

    static ObjectMapper mapper = new ObjectMapper();
    static TypeReference<Map<String, Map<String, String>>> typeRef
            = new TypeReference<Map<String, Map<String, String>>>() {
    };

    static {
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        mapper.configure(JsonReadFeature.ALLOW_TRAILING_COMMA.mappedFeature(), true);
    }

    public static Map<String, Map<String, String>> parse(String json) throws IOException {
        return mapper.readValue(json, typeRef);
    }
}
