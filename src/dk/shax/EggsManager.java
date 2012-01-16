package dk.shax;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class EggsManager extends JavaPlugin {
	
	private Logger log = Logger.getLogger("Minecraft");
	public boolean isAllowedSkeleton, isAllowedCreeper, isAllowedSlime, isAllowedZombie, isAllowedSpider, isAllowedChicken, isAllowedCaveSpider;
	public boolean isAllowedCow, isAllowedEnderman, isAllowedWolf, isAllowedPigZombie, isAllowedSquid, isAllowedMagmaCube, isAllowedSheep;
	public boolean isAllowedBlaze, isAllowedVillager, isAllowedSilverfish, isAllowedPig, isAllowedGhast, isAllowedMooshroom, isAllowedEnderCrystal;
	public boolean isAllowedBoat, isAllowedMinecart, isAllowedMinecartWithChest, isAllowedPoweredMinecart, isAllowedExp;
	public boolean isAllowedEnderEye, isAllowedTNT, isAllowedSand, isAllowedPainting, isAllowedBobber, toUser;
	public String userMessage;
	private EggsManagerCommandExecutor executor;
	private FileConfiguration config;
	
	public void onEnable() {
		this.getConf();
		this.logMessage("Plugin enabled.");
	}
	
	public void getConf() {
		config = null;
		config = getConfig();
		
		isAllowedSkeleton = config.getBoolean("configuration.eggspawn.skeleton", false);
		isAllowedCreeper = config.getBoolean("configuration.eggspawn.creeper", false);
		isAllowedSlime = config.getBoolean("configuration.eggspawn.slime", false);
		isAllowedZombie = config.getBoolean("configuration.eggspawn.zombie", false);
		isAllowedSpider = config.getBoolean("configuration.eggspawn.spider", false);
		isAllowedChicken = config.getBoolean("configuration.eggspawn.chicken", false);
		isAllowedCaveSpider = config.getBoolean("configuration.eggspawn.cavespider", false);
		isAllowedCow = config.getBoolean("configuration.eggspawn.cow", false);
		isAllowedEnderman = config.getBoolean("configuration.eggspawn.enderman", false);
		isAllowedWolf = config.getBoolean("configuration.eggspawn.wolf", false);
		isAllowedPigZombie = config.getBoolean("configuration.eggspawn.pigzombie", false);
		isAllowedSquid = config.getBoolean("configuration.eggspawn.squid", false);
		isAllowedMagmaCube = config.getBoolean("configuration.eggspawn.magmacube", false);
		isAllowedSheep = config.getBoolean("configuration.eggspawn.sheep", false);
		isAllowedBlaze = config.getBoolean("configuration.eggspawn.blaze", false);
		isAllowedVillager = config.getBoolean("configuration.eggspawn.villager", false);
		isAllowedSilverfish = config.getBoolean("configuration.eggspawn.silverfish", false);
		isAllowedPig = config.getBoolean("configuration.eggspawn.pig", false);
		isAllowedGhast = config.getBoolean("configuration.eggspawn.ghast", false);
		isAllowedMooshroom = config.getBoolean("configuration.eggspawn.mooshroom", false);
		isAllowedEnderCrystal = config.getBoolean("configuration.eggspawn.endercrystal", false);
		isAllowedBoat = config.getBoolean("configuration.eggspawn.boat", false);
		isAllowedMinecart = config.getBoolean("configuration.eggspawn.minecart", false);
		isAllowedMinecartWithChest = config.getBoolean("configuration.eggspawn.minecartwithchest", false);
		isAllowedPoweredMinecart = config.getBoolean("configuration.eggspawn.poweredminecart", false);
		isAllowedExp = config.getBoolean("configuration.eggspawn.experienceorb", false);
		isAllowedEnderEye = config.getBoolean("configuration.eggspawn.endereye", false);
		isAllowedTNT = config.getBoolean("configuration.eggspawn.tnt", false);
		isAllowedSand = config.getBoolean("configuration.eggspawn.sand", false);
		isAllowedPainting = config.getBoolean("configuration.eggspawn.paintings", false);
		isAllowedBobber = config.getBoolean("configuration.eggspawn.fishingbobber", false);
		
		toUser = config.getBoolean("configuration.messages.touser", true);
		userMessage = config.getString("configuration.messages.usermessage", "You cannot place this egg!");

		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_INTERACT, new EggsManagerPlayerInteract(this), Priority.Highest, this);
		
		this.executor = new EggsManagerCommandExecutor(this);
		this.getCommand("eggsmanager").setExecutor(this.executor);
	}

	public void onDisable() {
		this.logMessage("Plugin disabled.");
	}
	
	protected void logMessage(String msg){
		// Log NAME + VERSION : MESSAGE
		PluginDescriptionFile pdFile = this.getDescription();
		this.log.info(pdFile.getName() + " " + pdFile.getVersion() + ": " + msg);
	}
}