package com.idtech.block;
 
import java.util.Random;

import net.minecraft.init.Items;
 
public class BlockBreadDeposit extends QuickBlock {
     
    {
        name = "Bread Deposit";
        texture = "breaddeposit";
        itemDropped = Items.BREAD;
    }
 
    
    public int quantityDropped(Random random)
    {
        return (int) (Math.random()*10);
    }
}