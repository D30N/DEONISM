package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class WU implements InterfaceC02686k<String> {
    public final String A00;

    @Nullable
    public final String A01;

    public WU(Context context, String str, C6Z c6z) {
        this.A00 = str;
        this.A01 = A03(context, str, c6z);
    }

    @Nullable
    public static String A00(Context context, String str) {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        return Settings.Global.getString(context.getContentResolver(), str);
    }

    @Nullable
    public static String A01(Context context, String str) {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        return Settings.Secure.getString(context.getContentResolver(), str);
    }

    @Nullable
    public static String A02(Context context, String str) {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        return Settings.System.getString(context.getContentResolver(), str);
    }

    @Nullable
    public static String A03(Context context, String str, C6Z c6z) {
        int i = C6Y.A00[c6z.ordinal()];
        char c2 = i != 1 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return "";
                case 5:
                    return A02(context, str);
                case 6:
                    return A01(context, str);
                case 7:
                    return A00(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final JSONObject ADb(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final boolean A7d(Object obj) {
        WU newSystemSettingValue = this;
        boolean zEquals = false;
        boolean isSettingValueEqual = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        WU wu = (WU) obj;
        boolean z = true;
        char c2 = newSystemSettingValue.A00 == null ? (char) 2 : (char) 18;
        while (true) {
            switch (c2) {
                case 2:
                    wu = wu;
                    if (wu.A00 != null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    isSettingValueEqual = true;
                    c2 = 4;
                    break;
                case 4:
                    newSystemSettingValue = newSystemSettingValue;
                    if (newSystemSettingValue.A01 != null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    wu = wu;
                    if (wu.A01 != null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    zEquals = true;
                    c2 = 7;
                    break;
                case 7:
                    newSystemSettingValue = newSystemSettingValue;
                    str2 = newSystemSettingValue.A00;
                    if (str2 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    wu = wu;
                    str3 = wu.A00;
                    if (str3 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    str2 = str2;
                    str3 = str3;
                    isSettingValueEqual = str2.equals(str3);
                    c2 = '\n';
                    break;
                case '\n':
                    newSystemSettingValue = newSystemSettingValue;
                    str4 = newSystemSettingValue.A01;
                    if (str4 == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    wu = wu;
                    str = wu.A01;
                    if (str == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    str4 = str4;
                    str = str;
                    zEquals = str4.equals(str);
                    c2 = '\r';
                    break;
                case '\r':
                    if (!isSettingValueEqual) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (!zEquals) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return z;
                case 16:
                    z = false;
                    c2 = 15;
                    break;
                case 17:
                    zEquals = false;
                    c2 = 7;
                    break;
                case 18:
                    isSettingValueEqual = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02686k
    public final int ADH() {
        WU wu = this;
        String str = wu.A00;
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    wu = wu;
                    if (wu.A01 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return str.getBytes().length + wu.A01.getBytes().length;
                case 4:
                    return 0;
            }
        }
    }
}
