package com.Uniye.Opalus;

import com.Uniye.Opalus.Items.NETHEREXPItems;
import com.Uniye.Opalus.Items.NETHEREXPblocks;
import com.Uniye.Opalus.Items.QUARKItems;
import com.Uniye.Opalus.Items.SAVAGE_AND_RAVAGEItems;
import com.Uniye.Opalus.tabs.ModCreativeModTabs;
import com.mojang.logging.LogUtils;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Opalus.MODID)
public class Opalus
{
    public static final String MODID = "opalus";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MODID);
    public static final boolean SAVAGE_AND_RAVAGE = ModList.get().isLoaded("savage_and_ravage");
    public static final boolean NETHEREXP = ModList.get().isLoaded("netherexp");
    public static final boolean QUARK = ModList.get().isLoaded("quark");

    public Opalus(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);
        if(SAVAGE_AND_RAVAGE)
        {
            SAVAGE_AND_RAVAGEItems.ITEMS.register(modEventBus);
        }
        if(NETHEREXP)
        {
            NETHEREXPItems.ITEMS.register(modEventBus);
            NETHEREXPblocks.BLOCKS.register(modEventBus);
        }
        if(QUARK)
        {
            QUARKItems.ITEMS.register(modEventBus);
        }
        ModCreativeModTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
