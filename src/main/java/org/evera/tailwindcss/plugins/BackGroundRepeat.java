package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class BackGroundRepeat implements IPlugin {

    String cssObject = "{\n" +
            "        '.bg-repeat': { 'background-repeat': 'repeat' },\n" +
            "        '.bg-no-repeat': { 'background-repeat': 'no-repeat' },\n" +
            "        '.bg-repeat-x': { 'background-repeat': 'repeat-x' },\n" +
            "        '.bg-repeat-y': { 'background-repeat': 'repeat-y' },\n" +
            "        '.bg-repeat-round': { 'background-repeat': 'round' },\n" +
            "        '.bg-repeat-space': { 'background-repeat': 'space' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
