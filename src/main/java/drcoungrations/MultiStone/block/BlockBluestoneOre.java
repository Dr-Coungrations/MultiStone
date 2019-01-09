package drcoungrations.MultiStone.block;

import drcoungrations.MultiStone.MultiStoneMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBluestoneOre extends Block {
	

    public BlockBluestoneOre(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.STONE, "blockBluestone_ore", "bluestone_ore_block");
    }
 
    public BlockBluestoneOre(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(Material.ROCK);
        setUnlocalizedName(MultiStoneMod.MODID + "." + "blockBluestone_ore");
        setRegistryName("bluestone_ore_block");
        setCreativeTab(CreativeTabs.MISC);
        setSoundType(sound);
        setHardness(10F);
        setResistance(6F);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(2F);
    }

}
