package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class EO implements InterfaceC0935Xr {
    public static byte[] A02;
    public final XJ A00;
    public final C8J A01;

    static {
        A04();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 40);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A02 = new byte[]{-42, -39, -21, -34, -39, -10, -24, -10, -10, -20, -14, -15, -30, -20, -25, 12, 17, 8, -3, -16, 3, 3, -12, -4, -1, 3, -69, -72, -53, -72, -13, -18, -22, -28, -19, -34, -24, -29, 7, -7, 7, 7, -3, 3, 2, -13, 8, -3, 1, -7, 119, -107, -94, 91, -88, 84, -104, -103, -96, -103, -88, -103, 84, -107, -88, -88, -103, -95, -92, -88, -89, 84, -103, -84, -105, -103, -103, -104, -103, -104, 84, -103, -86, -103, -94, -88, -89, 98, 13, 8, 26, 15, 19, 11};
    }

    public EO(XJ xj) {
        this.A00 = xj;
        this.A01 = new C8J(xj);
    }

    private JSONArray A01(Cursor cursor) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(A00(88, 2, k.AppCompatTheme_windowNoTitle), cursor.getString(XO.A03.A00));
            jSONObject2.put(A00(30, 8, 87), cursor.getString(XO.A08.A00));
            jSONObject2.put(A00(15, 4, 112), cursor.getString(XO.A09.A00));
            jSONObject2.put(A00(90, 4, 126), C0627Lq.A02(cursor.getDouble(XO.A07.A00)));
            jSONObject2.put(A00(38, 12, 108), C0627Lq.A02(cursor.getDouble(XO.A06.A00)));
            jSONObject2.put(A00(5, 10, 91), cursor.getString(XO.A05.A00));
            String string = cursor.getString(XO.A02.A00);
            if (string != null) {
                jSONObject = new JSONObject(string);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject2.put(A00(26, 4, 47), jSONObject);
            jSONObject2.put(A00(19, 7, 103), cursor.getString(XO.A01.A00));
            jSONObject2.put(A00(0, 5, 77), this.A00.A02().A6T());
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    private JSONArray A02(Cursor cursor) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(A00(88, 2, k.AppCompatTheme_windowNoTitle), cursor.getString(2));
            jSONObject2.put(A00(30, 8, 87), cursor.getString(0));
            jSONObject2.put(A00(15, 4, 112), cursor.getString(4));
            jSONObject2.put(A00(90, 4, 126), C0627Lq.A02(cursor.getDouble(5)));
            jSONObject2.put(A00(38, 12, 108), C0627Lq.A02(cursor.getDouble(6)));
            jSONObject2.put(A00(5, 10, 91), cursor.getString(7));
            String string = cursor.getString(8);
            if (string != null) {
                jSONObject = new JSONObject(string);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject2.put(A00(26, 4, 47), jSONObject);
            jSONObject2.put(A00(19, 7, 103), cursor.getString(9));
            jSONObject2.put(A00(0, 5, 77), this.A00.A02().A6T());
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    public static JSONObject A03(Cursor cursor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    cursor = cursor;
                    if (!cursor.moveToNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    cursor = cursor;
                    jSONObject = jSONObject;
                    jSONObject.put(cursor.getString(XQ.A02.A00), cursor.getString(XQ.A01.A00));
                    c2 = 2;
                    break;
                case 4:
                    return jSONObject;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    @SuppressLint({"CatchGeneralException"})
    public final int A3y(int i) {
        EO eo = this;
        Exception e = null;
        int iA08 = 0;
        char c2 = i > -1 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        eo = eo;
                        iA08 = eo.A01.A08(i);
                        c2 = 7;
                        break;
                    } catch (Exception e2) {
                        e = e2;
                        if (!BuildConfigApi.isDebug()) {
                            c2 = 7;
                            break;
                        } else {
                            c2 = 6;
                            break;
                        }
                    }
                case 6:
                    e = e;
                    Log.e(InterfaceC0935Xr.A00, A00(50, 38, 12), e);
                    c2 = 7;
                    break;
                case 7:
                    EO eo2 = eo;
                    eo2.A01.A0I();
                    eo2.A01.A0J();
                    return iA08;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9G
    public final void A3z() {
        this.A01.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    public final boolean A4g(String str) {
        return this.A01.A0K(str);
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    @Nullable
    public final JSONArray A5K() throws Throwable {
        EO eo = this;
        JSONArray events = null;
        Throwable th = null;
        Cursor cursorA0A = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    eo = eo;
                    cursorA0A = eo.A01.A0A();
                    events = null;
                    if (cursorA0A.getCount() <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    try {
                        eo = eo;
                        cursorA0A = cursorA0A;
                        events = eo.A01(cursorA0A);
                        c2 = '\b';
                        break;
                    } catch (JSONException unused) {
                        if (cursorA0A == null) {
                            c2 = 14;
                            break;
                        } else {
                            c2 = '\r';
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursorA0A == null) {
                            c2 = 11;
                            break;
                        } else {
                            c2 = '\n';
                            break;
                        }
                    }
                case '\b':
                    cursorA0A.close();
                    return events;
                case '\n':
                    cursorA0A.close();
                    c2 = 11;
                    break;
                case 11:
                    throw th;
                case '\r':
                    cursorA0A.close();
                    c2 = 14;
                    break;
                case 14:
                    return (JSONArray) null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    @Nullable
    public final JSONObject A5L() throws Throwable {
        EO eo = this;
        JSONObject tokens = null;
        Throwable th = null;
        Cursor cursorA0B = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    eo = eo;
                    cursorA0B = eo.A01.A0B();
                    tokens = null;
                    if (cursorA0B.getCount() <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    try {
                        cursorA0B = cursorA0B;
                        tokens = A03(cursorA0B);
                        c2 = '\b';
                        break;
                    } catch (JSONException unused) {
                        if (cursorA0B == null) {
                            c2 = 14;
                            break;
                        } else {
                            c2 = '\r';
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursorA0B == null) {
                            c2 = 11;
                            break;
                        } else {
                            c2 = '\n';
                            break;
                        }
                    }
                case '\b':
                    cursorA0B.close();
                    return tokens;
                case '\n':
                    cursorA0B.close();
                    c2 = 11;
                    break;
                case 11:
                    throw th;
                case '\r':
                    cursorA0B.close();
                    c2 = 14;
                    break;
                case 14:
                    return (JSONObject) null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    public final int A6D() throws Throwable {
        EO eo = this;
        Throwable th = null;
        int i = 0;
        Cursor cursorA09 = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    eo = eo;
                    cursorA09 = eo.A01.A09();
                    i = 0;
                    if (!cursorA09.moveToFirst()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    try {
                        cursorA09 = cursorA09;
                        i = cursorA09.getInt(0);
                        c2 = '\b';
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursorA09 == null) {
                            c2 = 11;
                            break;
                        } else {
                            c2 = '\n';
                            break;
                        }
                    }
                case '\b':
                    cursorA09.close();
                    return i;
                case '\n':
                    cursorA09.close();
                    c2 = 11;
                    break;
                case 11:
                    throw th;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    @Nullable
    public final String A6G(String str) {
        String string = null;
        Cursor cursorA0D = this.A01.A0D(str);
        char c2 = cursorA0D != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    cursorA0D = cursorA0D;
                    if (!cursorA0D.moveToNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    cursorA0D = cursorA0D;
                    if (cursorA0D.getCount() <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    cursorA0D = cursorA0D;
                    string = cursorA0D.getString(cursorA0D.getColumnIndex(XO.A09.A01));
                    c2 = 5;
                    break;
                case 5:
                    cursorA0D = cursorA0D;
                    cursorA0D.close();
                    c2 = 6;
                    break;
                case 6:
                    return string;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    public final Pair<JSONObject, JSONArray> A7A(int i) {
        Cursor cursorA0C = null;
        try {
            try {
                cursorA0C = this.A01.A0C(i);
                JSONArray jSONArrayA02 = null;
                JSONObject jSONObjectA03 = null;
                if (cursorA0C.getCount() > 0) {
                    jSONObjectA03 = A03(cursorA0C);
                    jSONArrayA02 = A02(cursorA0C);
                }
                Pair<JSONObject, JSONArray> pair = new Pair<>(jSONObjectA03, jSONArrayA02);
                cursorA0C.close();
                return pair;
            } catch (JSONException unused) {
                Pair<JSONObject, JSONArray> pair2 = new Pair<>(null, null);
                if (cursorA0C != null) {
                    cursorA0C.close();
                }
                return pair2;
            }
        } catch (Throwable th) {
            if (cursorA0C != null) {
                cursorA0C.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    public final boolean A7R(String str) {
        return this.A01.A0L(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9D != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.C9G
    public final void AE0(JT jt, C9D<String> c9d) {
        this.A01.A0G(jt.A08(), jt.A05().A00, jt.A06().toString(), jt.A04(), jt.A03(), jt.A07(), jt.A09(), c9d);
    }
}
