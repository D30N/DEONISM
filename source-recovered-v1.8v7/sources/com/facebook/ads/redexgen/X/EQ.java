package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public class EQ implements Runnable {
    public final /* synthetic */ ER A00;
    public final /* synthetic */ DownloadAction[] A01;

    public EQ(ER er, DownloadAction[] downloadActionArr) {
        this.A00 = er;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            if (this.A00.A00.A03) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.A00.A00.A0C);
            this.A00.A00.A0C.clear();
            for (DownloadAction downloadAction : this.A01) {
                this.A00.A00.A02(downloadAction);
            }
            this.A00.A00.A02 = true;
            Iterator it = this.A00.A00.A0D.iterator();
            while (it.hasNext()) {
                ((ET) it.next()).A9k(this.A00.A00);
            }
            if (!arrayList.isEmpty()) {
                this.A00.A00.A0C.addAll(arrayList);
                this.A00.A00.A0B();
            }
            this.A00.A00.A0A();
            for (int i = 0; i < this.A00.A00.A0C.size(); i++) {
                EX ex = (EX) this.A00.A00.A0C.get(i);
                if (ex.A06 == 0) {
                    this.A00.A00.A0D(ex);
                }
            }
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }
}
