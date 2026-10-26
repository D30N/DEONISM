package d.a.b.l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.FileDescriptor;

/* loaded from: classes.dex */
public interface b {

    public interface a {
        void a(String str, String str2);
    }

    void a(d.a.b.l.a aVar);

    void b(a aVar);

    Bitmap c(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options);
}
