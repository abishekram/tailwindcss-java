package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class MaxWidth extends SingleRuleModifier implements IPlugin {

    public MaxWidth() {
        super("max-width", "maxWidth", "max-w-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
