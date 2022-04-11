package com.github.pabszito.betterchatlab.modules.listener;

import com.github.pabszito.betterchatlab.listener.AsyncPlayerChatListener;
import com.github.pabszito.betterchatlab.listener.PlayerJoinListener;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import org.bukkit.event.Listener;

public class ListenerModule extends AbstractModule {

    @Override
    protected void configure() {
        // Create a new set binder for the Listener interface
        Multibinder<Listener> multibinder = Multibinder.newSetBinder(
                binder(),
                Listener.class
        );

        // Bind each listener
        multibinder.addBinding().to(AsyncPlayerChatListener.class);
        multibinder.addBinding().to(PlayerJoinListener.class);
    }
}
