package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.h0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class u extends com.facebook.imagepipeline.producers.c<c> {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f1401b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.common.time.b f1402c;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f1403b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.a f1404c;

        a(c cVar, h0.a aVar) {
            this.f1403b = cVar;
            this.f1404c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            u.this.j(this.f1403b, this.f1404c);
        }
    }

    class b extends e {
        final /* synthetic */ Future a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.a f1406b;

        b(u uVar, Future future, h0.a aVar) {
            this.a = future;
            this.f1406b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.n0
        public void b() {
            if (this.a.cancel(false)) {
                this.f1406b.b();
            }
        }
    }

    public static class c extends t {
        private long f;
        private long g;
        private long h;

        public c(k<d.a.e.j.e> kVar, m0 m0Var) {
            super(kVar, m0Var);
        }
    }

    public u(int i) {
        this(RealtimeSinceBootClock.get());
        this.a = i;
    }

    u(com.facebook.common.time.b bVar) {
        this.f1401b = Executors.newFixedThreadPool(3);
        this.f1402c = bVar;
    }

    private HttpURLConnection g(Uri uri, int i) throws IOException {
        HttpURLConnection httpURLConnectionO = o(uri);
        httpURLConnectionO.setConnectTimeout(this.a);
        int responseCode = httpURLConnectionO.getResponseCode();
        if (m(responseCode)) {
            return httpURLConnectionO;
        }
        if (!l(responseCode)) {
            httpURLConnectionO.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = httpURLConnectionO.getHeaderField("Location");
        httpURLConnectionO.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i <= 0 || uri2 == null || uri2.getScheme().equals(scheme)) {
            throw new IOException(i == 0 ? h("URL %s follows too many redirects", uri.toString()) : h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        return g(uri2, i - 1);
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i) {
        return i >= 200 && i < 300;
    }

    static HttpURLConnection o(Uri uri) {
        return (HttpURLConnection) d.a.b.k.f.n(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c a(k<d.a.e.j.e> kVar, m0 m0Var) {
        return new c(kVar, m0Var);
    }

    @Override // com.facebook.imagepipeline.producers.h0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, h0.a aVar) {
        cVar.f = this.f1402c.now();
        cVar.b().f(new b(this, this.f1401b.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void j(com.facebook.imagepipeline.producers.u.c r5, com.facebook.imagepipeline.producers.h0.a r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.g()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r2 = 5
            java.net.HttpURLConnection r1 = r4.g(r1, r2)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            com.facebook.common.time.b r2 = r4.f1402c     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            long r2 = r2.now()     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            com.facebook.imagepipeline.producers.u.c.l(r5, r2)     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            if (r1 == 0) goto L1d
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            r5 = -1
            r6.c(r0, r5)     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
        L1d:
            if (r0 == 0) goto L24
            r0.close()     // Catch: java.io.IOException -> L23
            goto L24
        L23:
        L24:
            if (r1 == 0) goto L3d
            goto L3a
        L27:
            r5 = move-exception
            goto L2e
        L29:
            r5 = move-exception
            r1 = r0
            goto L3f
        L2c:
            r5 = move-exception
            r1 = r0
        L2e:
            r6.a(r5)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L38
            r0.close()     // Catch: java.io.IOException -> L37
            goto L38
        L37:
        L38:
            if (r1 == 0) goto L3d
        L3a:
            r1.disconnect()
        L3d:
            return
        L3e:
            r5 = move-exception
        L3f:
            if (r0 == 0) goto L46
            r0.close()     // Catch: java.io.IOException -> L45
            goto L46
        L45:
        L46:
            if (r1 == 0) goto L4b
            r1.disconnect()
        L4b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.u.j(com.facebook.imagepipeline.producers.u$c, com.facebook.imagepipeline.producers.h0$a):void");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, String> e(c cVar, int i) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(cVar.g - cVar.f));
        map.put("fetch_time", Long.toString(cVar.h - cVar.g));
        map.put("total_time", Long.toString(cVar.h - cVar.f));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.h0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void b(c cVar, int i) {
        cVar.h = this.f1402c.now();
    }
}
