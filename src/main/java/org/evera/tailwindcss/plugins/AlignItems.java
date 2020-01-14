package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class AlignItems implements IPlugin {
    String alignItemCss = "   {\n" +
            "        '.items-start': {\n" +
            "          'align-items': 'flex-start',\n" +
            "        },\n" +
            "        '.items-end': {\n" +
            "          'align-items': 'flex-end',\n" +
            "        },\n" +
            "        '.items-center': {\n" +
            "          'align-items': 'center',\n" +
            "        },\n" +
            "        '.items-baseline': {\n" +
            "          'align-items': 'baseline',\n" +
            "        },\n" +
            "        '.items-stretch': {\n" +
            "          'align-items': 'stretch',\n" +
            "        },\n" +
            "      }";

    public void applyPlugin() {
    }
}
