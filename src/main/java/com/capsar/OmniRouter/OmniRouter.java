package com.capsar.OmniRouter;

/**
 * Created by adamc on 7/29/2014.
 */
import com.capsar.OmniRouter.IProxy.IProxy;
import com.capsar.OmniRouter.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class OmniRouter
{
    @Mod.Instance(Reference.MOD_ID)

    public static OmniRouter instance;

    @SidedProxy(clientSide = "com.capsar.OmniRouter.proxy.ClientProxy", serverSide = "com.capsar.OmniRouter.proxy.ServerProxy", modId = Reference.MOD_ID)
    public static IProxy proxy;
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    //init items and blocks

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
