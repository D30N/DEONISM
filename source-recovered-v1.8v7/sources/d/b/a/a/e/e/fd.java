package d.b.a.a.e.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

/* loaded from: classes.dex */
public final class fd extends a implements dd {
    fd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // d.b.a.a.e.e.dd
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeLong(j);
        h(23, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        v.c(parcelE, bundle);
        h(9, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeLong(j);
        h(24, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void generateEventId(ed edVar) {
        Parcel parcelE = e();
        v.b(parcelE, edVar);
        h(22, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void getAppInstanceId(ed edVar) {
        Parcel parcelE = e();
        v.b(parcelE, edVar);
        h(20, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void getCachedAppInstanceId(ed edVar) {
        Parcel parcelE = e();
        v.b(parcelE, edVar);
        h(19, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void getConditionalUserProperties(String str, String str2, ed edVar) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        v.b(parcelE, edVar);
        h(10, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void getCurrentScreenClass(ed edVar) {
        Parcel parcelE = e();
        v.b(parcelE, edVar);
        h(17, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void getCurrentScreenName(ed edVar) {
        Parcel parcelE = e();
        v.b(parcelE, edVar);
        h(16, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void getGmpAppId(ed edVar) {
        Parcel parcelE = e();
        v.b(parcelE, edVar);
        h(21, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void getMaxUserProperties(String str, ed edVar) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        v.b(parcelE, edVar);
        h(6, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void getTestFlag(ed edVar, int i) {
        Parcel parcelE = e();
        v.b(parcelE, edVar);
        parcelE.writeInt(i);
        h(38, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void getUserProperties(String str, String str2, boolean z, ed edVar) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        v.d(parcelE, z);
        v.b(parcelE, edVar);
        h(5, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void initForTests(Map map) {
        Parcel parcelE = e();
        parcelE.writeMap(map);
        h(37, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void initialize(d.b.a.a.d.a aVar, e eVar, long j) {
        Parcel parcelE = e();
        v.b(parcelE, aVar);
        v.c(parcelE, eVar);
        parcelE.writeLong(j);
        h(1, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void isDataCollectionEnabled(ed edVar) {
        Parcel parcelE = e();
        v.b(parcelE, edVar);
        h(40, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        v.c(parcelE, bundle);
        v.d(parcelE, z);
        v.d(parcelE, z2);
        parcelE.writeLong(j);
        h(2, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void logEventAndBundle(String str, String str2, Bundle bundle, ed edVar, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        v.c(parcelE, bundle);
        v.b(parcelE, edVar);
        parcelE.writeLong(j);
        h(3, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void logHealthData(int i, String str, d.b.a.a.d.a aVar, d.b.a.a.d.a aVar2, d.b.a.a.d.a aVar3) {
        Parcel parcelE = e();
        parcelE.writeInt(i);
        parcelE.writeString(str);
        v.b(parcelE, aVar);
        v.b(parcelE, aVar2);
        v.b(parcelE, aVar3);
        h(33, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void onActivityCreated(d.b.a.a.d.a aVar, Bundle bundle, long j) {
        Parcel parcelE = e();
        v.b(parcelE, aVar);
        v.c(parcelE, bundle);
        parcelE.writeLong(j);
        h(27, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void onActivityDestroyed(d.b.a.a.d.a aVar, long j) {
        Parcel parcelE = e();
        v.b(parcelE, aVar);
        parcelE.writeLong(j);
        h(28, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void onActivityPaused(d.b.a.a.d.a aVar, long j) {
        Parcel parcelE = e();
        v.b(parcelE, aVar);
        parcelE.writeLong(j);
        h(29, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void onActivityResumed(d.b.a.a.d.a aVar, long j) {
        Parcel parcelE = e();
        v.b(parcelE, aVar);
        parcelE.writeLong(j);
        h(30, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void onActivitySaveInstanceState(d.b.a.a.d.a aVar, ed edVar, long j) {
        Parcel parcelE = e();
        v.b(parcelE, aVar);
        v.b(parcelE, edVar);
        parcelE.writeLong(j);
        h(31, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void onActivityStarted(d.b.a.a.d.a aVar, long j) {
        Parcel parcelE = e();
        v.b(parcelE, aVar);
        parcelE.writeLong(j);
        h(25, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void onActivityStopped(d.b.a.a.d.a aVar, long j) {
        Parcel parcelE = e();
        v.b(parcelE, aVar);
        parcelE.writeLong(j);
        h(26, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void performAction(Bundle bundle, ed edVar, long j) {
        Parcel parcelE = e();
        v.c(parcelE, bundle);
        v.b(parcelE, edVar);
        parcelE.writeLong(j);
        h(32, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void registerOnMeasurementEventListener(b bVar) {
        Parcel parcelE = e();
        v.b(parcelE, bVar);
        h(35, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void resetAnalyticsData(long j) {
        Parcel parcelE = e();
        parcelE.writeLong(j);
        h(12, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelE = e();
        v.c(parcelE, bundle);
        parcelE.writeLong(j);
        h(8, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setCurrentScreen(d.b.a.a.d.a aVar, String str, String str2, long j) {
        Parcel parcelE = e();
        v.b(parcelE, aVar);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        parcelE.writeLong(j);
        h(15, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelE = e();
        v.d(parcelE, z);
        h(39, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelE = e();
        v.c(parcelE, bundle);
        h(42, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setEventInterceptor(b bVar) {
        Parcel parcelE = e();
        v.b(parcelE, bVar);
        h(34, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setInstanceIdProvider(c cVar) {
        Parcel parcelE = e();
        v.b(parcelE, cVar);
        h(18, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelE = e();
        v.d(parcelE, z);
        parcelE.writeLong(j);
        h(11, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setMinimumSessionDuration(long j) {
        Parcel parcelE = e();
        parcelE.writeLong(j);
        h(13, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setSessionTimeoutDuration(long j) {
        Parcel parcelE = e();
        parcelE.writeLong(j);
        h(14, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setUserId(String str, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeLong(j);
        h(7, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void setUserProperty(String str, String str2, d.b.a.a.d.a aVar, boolean z, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        v.b(parcelE, aVar);
        v.d(parcelE, z);
        parcelE.writeLong(j);
        h(4, parcelE);
    }

    @Override // d.b.a.a.e.e.dd
    public final void unregisterOnMeasurementEventListener(b bVar) {
        Parcel parcelE = e();
        v.b(parcelE, bVar);
        h(36, parcelE);
    }
}
