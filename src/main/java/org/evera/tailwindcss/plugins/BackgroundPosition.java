package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class BackgroundPosition implements IPlugin {
    String css = "background-position";
    String utilityFormat = "bg-${modifier}";

    @Override
    public void applyPlugin() {

    }
}
