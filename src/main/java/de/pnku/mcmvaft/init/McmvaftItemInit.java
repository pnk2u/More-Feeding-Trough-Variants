package de.pnku.mcmvaft.init;

import de.pnku.mcmvaft.MoreFeedingTroughVariants;
import de.pnku.mcmvaft.block.MoreFeedingTroughBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import slexom.animal_feeding_trough.platform.common.AnimalFeedingTroughMod;

public class McmvaftItemInit {
    public static final Item OAK_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.OAK_FEEDING_TROUGH_BLOCK, new Item.Properties());
    public static final Item SPRUCE_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.SPRUCE_FEEDING_TROUGH_BLOCK, new Item.Properties());
    public static final Item BIRCH_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.BIRCH_FEEDING_TROUGH_BLOCK, new Item.Properties());
    public static final Item JUNGLE_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.JUNGLE_FEEDING_TROUGH_BLOCK, new Item.Properties());
    public static final Item ACACIA_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.ACACIA_FEEDING_TROUGH_BLOCK, new Item.Properties());
    public static final Item DARK_OAK_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.DARK_OAK_FEEDING_TROUGH_BLOCK, new Item.Properties());
    public static final Item MANGROVE_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.MANGROVE_FEEDING_TROUGH_BLOCK, new Item.Properties());
    public static final Item CHERRY_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.CHERRY_FEEDING_TROUGH_BLOCK, new Item.Properties());
    public static final Item BAMBOO_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.BAMBOO_FEEDING_TROUGH_BLOCK, new Item.Properties());
    public static final Item CRIMSON_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.CRIMSON_FEEDING_TROUGH_BLOCK, new Item.Properties());
    public static final Item WARPED_FEEDING_TROUGH_ITEM = new BlockItem(McmvaftBlockInit.WARPED_FEEDING_TROUGH_BLOCK, new Item.Properties());


    public static void registerItems() {
        registerItem(WARPED_FEEDING_TROUGH_ITEM);
        registerItem(CRIMSON_FEEDING_TROUGH_ITEM);
        registerItem(BAMBOO_FEEDING_TROUGH_ITEM);
        registerItem(CHERRY_FEEDING_TROUGH_ITEM);
        registerItem(MANGROVE_FEEDING_TROUGH_ITEM);
        registerItem(DARK_OAK_FEEDING_TROUGH_ITEM);
        registerItem(ACACIA_FEEDING_TROUGH_ITEM);
        registerItem(JUNGLE_FEEDING_TROUGH_ITEM);
        registerItem(BIRCH_FEEDING_TROUGH_ITEM);
        registerItem(SPRUCE_FEEDING_TROUGH_ITEM);
        registerItem(OAK_FEEDING_TROUGH_ITEM);
    }

    private static void registerItem(Item feedingTroughitem) {
        Registry.register(BuiltInRegistries.ITEM, MoreFeedingTroughVariants.asId(((MoreFeedingTroughBlock)((BlockItem) feedingTroughitem).getBlock()).feedingTroughWoodType + "_feeding_trough"), feedingTroughitem);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> entries.addAfter(AnimalFeedingTroughMod.FEEDING_TROUGH_BLOCK_ITEM.get(), feedingTroughitem));
    }
}