package b.n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import b.n.a;
import b.n.m;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class j0 extends m {
    private static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    private int K = 3;

    class a extends n {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f994b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f995c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.f994b = view;
            this.f995c = view2;
        }

        @Override // b.n.n, b.n.m.f
        public void a(m mVar) {
            x.a(this.a).c(this.f994b);
        }

        @Override // b.n.n, b.n.m.f
        public void b(m mVar) {
            if (this.f994b.getParent() == null) {
                x.a(this.a).a(this.f994b);
            } else {
                j0.this.g();
            }
        }

        @Override // b.n.m.f
        public void e(m mVar) {
            this.f995c.setTag(j.save_overlay_view, null);
            x.a(this.a).c(this.f994b);
            mVar.V(this);
        }
    }

    private static class b extends AnimatorListenerAdapter implements m.f, a.InterfaceC0040a {
        private final View a;

        /* renamed from: b, reason: collision with root package name */
        private final int f997b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f998c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f999d;
        private boolean e;
        boolean f = false;

        b(View view, int i, boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.a = view;
            this.f997b = i;
            this.f998c = (ViewGroup) view.getParent();
            this.f999d = z;
            g(true);
        }

        private void f() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!this.f) {
                c0.h(this.a, this.f997b);
                ViewGroup viewGroup = this.f998c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ViewGroup viewGroup;
            if (!this.f999d || this.e == z || (viewGroup = this.f998c) == null) {
                return;
            }
            this.e = z;
            x.c(viewGroup, z);
        }

        @Override // b.n.m.f
        public void a(m mVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            g(false);
        }

        @Override // b.n.m.f
        public void b(m mVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            g(true);
        }

        @Override // b.n.m.f
        public void c(m mVar) {
        }

        @Override // b.n.m.f
        public void d(m mVar) {
        }

        @Override // b.n.m.f
        public void e(m mVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            f();
            mVar.V(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, b.n.a.InterfaceC0040a
        public void onAnimationPause(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f) {
                return;
            }
            c0.h(this.a, this.f997b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, b.n.a.InterfaceC0040a
        public void onAnimationResume(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f) {
                return;
            }
            c0.h(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private static class c {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1000b;

        /* renamed from: c, reason: collision with root package name */
        int f1001c;

        /* renamed from: d, reason: collision with root package name */
        int f1002d;
        ViewGroup e;
        ViewGroup f;

        c() {
        }
    }

    private void i0(s sVar) {
        sVar.a.put("android:visibility:visibility", Integer.valueOf(sVar.f1019b.getVisibility()));
        sVar.a.put("android:visibility:parent", sVar.f1019b.getParent());
        int[] iArr = new int[2];
        sVar.f1019b.getLocationOnScreen(iArr);
        sVar.a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r9 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r0.e == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r0.f1001c == 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b.n.j0.c j0(b.n.s r8, b.n.s r9) {
        /*
            r7 = this;
            b.n.j0$c r0 = new b.n.j0$c
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.f1000b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f1001c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.f1001c = r4
            r0.e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f1002d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L5e
        L5a:
            r0.f1002d = r4
            r0.f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L86
            if (r9 == 0) goto L86
            int r8 = r0.f1001c
            int r9 = r0.f1002d
            if (r8 != r9) goto L70
            android.view.ViewGroup r8 = r0.e
            android.view.ViewGroup r9 = r0.f
            if (r8 != r9) goto L70
            return r0
        L70:
            int r8 = r0.f1001c
            int r9 = r0.f1002d
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L79
            goto L97
        L79:
            if (r9 != 0) goto L9a
            goto L8c
        L7c:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            goto L97
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9a
            goto L8c
        L86:
            if (r8 != 0) goto L91
            int r8 = r0.f1002d
            if (r8 != 0) goto L91
        L8c:
            r0.f1000b = r2
        L8e:
            r0.a = r2
            goto L9a
        L91:
            if (r9 != 0) goto L9a
            int r8 = r0.f1001c
            if (r8 != 0) goto L9a
        L97:
            r0.f1000b = r1
            goto L8e
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.n.j0.j0(b.n.s, b.n.s):b.n.j0$c");
    }

    @Override // b.n.m
    public String[] J() {
        return L;
    }

    @Override // b.n.m
    public boolean L(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.a.containsKey("android:visibility:visibility") != sVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarJ0 = j0(sVar, sVar2);
        if (cVarJ0.a) {
            return cVarJ0.f1001c == 0 || cVarJ0.f1002d == 0;
        }
        return false;
    }

    @Override // b.n.m
    public void j(s sVar) {
        i0(sVar);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator l0(ViewGroup viewGroup, s sVar, int i, s sVar2, int i2) {
        if ((this.K & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f1019b.getParent();
            if (j0(z(view, false), K(view, false)).a) {
                return null;
            }
        }
        return k0(viewGroup, sVar2.f1019b, sVar, sVar2);
    }

    public abstract Animator m0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085 A[PHI: r2
      0x0085: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:36:0x0072, B:38:0x0075, B:40:0x007b, B:42:0x007f, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator n0(android.view.ViewGroup r11, b.n.s r12, int r13, b.n.s r14, int r15) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.n.j0.n0(android.view.ViewGroup, b.n.s, int, b.n.s, int):android.animation.Animator");
    }

    @Override // b.n.m
    public void o(s sVar) {
        i0(sVar);
    }

    public void o0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.K = i;
    }

    @Override // b.n.m
    public Animator t(ViewGroup viewGroup, s sVar, s sVar2) {
        c cVarJ0 = j0(sVar, sVar2);
        if (!cVarJ0.a) {
            return null;
        }
        if (cVarJ0.e == null && cVarJ0.f == null) {
            return null;
        }
        return cVarJ0.f1000b ? l0(viewGroup, sVar, cVarJ0.f1001c, sVar2, cVarJ0.f1002d) : n0(viewGroup, sVar, cVarJ0.f1001c, sVar2, cVarJ0.f1002d);
    }
}
