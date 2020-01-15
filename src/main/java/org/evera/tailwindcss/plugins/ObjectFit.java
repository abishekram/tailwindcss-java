package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class ObjectFit implements IPlugin {

    String cssObject = " {\n" +
            "        '.object-contain': { 'object-fit': 'contain' },\n" +
            "        '.object-cover': { 'object-fit': 'cover' },\n" +
            "        '.object-fill': { 'object-fit': 'fill' },\n" +
            "        '.object-none': { 'object-fit': 'none' },\n" +
            "        '.object-scale-down': { 'object-fit': 'scale-down' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
