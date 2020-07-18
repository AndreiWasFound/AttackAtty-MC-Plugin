package me.andreiwasfound.attackatty;

import org.bukkit.plugin.java.JavaPlugin;

public class AttackAtty extends JavaPlugin {
	
	@Override
	public void onEnable() {
		this.getCommand("bonus").setExecutor(new BonusCommand());
	}
	
	@Override
	public void onDisable() {
		
	}

}
