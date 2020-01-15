package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class Stroke extends SingleRuleModifier implements IPlugin {

    public Stroke() {
        super("stroke", "stroke", "stroke-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
