package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class BackgroundSize implements IPlugin {
    String css = "background-size";
    String utilityFormat = "bg-${modifier}";

    @Override
    public void applyPlugin() {

    }
}
