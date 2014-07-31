package com.capsar.OmniRouter.blocks;

import com.capsar.OmniRouter.OmniRouter;
import com.capsar.OmniRouter.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockRouter extends Block
{
	public IIcon[] icon = new IIcon[3];

    public BlockRouter()
    {
        super(Material.iron);
        this.setCreativeTab(OmniRouter.tabOmni);
        this.setBlockName(Reference.MOD_ID + ".router");
        this.setBlockTextureName(Reference.MOD_ID + ":simpleRouter");
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir)
	{
		blockIcon = ir.registerIcon(Reference.MOD_ID + ":simpleRouter");
		this.icon[0] = ir.registerIcon(Reference.MOD_ID + ":router_simple");
		this.icon[1] = ir.registerIcon(Reference.MOD_ID + ":router_intermediate");
		this.icon[2] = ir.registerIcon(Reference.MOD_ID + ":router_advanced");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return this.icon[meta];
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item id, CreativeTabs tab, List list)
	{
		for (int i = 0; i < 3; i++)
		{
			list.add(new ItemStack(id, 1, i));
		}
	}

	@Override
	public int damageDropped(int meta)
	{
		return meta;
	}
}