package com.facebook.ads.redexgen.X;

import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.WindowInsets;

@RequiresApi(21)
/* renamed from: com.facebook.ads.redexgen.X.0b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01060b extends AnonymousClass19 {
    @Override // com.facebook.ads.redexgen.X.C01772u
    public final C3C A08(View view, C3C c3c) {
        WindowInsets windowInsets = (WindowInsets) C3C.A01(c3c);
        WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (windowInsetsDispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(windowInsetsDispatchApplyWindowInsets);
        }
        return C3C.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.X.C01772u
    public final C3C A09(View view, C3C c3c) {
        WindowInsets windowInsets = (WindowInsets) C3C.A01(c3c);
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (windowInsetsOnApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(windowInsetsOnApplyWindowInsets);
        }
        return C3C.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.X.C01772u
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.C01772u
    public final void A0E(View view, final InterfaceC01622f interfaceC01622f) {
        if (interfaceC01622f == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.2t
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return (WindowInsets) C3C.A01(interfaceC01622f.A8t(view2, C3C.A00(windowInsets)));
                }
            });
        }
    }
}
