package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class TextDecoration implements IPlugin {

    String cssObject = " {\n" +
            "        '.underline': { 'text-decoration': 'underline' },\n" +
            "        '.line-through': { 'text-decoration': 'line-through' },\n" +
            "        '.no-underline': { 'text-decoration': 'none' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
