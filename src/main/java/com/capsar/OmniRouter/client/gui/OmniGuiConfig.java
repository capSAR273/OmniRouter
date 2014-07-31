package com.capsar.OmniRouter.client.gui;

import com.capsar.OmniRouter.OmniRouter;
import com.capsar.OmniRouter.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class OmniGuiConfig extends GuiConfig
{

    public OmniGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(OmniRouter.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(OmniRouter.config.toString()));
    }
}