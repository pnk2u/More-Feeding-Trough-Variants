package de.pnku.mcmvaft.init;

import de.pnku.mcmvaft.MoreFeedingTroughVariants;
import de.pnku.mcmvaft.block.MoreFeedingTroughBlock;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import slexom.animal_feeding_trough.platform.common.AnimalFeedingTroughMod;

public class McmvaftItemInit {
    public static final Item OAK_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.OAK_FEEDING_TROUGH_BLOCK);
    public static final Item SPRUCE_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.SPRUCE_FEEDING_TROUGH_BLOCK);
    public static final Item BIRCH_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.BIRCH_FEEDING_TROUGH_BLOCK);
    public static final Item JUNGLE_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.JUNGLE_FEEDING_TROUGH_BLOCK);
    public static final Item ACACIA_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.ACACIA_FEEDING_TROUGH_BLOCK);
    public static final Item DARK_OAK_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.DARK_OAK_FEEDING_TROUGH_BLOCK);
    public static final Item PALE_OAK_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.PALE_OAK_FEEDING_TROUGH_BLOCK);
    public static final Item MANGROVE_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.MANGROVE_FEEDING_TROUGH_BLOCK);
    public static final Item CHERRY_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.CHERRY_FEEDING_TROUGH_BLOCK);
    public static final Item BAMBOO_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.BAMBOO_FEEDING_TROUGH_BLOCK);
    public static final Item CRIMSON_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.CRIMSON_FEEDING_TROUGH_BLOCK);
    public static final Item WARPED_FEEDING_TROUGH_ITEM = itemFromBlock(McmvaftBlockInit.WARPED_FEEDING_TROUGH_BLOCK);

    public static BlockItem itemFromBlock(Block moreFeedingTroughBlock) {
        return new BlockItem(moreFeedingTroughBlock, setProperties(moreFeedingTroughBlock));
    }

    public static Item.Properties setProperties(Block moreFeedingTroughBlock) {
        return new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM,BuiltInRegistries.BLOCK.getKey(moreFeedingTroughBlock))).useBlockDescriptionPrefix();
    }


    public static void registerItems() {
        registerItem(WARPED_FEEDING_TROUGH_ITEM);
        registerItem(CRIMSON_FEEDING_TROUGH_ITEM);
        registerItem(BAMBOO_FEEDING_TROUGH_ITEM);
        registerItem(CHERRY_FEEDING_TROUGH_ITEM);
        registerItem(MANGROVE_FEEDING_TROUGH_ITEM);
        registerItem(DARK_OAK_FEEDING_TROUGH_ITEM);
        registerItem(PALE_OAK_FEEDING_TROUGH_ITEM);
        registerItem(ACACIA_FEEDING_TROUGH_ITEM);
        registerItem(JUNGLE_FEEDING_TROUGH_ITEM);
        registerItem(BIRCH_FEEDING_TROUGH_ITEM);
        registerItem(SPRUCE_FEEDING_TROUGH_ITEM);
        registerItem(OAK_FEEDING_TROUGH_ITEM);
    }

    private static void registerItem(Item feedingTroughitem) {
        Registry.register(BuiltInRegistries.ITEM, MoreFeedingTroughVariants.withModId(((MoreFeedingTroughBlock)((BlockItem) feedingTroughitem).getBlock()).feedingTroughWoodType + "_feeding_trough"), feedingTroughitem);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> entries.insertAfter(AnimalFeedingTroughMod.FEEDING_TROUGH_BLOCK_ITEM.get(), feedingTroughitem));
    }
}