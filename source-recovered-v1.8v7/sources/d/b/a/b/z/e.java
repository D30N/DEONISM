package d.b.a.b.z;

/* loaded from: classes.dex */
public class e extends d {
    float a = -1.0f;

    @Override // d.b.a.b.z.d
    public void a(m mVar, float f, float f2, float f3) {
        mVar.n(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double dSin = Math.sin(Math.toRadians(f));
        double d2 = f3;
        Double.isNaN(d2);
        double d3 = f2;
        Double.isNaN(d3);
        double dSin2 = Math.sin(Math.toRadians(90.0f - f));
        Double.isNaN(d2);
        Double.isNaN(d3);
        mVar.l((float) (dSin * d2 * d3), (float) (dSin2 * d2 * d3));
    }
}
