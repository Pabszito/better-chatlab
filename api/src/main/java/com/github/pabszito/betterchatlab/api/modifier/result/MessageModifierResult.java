package com.github.pabszito.betterchatlab.api.modifier.result;

public class MessageModifierResult {

    private final boolean cancelled;
    private final String alert;
    private final String message;

    public MessageModifierResult(boolean cancelled, String alert, String message) {
        this.cancelled = cancelled;
        this.alert = alert;
        this.message = message;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public String getCancellationAlert() {
        return alert;
    }

    public String getFinalMessage() {
        return message;
    }
}
