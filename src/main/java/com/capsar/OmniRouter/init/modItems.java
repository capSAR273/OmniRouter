package com.capsar.OmniRouter.init;

import com.capsar.OmniRouter.blocks.BlocksimpleRouter;
import com.capsar.OmniRouter.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by adamc on 7/29/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class modItems
{
    public static final BlocksimpleRouter SIMPLEROUTER = new BlocksimpleRouter();

    public static void init()
    {
        GameRegistry.registerBlock(SIMPLEROUTER, "simplerouter");

    }
}
