package b.n;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import b.n.m;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class q extends m {
    int M;
    private ArrayList<m> K = new ArrayList<>();
    private boolean L = true;
    boolean N = false;
    private int O = 0;

    class a extends n {
        final /* synthetic */ m a;

        a(m mVar) {
            this.a = mVar;
        }

        @Override // b.n.m.f
        public void e(m mVar) {
            this.a.Z();
            mVar.V(this);
        }
    }

    static class b extends n {
        q a;

        b(q qVar) {
            this.a = qVar;
        }

        @Override // b.n.n, b.n.m.f
        public void c(m mVar) {
            q qVar = this.a;
            if (qVar.N) {
                return;
            }
            qVar.g0();
            this.a.N = true;
        }

        @Override // b.n.m.f
        public void e(m mVar) {
            q qVar = this.a;
            int i = qVar.M - 1;
            qVar.M = i;
            if (i == 0) {
                qVar.N = false;
                qVar.v();
            }
            mVar.V(this);
        }
    }

    private void l0(m mVar) {
        this.K.add(mVar);
        mVar.s = this;
    }

    private void u0() {
        b bVar = new b(this);
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.M = this.K.size();
    }

    @Override // b.n.m
    public void T(View view) {
        super.T(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).T(view);
        }
    }

    @Override // b.n.m
    public void X(View view) {
        super.X(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).X(view);
        }
    }

    @Override // b.n.m
    protected void Z() {
        if (this.K.isEmpty()) {
            g0();
            v();
            return;
        }
        u0();
        if (this.L) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                it.next().Z();
            }
            return;
        }
        for (int i = 1; i < this.K.size(); i++) {
            this.K.get(i - 1).b(new a(this.K.get(i)));
        }
        m mVar = this.K.get(0);
        if (mVar != null) {
            mVar.Z();
        }
    }

    @Override // b.n.m
    public /* bridge */ /* synthetic */ m a0(long j) {
        q0(j);
        return this;
    }

    @Override // b.n.m
    public void b0(m.e eVar) {
        super.b0(eVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).b0(eVar);
        }
    }

    @Override // b.n.m
    public void d0(g gVar) {
        super.d0(gVar);
        this.O |= 4;
        if (this.K != null) {
            for (int i = 0; i < this.K.size(); i++) {
                this.K.get(i).d0(gVar);
            }
        }
    }

    @Override // b.n.m
    public void e0(p pVar) {
        super.e0(pVar);
        this.O |= 2;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).e0(pVar);
        }
    }

    @Override // b.n.m
    protected void g() {
        super.g();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).g();
        }
    }

    @Override // b.n.m
    String h0(String str) {
        String strH0 = super.h0(str);
        for (int i = 0; i < this.K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strH0);
            sb.append("\n");
            sb.append(this.K.get(i).h0(str + "  "));
            strH0 = sb.toString();
        }
        return strH0;
    }

    @Override // b.n.m
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public q b(m.f fVar) {
        super.b(fVar);
        return this;
    }

    @Override // b.n.m
    public void j(s sVar) {
        if (M(sVar.f1019b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.M(sVar.f1019b)) {
                    next.j(sVar);
                    sVar.f1020c.add(next);
                }
            }
        }
    }

    @Override // b.n.m
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public q c(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).c(view);
        }
        super.c(view);
        return this;
    }

    public q k0(m mVar) {
        l0(mVar);
        long j = this.f1006d;
        if (j >= 0) {
            mVar.a0(j);
        }
        if ((this.O & 1) != 0) {
            mVar.c0(y());
        }
        if ((this.O & 2) != 0) {
            mVar.e0(C());
        }
        if ((this.O & 4) != 0) {
            mVar.d0(B());
        }
        if ((this.O & 8) != 0) {
            mVar.b0(x());
        }
        return this;
    }

    public m m0(int i) {
        if (i < 0 || i >= this.K.size()) {
            return null;
        }
        return this.K.get(i);
    }

    @Override // b.n.m
    void n(s sVar) {
        super.n(sVar);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).n(sVar);
        }
    }

    public int n0() {
        return this.K.size();
    }

    @Override // b.n.m
    public void o(s sVar) {
        if (M(sVar.f1019b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.M(sVar.f1019b)) {
                    next.o(sVar);
                    sVar.f1020c.add(next);
                }
            }
        }
    }

    @Override // b.n.m
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public q V(m.f fVar) {
        super.V(fVar);
        return this;
    }

    @Override // b.n.m
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public q W(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).W(view);
        }
        super.W(view);
        return this;
    }

    public q q0(long j) {
        ArrayList<m> arrayList;
        super.a0(j);
        if (this.f1006d >= 0 && (arrayList = this.K) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).a0(j);
            }
        }
        return this;
    }

    @Override // b.n.m
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public q c0(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<m> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).c0(timeInterpolator);
            }
        }
        super.c0(timeInterpolator);
        return this;
    }

    @Override // b.n.m
    /* renamed from: s */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.K = new ArrayList<>();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            qVar.l0(this.K.get(i).clone());
        }
        return qVar;
    }

    public q s0(int i) {
        if (i == 0) {
            this.L = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.L = false;
        }
        return this;
    }

    @Override // b.n.m
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public q f0(long j) {
        super.f0(j);
        return this;
    }

    @Override // b.n.m
    protected void u(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long jE = E();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            m mVar = this.K.get(i);
            if (jE > 0 && (this.L || i == 0)) {
                long jE2 = mVar.E();
                if (jE2 > 0) {
                    mVar.f0(jE2 + jE);
                } else {
                    mVar.f0(jE);
                }
            }
            mVar.u(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
