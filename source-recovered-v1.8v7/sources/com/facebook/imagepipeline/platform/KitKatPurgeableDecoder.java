package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.memory.q;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import d.a.b.d.i;
import d.a.b.g.g;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(19)
@d.a.b.d.d
/* loaded from: classes.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c, reason: collision with root package name */
    private final q f1304c;

    @d.a.b.d.d
    public KitKatPurgeableDecoder(q qVar) {
        this.f1304c = qVar;
    }

    private static void i(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(d.a.b.h.a<g> aVar, BitmapFactory.Options options) {
        g gVarR = aVar.r();
        int size = gVarR.size();
        d.a.b.h.a<byte[]> aVarA = this.f1304c.a(size);
        try {
            byte[] bArrR = aVarA.r();
            gVarR.b(0, bArrR, 0, size);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrR, 0, size, options);
            i.h(bitmapDecodeByteArray, "BitmapFactory returned null");
            return bitmapDecodeByteArray;
        } finally {
            d.a.b.h.a.o(aVarA);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap e(d.a.b.h.a<g> aVar, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.f(aVar, i) ? null : DalvikPurgeableDecoder.f1298b;
        g gVarR = aVar.r();
        i.b(i <= gVarR.size());
        int i2 = i + 2;
        d.a.b.h.a<byte[]> aVarA = this.f1304c.a(i2);
        try {
            byte[] bArrR = aVarA.r();
            gVarR.b(0, bArrR, 0, i);
            if (bArr != null) {
                i(bArrR, i);
                i = i2;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrR, 0, i, options);
            i.h(bitmapDecodeByteArray, "BitmapFactory returned null");
            return bitmapDecodeByteArray;
        } finally {
            d.a.b.h.a.o(aVarA);
        }
    }
}
