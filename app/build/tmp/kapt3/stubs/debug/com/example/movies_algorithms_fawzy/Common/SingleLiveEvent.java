package com.example.movies_algorithms_fawzy.Common;

import java.lang.System;

/**
 * * A lifecycle-aware observable that sends only new updates after subscription, used for events like
 * * navigation and Snackbar messages.
 * * <p>
 * * This avoids a common problem with events: on configuration change (like rotation) an update
 * * can be emitted if the observer is active. This LiveData only calls the observable if there's an
 * * explicit call to setValue() or call().
 * * <p>
 * * Note that only one observer is going to be notified of changes.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0017J\u0019\u0010\r\u001a\u00020\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0017\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Common/SingleLiveEvent;", "T", "Landroid/arch/lifecycle/MutableLiveData;", "()V", "mPending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "call", "", "observe", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "observer", "Landroid/arch/lifecycle/Observer;", "setValue", "t", "(Ljava/lang/Object;)V", "app_debug"})
public final class SingleLiveEvent<T extends java.lang.Object> extends android.arch.lifecycle.MutableLiveData<T> {
    private final java.util.concurrent.atomic.AtomicBoolean mPending = null;
    
    @android.support.annotation.MainThread()
    @java.lang.Override()
    public void observe(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.Observer<T> observer) {
    }
    
    @android.support.annotation.MainThread()
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.Nullable()
    @android.support.annotation.Nullable()
    T t) {
    }
    
    /**
     * * Used for cases where T is Void, to make calls cleaner.
     */
    @android.support.annotation.MainThread()
    public final void call() {
    }
    
    public SingleLiveEvent() {
        super();
    }
}