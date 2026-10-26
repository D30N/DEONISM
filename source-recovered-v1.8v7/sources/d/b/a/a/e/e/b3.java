package d.b.a.a.e.e;

import d.b.a.a.e.e.a3;
import d.b.a.a.e.e.b3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b3<MessageType extends b3<MessageType, BuilderType>, BuilderType extends a3<MessageType, BuilderType>> implements z5 {
    protected int zza = 0;

    protected static <T> void k(Iterable<T> iterable, List<? super T> list) {
        u4.d(iterable);
        if (iterable instanceof k5) {
            List<?> listD = ((k5) iterable).d();
            k5 k5Var = (k5) list;
            int size = list.size();
            for (Object obj : listD) {
                if (obj == null) {
                    int size2 = k5Var.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size3 = k5Var.size() - 1; size3 >= size; size3--) {
                        k5Var.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof l3) {
                    k5Var.t((l3) obj);
                } else {
                    k5Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof m6) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size() - size4;
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(string2);
            }
            list.add(t);
        }
    }

    @Override // d.b.a.a.e.e.z5
    public final l3 e() {
        try {
            s3 s3VarS = l3.s(c());
            j(s3VarS.b());
            return s3VarS.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] n() {
        try {
            byte[] bArr = new byte[c()];
            y3 y3VarF = y3.f(bArr);
            j(y3VarF);
            y3VarF.N();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    int o() {
        throw new UnsupportedOperationException();
    }

    void q(int i) {
        throw new UnsupportedOperationException();
    }
}
