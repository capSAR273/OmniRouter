package com.capsar.OmniRouter.init;

import com.capsar.OmniRouter.blocks.BlocksimpleRouter;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by adamc on 7/30/2014.
 */
public class ModBlocks
{
    public static final BlocksimpleRouter blocksimpleRouter = new BlocksimpleRouter();

    public static void init()
    {
        GameRegistry.registerBlock(blocksimpleRouter, "simplerouter");

    }
}
