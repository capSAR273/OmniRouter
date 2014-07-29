package com.capsar.OmniRouter.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

/**
 * Created by adamc on 7/29/2014.
 */
public class configurationHandler
{
    public static void init(File configFile) {
        //create the configuration object from the configuration file
        net.minecraftforge.common.config.Configuration configuration = new Configuration();
        boolean configValue = false;
        try
        {
            //load the config file
            configuration.load();
            //read in properties from the config file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        } catch (Exception e)
        {
            //log the exception
        } finally
        {
            //save the config file
            configuration.save();
        }

        System.out.println("Config Test: "+ configValue);
    }

}
