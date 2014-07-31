package com.capsar.OmniRouter.blocks;

import com.capsar.OmniRouter.items.blocks.ItemBlockRouter;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockRegistry
{
	public static Block blockRouter;

	public static void init()
	{
		blockRouter = new BlockRouter();
		GameRegistry.registerBlock(blockRouter, ItemBlockRouter.class, blockRouter.getUnlocalizedName());
	}

}
