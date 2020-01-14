package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class FontWeight extends SingleRuleModifier implements IPlugin {

    public FontWeight() {
        super("font-weight", "fontWeight", "font-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
