package com.example.samplestickerapp;

import android.text.TextUtils;
import android.util.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class l {
    static List<n> a(InputStream inputStream) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
        try {
            return c(jsonReader);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static n b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        List<m> listD = null;
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        String strNextString4 = null;
        String strNextString5 = null;
        String strNextString6 = null;
        String strNextString7 = null;
        String strNextString8 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.nextName()) {
                case "identifier":
                    strNextString = jsonReader.nextString();
                    break;
                case "name":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "publisher":
                    strNextString3 = jsonReader.nextString();
                    break;
                case "tray_image_file":
                    strNextString4 = jsonReader.nextString();
                    break;
                case "publisher_email":
                    strNextString5 = jsonReader.nextString();
                    break;
                case "publisher_website":
                    strNextString6 = jsonReader.nextString();
                    break;
                case "privacy_policy_website":
                    strNextString7 = jsonReader.nextString();
                    break;
                case "license_agreement_website":
                    strNextString8 = jsonReader.nextString();
                    break;
                case "stickers":
                    listD = d(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (TextUtils.isEmpty(strNextString)) {
            throw new IllegalStateException("identifier cannot be empty");
        }
        if (TextUtils.isEmpty(strNextString2)) {
            throw new IllegalStateException("name cannot be empty");
        }
        if (TextUtils.isEmpty(strNextString3)) {
            throw new IllegalStateException("publisher cannot be empty");
        }
        if (TextUtils.isEmpty(strNextString4)) {
            throw new IllegalStateException("tray_image_file cannot be empty");
        }
        if (listD == null || listD.size() == 0) {
            throw new IllegalStateException("sticker list is empty");
        }
        if (strNextString.contains("..") || strNextString.contains("/")) {
            throw new IllegalStateException("identifier should not contain .. or / to prevent directory traversal");
        }
        jsonReader.endObject();
        n nVar = new n(strNextString, strNextString2, strNextString3, strNextString4, strNextString5, strNextString6, strNextString7, strNextString8);
        nVar.g(listD);
        return nVar;
    }

    private static List<n> c(JsonReader jsonReader) throws IOException {
        ArrayList<n> arrayList = new ArrayList();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("android_play_store_link".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("ios_app_store_link".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else {
                if (!"sticker_packs".equals(strNextName)) {
                    throw new IllegalStateException("unknown field in json: " + strNextName);
                }
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(b(jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (arrayList.size() == 0) {
            throw new IllegalStateException("sticker pack list cannot be empty");
        }
        for (n nVar : arrayList) {
            nVar.d(strNextString);
            nVar.e(strNextString2);
        }
        return arrayList;
    }

    private static List<m> d(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            String strNextString = null;
            ArrayList arrayList2 = new ArrayList(2);
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if ("image_file".equals(strNextName)) {
                    strNextString = jsonReader.nextString();
                } else {
                    if (!"emojis".equals(strNextName)) {
                        throw new IllegalStateException("unknown field in json: " + strNextName);
                    }
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                }
            }
            jsonReader.endObject();
            if (TextUtils.isEmpty(strNextString)) {
                throw new IllegalStateException("sticker image_file cannot be empty");
            }
            if (!strNextString.endsWith(".webp")) {
                throw new IllegalStateException("image file for stickers should be webp files, image file is: " + strNextString);
            }
            if (strNextString.contains("..") || strNextString.contains("/")) {
                throw new IllegalStateException("the file name should not contain .. or / to prevent directory traversal, image file is:" + strNextString);
            }
            arrayList.add(new m(strNextString, arrayList2));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
