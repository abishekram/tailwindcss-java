package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class FlexShrink extends SingleRuleModifier implements IPlugin {

    public FlexShrink() {
        super("flex-shrink", "flexShrink", "flex-shrink-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
