package com.github.pabszito.betterchatlab.api.modifier;

import com.github.pabszito.betterchatlab.api.modifier.result.MessageModifierResult;

// TODO: explain what a message modifier is
public interface MessageModifier {

    /**
     * @return The ID of the chat modifier.
     */
    String getId();

    /**
     * @return The display name of the chat modifier.
     */
    String getDisplayName();

    /**
     * Checks if the message can be sent or if it should be cancelled.
     * It also may modify the original message to something different
     * depending on the {@link MessageModifier}.
     * @return The result of this modifier.
     */
    MessageModifierResult getResult(String originalMessage);
}
