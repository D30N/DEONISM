package b.h.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b.h.a.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b, reason: collision with root package name */
    protected boolean f946b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f947c;

    /* renamed from: d, reason: collision with root package name */
    protected Cursor f948d;
    protected Context e;
    protected int f;
    protected C0034a g;
    protected DataSetObserver h;
    protected b.h.a.b i;

    /* renamed from: b.h.a.a$a, reason: collision with other inner class name */
    private class C0034a extends ContentObserver {
        C0034a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f946b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f946b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public abstract CharSequence a(Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursorJ = j(cursor);
        if (cursorJ != null) {
            cursorJ.close();
        }
    }

    @Override // b.h.a.b.a
    public Cursor c() {
        return this.f948d;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i) {
        b bVar;
        if ((i & 1) == 1) {
            i |= 2;
            this.f947c = true;
        } else {
            this.f947c = false;
        }
        boolean z = cursor != null;
        this.f948d = cursor;
        this.f946b = z;
        this.e = context;
        this.f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.g = new C0034a();
            bVar = new b();
        } else {
            bVar = null;
            this.g = null;
        }
        this.h = bVar;
        if (z) {
            C0034a c0034a = this.g;
            if (c0034a != null) {
                cursor.registerContentObserver(c0034a);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f946b || (cursor = this.f948d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f946b) {
            return null;
        }
        this.f948d.moveToPosition(i);
        if (view == null) {
            view = g(this.e, this.f948d, viewGroup);
        }
        e(view, this.e, this.f948d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new b.h.a.b(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f946b || (cursor = this.f948d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f948d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f946b && (cursor = this.f948d) != null && cursor.moveToPosition(i)) {
            return this.f948d.getLong(this.f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f946b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f948d.moveToPosition(i)) {
            if (view == null) {
                view = h(this.e, this.f948d, viewGroup);
            }
            e(view, this.e, this.f948d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f947c || (cursor = this.f948d) == null || cursor.isClosed()) {
            return;
        }
        this.f946b = this.f948d.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f948d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0034a c0034a = this.g;
            if (c0034a != null) {
                cursor2.unregisterContentObserver(c0034a);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f948d = cursor;
        if (cursor != null) {
            C0034a c0034a2 = this.g;
            if (c0034a2 != null) {
                cursor.registerContentObserver(c0034a2);
            }
            DataSetObserver dataSetObserver2 = this.h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f = cursor.getColumnIndexOrThrow("_id");
            this.f946b = true;
            notifyDataSetChanged();
        } else {
            this.f = -1;
            this.f946b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
