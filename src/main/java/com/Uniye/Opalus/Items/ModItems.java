package com.Uniye.Opalus.Items;

import com.Uniye.Opalus.Opalus;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Opalus.MODID);

    public static final RegistryObject<Item> GRIEFER_SPEAR = ITEMS.register(
            "griefer_spear",
            () -> new GrieferSpearItem(Tiers.IRON, 4.0F, -2.8F, new Item.Properties()));


    public static void register(IEventBus bus)
    {
        ITEMS.register(bus);
    }
}
