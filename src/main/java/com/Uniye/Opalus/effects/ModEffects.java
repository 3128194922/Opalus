package com.Uniye.Opalus.effects;

import com.Uniye.Opalus.Opalus;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {

    private ModEffects() {
    }

    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Opalus.MODID);

    public static final RegistryObject<MobEffect> AMPUTATION = EFFECTS.register("amputation", () -> new RegisterEffect(MobEffectCategory.BENEFICIAL, 0x650808));
}
