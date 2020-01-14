package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class ListStyleType extends SingleRuleModifier implements IPlugin {

    public ListStyleType() {
        super("list-style-type", "listStyleType", "list-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
