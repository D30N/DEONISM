package com.example.samplestickerapp;

import android.app.Application;

/* loaded from: classes.dex */
public class StickerApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        com.facebook.drawee.b.a.c.a(this);
    }
}
