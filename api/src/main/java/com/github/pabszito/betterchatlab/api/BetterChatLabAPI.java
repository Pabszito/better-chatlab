package com.github.pabszito.betterchatlab.api;

import com.github.pabszito.betterchatlab.api.modifier.MessageModifier;

import java.util.HashSet;
import java.util.Set;

public class BetterChatLabAPI {

    private static BetterChatLabAPI instance;
    private final Set<MessageModifier> messageModifiers;

    public BetterChatLabAPI() {
        if(instance != null) {
            throw new IllegalStateException("BetterChatLab was already initialized!");
        }

        instance = this;
        this.messageModifiers = new HashSet<>();
    }

    public static BetterChatLabAPI getInstance() {
        if(instance == null) {
            throw new IllegalStateException("BetterChatLab was not initialized yet!");
        }

        return instance;
    }

    public Set<MessageModifier> getMessageModifiers() {
        return messageModifiers;
    }
}
