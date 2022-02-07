package com.github.l3nnartt.bugfixes;

import net.labymod.addon.AddonTransformer;
import net.labymod.api.TransformerType;

public class ExampleAddonTransformer extends AddonTransformer {

  @Override
  public void registerTransformers() {
    this.registerTransformer(TransformerType.VANILLA, "example.mixin.json");
  }
}
