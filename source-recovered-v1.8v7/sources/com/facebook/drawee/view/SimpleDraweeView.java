package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import d.a.b.d.i;
import d.a.b.d.k;
import d.a.b.k.f;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class SimpleDraweeView extends d {
    private static k<? extends com.facebook.drawee.d.b> i;
    private com.facebook.drawee.d.b h;

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(context, attributeSet);
    }

    private void h(Context context, @Nullable AttributeSet attributeSet) {
        int resourceId;
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                i.h(i, "SimpleDraweeView was not initialized!");
                this.h = i.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.facebook.drawee.a.SimpleDraweeView);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(com.facebook.drawee.a.SimpleDraweeView_actualImageUri)) {
                        k(Uri.parse(typedArrayObtainStyledAttributes.getString(com.facebook.drawee.a.SimpleDraweeView_actualImageUri)), null);
                    } else if (typedArrayObtainStyledAttributes.hasValue(com.facebook.drawee.a.SimpleDraweeView_actualImageResource) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(com.facebook.drawee.a.SimpleDraweeView_actualImageResource, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    public static void i(k<? extends com.facebook.drawee.d.b> kVar) {
        i = kVar;
    }

    protected com.facebook.drawee.d.b getControllerBuilder() {
        return this.h;
    }

    public void j(int i2, @Nullable Object obj) {
        k(f.d(i2), obj);
    }

    public void k(Uri uri, @Nullable Object obj) {
        com.facebook.drawee.d.b bVar = this.h;
        bVar.y(obj);
        com.facebook.drawee.i.d dVarB = bVar.b(uri);
        dVarB.a(getController());
        setController(dVarB.build());
    }

    public void l(@Nullable String str, @Nullable Object obj) {
        k(str != null ? Uri.parse(str) : null, obj);
    }

    public void setActualImageResource(int i2) {
        j(i2, null);
    }

    public void setImageRequest(d.a.e.l.a aVar) {
        com.facebook.drawee.d.b bVar = this.h;
        bVar.z(aVar);
        bVar.A(getController());
        setController(bVar.build());
    }

    @Override // com.facebook.drawee.view.c, android.widget.ImageView
    public void setImageResource(int i2) {
        super.setImageResource(i2);
    }

    @Override // com.facebook.drawee.view.c, android.widget.ImageView
    public void setImageURI(Uri uri) {
        k(uri, null);
    }

    public void setImageURI(@Nullable String str) {
        l(str, null);
    }
}
