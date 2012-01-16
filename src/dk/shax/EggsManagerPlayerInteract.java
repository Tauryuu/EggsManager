package dk.shax;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;

public class EggsManagerPlayerInteract extends PlayerListener {
	
	private EggsManager plugin;
	
	public EggsManagerPlayerInteract(EggsManager instance){
		
		this.plugin = instance;
	}
	
	public void onPlayerInteract(PlayerInteractEvent event){
		if (event.isCancelled()) {
			return;
		}
		
		Player player = event.getPlayer();
		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
		
			if (event.useItemInHand() != null){
				if (player.getItemInHand().getTypeId() == 383){
					if (!plugin.isAllowedSkeleton && player.getItemInHand().getData().getData() == 51){
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedCreeper && player.getItemInHand().getData().getData() == 50) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedSlime && player.getItemInHand().getData().getData() == 55) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedZombie && player.getItemInHand().getData().getData() == 54) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedSpider && player.getItemInHand().getData().getData() == 52) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedChicken && player.getItemInHand().getData().getData() == 93) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedCaveSpider && player.getItemInHand().getData().getData() == 59) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedCow && player.getItemInHand().getData().getData() == 92) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedEnderman && player.getItemInHand().getData().getData() == 58) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedWolf && player.getItemInHand().getData().getData() == 95) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedPigZombie && player.getItemInHand().getData().getData() == 57) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedSquid && player.getItemInHand().getData().getData() == 94) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedMagmaCube && player.getItemInHand().getData().getData() == 62) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedSheep && player.getItemInHand().getData().getData() == 91) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedBlaze && player.getItemInHand().getData().getData() == 61) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedVillager && player.getItemInHand().getData().getData() == 120) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedSilverfish && player.getItemInHand().getData().getData() == 60) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedPig && player.getItemInHand().getData().getData() == 90) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedGhast && player.getItemInHand().getData().getData() == 56) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedMooshroom && player.getItemInHand().getData().getData() == 96) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedEnderCrystal && player.getItemInHand().getData().getData() == 200) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedBoat && player.getItemInHand().getData().getData() == 1) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedExp && player.getItemInHand().getData().getData() == 2) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedMinecart && player.getItemInHand().getData().getData() == 10) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedMinecartWithChest && player.getItemInHand().getData().getData() == 11) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedPoweredMinecart && player.getItemInHand().getData().getData() == 12) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedEnderEye && player.getItemInHand().getData().getData() == 72) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedTNT && player.getItemInHand().getData().getData() == 20) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedSand && player.getItemInHand().getData().getData() == 21) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedPainting && player.getItemInHand().getData().getData() == 9) {
						not_allowed(player);
						event.setCancelled(true);
					} else if (!plugin.isAllowedBobber && player.getItemInHand().getData().getData() == 90) {
						not_allowed(player);
						event.setCancelled(true);
					}
				}
			}
		}		
	}
	
	public void not_allowed(Player player){
		if (plugin.toUser) {
			player.sendMessage(ChatColor.RED + plugin.userMessage);
		}
	}
}
