package com.capsar.OmniRouter.items;

import com.capsar.OmniRouter.OmniRouter;
import com.capsar.OmniRouter.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by Nick on 7/30/14.
 */
public class ItemLinker extends Item
{
	public IIcon blankIcon;
	public IIcon storedIcon;

	public static boolean isLinked;

	public ItemLinker()
	{
		super();
		this.setCreativeTab(OmniRouter.tabOmni);
		this.setUnlocalizedName(Reference.MOD_ID + ".linker");
		this.setTextureName(Reference.MOD_ID + ":routerLinker");
		this.setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir)
	{
		itemIcon = ir.registerIcon(Reference.MOD_ID + ":linker_blank");
		blankIcon = ir.registerIcon(Reference.MOD_ID + ":linker_blank");
		storedIcon = ir.registerIcon(Reference.MOD_ID + ":linker_stored");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
	{
		if(!isLinked)
		{
			return blankIcon;
		}
		else
		{
			return storedIcon;
		}
	}


	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int hitSide, float hitX, float hitY, float hitZ)
	{
		if(player.isSneaking() && !isLinked)
		{
			player.swingItem();
			isLinked = true;
		}
		else if(player.isSneaking())
		{
			player.swingItem();
		}
		return false;
	}
}
