package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class FontSize extends SingleRuleModifier implements IPlugin {


    public FontSize() {
        super("font-size", "fontSize", "text-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
