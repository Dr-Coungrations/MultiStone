	package drcoungrations.MultiStone.block;

	import drcoungrations.MultiStone.MultiStoneMod;
	import net.minecraft.block.Block;
	import net.minecraft.block.SoundType;
	import net.minecraft.block.material.Material;
	import net.minecraft.creativetab.CreativeTabs;

	public class BlockBluestone extends Block {
		

	    public BlockBluestone(Material material, String unlocalizedName, String registryName) {
	        this(material, SoundType.STONE, "blockBluestone", "bluestone_block");
	    }
	 
	    public BlockBluestone(Material material, SoundType sound, String unlocalizedName, String registryName) {
	        super(Material.ROCK);
	        setUnlocalizedName(MultiStoneMod.MODID + "." + "blockBluestone");
	        setRegistryName("bluestone_block");
	        setCreativeTab(CreativeTabs.MISC);
	        setSoundType(sound);
	        setHardness(7F);
	        setResistance(8F);
	        setHarvestLevel("pickaxe", 1);
	        setLightLevel(4F);
	    }

	}
