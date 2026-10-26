package b.g.l.a0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    private final int f911b;

    /* renamed from: c, reason: collision with root package name */
    private final c f912c;

    /* renamed from: d, reason: collision with root package name */
    private final int f913d;

    public a(int i, c cVar, int i2) {
        this.f911b = i;
        this.f912c = cVar;
        this.f913d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f911b);
        this.f912c.M(this.f913d, bundle);
    }
}
