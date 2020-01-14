package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class FontSmoothing implements IPlugin {

    String cssObject = "{\n" +
            "        '.antialiased': {\n" +
            "          '-webkit-font-smoothing': 'antialiased',\n" +
            "          '-moz-osx-font-smoothing': 'grayscale',\n" +
            "        },\n" +
            "        '.subpixel-antialiased': {\n" +
            "          '-webkit-font-smoothing': 'auto',\n" +
            "          '-moz-osx-font-smoothing': 'auto',\n" +
            "        },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
