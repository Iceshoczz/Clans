package com.lirtistasya.plugins.util;

import static com.lirtistasya.plugins.util.BukkitPluginProperties.CHATCOLOR_BROADCAST;
import static com.lirtistasya.plugins.util.BukkitPluginProperties.CHATCOLOR_COMMAND;
import static com.lirtistasya.plugins.util.BukkitPluginProperties.CHATCOLOR_COMMAND_DESC;
import static com.lirtistasya.plugins.util.BukkitPluginProperties.CHATCOLOR_COMMAND_PARAM;
import static com.lirtistasya.plugins.util.BukkitPluginProperties.CHATCOLOR_ERROR;
import static com.lirtistasya.plugins.util.BukkitPluginProperties.CHATCOLOR_PLAYERMSG;
import static com.lirtistasya.plugins.util.BukkitPluginProperties.CHATCOLOR_PLAYERMSG_PARAM;
import static com.lirtistasya.plugins.util.BukkitPluginProperties.CHATCOLOR_WARNING;
import static org.bukkit.ChatColor.*;

public abstract class BukkitMessageReceiver {
	public static final String	BROADCAST			= "%b%";
	public static final String	COMMAND				= "%c%";
	public static final String	COMMAND_DESC		= "%cd%";
	public static final String	COMMAND_PARAM		= "%cp%";
	public static final String	ERROR				= "%e%";
	public static final String	PLAYERMSG			= "%p%";
	public static final String	PLAYERMSG_PARAM		= "%pp%";
	public static final String	WARNING				= "%w%";

	public static final String	COLOR_BLACK			= "&0";
	public static final String	COLOR_DARKBLUE		= "&1";
	public static final String	COLOR_DARKGREEN		= "&2";
	public static final String	COLOR_DARKAQUA		= "&3";
	public static final String	COLOR_DARKRED		= "&4";
	public static final String	COLOR_DARKPURPLE	= "&5";
	public static final String	COLOR_GOLD			= "&6";
	public static final String	COLOR_GRAY			= "&7";
	public static final String	COLOR_DARKGRAY		= "&8";
	public static final String	COLOR_BLUE			= "&9";
	public static final String	COLOR_GREEN			= "&a";
	public static final String	COLOR_AQUA			= "&b";
	public static final String	COLOR_RED			= "&c";
	public static final String	COLOR_LIGHTPURPLE	= "&d";
	public static final String	COLOR_YELLOW		= "&e";
	public static final String	COLOR_WHITE			= "&f";
	public static final String	COLOR_MAGIC			= "&k";
	public static final String	COLOR_BOLD			= "&l";
	public static final String	COLOR_STRIKETHROUGH	= "&m";
	public static final String	COLOR_UNDERLINE		= "&n";
	public static final String	COLOR_ITALIC		= "&o";
	public static final String	COLOR_RESET			= "&r";

	public abstract void sendMessage( String message );

	protected String parseMessage( String message ) {
		String ret = message;

		// Replace color codes by ChatColors
		ret = ret.replaceAll(COLOR_BLACK, BLACK.toString());
		ret = ret.replaceAll(COLOR_DARKBLUE, DARK_BLUE.toString());
		ret = ret.replaceAll(COLOR_DARKGREEN, DARK_GREEN.toString());
		ret = ret.replaceAll(COLOR_DARKAQUA, DARK_AQUA.toString());
		ret = ret.replaceAll(COLOR_DARKRED, DARK_RED.toString());
		ret = ret.replaceAll(COLOR_DARKPURPLE, DARK_PURPLE.toString());
		ret = ret.replaceAll(COLOR_GOLD, GOLD.toString());
		ret = ret.replaceAll(COLOR_GRAY, GRAY.toString());
		ret = ret.replaceAll(COLOR_DARKGRAY, DARK_GRAY.toString());
		ret = ret.replaceAll(COLOR_BLUE, BLUE.toString());
		ret = ret.replaceAll(COLOR_GREEN, GREEN.toString());
		ret = ret.replaceAll(COLOR_AQUA, AQUA.toString());
		ret = ret.replaceAll(COLOR_RED, RED.toString());
		ret = ret.replaceAll(COLOR_LIGHTPURPLE, LIGHT_PURPLE.toString());
		ret = ret.replaceAll(COLOR_YELLOW, YELLOW.toString());
		ret = ret.replaceAll(COLOR_WHITE, WHITE.toString());
		ret = ret.replaceAll(COLOR_MAGIC, MAGIC.toString());
		ret = ret.replaceAll(COLOR_BOLD, BOLD.toString());
		ret = ret.replaceAll(COLOR_STRIKETHROUGH, STRIKETHROUGH.toString());
		ret = ret.replaceAll(COLOR_UNDERLINE, UNDERLINE.toString());
		ret = ret.replaceAll(COLOR_ITALIC, ITALIC.toString());
		ret = ret.replaceAll(COLOR_RESET, RESET.toString());

		// Replace color placeholders by ChatColors
		ret = ret.replaceAll(BROADCAST, CHATCOLOR_BROADCAST.toString());
		ret = ret.replaceAll(COMMAND, CHATCOLOR_COMMAND.toString());
		ret = ret.replaceAll(COMMAND_DESC, CHATCOLOR_COMMAND_DESC.toString());
		ret = ret.replaceAll(COMMAND_PARAM, CHATCOLOR_COMMAND_PARAM.toString());
		ret = ret.replaceAll(ERROR, CHATCOLOR_ERROR.toString());
		ret = ret.replaceAll(PLAYERMSG, CHATCOLOR_PLAYERMSG.toString());
		ret = ret.replaceAll(PLAYERMSG_PARAM, CHATCOLOR_PLAYERMSG_PARAM.toString());
		ret = ret.replaceAll(WARNING, CHATCOLOR_WARNING.toString());

		return ret;
	}
}
