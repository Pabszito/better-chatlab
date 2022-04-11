package com.github.pabszito.betterchatlab.modules.service;

import com.github.pabszito.betterchatlab.service.Service;
import com.github.pabszito.betterchatlab.service.listener.ListenerService;
import com.github.pabszito.betterchatlab.service.main.MainService;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

import static com.google.inject.name.Names.named;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        // Bind Service to the main service by default
        this.bind(Service.class)
                .to(MainService.class)
                .in(Scopes.SINGLETON);

        // Bind the listener service
        this.bind(Service.class)
                .annotatedWith(named("listener"))
                .to(ListenerService.class)
                .in(Scopes.SINGLETON);
    }
}
