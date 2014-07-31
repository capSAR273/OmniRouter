package com.capsar.OmniRouter.items;

import com.capsar.OmniRouter.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by adamc on 7/29/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ItemRegistry
{
	public static Item linker;
	public static Item upgrades;

    public static void init()
    {
	    linker = new ItemLinker();
	    GameRegistry.registerItem(linker, linker.getUnlocalizedName());

	    upgrades = new ItemUpgrades().setUnlocalizedName(Reference.MOD_ID);
	    GameRegistry.registerItem(upgrades, upgrades.getUnlocalizedName());
    }
}
