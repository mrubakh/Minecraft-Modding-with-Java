
package com.idtech.world;
  
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
  
public class WorldMod {
      
    public static BiomeCustom biomeCustom;
      
    public static void init(){
        BiomeProperties properties = new BiomeProperties("Custom");
        properties.setBaseHeight(1.5F);
        properties.setHeightVariation(0.025F);
        properties.setTemperature(2.0F);
        properties.setWaterColor(0x11FF11);
        biomeCustom = new BiomeCustom(properties);
        registerModBiome(biomeCustom, 150, BiomeType.WARM);
    }
     
    // Biome ID finder
    public static int lastBiomeID = -1;
    public static int getEmptyBiomeID(){
        //Find the next biome id.
        while(Biome.getBiome(++lastBiomeID) != null);     
       return lastBiomeID;
    }
     
    /***
     * finds an empty id and registers it if there's room in the biome list.
     * 
     * @param b - The biome to register.
     * @param weight - The spawn weight.
     */
    public static void registerModBiome(Biome b, int weight, BiomeType type){
        int biomeID = getEmptyBiomeID();
         
        // If biomeID is >=256 biome list is full.
        if(biomeID < 256){
            // We have to register it manually here:
            Biome.REGISTRY.register(biomeID, new ResourceLocation(b.getBiomeName()), b);
            BiomeEntry entry = new BiomeEntry(b, weight);
            BiomeManager.addBiome(type, entry);
        }
    }
  
}