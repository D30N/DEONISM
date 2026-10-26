package b.l.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import b.d.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
class b extends b.l.a.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f965c = false;
    private final g a;

    /* renamed from: b, reason: collision with root package name */
    private final c f966b;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<D>] */
    public static class a<D> extends l<D> {
        private final int j;
        private final Bundle k;
        private final b.l.b.a<D> l;
        private g m;
        private C0039b<D> n;
        private b.l.b.a<D> o;

        @Override // androidx.lifecycle.LiveData
        protected void e() {
            if (b.f965c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.l.d();
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void f() {
            if (b.f965c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.l.e();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void g(m<? super D> mVar) {
            super.g(mVar);
            this.m = null;
            this.n = null;
        }

        @Override // androidx.lifecycle.l, androidx.lifecycle.LiveData
        public void h(D d2) {
            super.h(d2);
            b.l.b.a<D> aVar = this.o;
            if (aVar == null) {
                return;
            }
            aVar.c();
            throw null;
        }

        b.l.b.a<D> i(boolean z) {
            if (b.f965c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l.a();
            throw null;
        }

        public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.j);
            printWriter.print(" mArgs=");
            printWriter.println(this.k);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.l);
            this.l.b(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        void k() {
            g gVar = this.m;
            C0039b<D> c0039b = this.n;
            if (gVar == null || c0039b == null) {
                return;
            }
            super.g(c0039b);
            d(gVar, c0039b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.j);
            sb.append(" : ");
            b.g.k.a.a(this.l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: b.l.a.b$b, reason: collision with other inner class name */
    static class C0039b<D> implements m<D> {
    }

    static class c extends p {

        /* renamed from: c, reason: collision with root package name */
        private static final q.a f967c = new a();

        /* renamed from: b, reason: collision with root package name */
        private h<a> f968b = new h<>();

        static class a implements q.a {
            a() {
            }

            @Override // androidx.lifecycle.q.a
            public <T extends p> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c e(r rVar) {
            return (c) new q(rVar, f967c).a(c.class);
        }

        @Override // androidx.lifecycle.p
        protected void c() {
            super.c();
            if (this.f968b.r() <= 0) {
                this.f968b.c();
            } else {
                this.f968b.s(0).i(true);
                throw null;
            }
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f968b.r() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f968b.r() <= 0) {
                    return;
                }
                a aVarS = this.f968b.s(0);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f968b.n(0));
                printWriter.print(": ");
                printWriter.println(aVarS.toString());
                aVarS.j(str2, fileDescriptor, printWriter, strArr);
                throw null;
            }
        }

        void f() {
            int iR = this.f968b.r();
            for (int i = 0; i < iR; i++) {
                this.f968b.s(i).k();
            }
        }
    }

    b(g gVar, r rVar) {
        this.a = gVar;
        this.f966b = c.e(rVar);
    }

    @Override // b.l.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f966b.d(str, fileDescriptor, printWriter, strArr);
    }

    @Override // b.l.a.a
    public void c() {
        this.f966b.f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        b.g.k.a.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
