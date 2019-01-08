package drcoungrations.MultiStone;

import org.apache.logging.log4j.Logger;

import drcoungrations.MultiStone.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MultiStoneMod.MODID, name = MultiStoneMod.NAME, version = MultiStoneMod.VERSION, acceptedMinecraftVersions = MultiStoneMod.MC_VERSION)
public class MultiStoneMod {

	public static final String MODID = "ms";
	public static final String NAME = "Multi_Stone";
	public static final String VERSION = "0.1 Dev";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final String CLIENT = "drcoungrations.MultiStone.proxy.ClientProxy";
	public static final String SERVER = "drcoungrations.MultiStone.proxy.ServerProxy";
	
	@SidedProxy(clientSide = MultiStoneMod.CLIENT, serverSide = MultiStoneMod.SERVER)
	public static IProxy proxy;

	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("MultiStoneMod.NAME " + "says hi!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
