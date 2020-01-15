package org.evera.tailwindcss.plugins;

import org.evera.tailwindcss.type.IPlugin;
import org.evera.tailwindcss.type.SingleRuleModifier;

public class Width extends SingleRuleModifier implements IPlugin {


    public Width() {
        super("width", "width", "w-${modifier}");
    }

    @Override
    public void applyPlugin() {

    }
}
