package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class y2 extends u2 {
    private final x2 a = new x2();

    y2() {
    }

    @Override // d.b.a.a.e.e.u2
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.a.a(th, true).add(th2);
    }
}
