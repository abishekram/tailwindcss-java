package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class UserSelect implements IPlugin {

    String cssObject = " {\n" +
            "        '.select-none': { 'user-select': 'none' },\n" +
            "        '.select-text': { 'user-select': 'text' },\n" +
            "        '.select-all': { 'user-select': 'all' },\n" +
            "        '.select-auto': { 'user-select': 'auto' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
