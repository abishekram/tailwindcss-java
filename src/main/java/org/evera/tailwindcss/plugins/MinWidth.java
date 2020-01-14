package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class MinWidth extends SingleRuleModifier implements IPlugin {

    public MinWidth() {
        super("min-width", "minWidth", "min-w-${modifier}");
    }

    @Override
    public void applyPlugin() {
    }
}
