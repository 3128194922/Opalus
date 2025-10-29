package com.Uniye.Opalus.tabs;

import com.Uniye.Opalus.Items.NETHEREXPItems;
import com.Uniye.Opalus.Items.QUARKItems;
import com.Uniye.Opalus.Items.SAVAGE_AND_RAVAGEItems;
import com.Uniye.Opalus.Opalus;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Opalus.MODID);


    public static final RegistryObject<CreativeModeTab> OPALUS_TAB = CREATIVE_MODE_TABS.register("opalus_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.ACACIA_LEAVES))
                    .title(Component.translatable("creativetab.opalus_tab"))
                    .displayItems((parameters, output) -> {
                        // 添加您的物品到创造标签页
                        if(Opalus.SAVAGE_AND_RAVAGE)
                        {
                            output.accept(SAVAGE_AND_RAVAGEItems.GRIEFER_SPEAR.get());
                        }
                        if(Opalus.NETHEREXP)
                        {
                            output.accept(NETHEREXPItems.STUFFED_SORROWSQUASH.get());
                            output.accept(NETHEREXPItems.ZOMBIE_BRAIN.get());
                            output.accept(NETHEREXPItems.STUFFED_SORROWSQUASH_BLOCK.get());
                            output.accept(NETHEREXPItems.CHAINSWORD.get());
                        }
                        if(Opalus.QUARK)
                        {
                            output.accept(QUARKItems.CODEX.get());
                        }
                    })
                    .build()
    );

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }
}
