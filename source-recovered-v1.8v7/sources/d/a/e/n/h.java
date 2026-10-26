package d.a.e.n;

/* loaded from: classes.dex */
public class h implements d {
    private final int a;

    public h(int i) {
        this.a = i;
    }

    @Override // d.a.e.n.d
    public c createImageTranscoder(com.facebook.imageformat.c cVar, boolean z) {
        return new g(z, this.a);
    }
}
