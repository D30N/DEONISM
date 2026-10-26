package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02887h extends AbstractC0653Mr {
    public static byte[] A04;
    public WeakReference<AudioManager.OnAudioFocusChangeListener> A00;
    public final AbstractC0644Mh A01;
    public final LM A02;
    public final AbstractC0604Ks A03;

    static {
        A05();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 92);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A04 = new byte[]{-21, -1, -18, -13, -7};
    }

    public C02887h(XI xi) {
        super(xi);
        this.A00 = null;
        this.A01 = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.7k
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A01() {
                A01 = new byte[]{19, 7, 22, 27, 29};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                C02917k c02917k = this;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = null;
                AudioManager audioManager = (AudioManager) c02917k.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 34));
                char c2 = c02917k.A00.A00 == null ? (char) 2 : (char) 4;
                while (true) {
                    switch (c2) {
                        case 2:
                            onAudioFocusChangeListener = null;
                            c2 = 3;
                            break;
                        case 3:
                            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                            return;
                        case 4:
                            c02917k = c02917k;
                            onAudioFocusChangeListener = (AudioManager.OnAudioFocusChangeListener) c02917k.A00.A00.get();
                            c2 = 3;
                            break;
                    }
                }
            }
        };
        this.A02 = new LM() { // from class: com.facebook.ads.redexgen.X.7j
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 28);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A01() {
                A01 = new byte[]{0, 20, 5, 8, 14};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(C02977v c02977v) {
                C02907j c02907j = this;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = null;
                AudioManager audioManager = (AudioManager) c02907j.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 125));
                char c2 = c02907j.A00.A00 == null ? (char) 2 : (char) 4;
                while (true) {
                    switch (c2) {
                        case 2:
                            onAudioFocusChangeListener = null;
                            c2 = 3;
                            break;
                        case 3:
                            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                            return;
                        case 4:
                            c02907j = c02907j;
                            onAudioFocusChangeListener = (AudioManager.OnAudioFocusChangeListener) c02907j.A00.A00.get();
                            c2 = 3;
                            break;
                    }
                }
            }
        };
        this.A03 = new C02897i(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A09() {
        super.A09();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A0A() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A03);
        }
        super.A0A();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = null;
        AudioManager audioManager = (AudioManager) getContext().getApplicationContext().getSystemService(A02(0, 5, 46));
        WeakReference<AudioManager.OnAudioFocusChangeListener> weakReference = this.A00;
        char c2 = weakReference == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    onAudioFocusChangeListener = null;
                    c2 = 3;
                    break;
                case 3:
                    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                    super.onDetachedFromWindow();
                    return;
                case 4:
                    weakReference = weakReference;
                    onAudioFocusChangeListener = weakReference.get();
                    c2 = 3;
                    break;
            }
        }
    }
}
