package com.capsar.OmniRouter.init;

import com.capsar.OmniRouter.blocks.simpleRouter;
import com.capsar.OmniRouter.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Created by adamc on 7/29/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class modItems
{
    public static final simpleRouter simplerouter = new simpleRouter();

    public static void init()
    {
        GameRegistry.registerBlock(simplerouter, "simplerouter");

    }
}
