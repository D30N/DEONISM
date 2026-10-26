package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* loaded from: assets/audience_network.dex */
public interface QL {
    boolean A9a(QJ qj);

    HttpURLConnection ABX(String str) throws IOException;

    InputStream ABY(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream ABZ(HttpURLConnection httpURLConnection) throws IOException;

    void ABq(HttpURLConnection httpURLConnection, QH qh, String str) throws IOException;

    byte[] ACA(InputStream inputStream) throws IOException;

    void AE2(OutputStream outputStream, byte[] bArr) throws IOException;
}
