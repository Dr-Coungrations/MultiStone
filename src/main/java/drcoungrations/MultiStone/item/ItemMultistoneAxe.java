package drcoungrations.MultiStone.item;

import drcoungrations.MultiStone.MultiStoneMod;
import drcoungrations.MultiStone.materials.MSMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemMultistoneAxe extends ItemAxe{
	
	public ItemMultistoneAxe(ToolMaterial material, float damage, float speed, String unlocalizedName, String registryName) {
        super(ToolMaterial.DIAMOND, 8.0F, -3.1F);
 
        setUnlocalizedName(MultiStoneMod.MODID + "." + "itemMultistone_axe");
        setRegistryName("multistone_axe_item");
        setCreativeTab(CreativeTabs.MISC);
    }
 
    public ItemMultistoneAxe(ToolMaterial material, String unlocalizedName, String registryName) {
        this(MSMaterials.MULTISTONE_TOOL, 8.0F, -3.1F, "itemMultistone_axe", "multisatone_axe_item");
    }

}
