package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class TextTransform implements IPlugin {

    String cssObject = "{\n" +
            "        '.uppercase': { 'text-transform': 'uppercase' },\n" +
            "        '.lowercase': { 'text-transform': 'lowercase' },\n" +
            "        '.capitalize': { 'text-transform': 'capitalize' },\n" +
            "        '.normal-case': { 'text-transform': 'none' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
