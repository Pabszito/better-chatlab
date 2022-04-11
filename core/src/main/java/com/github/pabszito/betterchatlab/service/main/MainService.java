package com.github.pabszito.betterchatlab.service.main;

import com.github.pabszito.betterchatlab.BetterChatLab;
import com.github.pabszito.betterchatlab.service.Service;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.Arrays;

public class MainService implements Service {

    @Inject @Named("listener")
    private Service listenerService;

    @Inject
    private BetterChatLab plugin;

    @Override
    public void start() {
        // Start all required services
        startServices(listenerService);

        // Log that the plugin has been enabled
        plugin.getLogger().info(
                "BetterChatLab version " + plugin.getDescription().getVersion() + " has been enabled!"
        );
    }

    @Override
    public void stop() {
        // Stop all services - although none of the ones
        // we have right now require it
        stopServices();

        // Log that the plugin was disabled
        plugin.getLogger().info(
                "BetterChatLab version " + plugin.getDescription().getVersion() + " has been disabled!"
        );
    }

    /**
     * Loops through an array of services and starts them.
     * @param services The list of services to start.
     */
    private void startServices(Service... services) {
        Arrays.stream(services).forEach(Service::start);
    }

    /**
     * Loops through an array of services and stops them.
     * @param services The list of services to stop.
     */
    private void stopServices(Service... services) {
        Arrays.stream(services).forEach(Service::stop);
    }
}
