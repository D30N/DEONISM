package d.a.b.k;

import d.a.b.d.i;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class d {
    public static long a(InputStream inputStream, long j) throws IOException {
        i.g(inputStream);
        i.b(j >= 0);
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j;
    }
}
