package b.a.n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import b.a.n.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends ActionMode {
    final Context a;

    /* renamed from: b, reason: collision with root package name */
    final b f706b;

    public static class a implements b.a {
        final ActionMode.Callback a;

        /* renamed from: b, reason: collision with root package name */
        final Context f707b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f708c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final b.d.g<Menu, Menu> f709d = new b.d.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f707b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f709d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f707b, (b.g.f.a.a) menu);
            this.f709d.put(menu, oVar);
            return oVar;
        }

        @Override // b.a.n.b.a
        public boolean a(b bVar, Menu menu) {
            return this.a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // b.a.n.b.a
        public boolean b(b bVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(bVar), new j(this.f707b, (b.g.f.a.b) menuItem));
        }

        @Override // b.a.n.b.a
        public boolean c(b bVar, Menu menu) {
            return this.a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // b.a.n.b.a
        public void d(b bVar) {
            this.a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f708c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f708c.get(i);
                if (fVar != null && fVar.f706b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f707b, bVar);
            this.f708c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.a = context;
        this.f706b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f706b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f706b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.a, (b.g.f.a.a) this.f706b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f706b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f706b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f706b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f706b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f706b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f706b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f706b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f706b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f706b.n(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f706b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f706b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f706b.q(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f706b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f706b.s(z);
    }
}
