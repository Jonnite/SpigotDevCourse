package me.jonnite.wardensmp.listener;

import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class MilkCowListener implements Listener {

    @EventHandler
    public void MilkCowEvent(PlayerInteractEntityEvent sigma){

        Player p = sigma.getPlayer();
        Entity e = sigma.getRightClicked();
        Cow cow = (Cow) e;


        if(!(e instanceof Cow)) {
            return;
        }

        if(!cow.isAdult()) {
            return;
        }
        ItemStack main = p.getInventory().getItemInMainHand();

        if(main != null && main.getType() == Material.BUCKET) {

            e.setVelocity(new Vector(2, 0.7, 2));
        }
    }
}
