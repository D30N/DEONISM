package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(21)
/* loaded from: classes.dex */
public class i extends b<Bitmap> implements e {
    public i(d.a.b.g.c cVar, f0 f0Var, g0 g0Var) {
        super(cVar, f0Var, g0Var);
        n();
    }

    @Override // com.facebook.imagepipeline.memory.b
    protected int i(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.b
    protected int k(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Bitmap b(int i) {
        double d2 = i;
        Double.isNaN(d2);
        return Bitmap.createBitmap(1, (int) Math.ceil(d2 / 2.0d), Bitmap.Config.RGB_565);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void f(Bitmap bitmap) {
        d.a.b.d.i.g(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int j(Bitmap bitmap) {
        d.a.b.d.i.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    @Nullable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Bitmap l(g<Bitmap> gVar) {
        Bitmap bitmap = (Bitmap) super.l(gVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean p(Bitmap bitmap) {
        d.a.b.d.i.g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
