
package com.idtech.block;
 
import net.minecraft.util.math.BlockPos;
 
public class BlockCreepingMold extends QuickBlock {
 
    {
        name = "Creeping Mold";
        texture = "creepingmold";
    }
     
    public void tick(){
        BlockPos neighbor = findNeighborBlock();
        cloneAt(neighbor);
    }
     
}