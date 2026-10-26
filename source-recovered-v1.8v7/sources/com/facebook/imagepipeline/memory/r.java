package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.b;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class r extends b<byte[]> implements d.a.b.g.a {
    private final int[] j;

    public r(d.a.b.g.c cVar, f0 f0Var, g0 g0Var) {
        super(cVar, f0Var, g0Var);
        SparseIntArray sparseIntArray = f0Var.f1274c;
        this.j = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.j[i] = sparseIntArray.keyAt(i);
        }
        n();
    }

    @Override // com.facebook.imagepipeline.memory.b
    protected int i(int i) {
        if (i <= 0) {
            throw new b.C0054b(Integer.valueOf(i));
        }
        for (int i2 : this.j) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.b
    protected int k(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public byte[] b(int i) {
        return new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void f(byte[] bArr) {
        d.a.b.d.i.g(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int j(byte[] bArr) {
        d.a.b.d.i.g(bArr);
        return bArr.length;
    }
}
