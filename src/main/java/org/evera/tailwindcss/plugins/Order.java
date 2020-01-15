package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class Order extends SingleRuleModifier implements IPlugin {

    public Order() {
        super("order", "order", "order-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
