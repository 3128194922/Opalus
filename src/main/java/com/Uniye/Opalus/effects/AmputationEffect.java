package com.Uniye.Opalus.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class AmputationEffect extends MobEffect {
    public AmputationEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public MobEffect addAttributeModifier(Attribute pAttribute, String pUuid, double pAmount, AttributeModifier.Operation pOperation) {
        super.addAttributeModifier(pAttribute, pUuid, pAmount, pOperation);
        return this;
    }
}
