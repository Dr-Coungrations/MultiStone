package drcoungrations.MultiStone.util;

import drcoungrations.MultiStone.block.BlockBluestoneOre;
import drcoungrations.MultiStone.init.MSBlocks;
import drcoungrations.MultiStone.item.ItemBlueIronStick;
import drcoungrations.MultiStone.item.ItemBluestoneDust;
import drcoungrations.MultiStone.item.ItemIronStick;
import drcoungrations.MultiStone.item.ItemMultiStone;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                new BlockBluestoneOre(Material.ROCK, "blockBluestoneOre", "bluestone_ore_block")
        };
 
        event.getRegistry().registerAll(blocks);
	}
	
	 @SubscribeEvent
	    public static void registerItems(Register<Item> event) {
	        final Item[] items = {
	                new ItemBluestoneDust("itemBluestone_dust", "bluestone_dust_item"),
	                new ItemIronStick("itemIron_stick", "iron_stick_item"),
	                new ItemBlueIronStick("itemBlueiron_stick", "blueiron_stick_item"),
	                new ItemMultiStone("itemMulti_stone","multi_stone_item")
	        };
	        
	        final Item[] itemBlocks = {
	                new ItemBlock(MSBlocks.BLUESTONE_ORE_BLOCK).setRegistryName(MSBlocks.BLUESTONE_ORE_BLOCK.getRegistryName())
	        };
	 
	        event.getRegistry().registerAll(items);
	        event.getRegistry().registerAll(itemBlocks);
	    }

}
