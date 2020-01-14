package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;

public class Cursor implements IPlugin {
    String cssKey = "cursor";
    String themeKey = "cursor";
    String utilityFormat = "cursor-${modifier}";

    @Override
    public void applyPlugin() {

    }
}
