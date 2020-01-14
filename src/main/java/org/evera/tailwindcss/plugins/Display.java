package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class Display implements IPlugin {
    String cssObject = "{\n" +
            "        '.block': {\n" +
            "          display: 'block',\n" +
            "        },\n" +
            "        '.inline-block': {\n" +
            "          display: 'inline-block',\n" +
            "        },\n" +
            "        '.inline': {\n" +
            "          display: 'inline',\n" +
            "        },\n" +
            "        '.flex': {\n" +
            "          display: 'flex',\n" +
            "        },\n" +
            "        '.inline-flex': {\n" +
            "          display: 'inline-flex',\n" +
            "        },\n" +
            "        '.table': {\n" +
            "          display: 'table',\n" +
            "        },\n" +
            "        '.table-row': {\n" +
            "          display: 'table-row',\n" +
            "        },\n" +
            "        '.table-cell': {\n" +
            "          display: 'table-cell',\n" +
            "        },\n" +
            "        '.hidden': {\n" +
            "          display: 'none',\n" +
            "        },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
