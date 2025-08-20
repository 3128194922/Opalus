package com.Uniye.Opalus.Items;

import com.Uniye.Opalus.Opalus;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class QUARKItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Opalus.MODID);

    public static final RegistryObject<Item> CODEX = ITEMS.register("codex", () -> new CodexItem(new Item.Properties()));
}
