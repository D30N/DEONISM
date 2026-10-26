package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1158cj implements InterfaceC0616Lf {
    public final Collection<String> A00;

    public C1158cj() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Lf
    public final void ABs(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Lf
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.A00.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    sb = sb;
                    it = it;
                    String line = it.next();
                    sb.append(line);
                    sb.append('\n');
                    c2 = 2;
                    break;
                case 4:
                    return sb.toString();
            }
        }
    }
}
