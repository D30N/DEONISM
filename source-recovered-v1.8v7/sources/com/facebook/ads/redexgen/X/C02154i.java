package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02154i<T> implements InvocationHandler {
    public static byte[] A02;
    public ClassLoader A00;
    public T A01;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 125);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A02 = new byte[]{Byte.MAX_VALUE, 110, 119};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4i != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public C02154i(T impl, ClassLoader classLoader) {
        this.A01 = impl;
        this.A00 = classLoader;
    }

    @Nullable
    public static Object A00(final ClassLoader classLoader, Method method) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        int i = 0;
        Object objNewProxyInstance = null;
        Class<?> returnType = method.getReturnType();
        char c2 = returnType.equals(Void.TYPE) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    objNewProxyInstance = null;
                    c2 = 3;
                    break;
                case 3:
                    return objNewProxyInstance;
                case 4:
                    returnType = returnType;
                    i = 1;
                    if (!returnType.isPrimitive()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    method = method;
                    objNewProxyInstance = Array.get(Array.newInstance(method.getReturnType(), i), 0);
                    c2 = 3;
                    break;
                case 6:
                    returnType = returnType;
                    if (!returnType.equals(String.class)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    objNewProxyInstance = A02(0, 0, 105);
                    c2 = 3;
                    break;
                case '\b':
                    returnType = returnType;
                    if (!returnType.isInterface()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    classLoader = classLoader;
                    returnType = returnType;
                    Class[] clsArr = new Class[i];
                    clsArr[0] = returnType;
                    objNewProxyInstance = Proxy.newProxyInstance(classLoader, clsArr, new InvocationHandler() { // from class: com.facebook.ads.redexgen.X.4h
                        @Override // java.lang.reflect.InvocationHandler
                        @Nullable
                        public final Object invoke(Object obj, Method method2, Object[] objArr) {
                            return C02154i.A00(classLoader, method2);
                        }
                    });
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4i != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public final T A04() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4i != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    @Override // java.lang.reflect.InvocationHandler
    @SuppressLint({"CatchGeneralException"})
    public final Object invoke(Object obj, Method method, Object[] objArr) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        C02154i<T> c02154i = this;
        Throwable targetException = null;
        Object objInvoke = null;
        XJ xjA00 = null;
        Throwable th = null;
        Object objA00 = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c02154i = c02154i;
                        objInvoke = method.invoke(c02154i.A01, objArr);
                        c2 = '\n';
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!(th instanceof InvocationTargetException)) {
                            c2 = 7;
                            break;
                        } else {
                            c2 = 6;
                            break;
                        }
                    }
                case 6:
                    th = th;
                    targetException = ((InvocationTargetException) th).getTargetException();
                    if (!(targetException instanceof C01481r)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 7:
                    c02154i = c02154i;
                    method = method;
                    objA00 = A00(c02154i.A00, method);
                    xjA00 = C8B.A00();
                    if (xjA00 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    th = th;
                    xjA00 = xjA00;
                    xjA00.A04().A83(A02(0, 3, 99), C03008a.A0D, new C03018b(th));
                    c2 = '\t';
                    break;
                case '\t':
                    objA00 = objA00;
                    objInvoke = objA00;
                    c2 = '\n';
                    break;
                case '\n':
                    return objInvoke;
                case 11:
                    throw new IllegalStateException(targetException.getMessage());
            }
        }
    }
}
