package com.lirtistasya.plugins.util;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

// TODO JavaDoc of BukkitCommandExecutor
/**
 * 
 * @author lirtistasya/mezzodrinker
 */
public abstract class BukkitCommandExecutor implements CommandExecutor {
	protected YamlConfiguration	config	= null;
	protected BukkitPlugin		plugin	= null;

	public abstract void load( File file );

	@Override
	public abstract boolean onCommand( CommandSender sender, Command command, String label, String[] args );

	public abstract void save( File file ) throws IOException;
}
