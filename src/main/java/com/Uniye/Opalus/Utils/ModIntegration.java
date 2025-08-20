package com.Uniye.Opalus.Utils;

import net.minecraftforge.fml.ModList;

public class ModIntegration {
    public static final String SAVAGE_AND_RAVAGE = "savage_and_ravage";

    public static boolean isLoaded(String modid) {
        return ModList.get().isLoaded(modid);
    }

    public static boolean isSAVAGE_AND_RAVAGEloaded() {
        return isLoaded(SAVAGE_AND_RAVAGE);
    }
}
