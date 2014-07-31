package com.capsar.OmniRouter.client.gui;

/**
 * Created by adamc on 7/29/2014.
 */

import com.capsar.OmniRouter.items.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabOmni extends CreativeTabs
{
	public CreativeTabOmni(String tabLabel)
	{
		super(tabLabel);
	}

	//The tab icon is what you return here.
	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(ItemRegistry.linker, 1, 0);
	}

	@Override
	public Item getTabIconItem() { return new Item(); }
}
