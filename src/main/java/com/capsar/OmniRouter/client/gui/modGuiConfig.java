package com.capsar.OmniRouter.client.gui;

/**
 * Created by adamc on 7/29/2014.
 */
import com.capsar.OmniRouter.reference.Reference;
import com.capsar.OmniRouter.configuration.configurationHandler;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class modGuiConfig extends GuiConfig
{

    public modGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(configurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(configurationHandler.configuration.toString()));
    }
}
