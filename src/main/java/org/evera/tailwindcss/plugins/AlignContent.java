package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class AlignContent implements IPlugin {
    String alignCss = "{\n" +
            "        '.content-center': {\n" +
            "          'align-content': 'center',\n" +
            "        },\n" +
            "        '.content-start': {\n" +
            "          'align-content': 'flex-start',\n" +
            "        },\n" +
            "        '.content-end': {\n" +
            "          'align-content': 'flex-end',\n" +
            "        },\n" +
            "        '.content-between': {\n" +
            "          'align-content': 'space-between',\n" +
            "        },\n" +
            "        '.content-around': {\n" +
            "          'align-content': 'space-around',\n" +
            "        },\n" +
            "      },\n" +
            "      variants('alignContent')\n" +
            "    )\n" +
            "  }";


    public void applyPlugin() {

    }
}
