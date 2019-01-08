package drcoungrations.MultiStone.item;

import drcoungrations.MultiStone.MultiStoneMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBluestoneDust extends Item {
	
	public ItemBluestoneDust(String unlocalizedName, String registryName) {
        setUnlocalizedName(MultiStoneMod.MODID + "." + "itemBluestone_dust");
        setRegistryName("bluestone_dust_item");
        setCreativeTab(CreativeTabs.MISC);
    }

}
