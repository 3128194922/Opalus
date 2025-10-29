package com.Uniye.Opalus.Items;

import com.Uniye.Opalus.Opalus;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import net.minecraftforge.registries.RegistryObject;

import static vectorwing.farmersdelight.common.registry.ModItems.basicItem;
import static vectorwing.farmersdelight.common.registry.ModItems.bowlFoodItem;

public class NETHEREXPItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Opalus.MODID);

    public static final RegistryObject<Item> ZOMBIE_BRAIN = ITEMS.register("zombie_brain",
            () -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.6F).build())));

    public static final RegistryObject<Item> STUFFED_SORROWSQUASH_BLOCK = ITEMS.register("stuffed_sorrowsquash_block",
            () -> new BlockItem(NETHEREXPblocks.STUFFED_SORROWSQUASH_BLOCK.get(), basicItem().stacksTo(1)));

    public static final RegistryObject<Item> STUFFED_SORROWSQUASH = ITEMS.register("stuffed_sorrowsquash",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.STUFFED_PUMPKIN), true));

    public static final RegistryObject<Item> CHAINSWORD = ITEMS.register("chainsword",
            () -> new ChianswordItem(
                    Tiers.IRON, // 材质，可换成 Tiers.DIAMOND / Tiers.NETHERITE
                    7,          // 攻击伤害
                    -2.4F,      // 攻击速度（越小越慢，普通剑是 -2.4F）
                    new Item.Properties()
                            .stacksTo(1)   // 只能单持
                            .durability(500) // 耐久度
            ));
}
