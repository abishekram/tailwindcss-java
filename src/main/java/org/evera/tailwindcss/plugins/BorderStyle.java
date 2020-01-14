package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class BorderStyle implements IPlugin {

    String cssObject = "{\n" +
            "        '.border-solid': {\n" +
            "          'border-style': 'solid',\n" +
            "        },\n" +
            "        '.border-dashed': {\n" +
            "          'border-style': 'dashed',\n" +
            "        },\n" +
            "        '.border-dotted': {\n" +
            "          'border-style': 'dotted',\n" +
            "        },\n" +
            "        '.border-double': {\n" +
            "          'border-style': 'double',\n" +
            "        },\n" +
            "        '.border-none': {\n" +
            "          'border-style': 'none',\n" +
            "        },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
