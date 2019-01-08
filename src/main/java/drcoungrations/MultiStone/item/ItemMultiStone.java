package drcoungrations.MultiStone.item;

import drcoungrations.MultiStone.MultiStoneMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMultiStone extends Item {
	
	public ItemMultiStone(String unlocalizedName, String registryName) {
        setUnlocalizedName(MultiStoneMod.MODID + "." + "itemMulti_stone");
        setRegistryName("multi_stone_item");
        setCreativeTab(CreativeTabs.MISC);
    }

}