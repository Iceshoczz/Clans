package com.lirtistasya.plugins.util;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

// TODO JavaDoc of BukkitPlugin
public abstract class BukkitPlugin extends JavaPlugin {
	public static YamlConfiguration	config	= null;

	/**
	 * Method that is called before the plugin gets enabled.
	 */
	@Override
	public abstract void onEnable();

	/**
	 * Method that is called before the plugin gets disabled.
	 */
	@Override
	public abstract void onDisable();

	/**
	 * Saves all files used by this plugin.
	 */
	public abstract void save() throws IOException;

	/**
	 * Reloads all files used by this plugin.
	 */
	public abstract void reload() throws IOException;

	/**
	 * Logs an info message to the server's logger.
	 * 
	 * @param message
	 *            the info message
	 */
	public void info( String message ) {
		getLogger().info(message);
	}

	/**
	 * Logs a warning to the server's logger.
	 * 
	 * @param message
	 *            the warning
	 */
	public void warning( String message ) {
		getLogger().log(Level.WARNING, BukkitPluginProperties.CHATCOLOR_WARNING + message);
	}

	/**
	 * Logs an error message to the server's logger.
	 * 
	 * @param message
	 *            the error message
	 */
	public void error( String message ) {
		getLogger().log(Level.SEVERE, BukkitPluginProperties.CHATCOLOR_ERROR + message);
	}

	/**
	 * Returns a File instance for the given file name located in the folder of this plugin.
	 * 
	 * @param name
	 *            the file's name
	 * @return the file
	 */
	public File getFile( String name ) {
		return new File(getDataFolder() + "/" + name);
	}
}
