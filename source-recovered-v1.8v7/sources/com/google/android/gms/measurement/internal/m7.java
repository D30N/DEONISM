package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class m7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final URL f1794b;

    /* renamed from: c, reason: collision with root package name */
    private final j7 f1795c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1796d;
    private final Map<String, String> e;
    private final /* synthetic */ k7 f;

    public m7(k7 k7Var, String str, URL url, byte[] bArr, Map<String, String> map, j7 j7Var) {
        this.f = k7Var;
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(url);
        com.google.android.gms.common.internal.q.k(j7Var);
        this.f1794b = url;
        this.f1795c = j7Var;
        this.f1796d = str;
        this.e = null;
    }

    private final void b(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f.j().z(new Runnable(this, i, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.l7

            /* renamed from: b, reason: collision with root package name */
            private final m7 f1775b;

            /* renamed from: c, reason: collision with root package name */
            private final int f1776c;

            /* renamed from: d, reason: collision with root package name */
            private final Exception f1777d;
            private final byte[] e;
            private final Map f;

            {
                this.f1775b = this;
                this.f1776c = i;
                this.f1777d = exc;
                this.e = bArr;
                this.f = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1775b.a(this.f1776c, this.f1777d, this.e, this.f);
            }
        });
    }

    final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.f1795c.a(this.f1796d, i, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnectionU;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        this.f.b();
        int responseCode = 0;
        try {
            httpURLConnectionU = this.f.u(this.f1794b);
            try {
                if (this.e != null) {
                    for (Map.Entry<String, String> entry : this.e.entrySet()) {
                        httpURLConnectionU.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                responseCode = httpURLConnectionU.getResponseCode();
                Map<String, List<String>> headerFields = httpURLConnectionU.getHeaderFields();
                try {
                    k7 k7Var = this.f;
                    byte[] bArrW = k7.w(httpURLConnectionU);
                    if (httpURLConnectionU != null) {
                        httpURLConnectionU.disconnect();
                    }
                    b(responseCode, null, bArrW, headerFields);
                } catch (IOException e) {
                    map2 = headerFields;
                    e = e;
                    if (httpURLConnectionU != null) {
                        httpURLConnectionU.disconnect();
                    }
                    b(responseCode, e, null, map2);
                } catch (Throwable th) {
                    map = headerFields;
                    th = th;
                    if (httpURLConnectionU != null) {
                        httpURLConnectionU.disconnect();
                    }
                    b(responseCode, null, null, map);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                map2 = null;
            } catch (Throwable th2) {
                th = th2;
                map = null;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnectionU = null;
            map2 = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionU = null;
            map = null;
        }
    }
}
