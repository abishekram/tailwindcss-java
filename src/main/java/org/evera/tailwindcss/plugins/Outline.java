package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class Outline implements IPlugin {

    String cssObject = "{\n" +
            "        '.outline-none': { outline: '0' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
