package d.b.a.a.e.e;

import android.util.Log;

/* loaded from: classes.dex */
final class f2 extends z1<Boolean> {
    f2(g2 g2Var, String str, Boolean bool, boolean z) {
        super(g2Var, str, bool, z, null);
    }

    @Override // d.b.a.a.e.e.z1
    final /* synthetic */ Boolean e(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (k1.f2736c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (k1.f2737d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String strM = super.m();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strM).length() + 28 + String.valueOf(strValueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(strM);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
