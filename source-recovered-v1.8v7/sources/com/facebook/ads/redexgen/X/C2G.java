package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.2G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2G {
    public static C2G A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C2F>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C2F>> A03 = new HashMap<>();
    public final ArrayList<C2E> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 33);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A06 = new byte[]{88, 122, 109, 112, 118, 119, 57, 117, 112, 106, 109, 35, 57, 41, 50, 55, 50, 51, 43, 50, 124, 46, 57, 61, 47, 51, 50, 58, 58, 92, 115, 118, 110, Byte.MAX_VALUE, 104, 58, 119, 123, 110, 121, 114, Byte.MAX_VALUE, 126, 59, 58, 58, 119, 123, 110, 121, 114, 39, 42, 98, Byte.MAX_VALUE, 114, 123, 110, 56, 107, 123, 112, 125, 117, 125, 56, 50, 17, 29, 31, 18, 60, 12, 17, 31, 26, 29, 31, 13, 10, 51, 31, 16, 31, 25, 27, 12, 105, 94, 72, 84, 87, 77, 82, 85, 92, 27, 79, 66, 75, 94, 27, 85, 87, 64, 93, 91, 90, 106, 111, 122, 111, 121, 121, 31, 48, 53, 45, 60, 43, 121, 61, 48, 61, 121, 55, 54, 45, 121, 52, 56, 45, 58, 49, 99, 121, 23, 59, 46, 57, 50, 51, 52, 61, 122, 59, 61, 59, 51, 52, 41, 46, 122, 60, 51, 54, 46, 63, 40, 122, 33, 110, 103, 33, 104, 111, 117, 100, 111, 117, 33, 75, 73, 92, 77, 79, 71, 90, 81};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C2G(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2D
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C2D c2d = this;
                char c2 = message.what != 1 ? (char) 2 : (char) 4;
                while (true) {
                    switch (c2) {
                        case 2:
                            c2d = c2d;
                            message = message;
                            super.handleMessage(message);
                            c2 = 3;
                            break;
                        case 3:
                            return;
                        case 4:
                            c2d = c2d;
                            c2d.A00.A02();
                            c2 = 3;
                            break;
                    }
                }
            }
        };
    }

    public static C2G A00(Context context) {
        C2G c2g;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C2G(context.getApplicationContext());
            }
            c2g = A05;
        }
        return c2g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C2E[] c2eArr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    c2eArr = new C2E[size];
                    this.A02.toArray(c2eArr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (C2E c2e : c2eArr) {
                int size2 = c2e.A01.size();
                for (int i = 0; i < size2; i++) {
                    C2F c2f = c2e.A01.get(i);
                    if (!c2f.A01) {
                        c2f.A02.onReceive(this.A00, c2e.A00);
                    }
                }
            }
        }
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C2F> arrayListRemove = this.A04.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                C2F c2f = arrayListRemove.get(size);
                c2f.A01 = true;
                for (int i = 0; i < c2f.A03.countActions(); i++) {
                    String action = c2f.A03.getAction(i);
                    ArrayList<C2F> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C2F c2f2 = arrayList.get(size2);
                            if (c2f2.A02 == broadcastReceiver) {
                                c2f2.A01 = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C2F c2f = new C2F(intentFilter, broadcastReceiver);
            ArrayList<C2F> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c2f);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C2F> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c2f);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String str;
        String strA01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int i = 0;
            int i2 = (intent.getFlags() & 8) != 0 ? 1 : 0;
            if (i2 != 0) {
                String str2 = A01(87, 15, 26) + strResolveTypeIfNeeded + A01(58, 8, 57) + scheme + A01(160, 11, 32) + intent;
            }
            ArrayList<C2F> arrayList = this.A03.get(intent.getAction());
            if (arrayList != null) {
                if (i2 != 0) {
                    String str3 = A01(0, 13, 56) + arrayList;
                }
                ArrayList arrayList2 = null;
                while (i < arrayList.size()) {
                    C2F c2f = arrayList.get(i);
                    if (i2 != 0) {
                        String str4 = A01(136, 24, k.AppCompatTheme_windowMinWidthMinor) + c2f.A03;
                    }
                    if (!c2f.A00) {
                        str = strResolveTypeIfNeeded;
                        int iMatch = c2f.A03.match(action, strResolveTypeIfNeeded, scheme, data, categories, A01(66, 21, 95));
                        if (iMatch >= 0) {
                            if (i2 != 0) {
                                String str5 = A01(27, 27, 59) + Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c2f);
                            c2f.A00 = true;
                        } else if (i2 != 0) {
                            if (iMatch == -4) {
                                strA01 = A01(171, 8, 9);
                            } else if (iMatch == -3) {
                                strA01 = A01(102, 6, 21);
                            } else if (iMatch == -2) {
                                strA01 = A01(108, 4, 47);
                            } else if (iMatch != -1) {
                                strA01 = A01(13, 14, 125);
                            } else {
                                strA01 = A01(54, 4, 42);
                            }
                            String str6 = A01(112, 24, k.AppCompatTheme_windowFixedWidthMajor) + strA01;
                        }
                    } else if (i2 != 0) {
                        str = strResolveTypeIfNeeded;
                    } else {
                        str = strResolveTypeIfNeeded;
                    }
                    i++;
                    strResolveTypeIfNeeded = str;
                }
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        ((C2F) arrayList2.get(i3)).A00 = false;
                    }
                    this.A02.add(new C2E(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
