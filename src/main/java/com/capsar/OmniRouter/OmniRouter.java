package com.capsar.OmniRouter;

/**
 * Created by adamc on 7/29/2014.
 */
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "OmniRouter", version = "1.7.10-0.1", name = "Omni Router")
public class OmniRouter
{
    @Mod.Instance("OmniRouter")

    public static OmniRouter instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    //init items and blocks
    
    }
    public void init(FMLInitializationEvent event)
    {
    //init recipies, crafting

    }
    public void postinit(FMLPostInitializationEvent event)
    {
    // things to run after other mods initialize

    }

}
