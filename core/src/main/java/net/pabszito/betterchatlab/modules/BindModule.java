package net.pabszito.betterchatlab.modules;

import com.google.inject.AbstractModule;
import net.pabszito.betterchatlab.BetterChatLab;

public class BindModule extends AbstractModule {

    private final BetterChatLab plugin;

    public BindModule(BetterChatLab plugin) {
        this.plugin = plugin;
    }

    @Override
    protected void configure() {
        this.bind(BetterChatLab.class).toInstance(plugin);
    }
}
