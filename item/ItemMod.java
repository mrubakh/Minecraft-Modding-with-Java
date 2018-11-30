
package com.idtech.item;
 
import com.idtech.BaseMod;
 
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class ItemMod {
     
    // Material
    public static ToolMaterial GEL;
     
 
    // Tools
    public static ItemGelPickaxe itemGelPickaxe;
    public static ItemCustomArmor customHelm;
 
    public static void preInit(){
 
        // Materials
        GEL = EnumHelper.addToolMaterial("GEL", 3, 100, 10, 50, 0);
         
         
        // Tools
        itemGelPickaxe = new ItemGelPickaxe();
        GameRegistry.register(itemGelPickaxe.setRegistryName(itemGelPickaxe.name));
 
    }
 
    public static void init(){
 
        // Items
        BaseMod.proxy.registerItemInventoryRender(itemGelPickaxe, itemGelPickaxe.name);
 
    }
}