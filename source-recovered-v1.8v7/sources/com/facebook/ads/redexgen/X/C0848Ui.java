package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ui, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0848Ui extends C6U {
    public final Context A00;
    public final ApplicationInfo A01;
    public final C02525u A02;
    public final C02816x A03;

    public C0848Ui(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A01 = context.getApplicationInfo();
        this.A00 = context;
        this.A02 = c02525u;
        this.A03 = C02816x.A00(this.A00, this.A02.A0a(), this.A02.A0g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC02766s A05(HashMap<Integer, C0847Uh> map) {
        return new X9(SystemClock.elapsedRealtime(), A02(), map, EnumC02756r.A06);
    }

    public final InterfaceC02616d A0G() {
        return new UX(this);
    }

    public final InterfaceC02616d A0H() {
        return new UV(this);
    }

    public final InterfaceC02616d A0I() {
        return new UU(this);
    }

    public final InterfaceC02616d A0J() {
        return new UQ(this);
    }

    public final InterfaceC02616d A0K() {
        return new C0842Uc(this);
    }

    public final InterfaceC02616d A0L() {
        return new C0845Uf(this);
    }

    public final InterfaceC02616d A0M() {
        return new UY(this);
    }

    public final InterfaceC02616d A0N() {
        return new UZ(this);
    }

    public final InterfaceC02616d A0O() {
        return new C0843Ud(this);
    }

    public final InterfaceC02616d A0P() {
        return new C0846Ug(this);
    }

    public final InterfaceC02616d A0Q() {
        return new C0844Ue(this);
    }

    public final InterfaceC02616d A0R() {
        return new C0841Ub(this);
    }

    public final InterfaceC02616d A0S() {
        return new C0840Ua(this);
    }

    public final InterfaceC02616d A0T() {
        return new UO(this);
    }

    public final InterfaceC02616d A0U() {
        return new UP(this);
    }

    public final InterfaceC02616d A0V() {
        return new UR(this);
    }

    public final InterfaceC02616d A0W() {
        return new US(this);
    }

    public final InterfaceC02616d A0X() {
        return new UT(this);
    }

    public final InterfaceC02616d A0Y() {
        return new UW(this);
    }
}
