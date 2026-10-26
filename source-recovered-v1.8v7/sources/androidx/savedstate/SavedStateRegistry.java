package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {
    private b.b.a.b.b<String, b> a = new b.b.a.b.b<>();

    /* renamed from: b, reason: collision with root package name */
    private Bundle f675b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f676c;

    /* renamed from: d, reason: collision with root package name */
    boolean f677d;

    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (!this.f676c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f675b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f675b.remove(str);
        if (this.f675b.isEmpty()) {
            this.f675b = null;
        }
        return bundle2;
    }

    void b(d dVar, Bundle bundle) {
        if (this.f676c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f675b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        dVar.a(new e() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.e
            public void d(g gVar, d.a aVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z;
                if (aVar == d.a.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z = true;
                } else {
                    if (aVar != d.a.ON_STOP) {
                        return;
                    }
                    savedStateRegistry = SavedStateRegistry.this;
                    z = false;
                }
                savedStateRegistry.f677d = z;
            }
        });
        this.f676c = true;
    }

    void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f675b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.b.a.b.b<String, b>.d dVarJ = this.a.j();
        while (dVarJ.hasNext()) {
            Map.Entry next = dVarJ.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
