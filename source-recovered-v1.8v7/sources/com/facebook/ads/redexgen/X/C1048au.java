package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1048au implements InterfaceC0444Eg<C1048au, GN> {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Uri A07;
    public final GR A08;
    public final boolean A09;
    public final List<GJ> A0A;

    public C1048au(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, GR gr, Uri uri, List<GJ> list) {
        List<GJ> list2 = list;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A09 = z;
        this.A03 = j4;
        this.A06 = j5;
        this.A05 = j6;
        this.A04 = j7;
        this.A08 = gr;
        this.A07 = uri;
        this.A0A = list2 == null ? Collections.emptyList() : list2;
    }

    private final long A00(int i) {
        C1048au c1048au = this;
        long j = 0;
        long j2 = 0;
        char c2 = i == c1048au.A0A.size() + (-1) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1048au = c1048au;
                    j2 = c1048au.A01;
                    if (j2 != -9223372036854775807L) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    j = -9223372036854775807L;
                    c2 = 4;
                    break;
                case 4:
                    return j;
                case 5:
                    c1048au = c1048au;
                    j = j2 - c1048au.A0A.get(i).A00;
                    c2 = 4;
                    break;
                case 6:
                    c1048au = c1048au;
                    j = c1048au.A0A.get(i + 1).A00 - c1048au.A0A.get(i).A00;
                    c2 = 4;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0444Eg
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1048au A4B(List<GN> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new GN(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= A03()) {
                break;
            }
            if (((GN) linkedList.peek()).A01 != i) {
                long jA00 = A00(i);
                if (jA00 != -9223372036854775807L) {
                    j += jA00;
                }
            } else {
                GJ gjA05 = A05(i);
                arrayList.add(new GJ(gjA05.A01, gjA05.A00 - j, A02(gjA05.A02, linkedList), gjA05.A03));
            }
            i++;
        }
        long j2 = this.A01;
        return new C1048au(this.A00, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.A02, this.A09, this.A03, this.A06, this.A05, this.A04, this.A08, this.A07, arrayList);
    }

    public static ArrayList<GF> A02(List<GF> list, LinkedList<GN> linkedList) {
        GN gnPoll = linkedList.poll();
        int i = gnPoll.A01;
        ArrayList<GF> arrayList = new ArrayList<>();
        do {
            int i2 = gnPoll.A00;
            GF gf = list.get(i2);
            List<GM> list2 = gf.A03;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(gnPoll.A02));
                gnPoll = linkedList.poll();
                if (gnPoll.A01 != i) {
                    break;
                }
            } while (gnPoll.A00 == i2);
            arrayList.add(new GF(gf.A00, gf.A01, arrayList2, gf.A02, gf.A04));
        } while (gnPoll.A01 == i);
        linkedList.addFirst(gnPoll);
        return arrayList;
    }

    public final int A03() {
        return this.A0A.size();
    }

    public final long A04(int i) {
        return C03419q.A00(A00(i));
    }

    public final GJ A05(int i) {
        return this.A0A.get(i);
    }
}
