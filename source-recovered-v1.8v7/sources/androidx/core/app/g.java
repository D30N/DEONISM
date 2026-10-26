package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g {

    public static class a {
        final Bundle a;

        /* renamed from: b, reason: collision with root package name */
        private final j[] f386b;

        /* renamed from: c, reason: collision with root package name */
        private final j[] f387c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f388d;
        boolean e;
        private final int f;
        public int g;
        public CharSequence h;
        public PendingIntent i;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, j[] jVarArr, j[] jVarArr2, boolean z, int i2, boolean z2) {
            this.e = true;
            this.g = i;
            this.h = c.d(charSequence);
            this.i = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.f386b = jVarArr;
            this.f387c = jVarArr2;
            this.f388d = z;
            this.f = i2;
            this.e = z2;
        }

        public PendingIntent a() {
            return this.i;
        }

        public boolean b() {
            return this.f388d;
        }

        public j[] c() {
            return this.f387c;
        }

        public Bundle d() {
            return this.a;
        }

        public int e() {
            return this.g;
        }

        public j[] f() {
            return this.f386b;
        }

        public int g() {
            return this.f;
        }

        public boolean h() {
            return this.e;
        }

        public CharSequence i() {
            return this.h;
        }
    }

    public static class b extends d {
        private CharSequence e;

        @Override // androidx.core.app.g.d
        public void b(f fVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(fVar.a()).setBigContentTitle(this.f392b).bigText(this.e);
                if (this.f394d) {
                    bigTextStyleBigText.setSummaryText(this.f393c);
                }
            }
        }

        public b g(CharSequence charSequence) {
            this.e = c.d(charSequence);
            return this;
        }
    }

    public static class c {
        String A;
        Bundle B;
        int C;
        int D;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J;
        String K;
        long L;
        int M;
        Notification N;

        @Deprecated
        public ArrayList<String> O;
        public Context a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f389b;

        /* renamed from: c, reason: collision with root package name */
        ArrayList<a> f390c;

        /* renamed from: d, reason: collision with root package name */
        CharSequence f391d;
        CharSequence e;
        PendingIntent f;
        PendingIntent g;
        RemoteViews h;
        Bitmap i;
        CharSequence j;
        int k;
        int l;
        boolean m;
        boolean n;
        d o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x;
        boolean y;
        boolean z;

        @Deprecated
        public c(Context context) {
            this(context, null);
        }

        public c(Context context, String str) {
            this.f389b = new ArrayList<>();
            this.f390c = new ArrayList<>();
            this.m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            Notification notification = new Notification();
            this.N = notification;
            this.a = context;
            this.I = str;
            notification.when = System.currentTimeMillis();
            this.N.audioStreamType = -1;
            this.l = 0;
            this.O = new ArrayList<>();
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void j(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.N;
                i2 = i | notification.flags;
            } else {
                notification = this.N;
                i2 = (i ^ (-1)) & notification.flags;
            }
            notification.flags = i2;
        }

        public c a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f389b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new h(this).c();
        }

        public Bundle c() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public c e(boolean z) {
            j(16, z);
            return this;
        }

        public c f(String str) {
            this.I = str;
            return this;
        }

        public c g(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public c h(CharSequence charSequence) {
            this.e = d(charSequence);
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f391d = d(charSequence);
            return this;
        }

        public c k(boolean z) {
            this.x = z;
            return this;
        }

        public c l(int i) {
            this.l = i;
            return this;
        }

        public c m(int i) {
            this.N.icon = i;
            return this;
        }

        public c n(d dVar) {
            if (this.o != dVar) {
                this.o = dVar;
                if (dVar != null) {
                    dVar.f(this);
                }
            }
            return this;
        }

        public c o(CharSequence charSequence) {
            this.N.tickerText = d(charSequence);
            return this;
        }

        public c p(long j) {
            this.N.when = j;
            return this;
        }
    }

    public static abstract class d {
        protected c a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f392b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f393c;

        /* renamed from: d, reason: collision with root package name */
        boolean f394d = false;

        public void a(Bundle bundle) {
        }

        public abstract void b(f fVar);

        public RemoteViews c(f fVar) {
            return null;
        }

        public RemoteViews d(f fVar) {
            return null;
        }

        public RemoteViews e(f fVar) {
            return null;
        }

        public void f(c cVar) {
            if (this.a != cVar) {
                this.a = cVar;
                if (cVar != null) {
                    cVar.n(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return i.c(notification);
        }
        return null;
    }
}
