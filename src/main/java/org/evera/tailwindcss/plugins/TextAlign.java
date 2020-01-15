package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class TextAlign implements IPlugin {

    String cssObject = "{\n" +
            "        '.text-left': { 'text-align': 'left' },\n" +
            "        '.text-center': { 'text-align': 'center' },\n" +
            "        '.text-right': { 'text-align': 'right' },\n" +
            "        '.text-justify': { 'text-align': 'justify' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
