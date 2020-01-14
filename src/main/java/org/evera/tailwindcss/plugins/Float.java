package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class Float implements IPlugin {

    String cssObject = " {\n" +
            "        '.float-right': { float: 'right' },\n" +
            "        '.float-left': { float: 'left' },\n" +
            "        '.float-none': { float: 'none' },\n" +
            "        '.clearfix:after': {\n" +
            "          content: '\"\"',\n" +
            "          display: 'table',\n" +
            "          clear: 'both',\n" +
            "        },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
