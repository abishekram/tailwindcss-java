package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class WhiteSpace implements IPlugin {

    String cssObject = " {\n" +
            "        '.whitespace-normal': { 'white-space': 'normal' },\n" +
            "        '.whitespace-no-wrap': { 'white-space': 'nowrap' },\n" +
            "        '.whitespace-pre': { 'white-space': 'pre' },\n" +
            "        '.whitespace-pre-line': { 'white-space': 'pre-line' },\n" +
            "        '.whitespace-pre-wrap': { 'white-space': 'pre-wrap' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
