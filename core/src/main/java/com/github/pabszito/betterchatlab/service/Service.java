package com.github.pabszito.betterchatlab.service;

public interface Service {

    /**
     * Starts a service.
     */
    void start();

    /**
     * Stops a service.
     */
    default void stop() {}
}
