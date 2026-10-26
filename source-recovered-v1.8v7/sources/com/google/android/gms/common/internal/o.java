package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    private static final i f1565b = new i("LibraryVersion", "");

    /* renamed from: c, reason: collision with root package name */
    private static o f1566c = new o();
    private ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();

    protected o() {
    }

    public static o a() {
        return f1566c;
    }

    public String b(String str) throws IOException {
        q.h(str, "Please provide a valid libraryName");
        if (this.a.containsKey(str)) {
            return this.a.get(str);
        }
        Properties properties = new Properties();
        String property = null;
        try {
            InputStream resourceAsStream = o.class.getResourceAsStream(String.format("/%s.properties", str));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                property = properties.getProperty("version", null);
                i iVar = f1565b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(property);
                iVar.e("LibraryVersion", sb.toString());
            } else {
                i iVar2 = f1565b;
                String strValueOf = String.valueOf(str);
                iVar2.c("LibraryVersion", strValueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(strValueOf) : new String("Failed to get app version for libraryName: "));
            }
        } catch (IOException e) {
            i iVar3 = f1565b;
            String strValueOf2 = String.valueOf(str);
            iVar3.d("LibraryVersion", strValueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(strValueOf2) : new String("Failed to get app version for libraryName: "), e);
        }
        if (property == null) {
            f1565b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            property = "UNKNOWN";
        }
        this.a.put(str, property);
        return property;
    }
}
