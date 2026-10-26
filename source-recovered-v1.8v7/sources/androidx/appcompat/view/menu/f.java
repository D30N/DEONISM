package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    g f110b;

    /* renamed from: c, reason: collision with root package name */
    private int f111c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f112d;
    private final boolean e;
    private final LayoutInflater f;
    private final int g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.e = z;
        this.f = layoutInflater;
        this.f110b = gVar;
        this.g = i;
        a();
    }

    void a() {
        i iVarV = this.f110b.v();
        if (iVarV != null) {
            ArrayList<i> arrayListZ = this.f110b.z();
            int size = arrayListZ.size();
            for (int i = 0; i < size; i++) {
                if (arrayListZ.get(i) == iVarV) {
                    this.f111c = i;
                    return;
                }
            }
        }
        this.f111c = -1;
    }

    public g b() {
        return this.f110b;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i) {
        ArrayList<i> arrayListZ = this.e ? this.f110b.z() : this.f110b.E();
        int i2 = this.f111c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListZ.get(i);
    }

    public void d(boolean z) {
        this.f112d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> arrayListZ = this.e ? this.f110b.z() : this.f110b.E();
        int i = this.f111c;
        int size = arrayListZ.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(this.g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f110b.F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f112d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
