package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class WordBreak implements IPlugin {

    String cssObject = "{\n" +
            "        '.break-normal': {\n" +
            "          'overflow-wrap': 'normal',\n" +
            "          'word-break': 'normal',\n" +
            "        },\n" +
            "        '.break-words': { 'overflow-wrap': 'break-word' },\n" +
            "        '.break-all': { 'word-break': 'break-all' },\n" +
            "\n" +
            "        '.truncate': {\n" +
            "          overflow: 'hidden',\n" +
            "          'text-overflow': 'ellipsis',\n" +
            "          'white-space': 'nowrap',\n" +
            "        },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
