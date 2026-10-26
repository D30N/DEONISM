package b.g.i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import b.g.d.c.f;
import b.g.e.i;
import b.g.i.c;
import b.g.k.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class b {
    static final b.d.e<String, Typeface> a = new b.d.e<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final b.g.i.c f858b = new b.g.i.c("fonts", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f859c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final b.d.g<String, ArrayList<c.d<g>>> f860d = new b.d.g<>();
    private static final Comparator<byte[]> e = new d();

    static class a implements Callable<g> {
        final /* synthetic */ Context a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.g.i.a f861b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f862c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f863d;

        a(Context context, b.g.i.a aVar, int i, String str) {
            this.a = context;
            this.f861b = aVar;
            this.f862c = i;
            this.f863d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g call() {
            g gVarF = b.f(this.a, this.f861b, this.f862c);
            Typeface typeface = gVarF.a;
            if (typeface != null) {
                b.a.d(this.f863d, typeface);
            }
            return gVarF;
        }
    }

    /* renamed from: b.g.i.b$b, reason: collision with other inner class name */
    static class C0025b implements c.d<g> {
        final /* synthetic */ f.a a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f864b;

        C0025b(f.a aVar, Handler handler) {
            this.a = aVar;
            this.f864b = handler;
        }

        @Override // b.g.i.c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar) {
            int i;
            f.a aVar;
            if (gVar == null) {
                aVar = this.a;
                i = 1;
            } else {
                i = gVar.f869b;
                if (i == 0) {
                    this.a.b(gVar.a, this.f864b);
                    return;
                }
                aVar = this.a;
            }
            aVar.a(i, this.f864b);
        }
    }

    static class c implements c.d<g> {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // b.g.i.c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar) {
            synchronized (b.f859c) {
                ArrayList<c.d<g>> arrayList = b.f860d.get(this.a);
                if (arrayList == null) {
                    return;
                }
                b.f860d.remove(this.a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(gVar);
                }
            }
        }
    }

    static class d implements Comparator<byte[]> {
        d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length == bArr2.length) {
                for (int i = 0; i < bArr.length; i++) {
                    if (bArr[i] != bArr2[i]) {
                        length = bArr[i];
                        length2 = bArr2[i];
                    }
                }
                return 0;
            }
            length = bArr.length;
            length2 = bArr2.length;
            return length - length2;
        }
    }

    public static class e {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final f[] f865b;

        public e(int i, f[] fVarArr) {
            this.a = i;
            this.f865b = fVarArr;
        }

        public f[] a() {
            return this.f865b;
        }

        public int b() {
            return this.a;
        }
    }

    public static class f {
        private final Uri a;

        /* renamed from: b, reason: collision with root package name */
        private final int f866b;

        /* renamed from: c, reason: collision with root package name */
        private final int f867c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f868d;
        private final int e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            h.c(uri);
            this.a = uri;
            this.f866b = i;
            this.f867c = i2;
            this.f868d = z;
            this.e = i3;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.f866b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.f867c;
        }

        public boolean e() {
            return this.f868d;
        }
    }

    private static final class g {
        final Typeface a;

        /* renamed from: b, reason: collision with root package name */
        final int f869b;

        g(Typeface typeface, int i) {
            this.a = typeface;
            this.f869b = i;
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static e c(Context context, CancellationSignal cancellationSignal, b.g.i.a aVar) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoH = h(context.getPackageManager(), aVar, context.getResources());
        return providerInfoH == null ? new e(1, null) : new e(0, e(context, aVar, providerInfoH.authority, cancellationSignal));
    }

    private static List<List<byte[]>> d(b.g.i.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : b.g.d.c.c.c(resources, aVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static b.g.i.b.f[] e(android.content.Context r23, b.g.i.a r24, java.lang.String r25, android.os.CancellationSignal r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.i.b.e(android.content.Context, b.g.i.a, java.lang.String, android.os.CancellationSignal):b.g.i.b$f[]");
    }

    static g f(Context context, b.g.i.a aVar, int i) {
        try {
            e eVarC = c(context, null, aVar);
            if (eVarC.b() != 0) {
                return new g(null, eVarC.b() == 1 ? -2 : -3);
            }
            Typeface typefaceB = b.g.e.c.b(context, null, eVarC.a(), i);
            return new g(typefaceB, typefaceB != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface g(Context context, b.g.i.a aVar, f.a aVar2, Handler handler, boolean z, int i, int i2) {
        String str = aVar.c() + "-" + i2;
        Typeface typefaceC = a.c(str);
        if (typefaceC != null) {
            if (aVar2 != null) {
                aVar2.d(typefaceC);
            }
            return typefaceC;
        }
        if (z && i == -1) {
            g gVarF = f(context, aVar, i2);
            if (aVar2 != null) {
                int i3 = gVarF.f869b;
                if (i3 == 0) {
                    aVar2.b(gVarF.a, handler);
                } else {
                    aVar2.a(i3, handler);
                }
            }
            return gVarF.a;
        }
        a aVar3 = new a(context, aVar, i2, str);
        if (z) {
            try {
                return ((g) f858b.e(aVar3, i)).a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0025b c0025b = aVar2 == null ? null : new C0025b(aVar2, handler);
        synchronized (f859c) {
            ArrayList<c.d<g>> arrayList = f860d.get(str);
            if (arrayList != null) {
                if (c0025b != null) {
                    arrayList.add(c0025b);
                }
                return null;
            }
            if (c0025b != null) {
                ArrayList<c.d<g>> arrayList2 = new ArrayList<>();
                arrayList2.add(c0025b);
                f860d.put(str, arrayList2);
            }
            f858b.d(aVar3, new c(str));
            return null;
        }
    }

    public static ProviderInfo h(PackageManager packageManager, b.g.i.a aVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strD = aVar.d();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strD, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strD);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strD + ", but package was not " + aVar.e());
        }
        List<byte[]> listA = a(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listA, e);
        List<List<byte[]>> listD = d(aVar, resources);
        for (int i = 0; i < listD.size(); i++) {
            ArrayList arrayList = new ArrayList(listD.get(i));
            Collections.sort(arrayList, e);
            if (b(listA, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    public static Map<Uri, ByteBuffer> i(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri uriC = fVar.c();
                if (!map.containsKey(uriC)) {
                    map.put(uriC, i.f(context, cancellationSignal, uriC));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
