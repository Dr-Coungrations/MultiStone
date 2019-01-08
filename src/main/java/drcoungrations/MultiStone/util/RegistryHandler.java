package drcoungrations.MultiStone.util;

import drcoungrations.MultiStone.item.ItemBlueIronStick;
import drcoungrations.MultiStone.item.ItemBluestoneDust;
import drcoungrations.MultiStone.item.ItemIronStick;
import drcoungrations.MultiStone.item.ItemMultiStone;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	 @SubscribeEvent
	    public static void registerItems(Register<Item> event) {
	        final Item[] items = {
	                new ItemBluestoneDust("itemBluestone_dust", "bluestone_dust_item"),
	                new ItemIronStick("itemIron_stick", "iron_stick_item"),
	                new ItemBlueIronStick("itemBlueiron_stick", "blueiron_stick_item"),
	                new ItemMultiStone("itemMulti_stone","multi_stone_item")
	        };
	 
	        event.getRegistry().registerAll(items);
	    }

}
