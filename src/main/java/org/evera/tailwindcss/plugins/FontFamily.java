package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class FontFamily extends SingleRuleModifier implements IPlugin {

    public FontFamily() {
        super("font-family", "fontFamily", "font-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
