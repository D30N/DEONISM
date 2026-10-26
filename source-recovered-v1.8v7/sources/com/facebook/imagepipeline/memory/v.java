package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.b;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public abstract class v extends b<u> {
    private final int[] j;

    v(d.a.b.g.c cVar, f0 f0Var, g0 g0Var) {
        super(cVar, f0Var, g0Var);
        SparseIntArray sparseIntArray = f0Var.f1274c;
        this.j = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i >= iArr.length) {
                n();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
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
    public abstract u b(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void f(u uVar) {
        d.a.b.d.i.g(uVar);
        uVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int j(u uVar) {
        d.a.b.d.i.g(uVar);
        return uVar.a();
    }

    int y() {
        return this.j[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean p(u uVar) {
        d.a.b.d.i.g(uVar);
        return !uVar.isClosed();
    }
}
