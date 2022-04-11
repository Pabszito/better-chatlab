package com.github.pabszito.betterchatlab;

import com.github.pabszito.betterchatlab.modules.BinderModule;
import com.github.pabszito.betterchatlab.service.Service;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.bukkit.plugin.java.JavaPlugin;

public class BetterChatLab extends JavaPlugin {

    @Inject
    private Service service;

    @Override
    public void onEnable() {
        // Create a new Binder Module
        BinderModule module = new BinderModule(this);

        // Create a new injector
        Injector injector = module.createInjector();

        // Inject members
        injector.injectMembers(this);

        // Start main service
        service.start();
    }

    @Override
    public void onDisable() {
        // Stop main service
        service.stop();
    }
}
