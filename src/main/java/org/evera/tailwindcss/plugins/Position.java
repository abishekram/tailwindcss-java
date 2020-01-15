package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class Position implements IPlugin {

    String cssObject = "{\n" +
            "        '.static': { position: 'static' },\n" +
            "        '.fixed': { position: 'fixed' },\n" +
            "        '.absolute': { position: 'absolute' },\n" +
            "        '.relative': { position: 'relative' },\n" +
            "        '.sticky': { position: 'sticky' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
