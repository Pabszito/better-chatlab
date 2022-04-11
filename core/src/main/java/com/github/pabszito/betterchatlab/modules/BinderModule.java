package com.github.pabszito.betterchatlab.modules;

import com.github.pabszito.betterchatlab.modules.file.FileModule;
import com.github.pabszito.betterchatlab.modules.listener.ListenerModule;
import com.github.pabszito.betterchatlab.modules.service.ServiceModule;
import com.google.inject.AbstractModule;
import com.github.pabszito.betterchatlab.BetterChatLab;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class BinderModule extends AbstractModule {

    private final BetterChatLab plugin;

    public BinderModule(BetterChatLab plugin) {
        this.plugin = plugin;
    }

    @Override
    protected void configure() {
        // Bind the main instance of the plugin
        this.bind(BetterChatLab.class)
                .toInstance(plugin);

        // Install the file module
        this.install(new FileModule(plugin));

        // Install the service module
        this.install(new ServiceModule());

        // Install the listener module
        this.install(new ListenerModule());
    }

    /**
     * Creates a new injector based on this module.
     * @return A new Guice injector.
     */
    public Injector createInjector() {
        return Guice.createInjector(this);
    }
}
