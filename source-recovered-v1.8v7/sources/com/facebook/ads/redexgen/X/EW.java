package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class EW extends XR<String> {
    public static byte[] A08;
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C8J A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A08 = new byte[]{31, 26, 15, 26, 25, 26, 8, 30};
    }

    public EW(C8J c8j, String str, String str2, int i, double d2, double d3, String str3, Map map) {
        this.A03 = c8j;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A01 = d2;
        this.A00 = d3;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8M
    @Nullable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A03() {
        String strA01 = A01(0, 8, 39);
        this.A03.A01.A04().A7Q(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        C8J.A07.lock();
        SQLiteDatabase sQLiteDatabaseA0E = null;
        try {
            try {
                sQLiteDatabaseA0E = this.A03.A0E();
                sQLiteDatabaseA0E.beginTransaction();
                String strA0E = this.A03.A02.A0E(this.A03.A03.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabaseA0E.setTransactionSuccessful();
                if (sQLiteDatabaseA0E.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (Exception e) {
                        this.A03.A01.A04().A83(strA01, C03008a.A0n, new C03018b(e));
                    }
                }
                C8J.A07.unlock();
                return strA0E;
            } catch (Exception e2) {
                A01(C8L.A05);
                this.A03.A01.A04().A83(strA01, C03008a.A0m, new C03018b(e2));
                if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (Exception e3) {
                        this.A03.A01.A04().A83(strA01, C03008a.A0n, new C03018b(e3));
                    }
                }
                C8J.A07.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                try {
                    if (sQLiteDatabaseA0E.inTransaction()) {
                        sQLiteDatabaseA0E.endTransaction();
                    }
                } catch (Exception e4) {
                    this.A03.A01.A04().A83(strA01, C03008a.A0n, new C03018b(e4));
                }
            }
            C8J.A07.unlock();
            throw th;
        }
    }
}
