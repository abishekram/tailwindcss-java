package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class Resize implements IPlugin {

    String cssObject = " {\n" +
            "        '.resize-none': { resize: 'none' },\n" +
            "        '.resize-y': { resize: 'vertical' },\n" +
            "        '.resize-x': { resize: 'horizontal' },\n" +
            "        '.resize': { resize: 'both' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
