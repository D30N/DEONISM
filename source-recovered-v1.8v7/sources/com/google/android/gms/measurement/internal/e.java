package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import d.b.a.a.e.e.i0;
import d.b.a.a.e.e.j0;
import d.b.a.a.e.e.k0;
import d.b.a.a.e.e.m0;
import d.b.a.a.e.e.r4;
import d.b.a.a.e.e.ta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class e extends o9 {
    private static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    private static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d, reason: collision with root package name */
    private final f f1676d;
    private final k9 e;

    e(r9 r9Var) {
        super(r9Var);
        this.e = new k9(k());
        this.f1676d = new f(this, f(), "google_app_measurement.db");
    }

    private final Object F(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            m().G().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            m().G().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        m().G().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    private static void L(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    private final boolean U(String str, int i2, d.b.a.a.e.e.j0 j0Var) {
        s();
        c();
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(j0Var);
        if (TextUtils.isEmpty(j0Var.L())) {
            m().J().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", z3.x(str), Integer.valueOf(i2), String.valueOf(j0Var.J() ? Integer.valueOf(j0Var.K()) : null));
            return false;
        }
        byte[] bArrN = j0Var.n();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", j0Var.J() ? Integer.valueOf(j0Var.K()) : null);
        contentValues.put("event_name", j0Var.L());
        contentValues.put("session_scoped", j0Var.S() ? Boolean.valueOf(j0Var.T()) : null);
        contentValues.put("data", bArrN);
        try {
            if (w().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            m().G().b("Failed to insert event filter (got -1). appId", z3.x(str));
            return true;
        } catch (SQLiteException e) {
            m().G().c("Error storing event filter. appId", z3.x(str), e);
            return false;
        }
    }

    private final boolean V(String str, int i2, d.b.a.a.e.e.m0 m0Var) {
        s();
        c();
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(m0Var);
        if (TextUtils.isEmpty(m0Var.I())) {
            m().J().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", z3.x(str), Integer.valueOf(i2), String.valueOf(m0Var.G() ? Integer.valueOf(m0Var.H()) : null));
            return false;
        }
        byte[] bArrN = m0Var.n();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", m0Var.G() ? Integer.valueOf(m0Var.H()) : null);
        contentValues.put("property_name", m0Var.I());
        contentValues.put("session_scoped", m0Var.M() ? Boolean.valueOf(m0Var.N()) : null);
        contentValues.put("data", bArrN);
        try {
            if (w().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            m().G().b("Failed to insert property filter (got -1). appId", z3.x(str));
            return false;
        } catch (SQLiteException e) {
            m().G().c("Error storing property filter. appId", z3.x(str), e);
            return false;
        }
    }

    private final boolean h0() {
        return f().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long i0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = w().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e) {
                m().G().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean m0(String str, List<Integer> list) {
        com.google.android.gms.common.internal.q.g(str);
        s();
        c();
        SQLiteDatabase sQLiteDatabaseW = w();
        try {
            long jI0 = i0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(AdError.SERVER_ERROR_CODE, n().v(str, r.F)));
            if (jI0 <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String strJoin = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 140);
            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(string);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseW.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e) {
            m().G().c("Database error querying filters. appId", z3.x(str), e);
            return false;
        }
    }

    private final long z(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = w().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    return cursorRawQuery.getLong(0);
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e) {
                m().G().c("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0090: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0090 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<d.b.a.a.e.e.y0, java.lang.Long> A(java.lang.String r8, java.lang.Long r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.c()
            r7.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.w()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            if (r2 != 0) goto L37
            com.google.android.gms.measurement.internal.z3 r8 = r7.m()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.b4 r8 = r8.O()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            d.b.a.a.e.e.y0$a r4 = d.b.a.a.e.e.y0.d0()     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.v9.A(r4, r2)     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            d.b.a.a.e.e.y0$a r4 = (d.b.a.a.e.e.y0.a) r4     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            d.b.a.a.e.e.z5 r2 = r4.i()     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            d.b.a.a.e.e.r4 r2 = (d.b.a.a.e.e.r4) r2     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            d.b.a.a.e.e.y0 r2 = (d.b.a.a.e.e.y0) r2     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            return r8
        L5e:
            r2 = move-exception
            com.google.android.gms.measurement.internal.z3 r3 = r7.m()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.b4 r3 = r3.G()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.z3.x(r8)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            r3.d(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L8f
            if (r1 == 0) goto L75
            r1.close()
        L75:
            return r0
        L76:
            r8 = move-exception
            goto L7c
        L78:
            r8 = move-exception
            goto L91
        L7a:
            r8 = move-exception
            r1 = r0
        L7c:
            com.google.android.gms.measurement.internal.z3 r9 = r7.m()     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.b4 r9 = r9.G()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8e
            r1.close()
        L8e:
            return r0
        L8f:
            r8 = move-exception
            r0 = r1
        L91:
            if (r0 == 0) goto L96
            r0.close()
        L96:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.A(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final void A0() {
        s();
        w().endTransaction();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.d B(long r22, java.lang.String r24, long r25, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.B(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.d");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d5: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:47:0x00d5 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle B0(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.c()
            r7.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.w()     // Catch: java.lang.Throwable -> Lbd android.database.sqlite.SQLiteException -> Lbf
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lbd android.database.sqlite.SQLiteException -> Lbf
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lbd android.database.sqlite.SQLiteException -> Lbf
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lbd android.database.sqlite.SQLiteException -> Lbf
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.z3 r8 = r7.m()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.b4 r8 = r8.O()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            if (r1 == 0) goto L2f
            r1.close()
        L2f:
            return r0
        L30:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            d.b.a.a.e.e.y0$a r3 = d.b.a.a.e.e.y0.d0()     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.v9.A(r3, r2)     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            d.b.a.a.e.e.y0$a r3 = (d.b.a.a.e.e.y0.a) r3     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            d.b.a.a.e.e.z5 r2 = r3.i()     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            d.b.a.a.e.e.r4 r2 = (d.b.a.a.e.e.r4) r2     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            d.b.a.a.e.e.y0 r2 = (d.b.a.a.e.e.y0) r2     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            r7.o()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            java.util.List r8 = r2.F()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
        L55:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            d.b.a.a.e.e.a1 r3 = (d.b.a.a.e.e.a1) r3     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            java.lang.String r4 = r3.P()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            boolean r5 = r3.c0()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            if (r5 == 0) goto L73
            double r5 = r3.d0()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            goto L55
        L73:
            boolean r5 = r3.a0()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            if (r5 == 0) goto L81
            float r3 = r3.b0()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            goto L55
        L81:
            boolean r5 = r3.U()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            if (r5 == 0) goto L8f
            java.lang.String r3 = r3.V()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            goto L55
        L8f:
            boolean r5 = r3.Y()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            if (r5 == 0) goto L55
            long r5 = r3.Z()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            goto L55
        L9d:
            if (r1 == 0) goto La2
            r1.close()
        La2:
            return r2
        La3:
            r2 = move-exception
            com.google.android.gms.measurement.internal.z3 r3 = r7.m()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.b4 r3 = r3.G()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.z3.x(r8)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld4
            if (r1 == 0) goto Lba
            r1.close()
        Lba:
            return r0
        Lbb:
            r8 = move-exception
            goto Lc1
        Lbd:
            r8 = move-exception
            goto Ld6
        Lbf:
            r8 = move-exception
            r1 = r0
        Lc1:
            com.google.android.gms.measurement.internal.z3 r2 = r7.m()     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.b4 r2 = r2.G()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Ld4
            if (r1 == 0) goto Ld3
            r1.close()
        Ld3:
            return r0
        Ld4:
            r8 = move-exception
            r0 = r1
        Ld6:
            if (r0 == 0) goto Ldb
            r0.close()
        Ldb:
            goto Ldd
        Ldc:
            throw r8
        Ldd:
            goto Ldc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.B0(java.lang.String):android.os.Bundle");
    }

    public final d C(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return B(j2, str, 1L, false, false, z3, false, z5);
    }

    public final boolean C0() {
        return i0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.l D(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.D(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.l");
    }

    final void D0() {
        int iDelete;
        c();
        s();
        if (h0()) {
            long jA = l().h.a();
            long jB = k().b();
            if (Math.abs(jB - jA) > r.y.a(null).longValue()) {
                l().h.b(jB);
                c();
                s();
                if (!h0() || (iDelete = w().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(k().a()), String.valueOf(qa.N())})) <= 0) {
                    return;
                }
                m().O().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    public final long E0() {
        return z("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long F0() {
        return z("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String G(long r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r4.c()
            r4.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.w()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.z3 r6 = r4.m()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.b4 r6 = r6.O()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L3d
            r5.close()
        L3d:
            return r6
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r6 = move-exception
            goto L59
        L42:
            r6 = move-exception
            r5 = r0
        L44:
            com.google.android.gms.measurement.internal.z3 r1 = r4.m()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.b4 r1 = r1.G()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L56
            r5.close()
        L56:
            return r0
        L57:
            r6 = move-exception
            r0 = r5
        L59:
            if (r0 == 0) goto L5e
            r0.close()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.G(long):java.lang.String");
    }

    public final boolean G0() {
        return i0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.aa> H(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.H(java.lang.String):java.util.List");
    }

    public final boolean H0() {
        return i0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd A[EDGE_INSN: B:58:0x00cd->B:38:0x00cd BREAK  A[LOOP:0: B:18:0x005c->B:61:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.util.Pair<d.b.a.a.e.e.c1, java.lang.Long>> I(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.I(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        m().G().b("Read more than the max allowed user properties, ignoring excess", java.lang.Integer.valueOf(com.facebook.ads.AdError.NETWORK_ERROR_CODE));
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:22:0x00b7, B:24:0x00c1, B:29:0x00f1, B:26:0x00dc, B:28:0x00eb, B:52:0x0124, B:54:0x013b, B:56:0x0147), top: B:76:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.aa> J(java.lang.String r21, java.lang.String r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.J(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        m().G().b("Read more than the max allowed conditional properties, ignoring extra", java.lang.Integer.valueOf(com.facebook.ads.AdError.NETWORK_ERROR_CODE));
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.oa> K(java.lang.String r40, java.lang.String[] r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.K(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void M(l lVar) {
        com.google.android.gms.common.internal.q.k(lVar);
        c();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lVar.a);
        contentValues.put("name", lVar.f1766b);
        contentValues.put("lifetime_count", Long.valueOf(lVar.f1767c));
        contentValues.put("current_bundle_count", Long.valueOf(lVar.f1768d));
        contentValues.put("last_fire_timestamp", Long.valueOf(lVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(lVar.g));
        contentValues.put("last_bundled_day", lVar.h);
        contentValues.put("last_sampled_complex_event_id", lVar.i);
        contentValues.put("last_sampling_rate", lVar.j);
        contentValues.put("current_session_count", Long.valueOf(lVar.e));
        Boolean bool = lVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (w().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                m().G().b("Failed to insert/update event aggregates (got -1). appId", z3.x(lVar.a));
            }
        } catch (SQLiteException e) {
            m().G().c("Error storing event aggregates. appId", z3.x(lVar.a), e);
        }
    }

    public final void N(f4 f4Var) {
        com.google.android.gms.common.internal.q.k(f4Var);
        c();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f4Var.t());
        contentValues.put("app_instance_id", f4Var.x());
        contentValues.put("gmp_app_id", f4Var.A());
        contentValues.put("resettable_device_id_hash", f4Var.J());
        contentValues.put("last_bundle_index", Long.valueOf(f4Var.f0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(f4Var.P()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(f4Var.R()));
        contentValues.put("app_version", f4Var.T());
        contentValues.put("app_store", f4Var.X());
        contentValues.put("gmp_version", Long.valueOf(f4Var.Z()));
        contentValues.put("dev_cert_hash", Long.valueOf(f4Var.b0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(f4Var.e0()));
        contentValues.put("day", Long.valueOf(f4Var.j0()));
        contentValues.put("daily_public_events_count", Long.valueOf(f4Var.k0()));
        contentValues.put("daily_events_count", Long.valueOf(f4Var.l0()));
        contentValues.put("daily_conversions_count", Long.valueOf(f4Var.m0()));
        contentValues.put("config_fetched_time", Long.valueOf(f4Var.g0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(f4Var.h0()));
        contentValues.put("app_version_int", Long.valueOf(f4Var.V()));
        contentValues.put("firebase_instance_id", f4Var.M());
        contentValues.put("daily_error_events_count", Long.valueOf(f4Var.h()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(f4Var.g()));
        contentValues.put("health_monitor_sample", f4Var.i());
        contentValues.put("android_id", Long.valueOf(f4Var.k()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(f4Var.l()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(f4Var.m()));
        contentValues.put("admob_app_id", f4Var.D());
        contentValues.put("dynamite_version", Long.valueOf(f4Var.d0()));
        if (f4Var.o() != null) {
            if (f4Var.o().size() == 0) {
                m().J().b("Safelisted events should not be an empty list. appId", f4Var.t());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", f4Var.o()));
            }
        }
        if (ta.b() && n().C(f4Var.t(), r.o0)) {
            contentValues.put("ga_app_id", f4Var.G());
        }
        try {
            SQLiteDatabase sQLiteDatabaseW = w();
            if (sQLiteDatabaseW.update("apps", contentValues, "app_id = ?", new String[]{f4Var.t()}) == 0 && sQLiteDatabaseW.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                m().G().b("Failed to insert/update app (got -1). appId", z3.x(f4Var.t()));
            }
        } catch (SQLiteException e) {
            m().G().c("Error storing app. appId", z3.x(f4Var.t()), e);
        }
    }

    final void O(String str, List<d.b.a.a.e.e.i0> list) {
        boolean z;
        b4 b4VarJ;
        String str2;
        Object objX;
        Integer numValueOf;
        boolean z2;
        com.google.android.gms.common.internal.q.k(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            i0.a aVarA = list.get(i2).A();
            if (aVarA.A() != 0) {
                for (int i3 = 0; i3 < aVarA.A(); i3++) {
                    j0.a aVarA2 = aVarA.B(i3).A();
                    j0.a aVar = (j0.a) ((r4.a) aVarA2.clone());
                    String strA = c6.a(aVarA2.z());
                    if (strA != null) {
                        aVar.x(strA);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i4 = 0; i4 < aVarA2.A(); i4++) {
                        d.b.a.a.e.e.k0 k0VarY = aVarA2.y(i4);
                        String strA2 = f6.a(k0VarY.N());
                        if (strA2 != null) {
                            k0.a aVarA3 = k0VarY.A();
                            aVarA3.w(strA2);
                            aVar.w(i4, (d.b.a.a.e.e.k0) ((d.b.a.a.e.e.r4) aVarA3.i()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        aVarA.x(i3, aVar);
                        list.set(i2, (d.b.a.a.e.e.i0) ((d.b.a.a.e.e.r4) aVarA.i()));
                    }
                }
            }
            if (aVarA.w() != 0) {
                for (int i5 = 0; i5 < aVarA.w(); i5++) {
                    d.b.a.a.e.e.m0 m0VarZ = aVarA.z(i5);
                    String strA3 = e6.a(m0VarZ.I());
                    if (strA3 != null) {
                        m0.a aVarA4 = m0VarZ.A();
                        aVarA4.w(strA3);
                        aVarA.y(i5, aVarA4);
                        list.set(i2, (d.b.a.a.e.e.i0) ((d.b.a.a.e.e.r4) aVarA.i()));
                    }
                }
            }
        }
        s();
        c();
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(list);
        SQLiteDatabase sQLiteDatabaseW = w();
        sQLiteDatabaseW.beginTransaction();
        try {
            s();
            c();
            com.google.android.gms.common.internal.q.g(str);
            SQLiteDatabase sQLiteDatabaseW2 = w();
            sQLiteDatabaseW2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseW2.delete("event_filters", "app_id=?", new String[]{str});
            for (d.b.a.a.e.e.i0 i0Var : list) {
                s();
                c();
                com.google.android.gms.common.internal.q.g(str);
                com.google.android.gms.common.internal.q.k(i0Var);
                if (i0Var.J()) {
                    int iK = i0Var.K();
                    Iterator<d.b.a.a.e.e.j0> it = i0Var.O().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().J()) {
                                b4VarJ = m().J();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                objX = z3.x(str);
                                numValueOf = Integer.valueOf(iK);
                                break;
                            }
                        } else {
                            Iterator<d.b.a.a.e.e.m0> it2 = i0Var.M().iterator();
                            while (it2.hasNext()) {
                                if (!it2.next().G()) {
                                    b4VarJ = m().J();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    objX = z3.x(str);
                                    numValueOf = Integer.valueOf(iK);
                                }
                            }
                            Iterator<d.b.a.a.e.e.j0> it3 = i0Var.O().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!U(str, iK, it3.next())) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                Iterator<d.b.a.a.e.e.m0> it4 = i0Var.M().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (!V(str, iK, it4.next())) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                s();
                                c();
                                com.google.android.gms.common.internal.q.g(str);
                                SQLiteDatabase sQLiteDatabaseW3 = w();
                                sQLiteDatabaseW3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iK)});
                                sQLiteDatabaseW3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iK)});
                            }
                        }
                    }
                    b4VarJ.c(str2, objX, numValueOf);
                    break;
                }
                m().J().b("Audience with no ID. appId", z3.x(str));
            }
            ArrayList arrayList = new ArrayList();
            for (d.b.a.a.e.e.i0 i0Var2 : list) {
                arrayList.add(i0Var2.J() ? Integer.valueOf(i0Var2.K()) : null);
            }
            m0(str, arrayList);
            sQLiteDatabaseW.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseW.endTransaction();
        }
    }

    final void P(List<Long> list) throws SQLException {
        c();
        s();
        com.google.android.gms.common.internal.q.k(list);
        com.google.android.gms.common.internal.q.m(list.size());
        if (h0()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (i0(sb2.toString(), null) > 0) {
                m().J().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseW = w();
                StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseW.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                m().G().b("Error incrementing retry count. error", e);
            }
        }
    }

    public final boolean Q(d.b.a.a.e.e.c1 c1Var, boolean z) {
        b4 b4VarG;
        Object objX;
        String str;
        ContentValues contentValues;
        c();
        s();
        com.google.android.gms.common.internal.q.k(c1Var);
        com.google.android.gms.common.internal.q.g(c1Var.I2());
        com.google.android.gms.common.internal.q.n(c1Var.j2());
        D0();
        long jA = k().a();
        if (c1Var.k2() < jA - qa.N() || c1Var.k2() > qa.N() + jA) {
            m().J().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", z3.x(c1Var.I2()), Long.valueOf(jA), Long.valueOf(c1Var.k2()));
        }
        try {
            byte[] bArrX = o().X(c1Var.n());
            m().O().b("Saving bundle, size", Integer.valueOf(bArrX.length));
            contentValues = new ContentValues();
            contentValues.put("app_id", c1Var.I2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c1Var.k2()));
            contentValues.put("data", bArrX);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c1Var.x0()) {
                contentValues.put("retry_count", Integer.valueOf(c1Var.I0()));
            }
        } catch (IOException e) {
            e = e;
            b4VarG = m().G();
            objX = z3.x(c1Var.I2());
            str = "Data loss. Failed to serialize bundle. appId";
        }
        try {
            if (w().insert("queue", null, contentValues) != -1) {
                return true;
            }
            m().G().b("Failed to insert bundle (got -1). appId", z3.x(c1Var.I2()));
            return false;
        } catch (SQLiteException e2) {
            e = e2;
            b4VarG = m().G();
            objX = z3.x(c1Var.I2());
            str = "Error storing bundle. appId";
            b4VarG.c(str, objX, e);
            return false;
        }
    }

    public final boolean R(m mVar, long j2, boolean z) {
        c();
        s();
        com.google.android.gms.common.internal.q.k(mVar);
        com.google.android.gms.common.internal.q.g(mVar.a);
        byte[] bArrN = o().y(mVar).n();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", mVar.a);
        contentValues.put("name", mVar.f1784b);
        contentValues.put("timestamp", Long.valueOf(mVar.f1786d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", bArrN);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (w().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            m().G().b("Failed to insert raw event (got -1). appId", z3.x(mVar.a));
            return false;
        } catch (SQLiteException e) {
            m().G().c("Error storing raw event. appId", z3.x(mVar.a), e);
            return false;
        }
    }

    public final boolean S(aa aaVar) {
        com.google.android.gms.common.internal.q.k(aaVar);
        c();
        s();
        if (o0(aaVar.a, aaVar.f1625c) == null) {
            if (z9.d0(aaVar.f1625c)) {
                if (i0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{aaVar.a}) >= n().y(aaVar.a)) {
                    return false;
                }
            } else if (!"_npa".equals(aaVar.f1625c) && i0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{aaVar.a, aaVar.f1624b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", aaVar.a);
        contentValues.put("origin", aaVar.f1624b);
        contentValues.put("name", aaVar.f1625c);
        contentValues.put("set_timestamp", Long.valueOf(aaVar.f1626d));
        L(contentValues, "value", aaVar.e);
        try {
            if (w().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                m().G().b("Failed to insert/update user property (got -1). appId", z3.x(aaVar.a));
            }
        } catch (SQLiteException e) {
            m().G().c("Error storing user property. appId", z3.x(aaVar.a), e);
        }
        return true;
    }

    public final boolean T(oa oaVar) {
        com.google.android.gms.common.internal.q.k(oaVar);
        c();
        s();
        if (o0(oaVar.f1829b, oaVar.f1831d.f1965c) == null && i0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{oaVar.f1829b}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oaVar.f1829b);
        contentValues.put("origin", oaVar.f1830c);
        contentValues.put("name", oaVar.f1831d.f1965c);
        L(contentValues, "value", oaVar.f1831d.h());
        contentValues.put("active", Boolean.valueOf(oaVar.f));
        contentValues.put("trigger_event_name", oaVar.g);
        contentValues.put("trigger_timeout", Long.valueOf(oaVar.i));
        g();
        contentValues.put("timed_out_event", z9.n0(oaVar.h));
        contentValues.put("creation_timestamp", Long.valueOf(oaVar.e));
        g();
        contentValues.put("triggered_event", z9.n0(oaVar.j));
        contentValues.put("triggered_timestamp", Long.valueOf(oaVar.f1831d.f1966d));
        contentValues.put("time_to_live", Long.valueOf(oaVar.k));
        g();
        contentValues.put("expired_event", z9.n0(oaVar.l));
        try {
            if (w().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                m().G().b("Failed to insert/update conditional user property (got -1)", z3.x(oaVar.f1829b));
            }
        } catch (SQLiteException e) {
            m().G().c("Error storing conditional user property", z3.x(oaVar.f1829b), e);
        }
        return true;
    }

    final boolean W(String str, Bundle bundle) {
        c();
        s();
        byte[] bArrN = o().y(new m(this.a, "", str, "dep", 0L, 0L, bundle)).n();
        m().O().c("Saving default event parameters, appId, data size", e().w(str), Integer.valueOf(bArrN.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrN);
        try {
            if (w().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            m().G().b("Failed to insert default event parameters (got -1). appId", z3.x(str));
            return false;
        } catch (SQLiteException e) {
            m().G().c("Error storing default event parameters. appId", z3.x(str), e);
            return false;
        }
    }

    public final boolean X(String str, Long l2, long j2, d.b.a.a.e.e.y0 y0Var) {
        c();
        s();
        com.google.android.gms.common.internal.q.k(y0Var);
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(l2);
        byte[] bArrN = y0Var.n();
        m().O().c("Saving complex main event, appId, data size", e().w(str), Integer.valueOf(bArrN.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrN);
        try {
            if (w().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            m().G().b("Failed to insert complex main event (got -1). appId", z3.x(str));
            return false;
        } catch (SQLiteException e) {
            m().G().c("Error storing complex main event. appId", z3.x(str), e);
            return false;
        }
    }

    public final long Y() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = w().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return -1L;
                }
                long j2 = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e) {
                m().G().b("Error querying raw events", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.f4 j0(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.j0(java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    public final List<oa> k0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.q.g(str);
        c();
        s();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return K(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void l0(String str, String str2) {
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        c();
        s();
        try {
            w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            m().G().d("Error deleting user property. appId", z3.x(str), e().A(str2), e);
        }
    }

    public final long n0(String str) {
        com.google.android.gms.common.internal.q.g(str);
        c();
        s();
        try {
            return w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, n().v(str, r.p))))});
        } catch (SQLiteException e) {
            m().G().c("Error deleting over the limit events. appId", z3.x(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.aa o0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.q.g(r19)
            com.google.android.gms.common.internal.q.g(r20)
            r18.c()
            r18.s()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.w()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r14[r1] = r19     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r14[r2] = r8     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7f
            if (r0 != 0) goto L44
            if (r10 == 0) goto L43
            r10.close()
        L43:
            return r9
        L44:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7f
            r11 = r18
            java.lang.Object r7 = r11.F(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r3 = r10.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.aa r0 = new com.google.android.gms.measurement.internal.aa     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            if (r1 == 0) goto L73
            com.google.android.gms.measurement.internal.z3 r1 = r18.m()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.b4 r1 = r1.G()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.z3.x(r19)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1.b(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
        L73:
            if (r10 == 0) goto L78
            r10.close()
        L78:
            return r0
        L79:
            r0 = move-exception
            goto L8b
        L7b:
            r0 = move-exception
            r11 = r18
            goto Lab
        L7f:
            r0 = move-exception
            r11 = r18
            goto L8b
        L83:
            r0 = move-exception
            r11 = r18
            goto Lac
        L87:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L8b:
            com.google.android.gms.measurement.internal.z3 r1 = r18.m()     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.b4 r1 = r1.G()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.z3.x(r19)     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.x3 r4 = r18.e()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = r4.A(r8)     // Catch: java.lang.Throwable -> Laa
            r1.d(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Laa
            if (r10 == 0) goto La9
            r10.close()
        La9:
            return r9
        Laa:
            r0 = move-exception
        Lab:
            r9 = r10
        Lac:
            if (r9 == 0) goto Lb1
            r9.close()
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.o0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.aa");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.oa p0(java.lang.String r33, java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.p0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.oa");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] q0(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            com.google.android.gms.common.internal.q.g(r12)
            r11.c()
            r11.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.w()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            r6[r9] = r12     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            if (r2 != 0) goto L37
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            if (r3 == 0) goto L52
            com.google.android.gms.measurement.internal.z3 r3 = r11.m()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.b4 r3 = r3.G()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.z3.x(r12)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            r3.b(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
        L52:
            if (r1 == 0) goto L57
            r1.close()
        L57:
            return r2
        L58:
            r2 = move-exception
            goto L5e
        L5a:
            r12 = move-exception
            goto L77
        L5c:
            r2 = move-exception
            r1 = r0
        L5e:
            com.google.android.gms.measurement.internal.z3 r3 = r11.m()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.b4 r3 = r3.G()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.z3.x(r12)     // Catch: java.lang.Throwable -> L75
            r3.c(r4, r12, r2)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L74
            r1.close()
        L74:
            return r0
        L75:
            r12 = move-exception
            r0 = r1
        L77:
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.q0(java.lang.String):byte[]");
    }

    public final int r0(String str, String str2) {
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        c();
        s();
        try {
            return w().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            m().G().d("Error deleting conditional property", z3.x(str), e().A(str2), e);
            return 0;
        }
    }

    final Map<Integer, List<d.b.a.a.e.e.j0>> s0(String str) {
        com.google.android.gms.common.internal.q.g(str);
        b.d.a aVar = new b.d.a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = w().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<d.b.a.a.e.e.j0>> mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap;
                }
                do {
                    byte[] blob = cursorQuery.getBlob(1);
                    try {
                        j0.a aVarU = d.b.a.a.e.e.j0.U();
                        v9.A(aVarU, blob);
                        d.b.a.a.e.e.j0 j0Var = (d.b.a.a.e.e.j0) ((d.b.a.a.e.e.r4) aVarU.i());
                        if (j0Var.O()) {
                            int i2 = cursorQuery.getInt(0);
                            List arrayList = (List) aVar.get(Integer.valueOf(i2));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                aVar.put(Integer.valueOf(i2), arrayList);
                            }
                            arrayList.add(j0Var);
                        }
                    } catch (IOException e) {
                        m().G().c("Failed to merge filter. appId", z3.x(str), e);
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return aVar;
            } catch (SQLiteException e2) {
                m().G().c("Database error querying filters. appId", z3.x(str), e2);
                Map<Integer, List<d.b.a.a.e.e.j0>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> t0(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.s()
            r7.c()
            com.google.android.gms.common.internal.q.g(r8)
            b.d.a r0 = new b.d.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.w()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r6 = 1
            r4[r6] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            if (r3 != 0) goto L32
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r8
        L32:
            int r3 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            if (r4 != 0) goto L4e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
        L4e:
            int r3 = r1.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            if (r3 != 0) goto L32
            if (r1 == 0) goto L64
            r1.close()
        L64:
            return r0
        L65:
            r0 = move-exception
            goto L6b
        L67:
            r8 = move-exception
            goto La0
        L69:
            r0 = move-exception
            r1 = r2
        L6b:
            com.google.android.gms.measurement.internal.z3 r3 = r7.m()     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.measurement.internal.b4 r3 = r3.G()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.z3.x(r8)     // Catch: java.lang.Throwable -> L9e
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> L9e
            boolean r0 = d.b.a.a.e.e.aa.b()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L98
            com.google.android.gms.measurement.internal.qa r0 = r7.n()     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.r.T0     // Catch: java.lang.Throwable -> L9e
            boolean r8 = r0.C(r8, r3)     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L98
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L97
            r1.close()
        L97:
            return r8
        L98:
            if (r1 == 0) goto L9d
            r1.close()
        L9d:
            return r2
        L9e:
            r8 = move-exception
            r2 = r1
        La0:
            if (r2 == 0) goto La5
            r2.close()
        La5:
            goto La7
        La6:
            throw r8
        La7:
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.t0(java.lang.String):java.util.Map");
    }

    @Override // com.google.android.gms.measurement.internal.o9
    protected final boolean u() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, java.util.List<d.b.a.a.e.e.j0>> u0(java.lang.String r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r12.s()
            r12.c()
            com.google.android.gms.common.internal.q.g(r13)
            com.google.android.gms.common.internal.q.g(r14)
            b.d.a r0 = new b.d.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.w()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r6[r10] = r13     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r6[r11] = r14     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            if (r1 != 0) goto L48
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            if (r14 == 0) goto L47
            r14.close()
        L47:
            return r13
        L48:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            d.b.a.a.e.e.j0$a r2 = d.b.a.a.e.e.j0.U()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.v9.A(r2, r1)     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            d.b.a.a.e.e.j0$a r2 = (d.b.a.a.e.e.j0.a) r2     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            d.b.a.a.e.e.z5 r1 = r2.i()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            d.b.a.a.e.e.r4 r1 = (d.b.a.a.e.e.r4) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            d.b.a.a.e.e.j0 r1 = (d.b.a.a.e.e.j0) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            if (r3 != 0) goto L79
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
        L79:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            goto L8f
        L7d:
            r1 = move-exception
            com.google.android.gms.measurement.internal.z3 r2 = r12.m()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.b4 r2 = r2.G()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.z3.x(r13)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            r2.c(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
        L8f:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            if (r1 != 0) goto L48
            if (r14 == 0) goto L9a
            r14.close()
        L9a:
            return r0
        L9b:
            r0 = move-exception
            goto La1
        L9d:
            r13 = move-exception
            goto Ld6
        L9f:
            r0 = move-exception
            r14 = r9
        La1:
            com.google.android.gms.measurement.internal.z3 r1 = r12.m()     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.b4 r1 = r1.G()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.z3.x(r13)     // Catch: java.lang.Throwable -> Ld4
            r1.c(r2, r3, r0)     // Catch: java.lang.Throwable -> Ld4
            boolean r0 = d.b.a.a.e.e.aa.b()     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto Lce
            com.google.android.gms.measurement.internal.qa r0 = r12.n()     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.r.T0     // Catch: java.lang.Throwable -> Ld4
            boolean r13 = r0.C(r13, r1)     // Catch: java.lang.Throwable -> Ld4
            if (r13 == 0) goto Lce
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Ld4
            if (r14 == 0) goto Lcd
            r14.close()
        Lcd:
            return r13
        Lce:
            if (r14 == 0) goto Ld3
            r14.close()
        Ld3:
            return r9
        Ld4:
            r13 = move-exception
            r9 = r14
        Ld6:
            if (r9 == 0) goto Ldb
            r9.close()
        Ldb:
            goto Ldd
        Ldc:
            throw r13
        Ldd:
            goto Ldc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.u0(java.lang.String, java.lang.String):java.util.Map");
    }

    public final void v() {
        s();
        w().setTransactionSuccessful();
    }

    public final void v0() {
        s();
        w().beginTransaction();
    }

    final SQLiteDatabase w() {
        c();
        try {
            return this.f1676d.getWritableDatabase();
        } catch (SQLiteException e) {
            m().J().b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, d.b.a.a.e.e.e1> w0(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r11.s()
            r11.c()
            com.google.android.gms.common.internal.q.g(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.w()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L9c android.database.sqlite.SQLiteException -> L9e
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch: java.lang.Throwable -> L9c android.database.sqlite.SQLiteException -> L9e
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch: java.lang.Throwable -> L9c android.database.sqlite.SQLiteException -> L9e
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L9c android.database.sqlite.SQLiteException -> L9e
            r4[r9] = r12     // Catch: java.lang.Throwable -> L9c android.database.sqlite.SQLiteException -> L9e
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9c android.database.sqlite.SQLiteException -> L9e
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            if (r1 != 0) goto L52
            boolean r1 = d.b.a.a.e.e.aa.b()     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            if (r1 == 0) goto L4c
            com.google.android.gms.measurement.internal.qa r1 = r11.n()     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.r.T0     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            boolean r1 = r1.C(r12, r2)     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            if (r1 == 0) goto L4c
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            if (r0 == 0) goto L4b
            r0.close()
        L4b:
            return r12
        L4c:
            if (r0 == 0) goto L51
            r0.close()
        L51:
            return r8
        L52:
            b.d.a r1 = new b.d.a     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
        L57:
            int r2 = r0.getInt(r9)     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            byte[] r3 = r0.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            d.b.a.a.e.e.e1$a r4 = d.b.a.a.e.e.e1.c0()     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            com.google.android.gms.measurement.internal.v9.A(r4, r3)     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            d.b.a.a.e.e.e1$a r4 = (d.b.a.a.e.e.e1.a) r4     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            d.b.a.a.e.e.z5 r3 = r4.i()     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            d.b.a.a.e.e.r4 r3 = (d.b.a.a.e.e.r4) r3     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            d.b.a.a.e.e.e1 r3 = (d.b.a.a.e.e.e1) r3     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            goto L8e
        L78:
            r3 = move-exception
            com.google.android.gms.measurement.internal.z3 r4 = r11.m()     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            com.google.android.gms.measurement.internal.b4 r4 = r4.G()     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.z3.x(r12)     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            r4.d(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
        L8e:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L9a java.lang.Throwable -> Ld3
            if (r2 != 0) goto L57
            if (r0 == 0) goto L99
            r0.close()
        L99:
            return r1
        L9a:
            r1 = move-exception
            goto La0
        L9c:
            r12 = move-exception
            goto Ld5
        L9e:
            r1 = move-exception
            r0 = r8
        La0:
            com.google.android.gms.measurement.internal.z3 r2 = r11.m()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.measurement.internal.b4 r2 = r2.G()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.z3.x(r12)     // Catch: java.lang.Throwable -> Ld3
            r2.c(r3, r4, r1)     // Catch: java.lang.Throwable -> Ld3
            boolean r1 = d.b.a.a.e.e.aa.b()     // Catch: java.lang.Throwable -> Ld3
            if (r1 == 0) goto Lcd
            com.google.android.gms.measurement.internal.qa r1 = r11.n()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.r.T0     // Catch: java.lang.Throwable -> Ld3
            boolean r12 = r1.C(r12, r2)     // Catch: java.lang.Throwable -> Ld3
            if (r12 == 0) goto Lcd
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Ld3
            if (r0 == 0) goto Lcc
            r0.close()
        Lcc:
            return r12
        Lcd:
            if (r0 == 0) goto Ld2
            r0.close()
        Ld2:
            return r8
        Ld3:
            r12 = move-exception
            r8 = r0
        Ld5:
            if (r8 == 0) goto Lda
            r8.close()
        Lda:
            goto Ldc
        Ldb:
            throw r12
        Ldc:
            goto Ldb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.w0(java.lang.String):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String x() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.w()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3f
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.z3 r3 = r6.m()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.b4 r3 = r3.G()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.x():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, java.util.List<d.b.a.a.e.e.m0>> x0(java.lang.String r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r12.s()
            r12.c()
            com.google.android.gms.common.internal.q.g(r13)
            com.google.android.gms.common.internal.q.g(r14)
            b.d.a r0 = new b.d.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.w()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r6[r10] = r13     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r6[r11] = r14     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9d android.database.sqlite.SQLiteException -> L9f
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            if (r1 != 0) goto L48
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            if (r14 == 0) goto L47
            r14.close()
        L47:
            return r13
        L48:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            d.b.a.a.e.e.m0$a r2 = d.b.a.a.e.e.m0.O()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.v9.A(r2, r1)     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            d.b.a.a.e.e.m0$a r2 = (d.b.a.a.e.e.m0.a) r2     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            d.b.a.a.e.e.z5 r1 = r2.i()     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            d.b.a.a.e.e.r4 r1 = (d.b.a.a.e.e.r4) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            d.b.a.a.e.e.m0 r1 = (d.b.a.a.e.e.m0) r1     // Catch: java.io.IOException -> L7d android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            if (r3 != 0) goto L79
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
        L79:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            goto L8f
        L7d:
            r1 = move-exception
            com.google.android.gms.measurement.internal.z3 r2 = r12.m()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.b4 r2 = r2.G()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.z3.x(r13)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            r2.c(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
        L8f:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L9b java.lang.Throwable -> Ld4
            if (r1 != 0) goto L48
            if (r14 == 0) goto L9a
            r14.close()
        L9a:
            return r0
        L9b:
            r0 = move-exception
            goto La1
        L9d:
            r13 = move-exception
            goto Ld6
        L9f:
            r0 = move-exception
            r14 = r9
        La1:
            com.google.android.gms.measurement.internal.z3 r1 = r12.m()     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.b4 r1 = r1.G()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.z3.x(r13)     // Catch: java.lang.Throwable -> Ld4
            r1.c(r2, r3, r0)     // Catch: java.lang.Throwable -> Ld4
            boolean r0 = d.b.a.a.e.e.aa.b()     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto Lce
            com.google.android.gms.measurement.internal.qa r0 = r12.n()     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.r.T0     // Catch: java.lang.Throwable -> Ld4
            boolean r13 = r0.C(r13, r1)     // Catch: java.lang.Throwable -> Ld4
            if (r13 == 0) goto Lce
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Ld4
            if (r14 == 0) goto Lcd
            r14.close()
        Lcd:
            return r13
        Lce:
            if (r14 == 0) goto Ld3
            r14.close()
        Ld3:
            return r9
        Ld4:
            r13 = move-exception
            r9 = r14
        Ld6:
            if (r9 == 0) goto Ldb
            r9.close()
        Ldb:
            goto Ldd
        Ldc:
            throw r13
        Ldd:
            goto Ldc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.x0(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long y(d.b.a.a.e.e.c1 c1Var) {
        c();
        s();
        com.google.android.gms.common.internal.q.k(c1Var);
        com.google.android.gms.common.internal.q.g(c1Var.I2());
        byte[] bArrN = c1Var.n();
        long jW = o().w(bArrN);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1Var.I2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jW));
        contentValues.put("metadata", bArrN);
        try {
            w().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jW;
        } catch (SQLiteException e) {
            m().G().c("Error storing raw event metadata. appId", z3.x(c1Var.I2()), e);
            throw e;
        }
    }

    public final long y0(String str) {
        com.google.android.gms.common.internal.q.g(str);
        return z("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    protected final long z0(String str, String str2) throws Throwable {
        long jZ;
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        c();
        s();
        SQLiteDatabase sQLiteDatabaseW = w();
        sQLiteDatabaseW.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    jZ = z(sb.toString(), new String[]{str}, -1L);
                    if (jZ == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (sQLiteDatabaseW.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            m().G().c("Failed to insert column (got -1). appId", z3.x(str), str2);
                            sQLiteDatabaseW.endTransaction();
                            return -1L;
                        }
                        jZ = 0;
                    }
                } catch (SQLiteException e) {
                    e = e;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + jZ));
                    if (sQLiteDatabaseW.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        m().G().c("Failed to update column (got 0). appId", z3.x(str), str2);
                        sQLiteDatabaseW.endTransaction();
                        return -1L;
                    }
                    sQLiteDatabaseW.setTransactionSuccessful();
                    sQLiteDatabaseW.endTransaction();
                    return jZ;
                } catch (SQLiteException e2) {
                    e = e2;
                    j2 = jZ;
                    m().G().d("Error inserting column. appId", z3.x(str), str2, e);
                    sQLiteDatabaseW.endTransaction();
                    return j2;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabaseW.endTransaction();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
