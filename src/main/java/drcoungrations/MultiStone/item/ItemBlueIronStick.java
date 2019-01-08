package drcoungrations.MultiStone.item;

import drcoungrations.MultiStone.MultiStoneMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBlueIronStick extends Item {
	
	public ItemBlueIronStick(String unlocalizedName, String registryName) {
        setUnlocalizedName(MultiStoneMod.MODID + "." + "itemBlueiron_stick");
        setRegistryName("blueiron_stick_item");
        setCreativeTab(CreativeTabs.MISC);
    }

}
