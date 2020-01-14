package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class Flex extends SingleRuleModifier implements IPlugin {


    public Flex() {
        super("flex", "flex", "flex-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
