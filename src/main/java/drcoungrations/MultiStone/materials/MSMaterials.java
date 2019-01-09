package drcoungrations.MultiStone.materials;

import drcoungrations.MultiStone.MultiStoneMod;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class MSMaterials {
	
	public static Item.ToolMaterial MULTISTONE_TOOL = EnumHelper.addToolMaterial(MultiStoneMod.MODID + ":" + "multistone_tool", 4, 2048, 16.0F, 5.0F, 15);

}
