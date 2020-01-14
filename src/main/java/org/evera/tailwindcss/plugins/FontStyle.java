package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class FontStyle implements IPlugin {
    String cssObject = "{\n" +
            "        '.italic': { 'font-style': 'italic' },\n" +
            "        '.not-italic': { 'font-style': 'normal' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
