package com.idtech.block;

import net.minecraft.init.Items;
import net.minecraft.util.EnumParticleTypes;

public class BlockRubber extends QuickBlock {
 
    {
        name = "Rubber";
        texture = "rubber";
    }
     
    public void onEntityWalk(){
        entity.motionY += 1;
        spawnParticles(EnumParticleTypes.PORTAL, 40);
        spawnItem(Items.APPLE);
    }
     
}
