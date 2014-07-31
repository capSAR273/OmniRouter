package com.capsar.OmniRouter.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by Nick on 7/30/14.
 */
public class ItemBlockRouter extends ItemBlock
{

	public ItemBlockRouter(Block block)
	{
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "";
		switch (itemstack.getItemDamage())
		{
			case 0:
			{
				name = "simple";
				break;
			}
			case 1:
			{
				name = "intermediate";
				break;
			}
			case 2:
			{
				name = "advanced";
				break;
			}
			default:
				name = "nothing";
		}
		return getUnlocalizedName() + "." + name;
	}

	@Override
	public int getMetadata(int par1)
	{
		return par1;
	}
}