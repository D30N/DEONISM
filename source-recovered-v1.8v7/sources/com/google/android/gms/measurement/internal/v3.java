package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class v3 extends f5 {

    /* renamed from: c, reason: collision with root package name */
    private final y3 f1922c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1923d;

    v3(d5 d5Var) {
        super(d5Var);
        this.f1922c = new y3(this, f(), "google_app_measurement_local.db");
    }

    private static long C(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getLong(0);
            }
            if (cursorQuery == null) {
                return -1L;
            }
            cursorQuery.close();
            return -1L;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa A[PHI: r6 r9
      0x00fa: PHI (r6v3 int) = (r6v1 int), (r6v4 int) binds: [B:73:0x0115, B:66:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r9v7 android.database.sqlite.SQLiteDatabase) = (r9v6 android.database.sqlite.SQLiteDatabase), (r9v8 android.database.sqlite.SQLiteDatabase) binds: [B:73:0x0115, B:66:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean E(int r17, byte[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v3.E(int, byte[]):boolean");
    }

    private final SQLiteDatabase L() {
        if (this.f1923d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f1922c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f1923d = true;
        return null;
    }

    private final boolean M() {
        return f().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean B() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01de A[PHI: r8 r15
      0x01de: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:130:0x01dc, B:122:0x01cc, B:137:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r15v8 android.database.sqlite.SQLiteDatabase) = 
      (r15v4 android.database.sqlite.SQLiteDatabase)
      (r15v7 android.database.sqlite.SQLiteDatabase)
      (r15v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:130:0x01dc, B:122:0x01cc, B:137:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.google.android.gms.common.internal.v.a>] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.v.a> D(int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v3.D(int):java.util.List");
    }

    public final boolean F(p pVar) {
        Parcel parcelObtain = Parcel.obtain();
        pVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return E(0, bArrMarshall);
        }
        m().H().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean G(y9 y9Var) {
        Parcel parcelObtain = Parcel.obtain();
        y9Var.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return E(1, bArrMarshall);
        }
        m().H().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean H(oa oaVar) {
        g();
        byte[] bArrN0 = z9.n0(oaVar);
        if (bArrN0.length <= 131072) {
            return E(2, bArrN0);
        }
        m().H().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final void I() {
        a();
        c();
        try {
            int iDelete = L().delete("messages", null, null) + 0;
            if (iDelete > 0) {
                m().O().b("Reset local analytics data. records", Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            m().G().b("Error resetting local analytics data. error", e);
        }
    }

    public final boolean J() {
        return E(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[PHI: r4
      0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:37:0x0081, B:33:0x006d, B:30:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r11.c()
            r11.a()
            boolean r1 = r11.f1923d
            r2 = 0
            if (r1 == 0) goto Le
            return r2
        Le:
            boolean r1 = r11.M()
            if (r1 != 0) goto L15
            return r2
        L15:
            r1 = 5
            r3 = 0
            r4 = 5
        L18:
            if (r3 >= r1) goto L8d
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r11.L()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            if (r5 != 0) goto L2a
            r11.f1923d = r6     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            if (r5 == 0) goto L29
            r5.close()
        L29:
            return r2
        L2a:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            r9[r2] = r10     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            r5.endTransaction()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            if (r5 == 0) goto L48
            r5.close()
        L48:
            return r6
        L49:
            r0 = move-exception
            goto L87
        L4b:
            r7 = move-exception
            if (r5 == 0) goto L57
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L57
            r5.endTransaction()     // Catch: java.lang.Throwable -> L49
        L57:
            com.google.android.gms.measurement.internal.z3 r8 = r11.m()     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.measurement.internal.b4 r8 = r8.G()     // Catch: java.lang.Throwable -> L49
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L49
            r11.f1923d = r6     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L84
            goto L6f
        L67:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L49
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L49
            int r4 = r4 + 20
            if (r5 == 0) goto L84
        L6f:
            r5.close()
            goto L84
        L73:
            r7 = move-exception
            com.google.android.gms.measurement.internal.z3 r8 = r11.m()     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.measurement.internal.b4 r8 = r8.G()     // Catch: java.lang.Throwable -> L49
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L49
            r11.f1923d = r6     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L84
            goto L6f
        L84:
            int r3 = r3 + 1
            goto L18
        L87:
            if (r5 == 0) goto L8c
            r5.close()
        L8c:
            throw r0
        L8d:
            com.google.android.gms.measurement.internal.z3 r0 = r11.m()
            com.google.android.gms.measurement.internal.b4 r0 = r0.J()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v3.K():boolean");
    }
}
