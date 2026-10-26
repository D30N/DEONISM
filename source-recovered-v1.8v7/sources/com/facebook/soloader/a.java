package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.f;
import com.facebook.soloader.n;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* loaded from: classes.dex */
public class a extends f {
    private final int h;

    /* renamed from: com.facebook.soloader.a$a, reason: collision with other inner class name */
    protected class C0060a extends f.c {
        private File f;
        private final int g;

        C0060a(f fVar) {
            super(fVar);
            this.f = new File(a.this.f1461c.getApplicationInfo().nativeLibraryDir);
            this.g = a.this.h;
        }

        @Override // com.facebook.soloader.f.c
        protected boolean j(ZipEntry zipEntry, String str) {
            String str2;
            String name = zipEntry.getName();
            boolean z = false;
            if (str.equals(a.this.f1462d)) {
                a.this.f1462d = null;
                str2 = String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.g & 1) == 0) {
                str2 = "allowing consideration of " + name + ": self-extraction preferred";
            } else {
                File file = new File(this.f, str);
                if (file.isFile()) {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length == size) {
                        str2 = "not allowing consideration of " + name + ": deferring to libdir";
                        Log.d("ApkSoSource", str2);
                        return z;
                    }
                    str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                } else {
                    str2 = String.format("allowing considering of %s: %s not in system lib dir", name, str);
                }
            }
            z = true;
            Log.d("ApkSoSource", str2);
            return z;
        }
    }

    public a(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.h = i;
    }

    @Override // com.facebook.soloader.n
    protected byte[] i() throws IOException {
        File canonicalFile = this.f.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            parcelObtain.writeInt(SysUtil.f(this.f1461c));
            if ((this.h & 1) == 0) {
                parcelObtain.writeByte((byte) 0);
                return parcelObtain.marshall();
            }
            String str = this.f1461c.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile2.getPath());
            parcelObtain.writeLong(canonicalFile2.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.n
    protected n.f l() {
        return new C0060a(this);
    }
}
