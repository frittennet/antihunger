package net.fritten.antihunger;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import net.fritten.antihunger.events.PlayerEventListener;

public final class AntiHunger extends JavaPlugin {

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info(this.getName() + "disabled successfully!");
    }

    @Override
    public void onEnable() {
        super.onEnable();
        getServer().getPluginManager().registerEvents(new PlayerEventListener(), this);

        for(Player player : Bukkit.getOnlinePlayers()){
            player.setSaturation(20f);
        }

        getLogger().info(this.getName() + "enabled successfully!");
    }
}
