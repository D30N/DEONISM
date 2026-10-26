package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.exoplayer2.drm.ExoMediaDrm;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Bb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class HandlerC0378Bb extends Handler {
    public final /* synthetic */ YW A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bb != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    public HandlerC0378Bb(YW yw, Looper looper) {
        super(looper);
        this.A00 = yw;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bb != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    private long A00(int i) {
        return Math.min((i - 1) * AdError.NETWORK_ERROR_CODE, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bb != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    private boolean A01(Message message) {
        HandlerC0378Bb handlerC0378Bb = this;
        int errorCount = 0;
        boolean z = false;
        char c2 = message.arg1 == 1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    z = false;
                    c2 = 3;
                    break;
                case 6:
                    handlerC0378Bb = handlerC0378Bb;
                    message = message;
                    errorCount = message.arg2 + 1;
                    if (errorCount <= handlerC0378Bb.A00.A0D) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    HandlerC0378Bb handlerC0378Bb2 = handlerC0378Bb;
                    Message messageObtain = Message.obtain(message);
                    messageObtain.arg2 = errorCount;
                    handlerC0378Bb2.sendMessageDelayed(messageObtain, handlerC0378Bb2.A00(errorCount));
                    return true;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bb != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    public final void A02(int i, Object obj, boolean z) {
        obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bb != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            Object obj = message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    e = this.A00.A0B.executeProvisionRequest(this.A00.A0C, (C2) obj);
                } else if (i == 1) {
                    Pair<ExoMediaDrm.KeyRequest, String> keyRequest = (Pair) obj;
                    e = this.A00.A0B.executeKeyRequest(this.A00.A0C, (InterfaceC0399By) keyRequest.first, (String) keyRequest.second);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                e = e;
                if (A01(message)) {
                    return;
                }
            }
            this.A00.A0A.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }
}
