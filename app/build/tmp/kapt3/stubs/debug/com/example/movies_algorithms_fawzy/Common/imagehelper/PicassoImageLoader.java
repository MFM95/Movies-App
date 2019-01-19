package com.example.movies_algorithms_fawzy.Common.imagehelper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fH\u0016J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Common/imagehelper/PicassoImageLoader;", "Lcom/example/movies_algorithms_fawzy/Common/imagehelper/ImageLoader;", "picasso", "Lcom/squareup/picasso/Picasso;", "(Lcom/squareup/picasso/Picasso;)V", "load", "", "url", "", "imageView", "Landroid/widget/ImageView;", "callback", "Lkotlin/Function1;", "", "fadeEffect", "FetchCallback", "app_debug"})
public final class PicassoImageLoader implements com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader {
    private final com.squareup.picasso.Picasso picasso = null;
    
    @java.lang.Override()
    public void load(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public void load(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, boolean fadeEffect) {
    }
    
    public PicassoImageLoader(@org.jetbrains.annotations.NotNull()
    com.squareup.picasso.Picasso picasso) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Common/imagehelper/PicassoImageLoader$FetchCallback;", "Lcom/squareup/picasso/Callback;", "delegate", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getDelegate", "()Lkotlin/jvm/functions/Function1;", "onError", "onSuccess", "app_debug"})
    static final class FetchCallback implements com.squareup.picasso.Callback {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> delegate = null;
        
        @java.lang.Override()
        public void onSuccess() {
        }
        
        @java.lang.Override()
        public void onError() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getDelegate() {
            return null;
        }
        
        public FetchCallback(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> delegate) {
            super();
        }
    }
}