package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class d extends AutoCompleteTextView implements b.g.l.q {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f205d = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    private final e f206b;

    /* renamed from: c, reason: collision with root package name */
    private final y f207c;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.autoCompleteTextViewStyle);
    }

    public d(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        w0 w0VarU = w0.u(getContext(), attributeSet, f205d, i, 0);
        if (w0VarU.r(0)) {
            setDropDownBackgroundDrawable(w0VarU.g(0));
        }
        w0VarU.v();
        e eVar = new e(this);
        this.f206b = eVar;
        eVar.e(attributeSet, i);
        y yVar = new y(this);
        this.f207c = yVar;
        yVar.m(attributeSet, i);
        this.f207c.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f206b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f207c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // b.g.l.q
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f206b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // b.g.l.q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f206b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f206b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f206b;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(b.a.k.a.a.d(getContext(), i));
    }

    @Override // b.g.l.q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f206b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // b.g.l.q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f206b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f207c;
        if (yVar != null) {
            yVar.p(context, i);
        }
    }
}
