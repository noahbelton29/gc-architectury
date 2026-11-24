package uk.nbforge.common;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import uk.nbforge.GCMod;

import java.util.function.Function;

public class GCItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(GCMod.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> ZEITON_7_CRYSTAL =
            registerItem("zeiton_7_crystal", Item::new);

    private static <T extends Item> RegistrySupplier<T> registerItem(String name, Function<Item.Properties, T> propertiesFactory) {
        return ITEMS.register(name, () -> {
            Item.Properties properties = new Item.Properties()
                    .setId(ResourceKey.create(
                            Registries.ITEM,
                            Identifier.fromNamespaceAndPath(
                                    GCMod.MOD_ID,
                                    name
                            )
                    ));

            return propertiesFactory.apply(properties);
        });
    }
    public static void init() {
        ITEMS.register();
    }
}
