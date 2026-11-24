package uk.nbforge.fabric;

import net.fabricmc.api.ModInitializer;

import uk.nbforge.GCMod;

public final class GCModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GCMod.init();
    }
}
