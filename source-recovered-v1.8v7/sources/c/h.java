package c;

import c.f;

/* loaded from: classes.dex */
class h {
    private f<?> a;

    public h(f<?> fVar) {
        this.a = fVar;
    }

    public void a() {
        this.a = null;
    }

    protected void finalize() throws Throwable {
        f.d dVarK;
        try {
            f<?> fVar = this.a;
            if (fVar != null && (dVarK = f.k()) != null) {
                dVarK.a(fVar, new i(fVar.i()));
            }
        } finally {
            super.finalize();
        }
    }
}
