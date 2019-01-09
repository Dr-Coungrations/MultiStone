package drcoungrations.MultiStone.util;

import drcoungrations.MultiStone.init.MSBlocks;
import drcoungrations.MultiStone.init.MS_Items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {
	
	@SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(MS_Items.BLUESTONE_DUST_ITEM);
        registerModel(MS_Items.IRON_STICK_ITEM);
        registerModel(MS_Items.BLUEIRON_STICK_ITEM);
        registerModel(MS_Items.MULTI_STONE_ITEM);
        registerModel(MS_Items.MULTISTONE_AXE_ITEM);
        registerModel(Item.getItemFromBlock(MSBlocks.BLUESTONE_ORE_BLOCK));
        registerModel(Item.getItemFromBlock(MSBlocks.BLUESTONE_BLOCK));

    }
 
    private static void registerModel(Item item) {
    	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
