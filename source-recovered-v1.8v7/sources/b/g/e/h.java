package b.g.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import b.g.d.c.c;
import b.g.i.b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class h {
    private ConcurrentHashMap<Long, c.b> a = new ConcurrentHashMap<>();

    class a implements c<b.f> {
        a(h hVar) {
        }

        @Override // b.g.e.h.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(b.f fVar) {
            return fVar.d();
        }

        @Override // b.g.e.h.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(b.f fVar) {
            return fVar.e();
        }
    }

    class b implements c<c.C0022c> {
        b(h hVar) {
        }

        @Override // b.g.e.h.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(c.C0022c c0022c) {
            return c0022c.e();
        }

        @Override // b.g.e.h.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(c.C0022c c0022c) {
            return c0022c.f();
        }
    }

    private interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    h() {
    }

    private void a(Typeface typeface, c.b bVar) throws NoSuchFieldException {
        long j = j(typeface);
        if (j != 0) {
            this.a.put(Long.valueOf(j), bVar);
        }
    }

    private c.C0022c f(c.b bVar, int i) {
        return (c.C0022c) g(bVar.a(), i, new b(this));
    }

    private static <T> T g(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(cVar.a(t2) - i2) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > iAbs) {
                t = t2;
                i3 = iAbs;
            }
        }
        return t;
    }

    private static long j(Typeface typeface) throws NoSuchFieldException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    public Typeface b(Context context, c.b bVar, Resources resources, int i) throws NoSuchFieldException {
        c.C0022c c0022cF = f(bVar, i);
        if (c0022cF == null) {
            return null;
        }
        Typeface typefaceD = b.g.e.c.d(context, resources, c0022cF.b(), c0022cF.a(), i);
        a(typefaceD, bVar);
        return typefaceD;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(h(fVarArr, i).c());
        } catch (IOException unused) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface typefaceD = d(context, inputStreamOpenInputStream);
            i.a(inputStreamOpenInputStream);
            return typefaceD;
        } catch (IOException unused2) {
            i.a(inputStreamOpenInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            i.a(inputStream);
            throw th;
        }
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File fileE = i.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (i.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        File fileE = i.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (i.c(fileE, resources, i)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected b.f h(b.f[] fVarArr, int i) {
        return (b.f) g(fVarArr, i, new a(this));
    }

    c.b i(Typeface typeface) throws NoSuchFieldException {
        long j = j(typeface);
        if (j == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(j));
    }
}
