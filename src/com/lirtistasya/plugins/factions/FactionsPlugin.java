package com.lirtistasya.plugins.factions;

import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

import com.lirtistasya.plugins.util.BukkitPlugin;

public class FactionsPlugin extends BukkitPlugin {
	private YamlConfiguration	config		= null;
	private YamlConfiguration	factions	= null;

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		try {
			reload();
		} catch (IOException e) {
			error("Error while loading files:");
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		try {
			save();
		} catch (IOException e) {
			error("Error while saving files:");
			e.printStackTrace();
		}
	}

	@Override
	public void save() throws IOException {
		// TODO Auto-generated method stub
		config.save(getFile(FactionsProperties.CONFIG));
		factions.save(getFile(FactionsProperties.FACTIONS));
	}

	@Override
	public void reload() throws IOException {
		// TODO Auto-generated method stub
		config = YamlConfiguration.loadConfiguration(getFile(FactionsProperties.CONFIG));
		factions = YamlConfiguration.loadConfiguration(getFile(FactionsProperties.FACTIONS));
	}
}
