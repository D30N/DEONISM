package com.facebook.ads.redexgen.X;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.0E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0E implements Comparator<File> {
    public C0E() {
    }

    private int A00(long j, long j2) {
        int i = 0;
        char c2 = j < j2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = -1;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    if (j != j2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i = 0;
                    c2 = 3;
                    break;
                case 6:
                    i = 1;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compare(File file, File file2) {
        return A00(file.lastModified(), file2.lastModified());
    }
}
