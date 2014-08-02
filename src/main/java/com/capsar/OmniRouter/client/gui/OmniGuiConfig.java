package com.capsar.OmniRouter.client.gui;

import com.capsar.OmniRouter.ConfigHandler;
import com.capsar.OmniRouter.OmniRouter;
import com.capsar.OmniRouter.Reference;
import cpw.mods.fml.client.config.DummyConfigElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OmniGuiConfig extends GuiConfig
{

	private static Map<Class<? extends BaseModEntry>, String> sections = new HashMap<Class<? extends BaseModEntry>, String>();

	public OmniGuiConfig(GuiScreen parentScreen) {
		super(parentScreen, getConfigElements(), "Forge", false, false, I18n.format("info.omnirouter.config.title"));
	}

	private static List<IConfigElement> getConfigElements() {
		sections.put(GeneralEntry.class, ConfigHandler.general);

		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.add(new DummyConfigElement.DummyCategoryElement(sections.get(GeneralEntry.class), "info.omnirouter.config.section.general", GeneralEntry.class));


		return list;
	}

	private static class BaseModEntry extends GuiConfigEntries.CategoryEntry {

		public BaseModEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen() {
			String category = sections.get(this.getClass());
			return new GuiConfig(this.owningScreen, (new ConfigElement(OmniRouter.config.getCategory(category.toLowerCase()))).getChildElements(), Reference.MOD_ID, category, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, GuiConfig.getAbridgedConfigPath(OmniRouter.config.getConfigFile().getAbsolutePath()));
		}
	}

	public static class GeneralEntry extends BaseModEntry {

		public GeneralEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}
	}
}