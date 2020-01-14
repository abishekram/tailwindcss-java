package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class BackgroundColor implements IPlugin {
    String utilityName = "bg-${modifier}";
    String cssKey = "background-color";

    @Override
    public void applyPlugin() {

    }
}
