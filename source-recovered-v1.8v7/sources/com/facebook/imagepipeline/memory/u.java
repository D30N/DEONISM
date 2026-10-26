package com.facebook.imagepipeline.memory;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public interface u {
    int a();

    int b(int i, byte[] bArr, int i2, int i3);

    byte c(int i);

    void close();

    @Nullable
    ByteBuffer d();

    long e();

    int f(int i, byte[] bArr, int i2, int i3);

    long g();

    void h(int i, u uVar, int i2, int i3);

    boolean isClosed();
}
