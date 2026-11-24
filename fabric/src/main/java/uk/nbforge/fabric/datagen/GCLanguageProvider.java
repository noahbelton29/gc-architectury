package uk.nbforge.fabric.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import uk.nbforge.common.GCItems;
import uk.nbforge.util.StringUtil;

import java.util.concurrent.CompletableFuture;

public class GCLanguageProvider extends FabricLanguageProvider {
    public GCLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
         for (RegistrySupplier<Item> item : GCItems.ITEMS) {
             translationBuilder.add(item.get(), StringUtil.titleCase(item.getId().getPath()));
         }
    }
}
