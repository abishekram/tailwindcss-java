package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class FlexDirection implements IPlugin {

    public String cssObject = "{\n" +
            "        '.flex-row': {\n" +
            "          'flex-direction': 'row',\n" +
            "        },\n" +
            "        '.flex-row-reverse': {\n" +
            "          'flex-direction': 'row-reverse',\n" +
            "        },\n" +
            "        '.flex-col': {\n" +
            "          'flex-direction': 'column',\n" +
            "        },\n" +
            "        '.flex-col-reverse': {\n" +
            "          'flex-direction': 'column-reverse',\n" +
            "        },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
