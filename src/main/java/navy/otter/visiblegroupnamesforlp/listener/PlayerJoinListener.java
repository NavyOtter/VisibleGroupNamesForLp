package navy.otter.visiblegroupnamesforlp.listener;

import navy.otter.visiblegroupnamesforlp.lputil.LpUtils;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent e) {
    Player player = e.getPlayer();
    String prefix = LpUtils.getPlayerPrefix(player);

    if(prefix == null) {
      return;
    }
    String coloredPrefix = ChatColor.translateAlternateColorCodes('&', prefix);

    player.setDisplayName(prefix + player.getName());
  }
}
