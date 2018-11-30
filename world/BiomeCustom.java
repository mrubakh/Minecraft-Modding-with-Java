
package com.idtech.world;
 
 
import com.idtech.block.QuickBlock;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
 
public class BiomeCustom extends Biome{
 
    public BiomeCustom(BiomeProperties properties) {
        super(properties);
        // TODO Auto-generated constructor stub
        this.fillerBlock = Blocks.SAND.getStateFromMeta(1);
        this.topBlock = QuickBlock.getBlock("Rubber").getDefaultState();
 
         
        this.theBiomeDecorator.cactiPerChunk = 8;
        this.theBiomeDecorator.generateLakes = true;
    }
 
}