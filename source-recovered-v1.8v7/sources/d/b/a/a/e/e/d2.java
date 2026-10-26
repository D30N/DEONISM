package d.b.a.a.e.e;

import android.util.Log;

/* loaded from: classes.dex */
final class d2 extends z1<Double> {
    d2(g2 g2Var, String str, Double d2, boolean z) {
        super(g2Var, str, d2, z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // d.b.a.a.e.e.z1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Double e(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strM = super.m();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strM).length() + 27 + String.valueOf(strValueOf).length());
        sb.append("Invalid double value for ");
        sb.append(strM);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
