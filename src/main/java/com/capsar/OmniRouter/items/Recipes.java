package com.capsar.OmniRouter.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by adamc on 7/31/2014.
 */
public class Recipes
{
    public static void init()
    {
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.linker), new Object[]{
                "T T",
                "I I",
                " D ",
                'T',Blocks.redstone_torch,
                'I',Blocks.iron_block,
                'D',Blocks.diamond_block
        });
    }
}
