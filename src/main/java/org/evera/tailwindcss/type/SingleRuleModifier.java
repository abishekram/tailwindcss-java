package org.evera.tailwindcss.type;

public abstract class SingleRuleModifier {
    private String cssKey = "";
    private String themeKey = "";
    private String cssFormat = "";

    public SingleRuleModifier(String cssKey, String themeKey, String cssFormat) {
        this.cssKey = cssKey;
        this.themeKey = themeKey;
        this.cssFormat = cssFormat;
    }

    public SingleRuleModifier() {
    }
}
