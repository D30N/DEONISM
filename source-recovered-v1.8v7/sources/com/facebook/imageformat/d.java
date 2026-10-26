package com.facebook.imageformat;

import com.facebook.imageformat.c;
import d.a.b.d.i;
import d.a.b.d.m;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    private static d f1246d;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private List<c.a> f1247b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f1248c = new a();

    private d() {
        f();
    }

    public static c b(InputStream inputStream) {
        return d().a(inputStream);
    }

    public static c c(InputStream inputStream) {
        try {
            return b(inputStream);
        } catch (IOException e) {
            m.a(e);
            throw null;
        }
    }

    public static synchronized d d() {
        if (f1246d == null) {
            f1246d = new d();
        }
        return f1246d;
    }

    private static int e(int i, InputStream inputStream, byte[] bArr) throws IOException {
        i.g(inputStream);
        i.g(bArr);
        i.b(bArr.length >= i);
        if (!inputStream.markSupported()) {
            return d.a.b.d.a.b(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return d.a.b.d.a.b(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }

    private void f() {
        this.a = this.f1248c.a();
        List<c.a> list = this.f1247b;
        if (list != null) {
            Iterator<c.a> it = list.iterator();
            while (it.hasNext()) {
                this.a = Math.max(this.a, it.next().a());
            }
        }
    }

    public c a(InputStream inputStream) throws IOException {
        i.g(inputStream);
        int i = this.a;
        byte[] bArr = new byte[i];
        int iE = e(i, inputStream, bArr);
        c cVarB = this.f1248c.b(bArr, iE);
        if (cVarB != null && cVarB != c.f1245b) {
            return cVarB;
        }
        List<c.a> list = this.f1247b;
        if (list != null) {
            Iterator<c.a> it = list.iterator();
            while (it.hasNext()) {
                c cVarB2 = it.next().b(bArr, iE);
                if (cVarB2 != null && cVarB2 != c.f1245b) {
                    return cVarB2;
                }
            }
        }
        return c.f1245b;
    }
}
