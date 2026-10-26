package d.a.b.c;

import d.a.b.d.i;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c {

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    /* renamed from: d.a.b.c.c$c, reason: collision with other inner class name */
    public static class C0084c extends FileNotFoundException {
        public C0084c(String str) {
            super(str);
        }
    }

    public static class d extends IOException {
        public d(String str, @Nullable Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static void a(File file) throws a {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new a(file.getAbsolutePath(), new b(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new a(file.getAbsolutePath());
        }
    }

    public static void b(File file, File file2) throws d {
        i.g(file);
        i.g(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable bVar = null;
        if (file2.exists()) {
            bVar = new b(file2.getAbsolutePath());
        } else if (!file.getParentFile().exists()) {
            bVar = new C0084c(file.getAbsolutePath());
        } else if (!file.exists()) {
            bVar = new FileNotFoundException(file.getAbsolutePath());
        }
        throw new d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), bVar);
    }
}
