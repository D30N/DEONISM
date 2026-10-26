package d.b.a.a.c;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class l extends androidx.fragment.app.c {
    private Dialog j0 = null;
    private DialogInterface.OnCancelListener k0 = null;

    public static l u1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        l lVar = new l();
        com.google.android.gms.common.internal.q.l(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.j0 = dialog2;
        if (onCancelListener != null) {
            lVar.k0 = onCancelListener;
        }
        return lVar;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.k0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog q1(Bundle bundle) {
        if (this.j0 == null) {
            r1(false);
        }
        return this.j0;
    }

    @Override // androidx.fragment.app.c
    public void t1(androidx.fragment.app.i iVar, String str) {
        super.t1(iVar, str);
    }
}
