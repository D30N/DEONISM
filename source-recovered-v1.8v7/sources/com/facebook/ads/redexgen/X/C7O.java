package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7O extends AbstractC0653Mr implements View.OnClickListener {
    public final AbstractC0644Mh A00;
    public final LM A01;
    public final AbstractC0604Ks A02;
    public final AbstractC0602Kp A03;
    public final PW A04;

    public C7O(XI xi) {
        this(xi, null);
    }

    public C7O(XI xi, AttributeSet attributeSet) {
        this(xi, attributeSet, 0);
    }

    public C7O(XI xi, AttributeSet attributeSet, int i) {
        super(xi, attributeSet, i);
        this.A03 = new AbstractC0602Kp() { // from class: com.facebook.ads.redexgen.X.7V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0603Kr c0603Kr) {
                this.A00.setVisibility(0);
            }
        };
        this.A01 = new LM() { // from class: com.facebook.ads.redexgen.X.7U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02977v c02977v) {
                this.A00.A04.setChecked(true);
            }
        };
        this.A02 = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.7T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(L4 l4) {
                this.A00.A04.setChecked(false);
            }
        };
        this.A00 = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.7S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                this.A00.A04.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new PW(xi);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A09() {
        super.A09();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A0A() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A0A();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        C7O c7o = this;
        C7O c7o2 = null;
        C0755Qq videoView = null;
        char c2 = C0601Ko.A02(c7o) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c7o = c7o;
                    c7o2 = c7o;
                    c2 = 4;
                    break;
                case 4:
                    c7o2 = c7o2;
                    videoView = c7o2.getVideoView();
                    if (videoView != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    videoView = videoView;
                    if (videoView.getState() == EnumC0737Py.A07) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    videoView = videoView;
                    if (videoView.getState() == EnumC0737Py.A05) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    try {
                        videoView = videoView;
                        if (videoView.getState() != EnumC0737Py.A06) {
                            c2 = 18;
                            break;
                        } else {
                            c2 = 16;
                            break;
                        }
                    } catch (Throwable th) {
                        C0601Ko.A00(th, c7o2);
                        return;
                    }
                case 16:
                    videoView.A0Y(PC.A05, 11);
                    return;
                case 18:
                    C0755Qq c0755Qq = videoView;
                    if (c0755Qq.getState() == EnumC0737Py.A0A) {
                        c0755Qq.A0b(true, 7);
                        return;
                    }
                    return;
            }
        }
    }

    public void setPauseAccessibilityLabel(@Nullable String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(@Nullable String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
