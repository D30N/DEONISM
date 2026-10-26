package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Gy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0510Gy implements Q5 {
    public int A00;

    @Nullable
    public String A01;

    @Nullable
    public Map<String, List<String>> A02;

    @Nullable
    public byte[] A03;

    public C0510Gy(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.Q5
    @Nullable
    public final byte[] A5T() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.Q5
    @Nullable
    public final String A5U() {
        byte[] bArr = this.A03;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.Q5
    @Nullable
    public final Map<String, List<String>> A6M() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.Q5
    public final int A77() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.Q5
    @Nullable
    public final String getUrl() {
        return this.A01;
    }
}
