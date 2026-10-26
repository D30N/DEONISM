package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.File;

/* loaded from: assets/audience_network.dex */
public class I7 implements Comparable<I7> {
    public final long A00;
    public final long A01;
    public final long A02;

    @Nullable
    public final File A03;
    public final String A04;
    public final boolean A05;

    public I7(String str, long j, long j2, long j3, @Nullable File file) {
        this.A04 = str;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull I7 i7) {
        I7 i72 = this;
        long j = 0;
        int i = 0;
        long j2 = 0;
        char c2 = !i72.A04.equals(i7.A04) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return i72.A04.compareTo(i7.A04);
                case 3:
                    i72 = i72;
                    i7 = i7;
                    j = i72.A02 - i7.A02;
                    j2 = 0;
                    if (j != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    return i;
                case 6:
                    if (j >= j2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i = -1;
                    c2 = 5;
                    break;
                case '\b':
                    i = 1;
                    c2 = 5;
                    break;
            }
        }
    }

    public final boolean A01() {
        return !this.A05;
    }

    public final boolean A02() {
        boolean z = false;
        char c2 = this.A01 == -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
