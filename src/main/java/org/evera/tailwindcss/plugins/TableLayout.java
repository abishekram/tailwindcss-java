package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class TableLayout implements IPlugin {

    String cssObject = "{\n" +
            "        '.table-auto': { 'table-layout': 'auto' },\n" +
            "        '.table-fixed': { 'table-layout': 'fixed' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
