package com.Uniye.Opalus.Items;

import com.Uniye.Opalus.Opalus;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.block.FeastBlock;

public class NETHEREXPblocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Opalus.MODID);

    public static final RegistryObject<Block> STUFFED_SORROWSQUASH_BLOCK = BLOCKS.register("stuffed_sorrowsquash_block",
            () -> new FeastBlock(Block.Properties.copy(Blocks.PUMPKIN),
                    () -> NETHEREXPItems.STUFFED_SORROWSQUASH.get(), false));
}
