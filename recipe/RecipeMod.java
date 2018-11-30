package com.idtech.recipe;

import com.idtech.item.ItemGelPickaxe;
import com.idtech.item.ItemMod;
import com.idtech.item.QuickItem;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeMod {
	
	public static void init(){
		
		ItemStack dirtStack = new ItemStack(Blocks.DIRT);
		ItemStack sandStack = new ItemStack(Blocks.SAND);
		 
		GameRegistry.addShapelessRecipe(new ItemStack(ItemMod.itemGelPickaxe), dirtStack);
		
		
		GameRegistry.addShapedRecipe(new ItemStack(QuickItem.getItem("Lightning Hammer"), 1), 
                "xxx", 
                " y ", 
                " y ", 
                'x', Items.REPEATER, 
                'y', Items.STICK);
		

		GameRegistry.addShapedRecipe(
		  new ItemStack(Items.BOOK),  // Specify the result
		  "xy",  // Specify the top row
		  "yx",  // Specify the bottom row
		  'x', Blocks.STONE,  // Specify the block for 'x'
		  'y', Blocks.GRAVEL); // Specify the block for 'y'

	}
	
}
