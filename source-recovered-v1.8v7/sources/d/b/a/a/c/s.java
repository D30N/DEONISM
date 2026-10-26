package d.b.a.a.c;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.internal.j0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
abstract class s extends j0 {
    private int a;

    protected s(byte[] bArr) {
        com.google.android.gms.common.internal.q.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] U(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.common.internal.i0
    public final d.b.a.a.d.a b() {
        return d.b.a.a.d.b.U(h());
    }

    @Override // com.google.android.gms.common.internal.i0
    public final int c() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        d.b.a.a.d.a aVarB;
        if (obj != null && (obj instanceof i0)) {
            try {
                i0 i0Var = (i0) obj;
                if (i0Var.c() == hashCode() && (aVarB = i0Var.b()) != null) {
                    return Arrays.equals(h(), (byte[]) d.b.a.a.d.b.h(aVarB));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    abstract byte[] h();

    public int hashCode() {
        return this.a;
    }
}
