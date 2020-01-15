package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class PlaceHolderColor extends SingleRuleModifier implements IPlugin {

    public PlaceHolderColor() {
        super("color", "placeholderColor", "placeholder-${modifier}`::placeholder");
    }

    @Override
    public void applyPlugin() {

    }
}
