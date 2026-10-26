package d.b.a.a.e.e;

import android.util.Log;

/* loaded from: classes.dex */
final class b2 extends z1<Long> {
    b2(g2 g2Var, String str, Long l, boolean z) {
        super(g2Var, str, l, z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // d.b.a.a.e.e.z1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Long e(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strM = super.m();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strM).length() + 25 + String.valueOf(strValueOf).length());
        sb.append("Invalid long value for ");
        sb.append(strM);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
