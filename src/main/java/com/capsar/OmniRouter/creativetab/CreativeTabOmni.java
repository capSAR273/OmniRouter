package com.capsar.OmniRouter.creativetab;

/**
 * Created by adamc on 7/29/2014.
 */
import com.capsar.OmniRouter.init.modItems;
import com.capsar.OmniRouter.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabOmni
{
    public static final CreativeTabs OmniRouter = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(modItems.simplerouter);
        }
    };
}
