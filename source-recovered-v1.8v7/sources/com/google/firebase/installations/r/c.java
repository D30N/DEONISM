package com.google.firebase.installations.r;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.j;
import com.google.firebase.installations.r.d;
import com.google.firebase.installations.r.e;
import d.b.b.g.c;
import d.b.b.j.h;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f2315d = Pattern.compile("[0-9]+s");
    private static final Charset e = Charset.forName("UTF-8");
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final h f2316b;

    /* renamed from: c, reason: collision with root package name */
    private final d.b.b.g.c f2317c;

    public c(Context context, h hVar, d.b.b.g.c cVar) {
        this.a = context;
        this.f2316b = hVar;
        this.f2317c = cVar;
    }

    private static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fid", str);
        jSONObject.put("appId", str2);
        jSONObject.put("authVersion", "FIS_v2");
        jSONObject.put("sdkVersion", "a:16.2.1");
        return jSONObject;
    }

    private static JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdkVersion", "a:16.2.1");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("installation", jSONObject);
        return jSONObject2;
    }

    private String e() {
        try {
            byte[] bArrA = com.google.android.gms.common.util.a.a(this.a, this.a.getPackageName());
            if (bArrA != null) {
                return j.b(bArrA, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentValues", "No such package: " + this.a.getPackageName(), e2);
            return null;
        }
    }

    private HttpURLConnection f(URL url, String str) {
        c.a aVarA;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        httpURLConnection.addRequestProperty("Accept", "application/json");
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
        d.b.b.g.c cVar = this.f2317c;
        if (cVar != null && this.f2316b != null && (aVarA = cVar.a("fire-installations-id")) != c.a.NONE) {
            httpURLConnection.addRequestProperty("x-firebase-client", this.f2316b.a());
            httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(aVarA.f()));
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", e());
        httpURLConnection.addRequestProperty("x-goog-api-key", str);
        return httpURLConnection;
    }

    static long g(String str) {
        q.b(f2315d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d h(HttpURLConnection httpURLConnection) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(httpURLConnection.getInputStream(), e));
        e.a aVarA = e.a();
        d.a aVarA2 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarA2.f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarA2.c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarA2.d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarA.c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarA.d(g(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarA2.b(aVarA.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        aVarA2.e(d.b.OK);
        return aVarA2.a();
    }

    private e i(HttpURLConnection httpURLConnection) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(httpURLConnection.getInputStream(), e));
        e.a aVarA = e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarA.d(g(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        aVarA.b(e.b.OK);
        return aVarA.a();
    }

    private void j(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send CreateInstallation request to FIS. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            try {
                gZIPOutputStream.write(a(str, str2).toString().getBytes("UTF-8"));
            } catch (JSONException e2) {
                throw new IllegalStateException(e2);
            }
        } finally {
            gZIPOutputStream.close();
        }
    }

    private void k(HttpURLConnection httpURLConnection) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send GenerateAuthToken request to FIS. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            try {
                gZIPOutputStream.write(b().toString().getBytes("UTF-8"));
            } catch (JSONException e2) {
                throw new IllegalStateException(e2);
            }
        } finally {
            gZIPOutputStream.close();
        }
    }

    public d c(String str, String str2, String str3, String str4, String str5) throws IOException {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations", str3)));
        while (i <= 1) {
            HttpURLConnection httpURLConnectionF = f(url, str);
            try {
                httpURLConnectionF.setRequestMethod("POST");
                httpURLConnectionF.setDoOutput(true);
                if (str5 != null) {
                    httpURLConnectionF.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                j(httpURLConnectionF, str2, str4);
                int responseCode = httpURLConnectionF.getResponseCode();
                if (responseCode == 200) {
                    return h(httpURLConnectionF);
                }
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    d.a aVarA = d.a();
                    aVarA.e(d.b.BAD_CONFIG);
                    return aVarA.a();
                }
                i++;
            } finally {
                httpURLConnectionF.disconnect();
            }
        }
        throw new IOException();
    }

    public e d(String str, String str2, String str3, String str4) throws IOException {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations/%s/authTokens:generate", str3, str2)));
        while (i <= 1) {
            HttpURLConnection httpURLConnectionF = f(url, str);
            try {
                httpURLConnectionF.setRequestMethod("POST");
                httpURLConnectionF.addRequestProperty("Authorization", "FIS_v2 " + str4);
                k(httpURLConnectionF);
                int responseCode = httpURLConnectionF.getResponseCode();
                if (responseCode == 200) {
                    return i(httpURLConnectionF);
                }
                if (responseCode == 401 || responseCode == 404) {
                    e.a aVarA = e.a();
                    aVarA.b(e.b.AUTH_ERROR);
                    return aVarA.a();
                }
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    e.a aVarA2 = e.a();
                    aVarA2.b(e.b.BAD_CONFIG);
                    return aVarA2.a();
                }
                i++;
            } finally {
                httpURLConnectionF.disconnect();
            }
        }
        throw new IOException();
    }
}
