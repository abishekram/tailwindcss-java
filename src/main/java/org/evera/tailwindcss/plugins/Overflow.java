package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class Overflow implements IPlugin {

    String cssObject = "{\n" +
            "        '.overflow-auto': { overflow: 'auto' },\n" +
            "        '.overflow-hidden': { overflow: 'hidden' },\n" +
            "        '.overflow-visible': { overflow: 'visible' },\n" +
            "        '.overflow-scroll': { overflow: 'scroll' },\n" +
            "        '.overflow-x-auto': { 'overflow-x': 'auto' },\n" +
            "        '.overflow-y-auto': { 'overflow-y': 'auto' },\n" +
            "        '.overflow-x-hidden': { 'overflow-x': 'hidden' },\n" +
            "        '.overflow-y-hidden': { 'overflow-y': 'hidden' },\n" +
            "        '.overflow-x-visible': { 'overflow-x': 'visible' },\n" +
            "        '.overflow-y-visible': { 'overflow-y': 'visible' },\n" +
            "        '.overflow-x-scroll': { 'overflow-x': 'scroll' },\n" +
            "        '.overflow-y-scroll': { 'overflow-y': 'scroll' },\n" +
            "        '.scrolling-touch': { '-webkit-overflow-scrolling': 'touch' },\n" +
            "        '.scrolling-auto': { '-webkit-overflow-scrolling': 'auto' },\n" +
            "      }";

    @Override
    public void applyPlugin() {

    }
}
