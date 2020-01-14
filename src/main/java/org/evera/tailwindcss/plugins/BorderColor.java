package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class BorderColor implements IPlugin {
    String cssKey = "border-color";
    String cssFormat = "border-${modifier}";

    @Override
    public void applyPlugin() {

    }
}
