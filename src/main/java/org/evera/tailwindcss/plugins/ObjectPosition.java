package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class ObjectPosition extends SingleRuleModifier implements IPlugin {

    public ObjectPosition() {
        super("object-position", "objectPosition", "object-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
