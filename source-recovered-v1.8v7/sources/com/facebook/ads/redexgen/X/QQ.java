package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import d.b.a.b.k;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class QQ extends AsyncTask<String, Void, QR> {
    public static byte[] A05;
    public static final String A06;
    public static final Set<String> A07;
    public C8C A00;
    public Q5 A01;
    public QP A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 107);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A05 = new byte[]{14, -2, 9, 67, 80, 67, 78, 81, 73, -13, -6, -15, -15, -12, 33, 33, 30, 33, -49, 30, 31, 20, 29, 24, 29, 22, -49, 36, 33, 27, -23, -49, -76};
    }

    static {
        A04();
        A06 = QQ.class.getSimpleName();
        A07 = new HashSet();
        A07.add(A01(1, 1, 112));
        A07.add(A01(9, 4, 26));
    }

    public QQ(C8C c8c) {
        this(c8c, null, null);
    }

    public QQ(C8C c8c, Map<String, String> map) {
        this(c8c, map, null);
    }

    public QQ(C8C c8c, Map<String, String> map, Map<String, String> map2) {
        this.A00 = c8c;
        Map<String, String> postData = map != null ? new HashMap<>(map) : null;
        this.A03 = postData;
        Map<String, String> extraData = map2 != null ? new HashMap<>(map2) : null;
        this.A04 = extraData;
    }

    private final QR A00(String... strArr) throws Throwable {
        if (C0601Ko.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A07.contains(str)) {
                String strA02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        String key = entry.getKey();
                        String url = entry.getValue();
                        strA02 = A03(strA02, key, url);
                    }
                }
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A06(strA02)) {
                        return new QR(this.A01);
                    }
                    i = i2;
                }
            }
            return null;
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
            return null;
        }
    }

    private String A02(String str) {
        try {
            return A03(str, A01(3, 6, k.AppCompatTheme_windowFixedHeightMinor), LX.A01(this.A00.A02().A5N()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        String strA01 = null;
        char c2 = !TextUtils.isEmpty(str) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str2 = str2;
                    if (!TextUtils.isEmpty(str2)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    str3 = str3;
                    if (!TextUtils.isEmpty(str3)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return str;
                case 5:
                    str = str;
                    strA01 = A01(2, 1, 95);
                    if (!str.contains(strA01)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    strA01 = A01(32, 1, 35);
                    c2 = 7;
                    break;
                case 7:
                    return str + strA01 + str2 + A01(0, 1, 102) + URLEncoder.encode(str3);
            }
        }
    }

    private final void A05(QR qr) throws Throwable {
        QQ qq = this;
        QQ qq2 = null;
        char c2 = C0601Ko.A02(qq) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    qq = qq;
                    qq2 = qq;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        qq2 = qq2;
                        if (qq2.A02 != null) {
                            qq2.A02.ABw(qr);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, qq2);
                        return;
                    }
            }
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A06(String str) {
        Q5 q5ABi;
        Q6 q6A00 = QO.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                q5ABi = q6A00.ABi(str, new QK());
            } else {
                QK qk = new QK();
                qk.A05(this.A04);
                q5ABi = q6A00.ABj(str, qk.A08());
            }
            this.A01 = q5ABi;
        } catch (Exception e) {
            Log.e(A06, A01(13, 19, 68) + str, e);
        }
        Q5 q5 = this.A01;
        return q5 != null && q5.A77() == 200;
    }

    public final void A07(QP qp) {
        this.A02 = qp;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.ads.redexgen.X.QR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.ads.redexgen.X.QR, java.lang.Object] */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ QR doInBackground(String[] strArr) throws Throwable {
        QQ qq = this;
        QQ qq2 = null;
        char c2 = C0601Ko.A02(qq) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Object) 0;
                case 3:
                    qq = qq;
                    qq2 = qq;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        return qq2.A00(strArr);
                    } catch (Throwable th) {
                        C0601Ko.A00(th, qq2);
                        return (Object) 0;
                    }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        QP qp = this.A02;
        if (qp != null) {
            qp.ABu();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(QR qr) throws Throwable {
        QQ qq = this;
        QQ qq2 = null;
        char c2 = C0601Ko.A02(qq) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    qq = qq;
                    qq2 = qq;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        qq2.A05(qr);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, qq2);
                        return;
                    }
            }
        }
    }
}
