package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class ZIndex extends SingleRuleModifier implements IPlugin {

    public ZIndex() {
        super("z-index", "zIndex", "z-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
