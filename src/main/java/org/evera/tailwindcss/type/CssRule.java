package org.evera.tailwindcss.type;

import java.util.HashMap;
import java.util.Map;

public class CssRule {

    Map<String, String> rules;

    public CssRule(String cssKey, String cssValue) {
        rules = Map.of(cssKey, cssValue);
    }

    public CssRule() {
        rules = new HashMap<>();
    }


    public void addNewRule(String key, String value) {
        rules.put(key, value);
    }

    public void setRules(Map<String, String> rules) {
        this.rules = rules;
    }
}
