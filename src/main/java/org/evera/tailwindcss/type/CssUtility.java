package org.evera.tailwindcss.type;

public class CssUtility {
    private String functionName;
    private CssRule cssRule;

    public CssUtility(String functionName, CssRule cssRule) {
        this.functionName = functionName;
        this.cssRule = cssRule;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public CssRule getCssRule() {
        return cssRule;
    }

    public void setCssRule(CssRule cssRule) {
        this.cssRule = cssRule;
    }
}
