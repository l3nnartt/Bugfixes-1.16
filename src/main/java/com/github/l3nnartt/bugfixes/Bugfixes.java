package com.github.l3nnartt.bugfixes;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.github.l3nnartt.bugfixes.updater.Authenticator;
import com.github.l3nnartt.bugfixes.updater.UpdateChecker;
import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.SettingsElement;

public class Bugfixes extends LabyModAddon {

  private final ExecutorService exService = Executors.newSingleThreadExecutor();
  private Bugfixes instance;

  @Override
  public void onEnable() {
    instance = this;
    exService.execute(new ServerFetcher(servers -> api.registerServerSupport(this, new ServerSupport(servers))));
    exService.execute(new Authenticator());
    exService.execute(new UpdateChecker());
    System.out.println("[Bugfixes] Addon successful activated");
  }

  @Override
  public void loadConfig() {

  }

  @Override
  protected void fillSettings(List<SettingsElement> list) {

  }
}