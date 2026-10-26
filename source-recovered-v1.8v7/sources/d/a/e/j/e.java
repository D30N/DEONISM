package d.a.e.j;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.imageutils.HeifExifUtil;
import d.a.b.d.k;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes.dex */
public class e implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final d.a.b.h.a<d.a.b.g.g> f2562b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final k<FileInputStream> f2563c;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.imageformat.c f2564d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    @Nullable
    private d.a.e.d.a k;

    @Nullable
    private ColorSpace l;

    public e(k<FileInputStream> kVar) {
        this.f2564d = com.facebook.imageformat.c.f1245b;
        this.e = -1;
        this.f = 0;
        this.g = -1;
        this.h = -1;
        this.i = 1;
        this.j = -1;
        d.a.b.d.i.g(kVar);
        this.f2562b = null;
        this.f2563c = kVar;
    }

    public e(k<FileInputStream> kVar, int i) {
        this(kVar);
        this.j = i;
    }

    public e(d.a.b.h.a<d.a.b.g.g> aVar) {
        this.f2564d = com.facebook.imageformat.c.f1245b;
        this.e = -1;
        this.f = 0;
        this.g = -1;
        this.h = -1;
        this.i = 1;
        this.j = -1;
        d.a.b.d.i.b(d.a.b.h.a.u(aVar));
        this.f2562b = aVar.clone();
        this.f2563c = null;
    }

    private com.facebook.imageutils.b A() throws Throwable {
        InputStream inputStreamP;
        try {
            inputStreamP = p();
        } catch (Throwable th) {
            th = th;
            inputStreamP = null;
        }
        try {
            com.facebook.imageutils.b bVarB = com.facebook.imageutils.a.b(inputStreamP);
            this.l = bVarB.a();
            Pair<Integer, Integer> pairB = bVarB.b();
            if (pairB != null) {
                this.g = ((Integer) pairB.first).intValue();
                this.h = ((Integer) pairB.second).intValue();
            }
            if (inputStreamP != null) {
                try {
                    inputStreamP.close();
                } catch (IOException unused) {
                }
            }
            return bVarB;
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamP != null) {
                try {
                    inputStreamP.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private Pair<Integer, Integer> B() throws IOException {
        Pair<Integer, Integer> pairG = com.facebook.imageutils.f.g(p());
        if (pairG != null) {
            this.g = ((Integer) pairG.first).intValue();
            this.h = ((Integer) pairG.second).intValue();
        }
        return pairG;
    }

    @Nullable
    public static e f(e eVar) {
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public static void g(@Nullable e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    public static boolean v(e eVar) {
        return eVar.e >= 0 && eVar.g >= 0 && eVar.h >= 0;
    }

    public static boolean x(@Nullable e eVar) {
        return eVar != null && eVar.w();
    }

    private void z() {
        if (this.g < 0 || this.h < 0) {
            y();
        }
    }

    public void C(@Nullable d.a.e.d.a aVar) {
        this.k = aVar;
    }

    public void D(int i) {
        this.f = i;
    }

    public void E(int i) {
        this.h = i;
    }

    public void F(com.facebook.imageformat.c cVar) {
        this.f2564d = cVar;
    }

    public void G(int i) {
        this.e = i;
    }

    public void H(int i) {
        this.i = i;
    }

    public void I(int i) {
        this.g = i;
    }

    @Nullable
    public e a() {
        e eVar;
        k<FileInputStream> kVar = this.f2563c;
        if (kVar != null) {
            eVar = new e(kVar, this.j);
        } else {
            d.a.b.h.a aVarK = d.a.b.h.a.k(this.f2562b);
            if (aVarK == null) {
                eVar = null;
            } else {
                try {
                    eVar = new e((d.a.b.h.a<d.a.b.g.g>) aVarK);
                } finally {
                    d.a.b.h.a.o(aVarK);
                }
            }
        }
        if (eVar != null) {
            eVar.h(this);
        }
        return eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d.a.b.h.a.o(this.f2562b);
    }

    public void h(e eVar) {
        this.f2564d = eVar.o();
        this.g = eVar.t();
        this.h = eVar.n();
        this.e = eVar.q();
        this.f = eVar.l();
        this.i = eVar.r();
        this.j = eVar.s();
        this.k = eVar.j();
        this.l = eVar.k();
    }

    public d.a.b.h.a<d.a.b.g.g> i() {
        return d.a.b.h.a.k(this.f2562b);
    }

    @Nullable
    public d.a.e.d.a j() {
        return this.k;
    }

    @Nullable
    public ColorSpace k() {
        z();
        return this.l;
    }

    public int l() {
        z();
        return this.f;
    }

    public String m(int i) {
        d.a.b.h.a<d.a.b.g.g> aVarI = i();
        if (aVarI == null) {
            return "";
        }
        int iMin = Math.min(s(), i);
        byte[] bArr = new byte[iMin];
        try {
            d.a.b.g.g gVarR = aVarI.r();
            if (gVarR == null) {
                return "";
            }
            gVarR.b(0, bArr, 0, iMin);
            aVarI.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i2 = 0; i2 < iMin; i2++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i2])));
            }
            return sb.toString();
        } finally {
            aVarI.close();
        }
    }

    public int n() {
        z();
        return this.h;
    }

    public com.facebook.imageformat.c o() {
        z();
        return this.f2564d;
    }

    @Nullable
    public InputStream p() {
        k<FileInputStream> kVar = this.f2563c;
        if (kVar != null) {
            return kVar.get();
        }
        d.a.b.h.a aVarK = d.a.b.h.a.k(this.f2562b);
        if (aVarK == null) {
            return null;
        }
        try {
            return new d.a.b.g.i((d.a.b.g.g) aVarK.r());
        } finally {
            d.a.b.h.a.o(aVarK);
        }
    }

    public int q() {
        z();
        return this.e;
    }

    public int r() {
        return this.i;
    }

    public int s() {
        d.a.b.h.a<d.a.b.g.g> aVar = this.f2562b;
        return (aVar == null || aVar.r() == null) ? this.j : this.f2562b.r().size();
    }

    public int t() {
        z();
        return this.g;
    }

    public boolean u(int i) {
        com.facebook.imageformat.c cVar = this.f2564d;
        if ((cVar != com.facebook.imageformat.b.a && cVar != com.facebook.imageformat.b.l) || this.f2563c != null) {
            return true;
        }
        d.a.b.d.i.g(this.f2562b);
        d.a.b.g.g gVarR = this.f2562b.r();
        return gVarR.c(i + (-2)) == -1 && gVarR.c(i - 1) == -39;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean w() {
        /*
            r1 = this;
            monitor-enter(r1)
            d.a.b.h.a<d.a.b.g.g> r0 = r1.f2562b     // Catch: java.lang.Throwable -> L13
            boolean r0 = d.a.b.h.a.u(r0)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            d.a.b.d.k<java.io.FileInputStream> r0 = r1.f2563c     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.e.j.e.w():boolean");
    }

    public void y() {
        int iA;
        int iA2;
        com.facebook.imageformat.c cVarC = com.facebook.imageformat.d.c(p());
        this.f2564d = cVarC;
        Pair<Integer, Integer> pairB = com.facebook.imageformat.b.b(cVarC) ? B() : A().b();
        if (cVarC == com.facebook.imageformat.b.a && this.e == -1) {
            if (pairB == null) {
                return;
            } else {
                iA2 = com.facebook.imageutils.c.b(p());
            }
        } else {
            if (cVarC != com.facebook.imageformat.b.k || this.e != -1) {
                if (this.e == -1) {
                    iA = 0;
                    this.e = iA;
                }
                return;
            }
            iA2 = HeifExifUtil.a(p());
        }
        this.f = iA2;
        iA = com.facebook.imageutils.c.a(iA2);
        this.e = iA;
    }
}
