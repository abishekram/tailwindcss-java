package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class BorderCollapse implements IPlugin {
    String cssObject = "{\n" +
            "        '.border-collapse': { 'border-collapse': 'collapse' },\n" +
            "        '.border-separate': { 'border-collapse': 'separate' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
