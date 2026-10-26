package d.b.a.a.e.e;

import d.b.a.a.e.e.a3;
import d.b.a.a.e.e.b3;

/* loaded from: classes.dex */
public abstract class a3<MessageType extends b3<MessageType, BuilderType>, BuilderType extends a3<MessageType, BuilderType>> implements c6 {
    protected abstract BuilderType k(MessageType messagetype);

    @Override // d.b.a.a.e.e.c6
    public final /* synthetic */ c6 l(byte[] bArr) {
        n(bArr, 0, bArr.length);
        return this;
    }

    @Override // d.b.a.a.e.e.c6
    public final /* synthetic */ c6 m(byte[] bArr, e4 e4Var) {
        o(bArr, 0, bArr.length, e4Var);
        return this;
    }

    public abstract BuilderType n(byte[] bArr, int i, int i2);

    public abstract BuilderType o(byte[] bArr, int i, int i2, e4 e4Var);

    @Override // d.b.a.a.e.e.c6
    public final /* synthetic */ c6 p(z5 z5Var) {
        if (!f().getClass().isInstance(z5Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        k((b3) z5Var);
        return this;
    }
}
