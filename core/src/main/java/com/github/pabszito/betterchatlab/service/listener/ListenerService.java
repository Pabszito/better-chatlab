package com.github.pabszito.betterchatlab.service.listener;

import com.github.pabszito.betterchatlab.BetterChatLab;
import com.github.pabszito.betterchatlab.service.Service;
import com.google.inject.Inject;
import org.bukkit.event.Listener;

import java.util.Set;

public class ListenerService implements Service {

    @Inject
    private Set<Listener> listeners;

    @Inject
    private BetterChatLab plugin;

    @Override
    public void start() {
        // Register each listener
        listeners.forEach(listener -> plugin.getServer().getPluginManager().registerEvents(listener, plugin));
    }
}
