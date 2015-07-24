package ch.toothwit.antihunger.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class PlayerEventListener implements Listener {
	
	@EventHandler
	public void onFoodLevelChangeEvent(FoodLevelChangeEvent event){
		if(event.getEntityType() == EntityType.PLAYER){
			event.setCancelled(true); 
		}
	} 
}
