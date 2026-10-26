package b.a.n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f702b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f703c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f704d;
    private Resources e;

    public d() {
        super(null);
    }

    public d(Context context, int i) {
        super(context);
        this.a = i;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f702b = theme;
    }

    private Resources a() {
        Resources resources;
        if (this.e == null) {
            Configuration configuration = this.f704d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.e = resources;
        }
        return this.e;
    }

    private void c() {
        boolean z = this.f702b == null;
        if (z) {
            this.f702b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f702b.setTo(theme);
            }
        }
        d(this.f702b, this.a, z);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.a;
    }

    protected void d(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f703c == null) {
            this.f703c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f703c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f702b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = b.a.i.Theme_AppCompat_Light;
        }
        c();
        return this.f702b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            c();
        }
    }
}
