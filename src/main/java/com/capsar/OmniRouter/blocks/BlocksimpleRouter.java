package com.capsar.OmniRouter.blocks;

import com.capsar.OmniRouter.OmniRouter;
import com.capsar.OmniRouter.creativetab.CreativeTabOmni;
import com.capsar.OmniRouter.blocks.OmniBlock;
import com.capsar.OmniRouter.reference.Reference;
import net.minecraft.block.material.Material;

/**
 * Created by adamc on 7/29/2014.
 */
public class BlocksimpleRouter extends OmniBlock
{
    public BlocksimpleRouter()
    {
        super();
        this.setCreativeTab(CreativeTabOmni.OmniRouter);
        this.setBlockName("simpleRouter");
        this.setBlockTextureName(Reference.MOD_ID + ":simpleRouter");
    }

}
