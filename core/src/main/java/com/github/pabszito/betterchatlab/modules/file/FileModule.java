package com.github.pabszito.betterchatlab.modules.file;

import com.github.pabszito.betterchatlab.BetterChatLab;
import com.github.pabszito.betterchatlab.utils.Configuration;
import com.google.inject.AbstractModule;

public class FileModule extends AbstractModule {

    private final BetterChatLab plugin;

    public FileModule(BetterChatLab plugin) {
        this.plugin = plugin;
    }

    @Override
    protected void configure() {
        this.bind(Configuration.class)
                .toInstance(new Configuration(plugin, "config"));
    }
}
