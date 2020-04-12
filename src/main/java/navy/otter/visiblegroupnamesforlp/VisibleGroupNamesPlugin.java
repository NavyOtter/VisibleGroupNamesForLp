package navy.otter.visiblegroupnamesforlp;

import navy.otter.visiblegroupnamesforlp.listener.PlayerJoinListener;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class VisibleGroupNamesPlugin extends JavaPlugin {

  static LuckPerms api = LuckPermsProvider.get();

  @Override
  public void onEnable() {

    Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
  }

  public static LuckPerms getApi() {
    return api;
  }
}
