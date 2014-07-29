package com.capsar.OmniRouter.init;

import com.capsar.OmniRouter.item.OmniItem;
import com.capsar.OmniRouter.item.simpleRouter;
import com.capsar.OmniRouter.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by adamc on 7/29/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class modItems
{
    public static final OmniItem simplerouter = new simpleRouter();

    public static void init()
    {
        GameRegistry.registerItem(simplerouter, "Simple Router");
    }
}
