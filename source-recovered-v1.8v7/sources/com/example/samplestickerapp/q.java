package com.example.samplestickerapp;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class q {
    private static ArrayList<n> a(Cursor cursor) {
        ArrayList<n> arrayList = new ArrayList<>();
        cursor.moveToFirst();
        do {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("sticker_pack_identifier"));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("sticker_pack_name"));
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow("sticker_pack_publisher"));
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow("sticker_pack_icon"));
            String string5 = cursor.getString(cursor.getColumnIndexOrThrow("android_play_store_link"));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow("ios_app_download_link"));
            n nVar = new n(string, string2, string3, string4, cursor.getString(cursor.getColumnIndexOrThrow("sticker_pack_publisher_email")), cursor.getString(cursor.getColumnIndexOrThrow("sticker_pack_publisher_website")), cursor.getString(cursor.getColumnIndexOrThrow("sticker_pack_privacy_policy_website")), cursor.getString(cursor.getColumnIndexOrThrow("sticker_pack_license_agreement_website")));
            nVar.d(string5);
            nVar.e(string6);
            arrayList.add(nVar);
        } while (cursor.moveToNext());
        return arrayList;
    }

    private static List<m> b(String str, ContentResolver contentResolver) {
        Cursor cursorQuery = contentResolver.query(f(str), new String[]{"sticker_file_name", "sticker_emoji"}, null, null, null);
        ArrayList arrayList = new ArrayList();
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.moveToFirst();
            do {
                arrayList.add(new m(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("sticker_file_name")), Arrays.asList(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("sticker_emoji")).split(","))));
            } while (cursorQuery.moveToNext());
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public static byte[] c(String str, String str2, ContentResolver contentResolver) throws IOException {
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(e(str, str2));
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new IOException("cannot read sticker asset:" + str + "/" + str2);
                }
                byte[] bArr = new byte[16384];
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr, 0, 16384);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    public static ArrayList<n> d(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(StickerContentProvider.f1072c, null, null, null, null);
        if (cursorQuery == null) {
            throw new IllegalStateException("could not fetch from content provider, com.r3dliz4rd.deonism.stickercontentprovider");
        }
        HashSet hashSet = new HashSet();
        ArrayList<n> arrayListA = a(cursorQuery);
        Iterator<n> it = arrayListA.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (hashSet.contains(next.f1090b)) {
                throw new IllegalStateException("sticker pack identifiers should be unique, there are more than one pack with identifier:" + next.f1090b);
            }
            hashSet.add(next.f1090b);
        }
        if (arrayListA.isEmpty()) {
            throw new IllegalStateException("There should be at least one sticker pack in the app");
        }
        Iterator<n> it2 = arrayListA.iterator();
        while (it2.hasNext()) {
            n next2 = it2.next();
            next2.g(g(context, next2));
            r.f(context, next2);
        }
        return arrayListA;
    }

    public static Uri e(String str, String str2) {
        return new Uri.Builder().scheme("content").authority("com.r3dliz4rd.deonism.stickercontentprovider").appendPath("stickers_asset").appendPath(str).appendPath(str2).build();
    }

    private static Uri f(String str) {
        return new Uri.Builder().scheme("content").authority("com.r3dliz4rd.deonism.stickercontentprovider").appendPath("stickers").appendPath(str).build();
    }

    private static List<m> g(Context context, n nVar) {
        List<m> listB = b(nVar.f1090b, context.getContentResolver());
        for (m mVar : listB) {
            try {
                if (c(nVar.f1090b, mVar.f1087b, context.getContentResolver()).length <= 0) {
                    throw new IllegalStateException("Asset file is empty, pack: " + nVar.f1091c + ", sticker: " + mVar.f1087b);
                }
                mVar.a(r4.length);
            } catch (IOException | IllegalArgumentException e) {
                throw new IllegalStateException("Asset file doesn't exist. pack: " + nVar.f1091c + ", sticker: " + mVar.f1087b, e);
            }
        }
        return listB;
    }
}
