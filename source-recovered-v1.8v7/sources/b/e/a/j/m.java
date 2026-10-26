package b.e.a.j;

/* loaded from: classes.dex */
public class m extends n {

    /* renamed from: c, reason: collision with root package name */
    float f825c = 0.0f;

    @Override // b.e.a.j.n
    public void e() {
        super.e();
        this.f825c = 0.0f;
    }

    public void g() {
        this.f826b = 2;
    }

    public void h(int i) {
        if (this.f826b == 0 || this.f825c != i) {
            this.f825c = i;
            if (this.f826b == 1) {
                c();
            }
            b();
        }
    }
}
