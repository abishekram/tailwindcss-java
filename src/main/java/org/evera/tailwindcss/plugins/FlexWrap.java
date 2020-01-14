package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class FlexWrap implements IPlugin {
    String cssObject = "{\n" +
            "        '.flex-wrap': {\n" +
            "          'flex-wrap': 'wrap',\n" +
            "        },\n" +
            "        '.flex-wrap-reverse': {\n" +
            "          'flex-wrap': 'wrap-reverse',\n" +
            "        },\n" +
            "        '.flex-no-wrap': {\n" +
            "          'flex-wrap': 'nowrap',\n" +
            "        },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
