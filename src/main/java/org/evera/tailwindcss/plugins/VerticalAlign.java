package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class VerticalAlign implements IPlugin {

    String cssObject = " {\n" +
            "        '.align-baseline': { 'vertical-align': 'baseline' },\n" +
            "        '.align-top': { 'vertical-align': 'top' },\n" +
            "        '.align-middle': { 'vertical-align': 'middle' },\n" +
            "        '.align-bottom': { 'vertical-align': 'bottom' },\n" +
            "        '.align-text-top': { 'vertical-align': 'text-top' },\n" +
            "        '.align-text-bottom': { 'vertical-align': 'text-bottom' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
