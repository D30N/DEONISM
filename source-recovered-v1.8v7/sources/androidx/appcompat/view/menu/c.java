package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
abstract class c {
    final Context a;

    /* renamed from: b, reason: collision with root package name */
    private Map<b.g.f.a.b, MenuItem> f93b;

    /* renamed from: c, reason: collision with root package name */
    private Map<b.g.f.a.c, SubMenu> f94c;

    c(Context context) {
        this.a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b.g.f.a.b)) {
            return menuItem;
        }
        b.g.f.a.b bVar = (b.g.f.a.b) menuItem;
        if (this.f93b == null) {
            this.f93b = new b.d.a();
        }
        MenuItem menuItem2 = this.f93b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.a, bVar);
        this.f93b.put(bVar, jVar);
        return jVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof b.g.f.a.c)) {
            return subMenu;
        }
        b.g.f.a.c cVar = (b.g.f.a.c) subMenu;
        if (this.f94c == null) {
            this.f94c = new b.d.a();
        }
        SubMenu subMenu2 = this.f94c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, cVar);
        this.f94c.put(cVar, sVar);
        return sVar;
    }

    final void e() {
        Map<b.g.f.a.b, MenuItem> map = this.f93b;
        if (map != null) {
            map.clear();
        }
        Map<b.g.f.a.c, SubMenu> map2 = this.f94c;
        if (map2 != null) {
            map2.clear();
        }
    }

    final void f(int i) {
        Map<b.g.f.a.b, MenuItem> map = this.f93b;
        if (map == null) {
            return;
        }
        Iterator<b.g.f.a.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    final void g(int i) {
        Map<b.g.f.a.b, MenuItem> map = this.f93b;
        if (map == null) {
            return;
        }
        Iterator<b.g.f.a.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
