/**
 * 
 */
/**
 * @author augesrob
 *
 */
package me.augesrob.main;

import java.util.ArrayList;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Main extends JavaPlugin implements Listener {
	public void onEnable() {
		Bukkit.getConsoleSender()
				.sendMessage(ChatColor.GRAY + "**** " + ChatColor.RED + "SimpleRestart" + ChatColor.YELLOW
						+ " is now Enabled! - Version Using: " + ChatColor.RED + getDescription().getVersion()
						+ ChatColor.GRAY + " ****");
		Bukkit.getConsoleSender()
				.sendMessage(ChatColor.YELLOW + "               Made by: " + ChatColor.AQUA + "augesrob");
		System.out.println("Stop Enable!");
		getServer().getPluginManager().registerEvents(this, this);
		saveConfig();
	}

	public void onDisable() {
		System.out.println("Stop Disable!");
	}

	ArrayList<String> cooldownrp = new ArrayList();

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if ((sender instanceof Player)) {
			final Player player = (Player) sender;
			if ((label.equalsIgnoreCase("rp")) && (!this.cooldownrp.contains(player.getName()))
					&& (player.hasPermission("restartplus.use"))) {
				if (args.length == 0) {
					player.sendMessage(ChatColor.RED + "-=-=-=-=-=-=" + ChatColor.GOLD + ChatColor.BOLD
							+ getConfig().getString("Name") + ChatColor.RED + "=-=-=-=-=-=-");
					player.sendMessage("   ");
					player.sendMessage(ChatColor.GOLD + "- /rp [1-15-30-45-60][sec]" + ChatColor.GRAY
							+ " (Server restart in seconds)");
					player.sendMessage("   ");
					player.sendMessage(ChatColor.GOLD + "- /rp [1-15-30-45-60][min]" + ChatColor.GRAY
							+ " (Server restart in minutes)");
					player.sendMessage("   ");
					player.sendMessage(ChatColor.GOLD + "- /rp [1-12-24-48-72][hour]" + ChatColor.GRAY
							+ " (Server restart in hours)");
					player.sendMessage("   ");
					player.sendMessage(ChatColor.GRAY + "Example: /rp 30s <--- server restarts in 30 seconds");
					player.sendMessage("   ");
					player.sendMessage(ChatColor.RED + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
					player.sendMessage(ChatColor.GOLD + "Made by bestinworld532");
				} else if (args[0].equals("1sec")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 20L);
				} else if (args[0].equals("15sec")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
						}
					}, 100L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
						}
					}, 200L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
						}
					}, 220L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
						}
					}, 240L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
						}
					}, 260L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
						}
					}, 280L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 300L);
				} else if (args[0].equals("30sec")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 300L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 400L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 500L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 520L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 540L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 560L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 580L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 600L);
				} else if (args[0].equals("45sec")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 seconds\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 300L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 600L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 700L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 820L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 840L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 860L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 880L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 900L);
				} else if ((args[0].equals("60sec")) || (args[0].equals("1min"))) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 minute!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 minute\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 seconds\"" + ",color:aqua}");
						}
					}, 300L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 600L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 900L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 1000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 1100L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 1120L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 1140L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 1160L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 1180L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 1200L);
				} else if (args[0].equals("15min")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 minutes\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 minutes\"" + ",color:aqua}");
						}
					}, 6000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 minutes\"" + ",color:aqua}");
						}
					}, 12000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 minute!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 minute\"" + ",color:aqua}");
						}
					}, 16800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 seconds\"" + ",color:aqua}");
						}
					}, 17100L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 17400L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 17700L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 17800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 17900L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 17920L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 17940L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 17960L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 17980L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 18000L);
				} else if (args[0].equals("30min")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 minutes\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 minutes\"" + ",color:aqua}");
						}
					}, 18000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 minutes\"" + ",color:aqua}");
						}
					}, 24000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 minutes\"" + ",color:aqua}");
						}
					}, 30000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 minute!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 minute\"" + ",color:aqua}");
						}
					}, 34800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 seconds\"" + ",color:aqua}");
						}
					}, 35100L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 35400L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 35700L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 35800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 35900L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 35920L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 35940L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 35960L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 35980L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 36000L);
				} else if (args[0].equals("45min")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 minutes\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 minutes\"" + ",color:aqua}");
						}
					}, 18000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 minutes\"" + ",color:aqua}");
						}
					}, 36000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 minutes\"" + ",color:aqua}");
						}
					}, 42000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 minutes\"" + ",color:aqua}");
						}
					}, 48000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 minute!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 minute\"" + ",color:aqua}");
						}
					}, 52800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 seconds\"" + ",color:aqua}");
						}
					}, 53100L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 53400L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 53700L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 53800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 53900L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 53920L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 53940L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 53960L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 53980L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 54000L);
				} else if ((args[0].equals("60min")) || (args[0].equals("1hour"))) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 hour!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 hour\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 minutes\"" + ",color:aqua}");
						}
					}, 18000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 minutes\"" + ",color:aqua}");
						}
					}, 36000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 minutes\"" + ",color:aqua}");
						}
					}, 54000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 minutes\"" + ",color:aqua}");
						}
					}, 60000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 minutes\"" + ",color:aqua}");
						}
					}, 66000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 minute!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 minute\"" + ",color:aqua}");
						}
					}, 70800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 seconds\"" + ",color:aqua}");
						}
					}, 71100L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 71400L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 71700L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 71800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 71900L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 71920L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 71940L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 71960L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 71980L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 72000L);
				} else if (args[0].equals("12hour")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 12 hours!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"12 hours\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 hour!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 hour\"" + ",color:aqua}");
						}
					}, 792000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 minutes\"" + ",color:aqua}");
						}
					}, 810000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 minutes\"" + ",color:aqua}");
						}
					}, 828000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 minutes\"" + ",color:aqua}");
						}
					}, 846000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 minutes\"" + ",color:aqua}");
						}
					}, 852000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 minutes\"" + ",color:aqua}");
						}
					}, 858000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 minute!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 minute\"" + ",color:aqua}");
						}
					}, 862800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 seconds\"" + ",color:aqua}");
						}
					}, 863100L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 863400L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 863700L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 863800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 863900L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 863920L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 863940L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 863960L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 863980L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 864000L);
				} else if (args[0].equals("24hour")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 24 hours!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"24 hours\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 hour!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 hour\"" + ",color:aqua}");
						}
					}, 1656000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 minutes\"" + ",color:aqua}");
						}
					}, 1674000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 minutes\"" + ",color:aqua}");
						}
					}, 1692000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 minutes\"" + ",color:aqua}");
						}
					}, 1710000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 minutes\"" + ",color:aqua}");
						}
					}, 1716000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 minutes\"" + ",color:aqua}");
						}
					}, 1722000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 minute!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 minute\"" + ",color:aqua}");
						}
					}, 1726800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 seconds\"" + ",color:aqua}");
						}
					}, 1727100L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 1727400L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 1727700L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 1727800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 1727900L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 1727920L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 1727940L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 1727960L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 1727980L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 1728000L);
				} else if (args[0].equals("48hour")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 48 hours!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"48 hours\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 hour!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 hour\"" + ",color:aqua}");
						}
					}, 3384000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 minutes\"" + ",color:aqua}");
						}
					}, 3402000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 minutes\"" + ",color:aqua}");
						}
					}, 3420000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 minutes\"" + ",color:aqua}");
						}
					}, 3438000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 minutes\"" + ",color:aqua}");
						}
					}, 3444000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 minutes\"" + ",color:aqua}");
						}
					}, 3450000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 minute!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 minute\"" + ",color:aqua}");
						}
					}, 3454800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 seconds\"" + ",color:aqua}");
						}
					}, 3455100L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 3455400L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 3455700L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 3455800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 3455900L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 3455920L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 3455940L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 3455960L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 3455980L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 3456000L);
				} else if (args[0].equals("72hour")) {
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 72 hours!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"72 hours\"" + ",color:aqua}");
						}
					}, 0L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 hour!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 hour\"" + ",color:aqua}");
						}
					}, 5112000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 minutes\"" + ",color:aqua}");
						}
					}, 5130000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 minutes\"" + ",color:aqua}");
						}
					}, 5148000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 minutes\"" + ",color:aqua}");
						}
					}, 5166000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 minutes\"" + ",color:aqua}");
						}
					}, 5172000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 minutes!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 minutes\"" + ",color:aqua}");
						}
					}, 5178000L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 minute!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 minute\"" + ",color:aqua}");
						}
					}, 5182800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 45 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"45 seconds\"" + ",color:aqua}");
						}
					}, 5183100L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 30 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"30 seconds\"" + ",color:aqua}");
						}
					}, 5183400L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 15 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"15 seconds\"" + ",color:aqua}");
						}
					}, 5183700L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 10 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"10 seconds\"" + ",color:aqua}");
						}
					}, 5183800L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 5 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"5 seconds\"" + ",color:aqua}");
						}
					}, 5183900L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 4 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"4 seconds\"" + ",color:aqua}");
						}
					}, 5183920L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 3 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"3 seconds\"" + ",color:aqua}");
						}
					}, 5183940L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 2 seconds!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"2 seconds\"" + ",color:aqua}");
						}
					}, 5183960L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ Main.this.getConfig().getString("MainMessage") + ChatColor.AQUA + ChatColor.BOLD
									+ " 1 second!");
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "title " + player.getName()
									+ " title {text:\"Server restarting in...\"" + ",color:green}");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
									"title " + player.getName() + " subtitle {text:\"1 second\"" + ",color:aqua}");
						}
					}, 5183980L);
					this.cooldownrp.add(player.getName());
					getServer().getScheduler().scheduleSyncDelayedTask(this, new BukkitRunnable() {
						public void run() {
							Main.this.cooldownrp.remove(player.getName());
							Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED
									+ Main.this.getConfig().getString("Name") + ChatColor.GRAY + "]: " + ChatColor.GREEN
									+ ChatColor.BOLD + Main.this.getConfig().getString("RestartMessage"));
							player.playEffect(player.getLocation().add(0.0D, 1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
							player.playSound(player.getLocation(), Sound.NOTE_PIANO, 1.0F, 1.0F);
							Bukkit.getServer().shutdown();
						}
					}, 5184000L);
				}
			}
		}
		return false;
	}
}
