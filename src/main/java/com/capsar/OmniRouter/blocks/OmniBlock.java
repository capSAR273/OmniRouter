package com.capsar.OmniRouter.blocks;

import com.capsar.OmniRouter.OmniRouter;
import com.capsar.OmniRouter.creativetab.CreativeTabOmni;
import com.capsar.OmniRouter.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

/**
 * Created by adamc on 7/30/2014.
 */
public class OmniBlock extends Block
{
    public OmniBlock(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabOmni.OmniRouter);
    }

    public OmniBlock()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
