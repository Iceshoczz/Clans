package com.lirtistasya.plugins.util;

import org.bukkit.ChatColor;

// TODO JavaDoc of BukkitPluginProperties
public abstract class BukkitPluginProperties {
	/**
	 * <code>public static final String COMMANDHELP_PLACEHOLDER_PARAM = "%p";</code>
	 */
	public static final String		COMMANDHELP_PLACEHOLDER_PARAM	= "%p";

	/**
	 * <code>public static final ChatColor CHATCOLOR_BROADCAST = ChatColor.DARK_AQUA;</code>
	 */
	public static final ChatColor	CHATCOLOR_BROADCAST				= ChatColor.DARK_AQUA;
	/**
	 * <code>public static final ChatColor CHATCOLOR_COMMAND = ChatColor.GOLD;</code>
	 */
	public static final ChatColor	CHATCOLOR_COMMAND				= ChatColor.GOLD;
	/**
	 * <code>public static final ChatColor CHATCOLOR_COMMAND_DESC = ChatColor.WHITE;</code>
	 */
	public static final ChatColor	CHATCOLOR_COMMAND_DESC			= ChatColor.WHITE;
	/**
	 * <code>public static final ChatColor CHATCOLOR_COMMAND_PARAM = ChatColor.GRAY;</code>
	 */
	public static final ChatColor	CHATCOLOR_COMMAND_PARAM			= ChatColor.GRAY;
	/**
	 * <code>public static final ChatColor CHATCOLOR_ERROR = ChatColor.DARK_RED;</code>
	 */
	public static final ChatColor	CHATCOLOR_ERROR					= ChatColor.DARK_RED;
	/**
	 * <code>public static final ChatColor CHATCOLOR_PLAYERMSG = ChatColor.YELLOW;</code>
	 */
	public static final ChatColor	CHATCOLOR_PLAYERMSG				= ChatColor.YELLOW;
	/**
	 * <code>public static final ChatColor CHATCOLOR_PLAYERMSG_PARAM = ChatColor.WHITE;</code>
	 */
	public static final ChatColor	CHATCOLOR_PLAYERMSG_PARAM		= ChatColor.WHITE;
	/**
	 * <code>public static final ChatColor CHATCOLOR_WARNING = ChatColor.YELLOW;</code>
	 */
	public static final ChatColor	CHATCOLOR_WARNING				= ChatColor.YELLOW;

	/**
	 * Generates a command help. You can use {@link #COMMANDHELP_PLACEHOLDER_PARAM} as a placeholder for command parameters. By using <code>":"</code> in the parameter <code>message</code> you
	 * indicate a command description.<br/>
	 * <br/>
	 * <strong>For example:</strong><br/>
	 * The method call <code>commandHelp("/command %p %p: description", "param1", "param2")</code> will output <code>"§6/command §7param1§6 §7param2§6:§f description"</code> where §x resembles a
	 * ChatColor which is separately defined in the <code>CHATCOLOR_</code> attributes of this class.<br/>
	 * <br/>
	 * You might also use the last parameter twice without using it as third method parameter. Thus, <code>commandHelp("/command %p %p", "param1")</code> will output
	 * <code>"§6/command §7param1§6 §7param1§6"</code>.
	 * 
	 * @param help
	 *            the raw command help message
	 * @param params
	 *            the command's parameters
	 * @return the command help
	 * @see org.bukkit.ChatColor ChatColor
	 * @see #CHATCOLOR_COMMAND
	 * @see #CHATCOLOR_COMMAND_DESC
	 * @see #CHATCOLOR_COMMAND_PARAM
	 */
	public static String commandHelp( String help, String... params ) {
		final int length = COMMANDHELP_PLACEHOLDER_PARAM.length();
		int i = 0;
		int pos = -1;
		String buffer = help;
		String ret = CHATCOLOR_COMMAND.toString();
		StringBuilder sb = new StringBuilder(ret);

		while (buffer.contains(COMMANDHELP_PLACEHOLDER_PARAM)) {
			pos = buffer.indexOf(COMMANDHELP_PLACEHOLDER_PARAM);

			buffer = buffer.replaceFirst(COMMANDHELP_PLACEHOLDER_PARAM, CHATCOLOR_COMMAND_PARAM + params[i] + CHATCOLOR_COMMAND);

			sb.append(buffer.substring(0, pos + length + params[i].length() + 2)); // +2 because of the length of a ChatColor instance
			buffer = buffer.substring(pos + length + params[i].length() + 2);
			if (i + 1 < params.length) i++;
		}

		sb.append(buffer.substring(0, buffer.length()));
		ret = sb.toString().replace(":", ":" + CHATCOLOR_COMMAND_DESC);

		return ret;
	}
}
