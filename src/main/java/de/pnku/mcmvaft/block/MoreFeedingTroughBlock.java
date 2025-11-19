package de.pnku.mcmvaft.block;

import de.pnku.mcmvaft.MoreFeedingTroughVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import slexom.animal_feeding_trough.platform.common.block.FeedingTroughBlock;

public class MoreFeedingTroughBlock extends FeedingTroughBlock {
    public final String feedingTroughWoodType;

    public MoreFeedingTroughBlock(MapColor colour, String feedingTroughWoodType) {
        super(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(0.2f).sound(SoundType.WOOD).ignitedByLava().noOcclusion().setId(ResourceKey.create(Registries.BLOCK, MoreFeedingTroughVariants.withModId(feedingTroughWoodType + "_feeding_trough"))));
        this.feedingTroughWoodType = feedingTroughWoodType;
        this.registerDefaultState(this.stateDefinition.any().setValue(LEVEL, 0));
    }

    public MoreFeedingTroughBlock(MapColor colour, SoundType sound, String feedingTroughWoodType) {
        super(BlockBehaviour.Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(0.2f).sound(sound).ignitedByLava().noOcclusion().setId(ResourceKey.create(Registries.BLOCK, MoreFeedingTroughVariants.withModId(feedingTroughWoodType + "_feeding_trough"))));
        this.feedingTroughWoodType = feedingTroughWoodType;
        this.registerDefaultState(this.stateDefinition.any().setValue(LEVEL, 0));
    }
}