package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class d extends c<com.facebook.drawee.g.a> {
    public d(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        g(context, attributeSet);
    }

    protected void g(Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("GenericDraweeView#inflateHierarchy");
        }
        com.facebook.drawee.g.b bVarD = com.facebook.drawee.g.c.d(context, attributeSet);
        setAspectRatio(bVarD.f());
        setHierarchy(bVarD.a());
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }
}
