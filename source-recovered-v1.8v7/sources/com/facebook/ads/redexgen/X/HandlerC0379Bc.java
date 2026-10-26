package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Bc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class HandlerC0379Bc extends Handler {
    public final /* synthetic */ YW A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostResponseHandler */
    public HandlerC0379Bc(YW yw, Looper looper) {
        super(looper);
        this.A00 = yw;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostResponseHandler */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        HandlerC0379Bc handlerC0379Bc = this;
        int i = 0;
        Object response = null;
        HandlerC0379Bc handlerC0379Bc2 = null;
        Object obj = null;
        char c2 = C0601Ko.A02(handlerC0379Bc) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    handlerC0379Bc = handlerC0379Bc;
                    handlerC0379Bc2 = handlerC0379Bc;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        message = message;
                        Pair pair = (Pair) message.obj;
                        obj = pair.first;
                        response = pair.second;
                        i = message.what;
                        if (i == 0) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = '\f';
                            break;
                        }
                    } catch (Throwable th) {
                        C0601Ko.A00(th, handlerC0379Bc2);
                        return;
                    }
                case '\n':
                    handlerC0379Bc2.A00.A0B(obj, response);
                    return;
                case '\f':
                    if (i != 1) {
                        return;
                    }
                    handlerC0379Bc2.A00.A0A(obj, response);
                    return;
            }
        }
    }
}
