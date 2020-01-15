package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class PointerEvents implements IPlugin {

    String cssObject = "{\n" +
            "        '.pointer-events-none': { 'pointer-events': 'none' },\n" +
            "        '.pointer-events-auto': { 'pointer-events': 'auto' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
