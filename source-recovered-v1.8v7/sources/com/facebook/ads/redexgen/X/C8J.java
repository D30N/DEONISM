package com.facebook.ads.redexgen.X;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.ads.redexgen.X.8J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8J {
    public static byte[] A04;
    public static final String A05;
    public static final Lock A06;
    public static final Lock A07;
    public static final ReentrantReadWriteLock A08;
    public SQLiteOpenHelper A00;
    public final XJ A01;
    public final XQ A03 = new XQ(this);
    public final XO A02 = new XO(this);

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 36);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A04 = new byte[]{-109, -121, -114, -58, -63, -67, -73, -64, -59, -78, -61, -78, -69, -63, -64, 114, 120, -110, -66, -69, -65, -69, -58, -110, -63, -66, -47, -66, -65, -66, -48, -62, -61, -14, -15, -61, -74, -88, -81, -88, -90, -73, -125, -41, -46, -50, -56, -47, -42, -111, -63, -69, -40, -69, -83, -32, -46, -31, -83, -78, -83, -95, -98, -79, -94, 125, 72, 110, 122, 119, 117, 72, 102, -124, 102, -123, -63, -33, -20, -20, -19, -14, -98, -31, -33, -22, -22, -98, -27, -29, -14, -62, -33, -14, -33, -32, -33, -15, -29, -98, -28, -16, -19, -21, -98, -14, -26, -29, -98, -45, -57, -98, -14, -26, -16, -29, -33, -30, -97, 87, -127, -122, Byte.MIN_VALUE, -123, 87, -66, -11, -26, -29, -16, -29, -66, -78, -31, -28, -42, -41, -28, -78, -44, -21, -78, -81, -79, -69, -36, -18, -34};
    }

    static {
        A07();
        StringBuilder sb = new StringBuilder();
        sb.append(A05(36, 14, 63));
        sb.append(XQ.A02.A01);
        String strA05 = A05(0, 2, 67);
        sb.append(strA05);
        String strA052 = A05(3, 6, 46);
        sb.append(strA052);
        String strA053 = A05(50, 1, 111);
        sb.append(strA053);
        sb.append(XQ.A01.A01);
        sb.append(strA05);
        String strA054 = A05(9, 6, 41);
        sb.append(strA054);
        sb.append(strA053);
        sb.append(XO.A03.A01);
        sb.append(strA05);
        sb.append(strA054);
        sb.append(strA053);
        sb.append(XO.A04.A01);
        sb.append(strA05);
        sb.append(strA054);
        sb.append(strA053);
        sb.append(XO.A09.A01);
        sb.append(strA05);
        sb.append(strA054);
        sb.append(strA053);
        sb.append(XO.A07.A01);
        sb.append(strA05);
        sb.append(strA054);
        sb.append(strA053);
        sb.append(XO.A06.A01);
        sb.append(strA05);
        sb.append(strA054);
        sb.append(strA053);
        sb.append(XO.A05.A01);
        sb.append(strA05);
        sb.append(strA054);
        sb.append(strA053);
        sb.append(XO.A02.A01);
        sb.append(strA05);
        sb.append(strA054);
        sb.append(strA053);
        sb.append(XO.A01.A01);
        sb.append(A05(66, 6, 4));
        sb.append(strA054);
        sb.append(A05(k.AppCompatTheme_windowFixedHeightMinor, 6, 19));
        sb.append(strA052);
        sb.append(A05(32, 4, 127));
        sb.append(strA054);
        sb.append(strA053);
        sb.append(XO.A08.A01);
        sb.append(A05(51, 3, k.AppCompatTheme_windowFixedHeightMinor));
        sb.append(strA052);
        sb.append(strA053);
        sb.append(XQ.A02.A01);
        sb.append(A05(132, 10, 110));
        sb.append(strA054);
        sb.append(strA053);
        sb.append(XO.A07.A01);
        sb.append(A05(144, 4, k.AppCompatTheme_windowFixedHeightMinor));
        A05 = sb.toString();
        A08 = new ReentrantReadWriteLock();
        A06 = A08.readLock();
        A07 = A08.writeLock();
    }

    public C8J(XJ xj) {
        this.A01 = xj;
    }

    private synchronized SQLiteDatabase A00() {
        if (this.A00 == null) {
            final XJ xj = this.A01;
            this.A00 = new SQLiteOpenHelper(xj, this) { // from class: com.facebook.ads.redexgen.X.8K
                public static byte[] A01;
                public static final String A02;
                public final C8J A00;

                public static String A00(int i, int i2, int i3) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 110);
                                i4++;
                                c2 = 2;
                                break;
                            case 4:
                                return new String(bArrCopyOfRange);
                        }
                    }
                }

                public static void A02() {
                    A01 = new byte[]{-46, -3, 11, 8, 9, -39, 13, -6, -5, 5, -2, -39, 2, -1, -39, -2, 17, 2, 12, 13, 12, -39, 28, 43, 26, 44, 33, 30, 44, 68, 71, 86, 8, 86, 17, 71, 69, -61, -26, -58, -29, -10, -29, -28, -29, -11, -25, -54, -25, -18, -14, -25, -12, -94, -27, -29, -16, -94, -16, -15, -10, -94, -28, -25, -94, -16, -9, -18, -18, -62, -60, -77, -71, -65, -77, -110, -40, -31, -28, -41, -37, -39, -32, -47, -35, -41, -21, -27, -110, -81, -110, -63, -64, -83, 10, 21, 29, 14, 27, -23, 29, 10, 11, 21, 14, -23, 46, 63, 46, 55, 61, 60, -23, 10, 13, 13, -23, 12, 24, 21, 30, 22, 23, -23, -49, -13, -12, -11, -16, 4, -5, 3, -49, -33};
                }

                static {
                    A02();
                    A02 = C8K.class.getSimpleName();
                }

                {
                    super(xj, A01(xj), (SQLiteDatabase.CursorFactory) null, 4);
                    if (this != null) {
                        this.A00 = this;
                        return;
                    }
                    throw new IllegalArgumentException(A00(37, 32, 20));
                }

                public static String A01(XJ xj2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
                    String processName = null;
                    Locale locale = Locale.US;
                    Object[] objArr = {A00(1, 0, 100)};
                    String strA00 = A00(29, 8, k.AppCompatTheme_windowActionModeOverlay);
                    String str = String.format(locale, strA00, objArr);
                    char c2 = !JQ.A1U(xj2) ? (char) 2 : (char) 3;
                    while (true) {
                        switch (c2) {
                            case 2:
                                return str;
                            case 3:
                                xj2 = xj2;
                                String packageName = xj2.getPackageName();
                                processName = ProcessUtils.getProcessName(xj2);
                                if (!packageName.equals(processName)) {
                                    c2 = 4;
                                    break;
                                } else {
                                    c2 = 6;
                                    break;
                                }
                            case 4:
                                processName = processName;
                                if (!TextUtils.isEmpty(processName)) {
                                    c2 = 5;
                                    break;
                                } else {
                                    c2 = 6;
                                    break;
                                }
                            case 5:
                                String packageName2 = '_' + processName;
                                return String.format(Locale.US, strA00, packageName2);
                            case 6:
                                return str;
                        }
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
                    C8N[] c8nArrA0M = this.A00.A0M();
                    int length = c8nArrA0M.length;
                    int i = 0;
                    char c2 = 2;
                    while (true) {
                        switch (c2) {
                            case 2:
                                if (i >= length) {
                                    c2 = 4;
                                    break;
                                } else {
                                    c2 = 3;
                                    break;
                                }
                            case 3:
                                sQLiteDatabase = sQLiteDatabase;
                                c8nArrA0M = c8nArrA0M;
                                C8N table = c8nArrA0M[i];
                                table.A07(sQLiteDatabase);
                                i++;
                                c2 = 2;
                                break;
                            case 4:
                                return;
                        }
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
                    C8N[] c8nArrA0M = this.A00.A0M();
                    int length = c8nArrA0M.length;
                    int i3 = 0;
                    char c2 = 2;
                    while (true) {
                        switch (c2) {
                            case 2:
                                if (i3 >= length) {
                                    c2 = 4;
                                    break;
                                } else {
                                    c2 = 3;
                                    break;
                                }
                            case 3:
                                sQLiteDatabase = sQLiteDatabase;
                                c8nArrA0M = c8nArrA0M;
                                C8N c8n = c8nArrA0M[i3];
                                c8n.A08(sQLiteDatabase);
                                c8n.A07(sQLiteDatabase);
                                i3++;
                                c2 = 2;
                                break;
                            case 4:
                                return;
                        }
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
                    super.onOpen(sQLiteDatabase);
                    if (!sQLiteDatabase.isReadOnly()) {
                        sQLiteDatabase.execSQL(A00(69, 25, 4));
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
                    char c2 = i == 2 ? (char) 2 : (char) 4;
                    while (true) {
                        switch (c2) {
                            case 2:
                                if (i2 < 3) {
                                    c2 = 4;
                                    break;
                                } else {
                                    c2 = 3;
                                    break;
                                }
                            case 3:
                                sQLiteDatabase = sQLiteDatabase;
                                sQLiteDatabase.execSQL(A00(1, 28, 75));
                                c2 = 4;
                                break;
                            case 4:
                                if (i > 3) {
                                    c2 = 7;
                                    break;
                                } else {
                                    c2 = 5;
                                    break;
                                }
                            case 5:
                                if (i2 < 4) {
                                    c2 = 7;
                                    break;
                                } else {
                                    c2 = 6;
                                    break;
                                }
                            case 6:
                                sQLiteDatabase = sQLiteDatabase;
                                C8H c8h = XO.A01;
                                sQLiteDatabase.execSQL(A00(94, 30, 91) + c8h.A01 + A00(0, 1, 68) + c8h.A02 + A00(k.AppCompatTheme_windowNoTitle, 10, 65));
                                c2 = 7;
                                break;
                            case 7:
                                return;
                        }
                    }
                }
            };
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized SQLiteDatabase A01() {
        SQLiteException e = null;
        for (int i = 0; i < 10; i++) {
            try {
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.A01.A04().A83(A05(24, 8, 57), C03008a.A0j, new C03018b(e));
        throw e;
        return A00();
    }

    public final int A08(int i) {
        A07.lock();
        try {
            return A0E().delete(A05(9, 6, 41), XO.A01.A01 + A05(72, 4, 34), new String[]{String.valueOf(i - 1)});
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A09() {
        A06.lock();
        try {
            return this.A02.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0A() {
        A06.lock();
        try {
            return this.A02.A0C();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0B() {
        A06.lock();
        try {
            return this.A03.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0C(int i) {
        A06.lock();
        try {
            return A0E().rawQuery(A05 + A05(17, 7, 78) + String.valueOf(i), null);
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0D(String str) {
        A06.lock();
        try {
            return this.A02.A0D(str);
        } finally {
            A06.unlock();
        }
    }

    public final SQLiteDatabase A0E() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return A01();
        }
        throw new IllegalStateException(A05(76, 43, 90));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8M != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9D != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> AsyncTask A0F(final C8M<T> c8m, final C9D<T> c9d) {
        Executor executor = M3.A06;
        final XJ xj = this.A01;
        return M0.A00(executor, new AsyncTask<Void, Void, T>(xj, c8m, c9d) { // from class: com.facebook.ads.redexgen.X.8I
            public static byte[] A04;
            public C8L A00;
            public final XJ A01;
            public final C8M<T> A02;
            public final C9D<T> A03;

            static {
                A02();
            }

            public static String A01(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 63);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A02() {
                A04 = new byte[]{9, 12, 25, 12, 15, 12, 30, 8};
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8I != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8M != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9D != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
            {
                this.A02 = c8m;
                this.A03 = c9d;
                this.A01 = xj;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8I != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            private final T A00(Void... voidArr) throws Throwable {
                if (C0601Ko.A02(this)) {
                    return null;
                }
                T tA03 = null;
                try {
                    try {
                        tA03 = this.A02.A03();
                        this.A00 = this.A02.A00();
                        return tA03;
                    } catch (Exception e) {
                        this.A01.A04().A83(A01(0, 8, 82), C03008a.A0k, new C03018b(e));
                        this.A00 = C8L.A08;
                        return tA03;
                    }
                } catch (Throwable th) {
                    C0601Ko.A00(th, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8I != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) throws Throwable {
                C8I<T> c8i = this;
                C8I<T> c8i2 = null;
                char c2 = C0601Ko.A02(c8i) ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            return (Object) null;
                        case 3:
                            c8i = c8i;
                            c8i2 = c8i;
                            c2 = 4;
                            break;
                        case 4:
                            try {
                                return c8i2.A00(voidArr);
                            } catch (Throwable th) {
                                C0601Ko.A00(th, c8i2);
                                return (Object) null;
                            }
                    }
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8I != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final void onPostExecute(T t) throws Throwable {
                C8I<T> c8i = this;
                C8I<T> c8i2 = null;
                char c2 = C0601Ko.A02(c8i) ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            return;
                        case 3:
                            c8i = c8i;
                            c8i2 = c8i;
                            c2 = 4;
                            break;
                        case 4:
                            try {
                                c8i2 = c8i2;
                                if (c8i2.A00 != null) {
                                    c2 = '\b';
                                    break;
                                } else {
                                    c2 = 6;
                                    break;
                                }
                            } catch (Throwable th) {
                                C0601Ko.A00(th, c8i2);
                                return;
                            }
                        case 6:
                            c8i2.A03.A02(t);
                            return;
                        case '\b':
                            C8I<T> c8i3 = c8i2;
                            c8i3.A03.A01(c8i3.A00.A02(), c8i3.A00.A03());
                            return;
                    }
                }
            }
        }, new Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9D != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final AsyncTask A0G(String str, int i, String str2, double d2, double d3, String str3, Map<String, String> map, C9D<String> c9d) {
        return A0F(new EW(this, str2, str, i, d2, d3, str3, map), c9d);
    }

    public final void A0H() {
        A07.lock();
        try {
            this.A02.A09();
            this.A03.A09();
        } finally {
            A07.unlock();
        }
    }

    public final void A0I() {
        A07.lock();
        try {
            this.A03.A0D();
        } finally {
            A07.unlock();
        }
    }

    public final synchronized void A0J() {
        for (int i = 0; i < A0M().length; i++) {
        }
        if (this.A00 != null) {
            this.A00.close();
            this.A00 = null;
        }
    }

    public final boolean A0K(String str) {
        A07.lock();
        try {
            return this.A02.A0F(str);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0L(String str) throws SQLException {
        boolean z;
        A07.lock();
        try {
            A0E().execSQL(A05(59, 7, 57) + A05(9, 6, 41) + A05(54, 5, 105) + XO.A01.A01 + A05(2, 1, 45) + XO.A01.A01 + A05(15, 2, 35) + A05(125, 7, k.AppCompatTheme_windowMinWidthMajor) + XO.A03.A01 + A05(142, 2, 78), new String[]{str});
            z = true;
        } catch (SQLiteException unused) {
            z = false;
        }
        A07.unlock();
        return z;
    }

    public final C8N[] A0M() {
        return new C8N[]{this.A03, this.A02};
    }
}
