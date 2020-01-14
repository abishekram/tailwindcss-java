package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class JustifyContent implements IPlugin {
    String cssObject = "{\n" +
            "        '.justify-start': {\n" +
            "          'justify-content': 'flex-start',\n" +
            "        },\n" +
            "        '.justify-end': {\n" +
            "          'justify-content': 'flex-end',\n" +
            "        },\n" +
            "        '.justify-center': {\n" +
            "          'justify-content': 'center',\n" +
            "        },\n" +
            "        '.justify-between': {\n" +
            "          'justify-content': 'space-between',\n" +
            "        },\n" +
            "        '.justify-around': {\n" +
            "          'justify-content': 'space-around',\n" +
            "        },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
