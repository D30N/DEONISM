package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0372Av {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A46(int i, int i2, int i3) throws C0371Au;

    ByteBuffer A6b();

    int A6c();

    int A6d();

    int A6e();

    boolean A7Y();

    boolean A7c();

    void AC0();

    void AC1(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
