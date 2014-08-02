package com.capsar.OmniRouter;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler
{
	public static Configuration config;

	//sections to add to the config
	public static String general = "General";

	//options in the config
	public static boolean exampleOption;

	public static void init(Configuration config)
	{
		config.load();

		config.addCustomCategoryComment(general, "TEST SECTION PLEASE IGNORE");

		exampleOption = config.get(general, "exampleOption", true, "Description of option goes here.").getBoolean(exampleOption);

		if(config.hasChanged()) { config.save(); }
	}

	@SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            init(config);
        }
    }
}
