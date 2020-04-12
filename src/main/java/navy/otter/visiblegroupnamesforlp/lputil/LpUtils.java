package navy.otter.visiblegroupnamesforlp.lputil;

import navy.otter.visiblegroupnamesforlp.VisibleGroupNamesPlugin;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.cacheddata.CachedMetaData;
import net.luckperms.api.model.user.User;
import net.luckperms.api.query.QueryOptions;
import org.bukkit.entity.Player;

public class LpUtils {

  static LuckPerms luckPerms = VisibleGroupNamesPlugin.getApi();

  public static String getPlayerPrefix(Player player) {

    if (!player.isOnline()) {
      throw new IllegalStateException("Player is offline");
    }
    User user = luckPerms.getUserManager().getUser(player.getUniqueId());
    if(user == null) {
      return null;
    }
    CachedMetaData metaData = user.getCachedData().getMetaData(QueryOptions.nonContextual());
    return metaData.getPrefix();
  }
}

