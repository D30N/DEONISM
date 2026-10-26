package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Bm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class HandlerC0389Bm extends Handler {
    public final /* synthetic */ YZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bm != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public HandlerC0389Bm(YZ yz, Looper looper) {
        super(looper);
        this.A00 = yz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bm != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YW != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        HandlerC0389Bm handlerC0389Bm = this;
        YW yw = null;
        byte[] bArr = null;
        Iterator it = null;
        HandlerC0389Bm handlerC0389Bm2 = null;
        char c2 = C0601Ko.A02(handlerC0389Bm) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    handlerC0389Bm = handlerC0389Bm;
                    handlerC0389Bm2 = handlerC0389Bm;
                    c2 = 4;
                case 4:
                    message = message;
                    bArr = (byte[]) message.obj;
                    it = handlerC0389Bm2.A00.A09.iterator();
                    c2 = 11;
                case 11:
                    it = it;
                    c2 = it.hasNext() ? '\r' : (char) 20;
                case '\r':
                    try {
                        it = it;
                        yw = (YW) it.next();
                        c2 = yw.A0N(bArr) ? (char) 17 : (char) 11;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, handlerC0389Bm2);
                        return;
                    }
                case 17:
                    yw.A0J(message.what);
                    return;
                case 20:
                    return;
            }
            C0601Ko.A00(th, handlerC0389Bm2);
            return;
        }
    }
}
