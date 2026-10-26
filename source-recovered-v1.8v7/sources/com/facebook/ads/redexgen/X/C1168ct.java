package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.EditText;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.ct, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1168ct implements MD {
    public static byte[] A03;
    public C03188s A00;
    public Q6 A01;
    public final Executor A02;

    static {
        A05();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 89);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A03 = new byte[]{117, 125, 108, 121, 124, 121, 108, 121, 13, 33, 57, 96, 47, 52, 40, 37, 50, 51, 96, 44, 47, 39, 41, 46, 96, 33, 51, 96, 57, 47, 53, 96, 52, 47, 96, 36, 37, 34, 53, 39, Byte.MAX_VALUE, 96, 8, 47, 55, 96, 36, 47, 96, 57, 47, 53, 96, 50, 37, 48, 50, 47, 36, 53, 35, 37, 96, 52, 40, 37, 96, 41, 51, 51, 53, 37, Byte.MAX_VALUE, 88, 83, 93, 90, 89, 95, 94, 88, 90, 82, 82, 95, 94, 89, 94, 120, 122, 111, 126, 124, 116, 105, 98, 68, 114, Byte.MAX_VALUE, 5, 10, 0, 10, 6, 0, 10, 7, 3, 10, 10, 4, 10, 3, 2, 79, 10, 81, 85, 1, 10, 82, 2, 85, 1, 4, 7, 6, 4, 7, 5, 82, 5, 80, 5, 3, 87, 4, 3, 4, 85, 6, 81, 80, 1, 0, 80, 1, 6, 10, 11, 3, 12, 2, 58, 12, 1, 122, 76, 71, 77, 9, 123, 76, 89, 70, 91, 93, 111, 109, 109, 107, 125, 125, 81, 122, 97, 101, 107, 96, 110, 106, 112, 96, 92, 106, 109, 101, 108, 105, 108, 108, 106, 111, 98, 106, 104, 109, 105, 104, 107, 108, 106, 105, 16, 50, 61, 48, 54, 63, 20, 27, 30, 18, 25, 3, 40, 3, 30, 26, 18, 66, 67, 85, 69, 84, 79, 86, 82, 79, 73, 72, 2, 4, 18, 5, 40, 30, 19, 18, 25, 3, 30, 17, 30, 18, 5, 117, 74, 67, 86, 2, 106, 67, 82, 82, 71, 76, 71, 70, 29, 49, 62, 59, 55, 60, 38, 13, 38, 61, 57, 55, 60};
    }

    public C1168ct(Executor executor, C03188s c03188s, XI xi) {
        this.A01 = QO.A01(xi.A00());
        this.A02 = executor;
        this.A00 = c03188s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A03(String str) throws JSONException {
        QK miscInfo = new QK();
        QK qk = new QK();
        QK qk2 = new QK();
        miscInfo.put(A01(231, 15, 46), C02335a.A00().A03());
        miscInfo.put(A01(147, 9, 60), A01(73, 15, 51));
        miscInfo.put(A01(88, 11, 66), A01(188, 15, 2));
        miscInfo.put(A01(167, 12, 87), A01(99, 48, 106));
        miscInfo.put(A01(209, 11, 46), (System.currentTimeMillis() / 1000) + A01(73, 0, 54));
        String strA07 = this.A00.A07();
        if (strA07 != null) {
            qk2.put(A01(260, 12, 11), strA07);
        }
        qk.put(A01(220, 11, 127), str);
        qk.put(A01(179, 9, 90), LX.A01(qk2));
        miscInfo.A04(A01(0, 8, 65), LX.A01(qk));
        return miscInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(C03188s c03188s) {
        this.A00 = c03188s;
    }

    @Override // com.facebook.ads.redexgen.X.MD
    public final void AB0() {
        Activity activityA00 = LC.A00();
        if (activityA00 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activityA00);
        builder.setTitle(A01(246, 14, k.AppCompatTheme_windowMinWidthMinor));
        EditText editText = new EditText(activityA00);
        editText.setSingleLine(false);
        editText.setImeOptions(1073741824);
        editText.setHint(A01(8, 65, 25));
        editText.setMaxLines(2);
        editText.setMinLines(2);
        builder.setView(editText);
        builder.setNegativeButton(A01(203, 6, 10), new MA(this));
        builder.setPositiveButton(A01(156, 11, 112), new MB(this, editText));
        builder.create().show();
    }
}
