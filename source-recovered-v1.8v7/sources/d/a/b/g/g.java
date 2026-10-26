package d.a.b.g;

import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public interface g extends Closeable {

    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int b(int i, byte[] bArr, int i2, int i3);

    byte c(int i);

    @Nullable
    ByteBuffer d();

    long e();

    boolean isClosed();

    int size();
}
