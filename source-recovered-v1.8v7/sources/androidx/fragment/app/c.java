package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler Y;
    private Runnable Z = new a();
    int a0 = 0;
    int b0 = 0;
    boolean c0 = true;
    boolean d0 = true;
    int e0 = -1;
    Dialog f0;
    boolean g0;
    boolean h0;
    boolean i0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.f0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void T(Bundle bundle) {
        Bundle bundle2;
        super.T(bundle);
        if (this.d0) {
            View viewK = K();
            if (viewK != null) {
                if (viewK.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f0.setContentView(viewK);
            }
            d dVarI = i();
            if (dVarI != null) {
                this.f0.setOwnerActivity(dVarI);
            }
            this.f0.setCancelable(this.c0);
            this.f0.setOnCancelListener(this);
            this.f0.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void W(Context context) {
        super.W(context);
        if (this.i0) {
            return;
        }
        this.h0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void Z(Bundle bundle) {
        super.Z(bundle);
        this.Y = new Handler();
        this.d0 = this.x == 0;
        if (bundle != null) {
            this.a0 = bundle.getInt("android:style", 0);
            this.b0 = bundle.getInt("android:theme", 0);
            this.c0 = bundle.getBoolean("android:cancelable", true);
            this.d0 = bundle.getBoolean("android:showsDialog", this.d0);
            this.e0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void g0() {
        super.g0();
        Dialog dialog = this.f0;
        if (dialog != null) {
            this.g0 = true;
            dialog.setOnDismissListener(null);
            this.f0.dismiss();
            if (!this.h0) {
                onDismiss(this.f0);
            }
            this.f0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void h0() {
        super.h0();
        if (this.i0 || this.h0) {
            return;
        }
        this.h0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater i0(Bundle bundle) {
        Context contextI;
        if (!this.d0) {
            return super.i0(bundle);
        }
        Dialog dialogQ1 = q1(bundle);
        this.f0 = dialogQ1;
        if (dialogQ1 != null) {
            s1(dialogQ1, this.a0);
            contextI = this.f0.getContext();
        } else {
            contextI = this.t.i();
        }
        return (LayoutInflater) contextI.getSystemService("layout_inflater");
    }

    public void o1() {
        p1(false, false);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.g0) {
            return;
        }
        p1(true, true);
    }

    void p1(boolean z, boolean z2) {
        if (this.h0) {
            return;
        }
        this.h0 = true;
        this.i0 = false;
        Dialog dialog = this.f0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.Y.getLooper()) {
                    onDismiss(this.f0);
                } else {
                    this.Y.post(this.Z);
                }
            }
        }
        this.g0 = true;
        if (this.e0 >= 0) {
            Z0().e(this.e0, 1);
            this.e0 = -1;
            return;
        }
        n nVarA = Z0().a();
        nVarA.g(this);
        if (z) {
            nVarA.e();
        } else {
            nVarA.d();
        }
    }

    public Dialog q1(Bundle bundle) {
        throw null;
    }

    public void r1(boolean z) {
        this.d0 = z;
    }

    public void s1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void t1(i iVar, String str) {
        this.h0 = false;
        this.i0 = true;
        n nVarA = iVar.a();
        nVarA.b(this, str);
        nVarA.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void v0(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        super.v0(bundle);
        Dialog dialog = this.f0;
        if (dialog != null && (bundleOnSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.a0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.c0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.d0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.e0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void w0() {
        super.w0();
        Dialog dialog = this.f0;
        if (dialog != null) {
            this.g0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x0() {
        super.x0();
        Dialog dialog = this.f0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
