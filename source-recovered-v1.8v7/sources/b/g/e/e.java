package b.g.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import b.g.d.c.c;
import b.g.i.b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
class e extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final Class f852b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor f853c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f854d;
    private static final Method e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f853c = constructor;
        f852b = cls;
        f854d = method2;
        e = method;
    }

    e() {
    }

    private static boolean k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f854d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f852b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        if (f854d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f854d != null;
    }

    private static Object n() {
        try {
            return f853c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // b.g.e.h
    public Typeface b(Context context, c.b bVar, Resources resources, int i) {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        for (c.C0022c c0022c : bVar.a()) {
            ByteBuffer byteBufferB = i.b(context, resources, c0022c.b());
            if (byteBufferB == null || !k(objN, byteBufferB, c0022c.c(), c0022c.e(), c0022c.f())) {
                return null;
            }
        }
        return l(objN);
    }

    @Override // b.g.e.h
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        b.d.g gVar = new b.d.g();
        for (b.f fVar : fVarArr) {
            Uri uriC = fVar.c();
            ByteBuffer byteBufferF = (ByteBuffer) gVar.get(uriC);
            if (byteBufferF == null) {
                byteBufferF = i.f(context, cancellationSignal, uriC);
                gVar.put(uriC, byteBufferF);
            }
            if (byteBufferF == null || !k(objN, byteBufferF, fVar.b(), fVar.d(), fVar.e())) {
                return null;
            }
        }
        Typeface typefaceL = l(objN);
        if (typefaceL == null) {
            return null;
        }
        return Typeface.create(typefaceL, i);
    }
}
