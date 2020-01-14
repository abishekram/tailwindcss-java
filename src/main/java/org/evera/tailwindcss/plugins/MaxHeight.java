package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class MaxHeight extends SingleRuleModifier implements IPlugin {

    public MaxHeight() {
        super("max-height", "maxHeight", "max-h-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
