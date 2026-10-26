package d.b.a.a.e.e;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l1 implements p1 {
    private static final Map<Uri, l1> g = new b.d.a();
    private static final String[] h = {"key", "value"};
    private final ContentResolver a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f2751b;
    private volatile Map<String, String> e;

    /* renamed from: c, reason: collision with root package name */
    private final ContentObserver f2752c = new n1(this, null);

    /* renamed from: d, reason: collision with root package name */
    private final Object f2753d = new Object();
    private final List<q1> f = new ArrayList();

    private l1(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.f2751b = uri;
        contentResolver.registerContentObserver(uri, false, this.f2752c);
    }

    public static l1 a(ContentResolver contentResolver, Uri uri) {
        l1 l1Var;
        synchronized (l1.class) {
            l1Var = g.get(uri);
            if (l1Var == null) {
                try {
                    l1 l1Var2 = new l1(contentResolver, uri);
                    try {
                        g.put(uri, l1Var2);
                    } catch (SecurityException unused) {
                    }
                    l1Var = l1Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return l1Var;
    }

    static synchronized void d() {
        for (l1 l1Var : g.values()) {
            l1Var.a.unregisterContentObserver(l1Var.f2752c);
        }
        g.clear();
    }

    private final Map<String, String> f() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) s1.a(new r1(this) { // from class: d.b.a.a.e.e.o1
                    private final l1 a;

                    {
                        this.a = this;
                    }

                    @Override // d.b.a.a.e.e.r1
                    public final Object a() {
                        return this.a.e();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public final Map<String, String> b() {
        Map<String, String> mapF = this.e;
        if (mapF == null) {
            synchronized (this.f2753d) {
                mapF = this.e;
                if (mapF == null) {
                    mapF = f();
                    this.e = mapF;
                }
            }
        }
        return mapF != null ? mapF : Collections.emptyMap();
    }

    public final void c() {
        synchronized (this.f2753d) {
            this.e = null;
            z1.g();
        }
        synchronized (this) {
            Iterator<q1> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    final /* synthetic */ Map e() {
        Cursor cursorQuery = this.a.query(this.f2751b, h, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new b.d.a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return aVar;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // d.b.a.a.e.e.p1
    public final /* synthetic */ Object g(String str) {
        return b().get(str);
    }
}
