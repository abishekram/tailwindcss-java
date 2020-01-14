package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class BackgroundAttachment implements IPlugin {

    String cssObject = "{\n" +
            "        '.bg-fixed': { 'background-attachment': 'fixed' },\n" +
            "        '.bg-local': { 'background-attachment': 'local' },\n" +
            "        '.bg-scroll': { 'background-attachment': 'scroll' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
