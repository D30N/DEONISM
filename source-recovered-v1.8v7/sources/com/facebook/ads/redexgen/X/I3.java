package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.File;
import java.util.NavigableSet;

/* loaded from: assets/audience_network.dex */
public interface I3 {
    void A3P(String str, IF r2) throws I1;

    void A43(File file) throws I1;

    long A5Z();

    long A5b(String str, long j, long j2);

    @NonNull
    NavigableSet<I7> A5c(String str);

    long A5n(String str);

    ID A5o(String str);

    void ACN(I7 i7);

    void ACU(I7 i7) throws I1;

    void AD0(String str, long j) throws I1;

    File ADO(String str, long j, long j2) throws I1;

    I7 ADQ(String str, long j) throws InterruptedException, I1;

    @Nullable
    I7 ADR(String str, long j) throws I1;
}
