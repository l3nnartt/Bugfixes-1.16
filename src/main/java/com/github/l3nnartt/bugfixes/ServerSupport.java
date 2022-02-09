package com.github.l3nnartt.bugfixes;

import net.labymod.api.event.events.client.gui.screen.overlay.PlayerTabListOverlayEvent;
import net.labymod.api.permissions.Permissions;
import net.labymod.servermanager.ChatDisplayAction;
import net.labymod.servermanager.Server;
import net.labymod.settings.elements.SettingsElement;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.PacketBuffer;
import java.util.List;

public class ServerSupport extends Server {

    public ServerSupport(String... addressNames) {
        super( "Bugfixes", addressNames);
    }

    public boolean isAllowed(Permissions.Permission permission) {
        return true;
    }

    @Override
    public void onJoin(ServerData serverData) {

    }

    @Override
    public ChatDisplayAction handleChatMessage(String s, String s1) throws Exception {
        return ChatDisplayAction.NORMAL;
    }

    @Override
    public void handlePayloadMessage(String s, PacketBuffer packetBuffer) throws Exception {

    }

    @Override
    public void handleTabInfoMessage(PlayerTabListOverlayEvent.Type type, String s, String s1) throws Exception {

    }

    @Override
    public void fillSubSettings(List<SettingsElement> list) {

    }
}