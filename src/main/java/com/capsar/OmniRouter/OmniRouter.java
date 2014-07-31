package com.capsar.OmniRouter;

import com.capsar.OmniRouter.blocks.BlockRegistry;
import com.capsar.OmniRouter.client.gui.CreativeTabOmni;
import com.capsar.OmniRouter.items.ItemRegistry;
import com.capsar.OmniRouter.proxy.commonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME, guiFactory = Reference.GUI_FACTORY)
public class OmniRouter
{
    @Mod.Instance(Reference.MOD_ID)
    public static OmniRouter instance;
	public static Configuration config;

	public static CreativeTabs tabOmni = new CreativeTabOmni(Reference.MOD_ID + ".creativeTab");
	public static Logger logger = LogManager.getLogger(Reference.MOD_NAME);

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static commonProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    //init items and blocks
	    config = new Configuration(event.getSuggestedConfigurationFile());
	    ConfigHandler.init(config);

	    BlockRegistry.init();
        ItemRegistry.init();

    }
    public void init(FMLInitializationEvent event)
    {
    //init recipes, crafting

    }
    public void postinit(FMLPostInitializationEvent event)
    {
    // things to run after other mods initialize

    }
}
