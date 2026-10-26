package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class RJ implements C0S {
    public static byte[] A06;
    public final RL A00;
    public final AtomicReference<String> A04 = new AtomicReference<>();
    public final AtomicReference<String> A03 = new AtomicReference<>();
    public final AtomicReference<EnumC01080d> A05 = new AtomicReference<>();
    public final UUID A01 = UUID.randomUUID();
    public final AtomicInteger A02 = new AtomicInteger(1);

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 25);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A06 = new byte[]{-122, -107, -114, -114, -123, -116, Byte.MAX_VALUE, -109, -123, -111};
    }

    public RJ(RL rl) {
        this.A00 = rl;
    }

    public final void A02(C0U c0u, C0X... c0xArr) throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0X c0x : c0xArr) {
                c0x.A02(jSONObject);
            }
            try {
                jSONObject.put(A00(0, 10, 7), this.A02.getAndIncrement());
            } catch (JSONException unused) {
            }
            C0Y.A0E.A02(this.A01).A02(jSONObject);
            String str = this.A04.get();
            if (!TextUtils.isEmpty(str)) {
                C0Y.A0P.A02(str).A02(jSONObject);
            }
            String str2 = this.A03.get();
            if (!TextUtils.isEmpty(str2)) {
                C0Y.A0O.A02(str2).A02(jSONObject);
            }
            EnumC01080d enumC01080d = this.A05.get();
            if (enumC01080d != null) {
                C0Y.A0D.A02(enumC01080d).A02(jSONObject);
            }
            this.A00.A00(c0u, jSONObject);
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Q(String str, int i) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0R, C0Y.A0G.A02(Integer.valueOf(i)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2R(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0S, C0Y.A0K.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2S(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0T, C0Y.A0K.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2T(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0U, C0Y.A0K.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2U(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0V, C0Y.A0K.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2V(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0W, C0Y.A0K.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2W(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0X, C0Y.A0K.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2X() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0i, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Y() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0Y, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Z() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0v, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2a() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0w, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2b(boolean z) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0Z, C0Y.A02.A02(Boolean.valueOf(z)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2c(long j, int i, String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0x, C0Y.A0F.A02(Integer.valueOf(i)), C0Y.A0L.A02(str), C0Y.A0J.A02(Long.valueOf(j)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2d() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0z, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2e() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0y, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2f() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A10, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2g(long j) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A11, C0Y.A0J.A02(Long.valueOf(j)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2h(C0R c0r) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1c, C0Y.A01.A02(c0r));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2i(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2 = rj2;
                        rj2.A03.set(str);
                        rj2.A02(C0U.A0a, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2j() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0b, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2k() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0c, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2l(long j, int i, String str, boolean z) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0d, C0Y.A0J.A02(Long.valueOf(j)), C0Y.A0F.A02(Integer.valueOf(i)), C0Y.A0L.A02(str), C0Y.A09.A02(Boolean.valueOf(z)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2m(long j) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0e, C0Y.A0J.A02(Long.valueOf(j)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2n(boolean z) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A18, C0Y.A0C.A02(Boolean.valueOf(z)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2o() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A19, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2p() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1C, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2q(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1D, C0Y.A0L.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2r() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1E, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2s() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1F, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2t() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1G, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2u(int i) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1H, C0Y.A0G.A02(Integer.valueOf(i)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2v() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1I, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2w() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1L, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2x() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1J, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2y(int i) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1K, C0Y.A0G.A02(Integer.valueOf(i)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2z() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1M, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A30(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1N, C0Y.A0M.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A31() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1O, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A32() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1P, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A33() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1Q, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A34() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1R, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A35(int i) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1S, C0Y.A0G.A02(Integer.valueOf(i)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A36() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1T, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A37(int i) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1U, C0Y.A0G.A02(Integer.valueOf(i)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A38() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1e, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A39() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1f, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3A(C0R c0r) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1b, C0Y.A01.A02(c0r));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3B(int i) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1d, C0Y.A0H.A02(Integer.valueOf(i)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3C() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1g, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3u(long j) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0g, C0Y.A0J.A02(Long.valueOf(j)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3v(long j) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0h, C0Y.A0J.A02(Long.valueOf(j)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A40() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0j, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4V() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0k, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4W() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0o, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4X(boolean z) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0f, C0Y.A08.A02(Boolean.valueOf(z)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4Y(int i, String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0p, C0Y.A0F.A02(Integer.valueOf(i)), C0Y.A0L.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4Z(boolean z) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0n, C0Y.A04.A02(Boolean.valueOf(z)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4a() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0r, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4b() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0s, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4c() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0t, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4d() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A0u, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8Z(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A12, C0Y.A0L.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8a(int i) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A13, C0Y.A0H.A02(Integer.valueOf(i)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8c() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A14, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ACH(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A16, C0Y.A0L.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ACI() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A17, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADB(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2 = rj2;
                        rj2.A04.set(str);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADD(EnumC01080d enumC01080d) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2 = rj2;
                        rj2.A05.set(enumC01080d);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADl() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1B, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADm() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1h, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADn() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1i, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADo() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1j, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADp() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1k, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADq(boolean z) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1l, C0Y.A03.A02(Boolean.valueOf(z)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADr() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1m, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADs() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1n, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADt(int i, @Nullable String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1o, C0Y.A0F.A02(Integer.valueOf(i)), C0Y.A0L.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADu(boolean z) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1p, C0Y.A07.A02(Boolean.valueOf(z)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADv() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1q, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADw(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1r, C0Y.A0L.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADx() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1s, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADy(int i) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1t, C0Y.A0I.A02(Integer.valueOf(i)));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AE3(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1V, C0Y.A0L.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AE4(String str) throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1W, C0Y.A0L.A02(str));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final String getId() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (String) null;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2 = rj2;
                        return rj2.A01.toString();
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return (String) null;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void unregisterView() throws Throwable {
        RJ rj = this;
        RJ rj2 = null;
        char c2 = C0601Ko.A02(rj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    rj = rj;
                    rj2 = rj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        rj2.A02(C0U.A1A, new C0X[0]);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, rj2);
                        return;
                    }
            }
        }
    }
}
