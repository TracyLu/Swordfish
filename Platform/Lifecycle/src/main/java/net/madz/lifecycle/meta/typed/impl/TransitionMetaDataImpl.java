package net.madz.lifecycle.meta.typed.impl;

import java.lang.reflect.Method;

import net.madz.common.DottedPath;
import net.madz.common.Dumper;
import net.madz.lifecycle.annotations.typed.ITypedTransition;
import net.madz.lifecycle.meta.typed.StateMachineMetaData;
import net.madz.lifecycle.meta.typed.TransitionMetaData;
import net.madz.meta.MetaData;
import net.madz.verification.VerificationFailureSet;

public class TransitionMetaDataImpl implements MetaData, TransitionMetaData {

    protected final TransitionTypeEnum type;
    protected final ITypedTransition transition;
    protected final long timeout;
    protected final StateMachineMetaData<?, ?, ?> parent;
    protected final DottedPath dottedPath;
    protected Method transitionMethod;

    public TransitionMetaDataImpl(StateMachineMetaData<?, ?, ?> parent, String name, TransitionTypeEnum type, ITypedTransition transition, long timeout) {
        super();
        this.parent = parent;
        this.dottedPath = parent.getDottedPath().append(name);
        this.type = type;
        this.transition = transition;
        this.timeout = timeout;
    }

    @Override
    public TransitionTypeEnum getType() {
        return type;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends ITypedTransition> T getTransition() {
        return (T) transition;
    }

    @Override
    public long getTimeout() {
        return timeout;
    }

    @Override
    public StateMachineMetaData<?, ?, ?> getParent() {
        return parent;
    }

    @Override
    public Method getTransitionMethod() {
        return this.transitionMethod;
    }

    public void setTransitionMethod(Method method) {
        this.transitionMethod = method;
    }

    @Override
    public DottedPath getDottedPath() {
        return dottedPath;
    }

    @Override
    public void verifyMetaData(VerificationFailureSet verificationSet) {
    }

    @Override
    public void dump(Dumper dumper) {
        dumper.dump(toString());
    }

    @Override
    public String toString() {
        return "TransitionMetaDataImpl [dottedPath=" + dottedPath + ", type=" + type + ", transition=" + transition + ", timeout=" + timeout
                + ", transitionMethod=" + transitionMethod + "]";
    }

}
