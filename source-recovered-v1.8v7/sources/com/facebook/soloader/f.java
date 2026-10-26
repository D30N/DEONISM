package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.n;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class f extends n {
    protected final File f;
    protected final String g;

    private static final class b extends n.b implements Comparable {

        /* renamed from: d, reason: collision with root package name */
        final ZipEntry f1450d;
        final int e;

        b(String str, ZipEntry zipEntry, int i) {
            super(str, f(zipEntry));
            this.f1450d = zipEntry;
            this.e = i;
        }

        private static String f(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f1466b.compareTo(((b) obj).f1466b);
        }
    }

    protected class c extends n.f {

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private b[] f1451b;

        /* renamed from: c, reason: collision with root package name */
        private final ZipFile f1452c;

        /* renamed from: d, reason: collision with root package name */
        private final n f1453d;

        private final class a extends n.e {

            /* renamed from: b, reason: collision with root package name */
            private int f1454b;

            private a() {
            }

            @Override // com.facebook.soloader.n.e
            public boolean a() {
                c.this.i();
                return this.f1454b < c.this.f1451b.length;
            }

            @Override // com.facebook.soloader.n.e
            public n.d f() throws IOException {
                c.this.i();
                b[] bVarArr = c.this.f1451b;
                int i = this.f1454b;
                this.f1454b = i + 1;
                b bVar = bVarArr[i];
                InputStream inputStream = c.this.f1452c.getInputStream(bVar.f1450d);
                try {
                    return new n.d(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        c(n nVar) {
            this.f1452c = new ZipFile(f.this.f);
            this.f1453d = nVar;
        }

        @Override // com.facebook.soloader.n.f
        protected final n.c a() {
            return new n.c(i());
        }

        @Override // com.facebook.soloader.n.f, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f1452c.close();
        }

        @Override // com.facebook.soloader.n.f
        protected final n.e f() {
            return new a();
        }

        final b[] i() {
            if (this.f1451b == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap map = new HashMap();
                Pattern patternCompile = Pattern.compile(f.this.g);
                String[] strArrG = SysUtil.g();
                Enumeration<? extends ZipEntry> enumerationEntries = this.f1452c.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        int iD = SysUtil.d(strArrG, strGroup);
                        if (iD >= 0) {
                            linkedHashSet.add(strGroup);
                            b bVar = (b) map.get(strGroup2);
                            if (bVar == null || iD < bVar.e) {
                                map.put(strGroup2, new b(strGroup2, zipEntryNextElement, iD));
                            }
                        }
                    }
                }
                this.f1453d.p((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                b[] bVarArr = (b[]) map.values().toArray(new b[map.size()]);
                Arrays.sort(bVarArr);
                int i = 0;
                for (int i2 = 0; i2 < bVarArr.length; i2++) {
                    b bVar2 = bVarArr[i2];
                    if (j(bVar2.f1450d, bVar2.f1466b)) {
                        i++;
                    } else {
                        bVarArr[i2] = null;
                    }
                }
                b[] bVarArr2 = new b[i];
                int i3 = 0;
                for (b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i3] = bVar3;
                        i3++;
                    }
                }
                this.f1451b = bVarArr2;
            }
            return this.f1451b;
        }

        protected boolean j(ZipEntry zipEntry, String str) {
            throw null;
        }
    }

    public f(Context context, String str, File file, String str2) {
        super(context, str);
        this.f = file;
        this.g = str2;
    }
}
