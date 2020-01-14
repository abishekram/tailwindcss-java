package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class LetterSpacing extends SingleRuleModifier implements IPlugin {
    public LetterSpacing() {
        super("letter-spacing", "letterSpacing", "tracking-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
