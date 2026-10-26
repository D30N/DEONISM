package com.google.firebase.installations.q;

import com.google.firebase.installations.q.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private final File a;

    /* renamed from: b, reason: collision with root package name */
    private final d.b.b.c f2301b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(d.b.b.c cVar) {
        this.a = new File(cVar.g().getFilesDir(), "PersistedInstallation." + cVar.k() + ".json");
        this.f2301b = cVar;
    }

    private JSONObject b() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.a);
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        return new JSONObject(byteArrayOutputStream.toString());
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public d a(d dVar) throws JSONException, IOException {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f2301b.g().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(this.a)) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public d c() throws IOException {
        JSONObject jSONObjectB = b();
        String strOptString = jSONObjectB.optString("Fid", null);
        int iOptInt = jSONObjectB.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectB.optString("AuthToken", null);
        String strOptString3 = jSONObjectB.optString("RefreshToken", null);
        long jOptLong = jSONObjectB.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectB.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObjectB.optString("FisError", null);
        d.a aVarA = d.a();
        aVarA.d(strOptString);
        aVarA.g(a.values()[iOptInt]);
        aVarA.b(strOptString2);
        aVarA.f(strOptString3);
        aVarA.h(jOptLong);
        aVarA.c(jOptLong2);
        aVarA.e(strOptString4);
        return aVarA.a();
    }
}
