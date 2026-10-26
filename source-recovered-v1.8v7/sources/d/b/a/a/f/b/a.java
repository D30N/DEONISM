package d.b.a.a.f.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;

/* loaded from: classes.dex */
public class a extends com.google.android.gms.common.internal.g<g> implements d.b.a.a.f.f {
    private final Bundle A;
    private Integer B;
    private final boolean y;
    private final com.google.android.gms.common.internal.c z;

    private a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.c cVar, Bundle bundle, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        super(context, looper, 44, cVar, fVar, gVar);
        this.y = true;
        this.z = cVar;
        this.A = bundle;
        this.B = cVar.d();
    }

    public a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.c cVar, d.b.a.a.f.a aVar, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        this(context, looper, true, cVar, k0(cVar), fVar, gVar);
    }

    public static Bundle k0(com.google.android.gms.common.internal.c cVar) {
        d.b.a.a.f.a aVarH = cVar.h();
        Integer numD = cVar.d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.a());
        if (numD != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numD.intValue());
        }
        if (aVarH != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", aVarH.i());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", aVarH.h());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", aVarH.f());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", aVarH.g());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", aVarH.c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", aVarH.j());
            if (aVarH.b() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", aVarH.b().longValue());
            }
            if (aVarH.e() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", aVarH.e().longValue());
            }
        }
        return bundle;
    }

    @Override // d.b.a.a.f.f
    public final void b(e eVar) {
        q.l(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.z.b();
            ((g) B()).I(new i(new r(accountB, this.B.intValue(), "<<default account>>".equals(accountB.name) ? com.google.android.gms.auth.api.signin.a.a.a(x()).b() : null)), eVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.y(new k(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b
    protected String g() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new h(iBinder);
    }

    @Override // d.b.a.a.f.f
    public final void l() {
        j(new b.d());
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public boolean m() {
        return this.y;
    }

    @Override // com.google.android.gms.common.internal.b
    protected String n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.g, com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public int q() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected Bundle y() {
        if (!x().getPackageName().equals(this.z.f())) {
            this.A.putString("com.google.android.gms.signin.internal.realClientPackageName", this.z.f());
        }
        return this.A;
    }
}
