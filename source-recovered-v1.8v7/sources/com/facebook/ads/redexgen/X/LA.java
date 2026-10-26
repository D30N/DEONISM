package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class LA {
    public static byte[] A00;
    public static final Package A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final Set<XI> A05;
    public static final AtomicReference<LE> A06;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_viewInflaterClass);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A00 = new byte[]{89, 107, 124, 111, 110, 42, 121, 126, 107, 126, 111, 42, 104, Byte.MAX_VALUE, 100, 110, 102, 111, 42, 99, 121, 42, 111, 103, 122, 126, 115, 43, 121, 22, 19, 25, 0, 8, 22, 19, 8, 24, 21, 29, 8, 30, 19, 8, 28, 18, 14, 39, 72, 77, 71, 94, 86, 90, 72, 95, 76, 77, 86, 90, 93, 72, 93, 76, 86, 77, 72, 93, 72, 68, 43, 46, 36, 61, 53, 37, 56, 35, 45, 35, 36, 43, 38, 53, 47, 50, 62, 56, 43, 57};
    }

    static {
        A07();
        A01 = LA.class.getPackage();
        A03 = A01 + A06(47, 22, k.AppCompatTheme_windowMinWidthMinor);
        A02 = A01 + A06(28, 19, 37);
        A04 = A01 + A06(69, 21, 24);
        A05 = Collections.newSetFromMap(new WeakHashMap());
        A06 = new AtomicReference<>();
    }

    public static Intent A00(Intent cloneIntent) {
        Intent intentCloneFilter = cloneIntent.cloneFilter();
        intentCloneFilter.setFlags(cloneIntent.getFlags());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(cloneIntent.getExtras());
        intentCloneFilter.putExtra(A04, parcelObtain.marshall());
        parcelObtain.recycle();
        return intentCloneFilter;
    }

    public static Intent A01(Intent startIntent, ClassLoader classLoader) {
        Intent intentCloneFilter = startIntent.cloneFilter();
        intentCloneFilter.setFlags(startIntent.getFlags());
        Bundle bundle = new Bundle();
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArrayExtra = startIntent.getByteArrayExtra(A04);
        if (byteArrayExtra != null) {
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            bundle = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
        }
        intentCloneFilter.putExtras(bundle);
        return intentCloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A03);
        if (byteArray != null) {
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle2 = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
            return bundle2;
        }
        throw new IllegalStateException(A06(0, 28, k.AppCompatTheme_windowFixedWidthMajor));
    }

    @Nullable
    public static XI A03(Intent intent) {
        XI adContext = null;
        Iterator<XI> it = null;
        String stringExtra = intent.getStringExtra(A02);
        char c2 = stringExtra != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    it = A05.iterator();
                    c2 = 3;
                    break;
                case 3:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    stringExtra = stringExtra;
                    it = it;
                    adContext = it.next();
                    if (!stringExtra.equals(adContext.A0A().getId())) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return adContext;
                case 6:
                    return (XI) null;
            }
        }
    }

    public static AdActivityIntent A04(XI xi) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(xi.getApplicationContext(), A05());
        adActivityIntent.putExtra(A02, xi.A0A().getId());
        A05.add(xi);
        return adActivityIntent;
    }

    public static Class A05() {
        return AudienceNetworkActivity.class;
    }

    public static void A08(Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle2);
        bundle.putByteArray(A03, parcelObtain.marshall());
        parcelObtain.recycle();
    }

    public static void A09(XI xi, AdActivityIntent adActivityIntent) {
        xi.getApplicationContext().startActivity(A00(adActivityIntent));
    }

    public static boolean A0A(Intent intent, Set<String> set) {
        String url = null;
        Iterator<String> it = null;
        Uri data = intent.getData();
        char c2 = data == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    set = set;
                    data = data;
                    url = data.toString();
                    it = set.iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    url = url;
                    it = it;
                    if (!url.startsWith(it.next())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return true;
                case 7:
                    return false;
            }
        }
    }

    public static boolean A0B(XI xi, Intent intent) {
        return A0C(xi, intent, A06.get());
    }

    @VisibleForTesting
    public static boolean A0C(XI xi, Intent intent, @Nullable LE le) {
        XI xi2 = null;
        Activity activityA09 = null;
        char c2 = A0A(intent, JQ.A0T(xi)) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    xi = xi;
                    xi2 = xi;
                    activityA09 = xi.A09();
                    if (activityA09 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    activityA09 = activityA09;
                    xi2 = activityA09;
                    c2 = 5;
                    break;
                case 5:
                    le = le;
                    if (le == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    xi = xi;
                    intent = intent;
                    if (!A0A(intent, JQ.A0U(xi))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    xi2.startActivity(intent);
                    return true;
                case '\b':
                    intent = intent;
                    intent.addFlags(268435456);
                    c2 = 5;
                    break;
                case '\t':
                    return le.startActivity(xi2, intent);
            }
        }
    }
}
