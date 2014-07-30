package com.capsar.OmniRouter.item;

import com.capsar.OmniRouter.creativetab.CreativeTabOmni;
import com.capsar.OmniRouter.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;

/**
 * Created by adamc on 7/29/2014.
 */
public class simpleRouter extends Block
{
    public simpleRouter()
    {
        super(Material.rock);
        //this.getUnlocalizedName("simpleRouter");
        //this.getTextureName(Reference.MOD_ID + ":" + "simpleRouter");
        this.setCreativeTab(CreativeTabOmni.OmniRouter);

    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+ 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}
