package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class FlexGrow extends SingleRuleModifier implements IPlugin {
    public FlexGrow() {
        super("flex-grow", "flexGrow", "flex-grow-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
