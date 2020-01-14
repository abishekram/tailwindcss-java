package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class Appearance implements IPlugin {

    String cssObject = " {\n" +
            "        '.appearance-none': { appearance: 'none' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
