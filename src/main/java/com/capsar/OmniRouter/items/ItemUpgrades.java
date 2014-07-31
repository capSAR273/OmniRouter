package com.capsar.OmniRouter.items;

import com.capsar.OmniRouter.OmniRouter;
import com.capsar.OmniRouter.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

/**
 * Created by Nick on 7/30/14.
 */
public class ItemUpgrades extends Item
{
	public IIcon[] icon = new IIcon[5];

	public ItemUpgrades() {
		this.setCreativeTab(OmniRouter.tabOmni);
		this.setHasSubtypes(true);
		this.setMaxStackSize(16);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "";
		switch (itemstack.getItemDamage())
		{
			case 0:
			{
				name = "range";
				break;
			}
			case 1:
			{
				name = "range.plus";
				break;
			}
			case 2:
			{
				name = "speed";
				break;
			}
			case 3:
			{
				name = "efficiency";
				break;
			}
			default:
				name = "nothing";
				break;
		}
		return getUnlocalizedName() + ".upgrade." + name;
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta)
	{
		return this.icon[meta];
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ri)
	{
		this.icon[0] = ri.registerIcon(Reference.MOD_ID + ":upgradeBase");
		this.icon[1] = ri.registerIcon(Reference.MOD_ID + ":upgradeBase");
		this.icon[2] = ri.registerIcon(Reference.MOD_ID + ":upgradeBase");
		this.icon[3] = ri.registerIcon(Reference.MOD_ID + ":upgradeBase");
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list)
	{
		for (int i = 0; i <= 3; i++)
		{
			list.add(new ItemStack(this, 1, i));
		}
	}
}