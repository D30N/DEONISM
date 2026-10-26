package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.l.r;
import b.i.b.c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    b.i.b.c a;

    /* renamed from: b, reason: collision with root package name */
    b f1999b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2000c;
    private boolean e;

    /* renamed from: d, reason: collision with root package name */
    private float f2001d = 0.0f;
    int f = 2;
    float g = 0.5f;
    float h = 0.0f;
    float i = 0.5f;
    private final c.AbstractC0038c j = new a();

    class a extends c.AbstractC0038c {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f2002b = -1;

        a() {
        }

        private boolean n(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.g);
            }
            boolean z = r.v(view) == 1;
            int i = SwipeDismissBehavior.this.f;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            if (z) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
        @Override // b.i.b.c.AbstractC0038c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = b.g.l.r.v(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.a
                goto L37
            L1c:
                int r5 = r2.a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // b.i.b.c.AbstractC0038c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // b.i.b.c.AbstractC0038c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // b.i.b.c.AbstractC0038c
        public void i(View view, int i) {
            this.f2002b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // b.i.b.c.AbstractC0038c
        public void j(int i) {
            b bVar = SwipeDismissBehavior.this.f1999b;
            if (bVar != null) {
                bVar.b(i);
            }
        }

        @Override // b.i.b.c.AbstractC0038c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = this.a + (view.getWidth() * SwipeDismissBehavior.this.h);
            float width2 = this.a + (view.getWidth() * SwipeDismissBehavior.this.i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f), 1.0f));
            }
        }

        @Override // b.i.b.c.AbstractC0038c
        public void l(View view, float f, float f2) {
            int i;
            boolean z;
            b bVar;
            this.f2002b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                int left = view.getLeft();
                int i2 = this.a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.F(i, view.getTop())) {
                r.V(view, new c(view, z));
            } else {
                if (!z || (bVar = SwipeDismissBehavior.this.f1999b) == null) {
                    return;
                }
                bVar.a(view);
            }
        }

        @Override // b.i.b.c.AbstractC0038c
        public boolean m(View view, int i) {
            int i2 = this.f2002b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.E(view);
        }
    }

    public interface b {
        void a(View view);

        void b(int i);
    }

    private class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final View f2004b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f2005c;

        c(View view, boolean z) {
            this.f2004b = view;
            this.f2005c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            b.i.b.c cVar = SwipeDismissBehavior.this.a;
            if (cVar != null && cVar.k(true)) {
                r.V(this.f2004b, this);
            } else {
                if (!this.f2005c || (bVar = SwipeDismissBehavior.this.f1999b) == null) {
                    return;
                }
                bVar.a(this.f2004b);
            }
        }
    }

    static float F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void H(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.e ? b.i.b.c.l(viewGroup, this.f2001d, this.j) : b.i.b.c.m(viewGroup, this.j);
        }
    }

    static float I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        b.i.b.c cVar = this.a;
        if (cVar == null) {
            return false;
        }
        cVar.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f) {
        this.i = F(0.0f, f, 1.0f);
    }

    public void K(float f) {
        this.h = F(0.0f, f, 1.0f);
    }

    public void L(int i) {
        this.f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zB = this.f2000c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2000c = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2000c = false;
        }
        if (!zB) {
            return false;
        }
        H(coordinatorLayout);
        return this.a.G(motionEvent);
    }
}
