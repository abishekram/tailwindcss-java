package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class MinHeight extends SingleRuleModifier implements IPlugin {

    public MinHeight() {
        super("min-height", "minHeight", "min-h-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
