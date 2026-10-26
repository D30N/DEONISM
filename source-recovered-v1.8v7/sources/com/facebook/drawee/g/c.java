package com.facebook.drawee.g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.f.p;
import com.facebook.infer.annotation.ReturnsOwnership;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c {
    @Nullable
    private static Drawable a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    @ReturnsOwnership
    private static e b(b bVar) {
        if (bVar.s() == null) {
            bVar.I(new e());
        }
        return bVar.s();
    }

    @Nullable
    private static p.b c(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return p.b.a;
            case 1:
                return p.b.f1206b;
            case 2:
                return p.b.f1207c;
            case 3:
                return p.b.f1208d;
            case 4:
                return p.b.e;
            case 5:
                return p.b.f;
            case 6:
                return p.b.g;
            case 7:
                return p.b.h;
            case 8:
                return p.b.i;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static b d(Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        b bVar = new b(context.getResources());
        e(bVar, context, attributeSet);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01e5 A[PHI: r1 r2 r3
      0x01e5: PHI (r1v17 boolean) = (r1v13 boolean), (r1v22 boolean) binds: [B:132:0x01e3, B:117:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r2v14 boolean) = (r2v11 boolean), (r2v17 boolean) binds: [B:132:0x01e3, B:117:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:132:0x01e3, B:117:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.drawee.g.b e(com.facebook.drawee.g.b r18, android.content.Context r19, @javax.annotation.Nullable android.util.AttributeSet r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.g.c.e(com.facebook.drawee.g.b, android.content.Context, android.util.AttributeSet):com.facebook.drawee.g.b");
    }
}
