package net.mrgame.theawakening.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrgame.theawakening.TheAwakening;

public class ModItems {
    public static final Item AWAKENING_ORB = registerItem("awakening_orb", new Item(new Item.Settings()));
    public static final Item EYE_OF_AWAKENING = registerItem("eye_of_awakening", new Item(new Item.Settings()));
    public static final Item AWAKENING_GEM = registerItem("awakening_gem", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheAwakening.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheAwakening.LOGGER.info("Registering Mod Items for " + TheAwakening.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(AWAKENING_ORB);
            entries.add(EYE_OF_AWAKENING);
            entries.add(AWAKENING_GEM);
        });
    }
}
