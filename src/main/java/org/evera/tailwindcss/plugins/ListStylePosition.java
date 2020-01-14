package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class ListStylePosition implements IPlugin {

    String cssObject = "{\n" +
            "        '.list-inside': { 'list-style-position': 'inside' },\n" +
            "        '.list-outside': { 'list-style-position': 'outside' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
