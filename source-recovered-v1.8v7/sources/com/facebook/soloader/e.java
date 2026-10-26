package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e extends n {

    private final class b extends n.f {

        /* renamed from: b, reason: collision with root package name */
        private final c[] f1446b;

        private final class a extends n.e {

            /* renamed from: b, reason: collision with root package name */
            private int f1447b;

            private a() {
            }

            @Override // com.facebook.soloader.n.e
            public boolean a() {
                return this.f1447b < b.this.f1446b.length;
            }

            @Override // com.facebook.soloader.n.e
            public n.d f() throws IOException {
                c[] cVarArr = b.this.f1446b;
                int i = this.f1447b;
                this.f1447b = i + 1;
                c cVar = cVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.f1449d);
                try {
                    return new n.d(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
        
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r10 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        b(com.facebook.soloader.e r17, com.facebook.soloader.n r18) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.e.b.<init>(com.facebook.soloader.e, com.facebook.soloader.n):void");
        }

        @Override // com.facebook.soloader.n.f
        protected n.c a() {
            return new n.c(this.f1446b);
        }

        @Override // com.facebook.soloader.n.f
        protected n.e f() {
            return new a();
        }
    }

    private static final class c extends n.b {

        /* renamed from: d, reason: collision with root package name */
        final File f1449d;

        c(String str, String str2, File file) {
            super(str, str2);
            this.f1449d = file;
        }
    }

    public e(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.n
    protected n.f l() {
        return new b(this, this);
    }
}
