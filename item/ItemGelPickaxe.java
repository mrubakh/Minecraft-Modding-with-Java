
package com.idtech.item;
 
import com.idtech.BaseMod;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
 
public class ItemGelPickaxe extends ItemPickaxe {
 
    public static final String name = "GelPickaxe";
    
    
    protected ItemGelPickaxe() {
    	super(ItemMod.GEL);
        // TODO Auto-generated constructor stub
        setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
     
}