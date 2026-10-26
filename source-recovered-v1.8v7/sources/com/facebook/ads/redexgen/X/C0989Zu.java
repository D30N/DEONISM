package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0989Zu implements InterfaceC0429Dq {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0429Dq
    public final Metadata A4e(C0420Dd c0420Dd) {
        ByteBuffer buffer = c0420Dd.A01;
        byte[] bArrArray = buffer.array();
        int size = buffer.limit();
        C0544Ii c0544Ii = new C0544Ii(bArrArray, size);
        String strA0Q = c0544Ii.A0Q();
        String strA0Q2 = c0544Ii.A0Q();
        long jA0M = c0544Ii.A0M();
        long timescale = C0560Iy.A0G(c0544Ii.A0M(), 1000000L, jA0M);
        long presentationTimeUs = c0544Ii.A0M();
        long id = C0560Iy.A0G(presentationTimeUs, 1000L, jA0M);
        return new Metadata(new EventMessage(strA0Q, strA0Q2, id, c0544Ii.A0M(), Arrays.copyOfRange(bArrArray, c0544Ii.A06(), size), timescale));
    }
}
