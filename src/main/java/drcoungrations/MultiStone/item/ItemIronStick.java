package drcoungrations.MultiStone.item;

import drcoungrations.MultiStone.MultiStoneMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIronStick extends Item {
	
	public ItemIronStick(String unlocalizedName, String registryName) {
        setUnlocalizedName(MultiStoneMod.MODID + "." + "itemIron_stick");
        setRegistryName("iron_stick_item");
        setCreativeTab(CreativeTabs.MISC);
    }

}
