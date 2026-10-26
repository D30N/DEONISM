package d.b.a.a.e.e;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes.dex */
public interface dd extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(ed edVar);

    void getAppInstanceId(ed edVar);

    void getCachedAppInstanceId(ed edVar);

    void getConditionalUserProperties(String str, String str2, ed edVar);

    void getCurrentScreenClass(ed edVar);

    void getCurrentScreenName(ed edVar);

    void getGmpAppId(ed edVar);

    void getMaxUserProperties(String str, ed edVar);

    void getTestFlag(ed edVar, int i);

    void getUserProperties(String str, String str2, boolean z, ed edVar);

    void initForTests(Map map);

    void initialize(d.b.a.a.d.a aVar, e eVar, long j);

    void isDataCollectionEnabled(ed edVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, ed edVar, long j);

    void logHealthData(int i, String str, d.b.a.a.d.a aVar, d.b.a.a.d.a aVar2, d.b.a.a.d.a aVar3);

    void onActivityCreated(d.b.a.a.d.a aVar, Bundle bundle, long j);

    void onActivityDestroyed(d.b.a.a.d.a aVar, long j);

    void onActivityPaused(d.b.a.a.d.a aVar, long j);

    void onActivityResumed(d.b.a.a.d.a aVar, long j);

    void onActivitySaveInstanceState(d.b.a.a.d.a aVar, ed edVar, long j);

    void onActivityStarted(d.b.a.a.d.a aVar, long j);

    void onActivityStopped(d.b.a.a.d.a aVar, long j);

    void performAction(Bundle bundle, ed edVar, long j);

    void registerOnMeasurementEventListener(b bVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(d.b.a.a.d.a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(b bVar);

    void setInstanceIdProvider(c cVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, d.b.a.a.d.a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(b bVar);
}
