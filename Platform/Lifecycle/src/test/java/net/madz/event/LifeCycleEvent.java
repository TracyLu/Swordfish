package net.madz.event;

import demo.typed.RecoverMaster;

@LifeCycleEventListeners(RecoverMaster.class)
public enum LifeCycleEvent {

    INIT_EVENT,

    STARTUP_EVENT,

    READY,

    SHUTDOWN_EVENT,

    TERMINATION_EVENT
}
