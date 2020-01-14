package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class Height extends SingleRuleModifier implements IPlugin {

    public Height() {
        super("height", "height", "h-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
