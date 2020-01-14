package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class BoxShadow implements IPlugin {
    String cssKey = "box-shadow";
    String themeKey = "boxShadow";
    String utilityFormat = "shadow | shadow-${modifier}";

    @Override
    public void applyPlugin() {

    }
}
