package dragonofcreativity.rwbyfm;

import dragonofcreativity.rwbyfm.creativetabs.RWBYFMTab;
import dragonofcreativity.rwbyfm.init.ItemInit;
import dragonofcreativity.rwbyfm.proxy.CommonProxy;
import dragonofcreativity.rwbyfm.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:rwbym")
public class Main 
{
	public static final String MODID = "rwbyfm";
	
	public static final String VERSION = "1.0";
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs rwbyfmtab = new RWBYFMTab("rwbyfmtab");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {ItemInit.registerAll(event);}
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		System.out.println("RWBYM is installed: " + Loader.isModLoaded("rwbym"));
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
}
