package ch.toothwit.antirain.main;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;
import ch.toothwit.antirain.events.ServerEventListener;
public class AntiRain extends JavaPlugin {
	@Override
    public void onDisable() {
        super.onDisable();
        getLogger().info(this.getName() + "disabled successfully!");
    }

    @Override
    public void onEnable() {
        super.onEnable();
        getServer().getPluginManager().registerEvents(new ServerEventListener(), this);

        for (World w : getServer().getWorlds()) {
            if (w.isThundering())
                w.setThundering(false);
            if (w.hasStorm())
                w.setStorm(false);
        }

        getLogger().info(this.getName() + "enabled successfully!");
    }
}
