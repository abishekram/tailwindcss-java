package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class Visibility implements IPlugin {

    String cssObject = "{\n" +
            "        '.visible': { visibility: 'visible' },\n" +
            "        '.invisible': { visibility: 'hidden' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
