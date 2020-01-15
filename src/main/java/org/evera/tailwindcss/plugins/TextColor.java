package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class TextColor extends SingleRuleModifier implements IPlugin {

    public TextColor() {
        super("color", "textColor", "text-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
