package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class Opacity extends SingleRuleModifier implements IPlugin {

    public Opacity() {
        super("opacity", "opacity", "opacity-${modifier}");
    }

    @Override
    public void applyPlugin() {
    }
}
