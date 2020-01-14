package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class Fill implements IPlugin {
    String cssKey = "fill";
    String utilityFormat = "fill-${modifier}";
    String themeKey = "fill";

    @Override
    public void applyPlugin() {
    }
}
