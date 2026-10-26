package d.b.a.a.e.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d.b.a.a.d.a;

/* loaded from: classes.dex */
public abstract class cd extends u0 implements dd {
    public cd() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static dd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof dd ? (dd) iInterfaceQueryLocalInterface : new fd(iBinder);
    }

    @Override // d.b.a.a.e.e.u0
    protected final boolean e(int i, Parcel parcel, Parcel parcel2, int i2) {
        ed gdVar;
        ed gdVar2 = null;
        ed gdVar3 = null;
        ed gdVar4 = null;
        b dVar = null;
        b dVar2 = null;
        b dVar3 = null;
        ed gdVar5 = null;
        ed gdVar6 = null;
        ed gdVar7 = null;
        ed gdVar8 = null;
        ed gdVar9 = null;
        ed gdVar10 = null;
        c fVar = null;
        ed gdVar11 = null;
        ed gdVar12 = null;
        ed gdVar13 = null;
        ed gdVar14 = null;
        switch (i) {
            case 1:
                initialize(a.AbstractBinderC0096a.g(parcel.readStrongBinder()), (e) v.a(parcel, e.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) v.a(parcel, Bundle.CREATOR), v.e(parcel), v.e(parcel), parcel.readLong());
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) v.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    gdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar = iInterfaceQueryLocalInterface instanceof ed ? (ed) iInterfaceQueryLocalInterface : new gd(strongBinder);
                }
                logEventAndBundle(string, string2, bundle, gdVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), a.AbstractBinderC0096a.g(parcel.readStrongBinder()), v.e(parcel), parcel.readLong());
                break;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean zE = v.e(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar2 = iInterfaceQueryLocalInterface2 instanceof ed ? (ed) iInterfaceQueryLocalInterface2 : new gd(strongBinder2);
                }
                getUserProperties(string3, string4, zE, gdVar2);
                break;
            case 6:
                String string5 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar14 = iInterfaceQueryLocalInterface3 instanceof ed ? (ed) iInterfaceQueryLocalInterface3 : new gd(strongBinder3);
                }
                getMaxUserProperties(string5, gdVar14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) v.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) v.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar13 = iInterfaceQueryLocalInterface4 instanceof ed ? (ed) iInterfaceQueryLocalInterface4 : new gd(strongBinder4);
                }
                getConditionalUserProperties(string6, string7, gdVar13);
                break;
            case 11:
                setMeasurementEnabled(v.e(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(a.AbstractBinderC0096a.g(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar12 = iInterfaceQueryLocalInterface5 instanceof ed ? (ed) iInterfaceQueryLocalInterface5 : new gd(strongBinder5);
                }
                getCurrentScreenName(gdVar12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar11 = iInterfaceQueryLocalInterface6 instanceof ed ? (ed) iInterfaceQueryLocalInterface6 : new gd(strongBinder6);
                }
                getCurrentScreenClass(gdVar11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    fVar = iInterfaceQueryLocalInterface7 instanceof c ? (c) iInterfaceQueryLocalInterface7 : new f(strongBinder7);
                }
                setInstanceIdProvider(fVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar10 = iInterfaceQueryLocalInterface8 instanceof ed ? (ed) iInterfaceQueryLocalInterface8 : new gd(strongBinder8);
                }
                getCachedAppInstanceId(gdVar10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar9 = iInterfaceQueryLocalInterface9 instanceof ed ? (ed) iInterfaceQueryLocalInterface9 : new gd(strongBinder9);
                }
                getAppInstanceId(gdVar9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar8 = iInterfaceQueryLocalInterface10 instanceof ed ? (ed) iInterfaceQueryLocalInterface10 : new gd(strongBinder10);
                }
                getGmpAppId(gdVar8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar7 = iInterfaceQueryLocalInterface11 instanceof ed ? (ed) iInterfaceQueryLocalInterface11 : new gd(strongBinder11);
                }
                generateEventId(gdVar7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(a.AbstractBinderC0096a.g(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(a.AbstractBinderC0096a.g(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(a.AbstractBinderC0096a.g(parcel.readStrongBinder()), (Bundle) v.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(a.AbstractBinderC0096a.g(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(a.AbstractBinderC0096a.g(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(a.AbstractBinderC0096a.g(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                d.b.a.a.d.a aVarG = a.AbstractBinderC0096a.g(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar6 = iInterfaceQueryLocalInterface12 instanceof ed ? (ed) iInterfaceQueryLocalInterface12 : new gd(strongBinder12);
                }
                onActivitySaveInstanceState(aVarG, gdVar6, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) v.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar5 = iInterfaceQueryLocalInterface13 instanceof ed ? (ed) iInterfaceQueryLocalInterface13 : new gd(strongBinder13);
                }
                performAction(bundle2, gdVar5, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), a.AbstractBinderC0096a.g(parcel.readStrongBinder()), a.AbstractBinderC0096a.g(parcel.readStrongBinder()), a.AbstractBinderC0096a.g(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    dVar3 = iInterfaceQueryLocalInterface14 instanceof b ? (b) iInterfaceQueryLocalInterface14 : new d(strongBinder14);
                }
                setEventInterceptor(dVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    dVar2 = iInterfaceQueryLocalInterface15 instanceof b ? (b) iInterfaceQueryLocalInterface15 : new d(strongBinder15);
                }
                registerOnMeasurementEventListener(dVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    dVar = iInterfaceQueryLocalInterface16 instanceof b ? (b) iInterfaceQueryLocalInterface16 : new d(strongBinder16);
                }
                unregisterOnMeasurementEventListener(dVar);
                break;
            case 37:
                initForTests(v.f(parcel));
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar4 = iInterfaceQueryLocalInterface17 instanceof ed ? (ed) iInterfaceQueryLocalInterface17 : new gd(strongBinder17);
                }
                getTestFlag(gdVar4, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(v.e(parcel));
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gdVar3 = iInterfaceQueryLocalInterface18 instanceof ed ? (ed) iInterfaceQueryLocalInterface18 : new gd(strongBinder18);
                }
                isDataCollectionEnabled(gdVar3);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) v.a(parcel, Bundle.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
