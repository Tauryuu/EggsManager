package dk.shax;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class EggsManagerCommandExecutor implements CommandExecutor {
	
	private EggsManager plugin;
	
	public EggsManagerCommandExecutor(EggsManager instance) {
		this.plugin = instance;
	}

    public boolean onCommand (CommandSender sender, Command command, String label, String[] args) {
    	if (sender.hasPermission("eggsmanager.admin") || sender.isOp()) {
        	if (command.getName().equals("eggsmanager")) {
        		if (args.length != 0){
    		    	if (args[0].equals("reset")) {
    		    	
    					if (args.length < 2) {
    						return false;
    					}
    					
    					if (Boolean.parseBoolean(args[1]) == true) {
    						FileConfiguration config = plugin.getConfig();
    						config.set("configuration.eggspawn.skeleton", false);
    						config.set("configuration.eggspawn.creeper", false);
    						config.set("configuration.eggspawn.slime", false);
    						config.set("configuration.eggspawn.zombie", false);
    						config.set("configuration.eggspawn.spider", false);
    						config.set("configuration.eggspawn.chicken", false);
    						config.set("configuration.eggspawn.cavespider", false);
    						config.set("configuration.eggspawn.cow", false);
    						config.set("configuration.eggspawn.enderman", false);
    						config.set("configuration.eggspawn.wolf", false);
    						config.set("configuration.eggspawn.pigzombie", false);
    						config.set("configuration.eggspawn.squid", false);
    						config.set("configuration.eggspawn.magmacube", false);
    						config.set("configuration.eggspawn.sheep", false);
    						config.set("configuration.eggspawn.blaze", false);
    						config.set("configuration.eggspawn.villager", false);
    						config.set("configuration.eggspawn.silverfish", false);
    						config.set("configuration.eggspawn.pig", false);
    						config.set("configuration.eggspawn.ghast", false);
    						config.set("configuration.eggspawn.mooshroom", false);
    						config.set("configuration.eggspawn.endercrystal", false);
    						config.set("configuration.eggspawn.boat", false);
    						config.set("configuration.eggspawn.minecart", false);
    						config.set("configuration.eggspawn.minecartwithchest", false);
    						config.set("configuration.eggspawn.poweredminecart", false);
    						config.set("configuration.eggspawn.experienceorb", false);
    						config.set("configuration.eggspawn.snowball", false);
    						config.set("configuration.eggspawn.chickenegg", false);
    						config.set("configuration.eggspawn.endereye", false);
    						config.set("configuration.eggspawn.tnt", false);
    						config.set("configuration.eggspawn.sand", false);
    						config.set("configuration.eggspawn.fishingbobber", false);
    						config.set("configuration.eggspawn.paintings", false);
    						config.set("configuration.messages.touser", true);
    						config.set("configuration.messages.usermessage", "You cannot place this egg!");
    						plugin.saveConfig();
    						
    						sender.sendMessage(ChatColor.GREEN + "EggsManager configuration reset.");
    					
    						return true;
    					}
    		    	} else if (args[0].equals("reload")){
    					if (args.length < 2){
    						return false;
    					}
    					
    					if (Boolean.parseBoolean(args[1]) == true){
    						plugin.reloadConfig();
    						plugin.getConf();
    						sender.sendMessage("EggsManager reloaded.");
    						return true;
    					}
    		    		return false;
    		    	}
            	}
                return false;
        	}
    	}
		return false;
    }
}