package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class n extends com.facebook.soloader.c {

    /* renamed from: c, reason: collision with root package name */
    protected final Context f1461c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    protected String f1462d;
    private final Map<String, Object> e;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f1463b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f1464c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f1465d;
        final /* synthetic */ File e;
        final /* synthetic */ g f;

        a(File file, byte[] bArr, c cVar, File file2, g gVar) {
            this.f1463b = file;
            this.f1464c = bArr;
            this.f1465d = cVar;
            this.e = file2;
            this.f = gVar;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    Log.v("fb-UnpackingSoSource", "starting syncer worker");
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.f1463b, "rw");
                    try {
                        randomAccessFile.write(this.f1464c);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        randomAccessFile.close();
                        randomAccessFile = new RandomAccessFile(new File(n.this.a, "dso_manifest"), "rw");
                        try {
                            this.f1465d.b(randomAccessFile);
                            randomAccessFile.close();
                            SysUtil.e(n.this.a);
                            n.q(this.e, (byte) 1);
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } catch (Throwable th) {
                            try {
                                randomAccessFile.close();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } finally {
                    Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + n.this.a + " (from syncer thread)");
                    this.f.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class b {

        /* renamed from: b, reason: collision with root package name */
        public final String f1466b;

        /* renamed from: c, reason: collision with root package name */
        public final String f1467c;

        public b(String str, String str2) {
            this.f1466b = str;
            this.f1467c = str2;
        }
    }

    public static final class c {
        public final b[] a;

        public c(b[] bVarArr) {
            this.a = bVarArr;
        }

        static final c a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() != 1) {
                throw new RuntimeException("wrong dso manifest version");
            }
            int i = dataInput.readInt();
            if (i < 0) {
                throw new RuntimeException("illegal number of shared libraries");
            }
            b[] bVarArr = new b[i];
            for (int i2 = 0; i2 < i; i2++) {
                bVarArr[i2] = new b(dataInput.readUTF(), dataInput.readUTF());
            }
            return new c(bVarArr);
        }

        public final void b(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.a.length);
            int i = 0;
            while (true) {
                b[] bVarArr = this.a;
                if (i >= bVarArr.length) {
                    return;
                }
                dataOutput.writeUTF(bVarArr[i].f1466b);
                dataOutput.writeUTF(this.a[i].f1467c);
                i++;
            }
        }
    }

    protected static final class d implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        public final b f1468b;

        /* renamed from: c, reason: collision with root package name */
        public final InputStream f1469c;

        public d(b bVar, InputStream inputStream) {
            this.f1468b = bVar;
            this.f1469c = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f1469c.close();
        }
    }

    protected static abstract class e implements Closeable {
        protected e() {
        }

        public abstract boolean a();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract d f();
    }

    protected static abstract class f implements Closeable {
        protected f() {
        }

        protected abstract c a();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        protected abstract e f();
    }

    protected n(Context context, String str) {
        super(k(context, str), 1);
        this.e = new HashMap();
        this.f1461c = context;
    }

    private void g(b[] bVarArr) throws IOException {
        String[] list = this.a.list();
        if (list == null) {
            throw new IOException("unable to list directory " + this.a);
        }
        for (String str : list) {
            if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                boolean z = false;
                for (int i = 0; !z && i < bVarArr.length; i++) {
                    if (bVarArr[i].f1466b.equals(str)) {
                        z = true;
                    }
                }
                if (!z) {
                    File file = new File(this.a, str);
                    Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                    SysUtil.b(file);
                }
            }
        }
    }

    private void h(d dVar, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        Log.i("fb-UnpackingSoSource", "extracting DSO " + dVar.f1468b.f1466b);
        if (!this.a.setWritable(true, true)) {
            throw new IOException("cannot make directory writable for us: " + this.a);
        }
        File file = new File(this.a, dVar.f1468b.f1466b);
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (IOException e2) {
            Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e2);
            SysUtil.b(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
        }
        try {
            try {
                int iAvailable = dVar.f1469c.available();
                if (iAvailable > 1) {
                    SysUtil.c(randomAccessFile.getFD(), iAvailable);
                }
                SysUtil.a(randomAccessFile, dVar.f1469c, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e3) {
                SysUtil.b(file);
                throw e3;
            }
        } finally {
            randomAccessFile.close();
        }
    }

    private Object j(String str) {
        Object obj;
        synchronized (this.e) {
            obj = this.e.get(str);
            if (obj == null) {
                obj = new Object();
                this.e.put(str, obj);
            }
        }
        return obj;
    }

    public static File k(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    private boolean n(g gVar, int i, byte[] bArr) throws IOException {
        byte b2;
        File file = new File(this.a, "dso_state");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            b2 = randomAccessFile.readByte();
        } catch (EOFException unused) {
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    randomAccessFile.close();
                } catch (Throwable unused2) {
                }
            }
        }
        if (b2 != 1) {
            Log.v("fb-UnpackingSoSource", "dso store " + this.a + " regeneration interrupted: wiping clean");
            b2 = 0;
        }
        randomAccessFile.close();
        File file2 = new File(this.a, "dso_deps");
        c cVarA = null;
        randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            int length = (int) randomAccessFile.length();
            byte[] bArr2 = new byte[length];
            if (randomAccessFile.read(bArr2) != length) {
                Log.v("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                b2 = 0;
            }
            if (!Arrays.equals(bArr2, bArr)) {
                Log.v("fb-UnpackingSoSource", "deps mismatch on deps store: regenerating");
                b2 = 0;
            }
            if (b2 == 0 || (i & 2) != 0) {
                Log.v("fb-UnpackingSoSource", "so store dirty: regenerating");
                q(file, (byte) 0);
                f fVarL = l();
                try {
                    cVarA = fVarL.a();
                    e eVarF = fVarL.f();
                    try {
                        o(b2, cVarA, eVarF);
                        if (eVarF != null) {
                            eVarF.close();
                        }
                        if (fVarL != null) {
                            fVarL.close();
                        }
                    } finally {
                    }
                } finally {
                }
            }
            c cVar = cVarA;
            randomAccessFile.close();
            if (cVar == null) {
                return false;
            }
            a aVar = new a(file2, bArr, cVar, file, gVar);
            if ((i & 1) != 0) {
                new Thread(aVar, "SoSync:" + this.a.getName()).start();
            } else {
                aVar.run();
            }
            return true;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void o(byte b2, c cVar, e eVar) throws IOException {
        c cVarA;
        Log.v("fb-UnpackingSoSource", "regenerating DSO store " + getClass().getName());
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.a, "dso_manifest"), "rw");
        try {
            if (b2 == 1) {
                try {
                    cVarA = c.a(randomAccessFile);
                } catch (Exception e2) {
                    Log.i("fb-UnpackingSoSource", "error reading existing DSO manifest", e2);
                }
            } else {
                cVarA = null;
            }
            if (cVarA == null) {
                cVarA = new c(new b[0]);
            }
            g(cVar.a);
            byte[] bArr = new byte[32768];
            while (eVar.a()) {
                d dVarF = eVar.f();
                boolean z = true;
                int i = 0;
                while (z) {
                    try {
                        if (i >= cVarA.a.length) {
                            break;
                        }
                        if (cVarA.a[i].f1466b.equals(dVarF.f1468b.f1466b) && cVarA.a[i].f1467c.equals(dVarF.f1468b.f1467c)) {
                            z = false;
                        }
                        i++;
                    } finally {
                    }
                }
                if (z) {
                    h(dVarF, bArr);
                }
                if (dVarF != null) {
                    dVarF.close();
                }
            }
            randomAccessFile.close();
            Log.v("fb-UnpackingSoSource", "Finished regenerating DSO store " + getClass().getName());
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(File file, byte b2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b2);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.facebook.soloader.c, com.facebook.soloader.l
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int iE;
        synchronized (j(str)) {
            iE = e(str, i, this.a, threadPolicy);
        }
        return iE;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // com.facebook.soloader.l
    protected void b(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    protected byte[] i() {
        Parcel parcelObtain = Parcel.obtain();
        f fVarL = l();
        try {
            b[] bVarArr = fVarL.a().a;
            parcelObtain.writeByte((byte) 1);
            parcelObtain.writeInt(bVarArr.length);
            for (int i = 0; i < bVarArr.length; i++) {
                parcelObtain.writeString(bVarArr[i].f1466b);
                parcelObtain.writeString(bVarArr[i].f1467c);
            }
            if (fVarL != null) {
                fVarL.close();
            }
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (fVarL != null) {
                    try {
                        fVarL.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    protected abstract f l();

    protected synchronized void m(String str) {
        synchronized (j(str)) {
            this.f1462d = str;
            b(2);
        }
    }

    public void p(String[] strArr) {
    }
}
