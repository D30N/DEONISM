package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import d.b.a.a.e.e.y0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class la {
    private d.b.a.a.e.e.y0 a;

    /* renamed from: b, reason: collision with root package name */
    private Long f1781b;

    /* renamed from: c, reason: collision with root package name */
    private long f1782c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ ga f1783d;

    private la(ga gaVar) {
        this.f1783d = gaVar;
    }

    /* synthetic */ la(ga gaVar, ja jaVar) {
        this(gaVar);
    }

    final d.b.a.a.e.e.y0 a(String str, d.b.a.a.e.e.y0 y0Var) {
        b4 b4VarH;
        String str2;
        Object obj;
        String strW = y0Var.W();
        List<d.b.a.a.e.e.a1> listF = y0Var.F();
        Long l = (Long) this.f1783d.o().V(y0Var, "_eid");
        boolean z = l != null;
        if (z && strW.equals("_ep")) {
            strW = (String) this.f1783d.o().V(y0Var, "_en");
            if (TextUtils.isEmpty(strW)) {
                this.f1783d.m().H().b("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.a == null || this.f1781b == null || l.longValue() != this.f1781b.longValue()) {
                Pair<d.b.a.a.e.e.y0, Long> pairA = this.f1783d.p().A(str, l);
                if (pairA == null || (obj = pairA.first) == null) {
                    this.f1783d.m().H().c("Extra parameter without existing main event. eventName, eventId", strW, l);
                    return null;
                }
                this.a = (d.b.a.a.e.e.y0) obj;
                this.f1782c = ((Long) pairA.second).longValue();
                this.f1781b = (Long) this.f1783d.o().V(this.a, "_eid");
            }
            long j = this.f1782c - 1;
            this.f1782c = j;
            if (j <= 0) {
                e eVarP = this.f1783d.p();
                eVarP.c();
                eVarP.m().O().b("Clearing complex main event info. appId", str);
                try {
                    eVarP.w().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    eVarP.m().G().b("Error clearing complex main event", e);
                }
            } else {
                this.f1783d.p().X(str, l, this.f1782c, this.a);
            }
            ArrayList arrayList = new ArrayList();
            for (d.b.a.a.e.e.a1 a1Var : this.a.F()) {
                this.f1783d.o();
                if (v9.z(y0Var, a1Var.P()) == null) {
                    arrayList.add(a1Var);
                }
            }
            if (arrayList.isEmpty()) {
                b4VarH = this.f1783d.m().H();
                str2 = "No unique parameters in main event. eventName";
                b4VarH.b(str2, strW);
            } else {
                arrayList.addAll(listF);
                listF = arrayList;
            }
        } else if (z) {
            this.f1781b = l;
            this.a = y0Var;
            Object objV = this.f1783d.o().V(y0Var, "_epc");
            long jLongValue = ((Long) (objV != null ? objV : 0L)).longValue();
            this.f1782c = jLongValue;
            if (jLongValue <= 0) {
                b4VarH = this.f1783d.m().H();
                str2 = "Complex event with zero extra param count. eventName";
                b4VarH.b(str2, strW);
            } else {
                this.f1783d.p().X(str, l, this.f1782c, y0Var);
            }
        }
        y0.a aVarA = y0Var.A();
        aVarA.C(strW);
        aVarA.I();
        aVarA.B(listF);
        return (d.b.a.a.e.e.y0) ((d.b.a.a.e.e.r4) aVarA.i());
    }
}
