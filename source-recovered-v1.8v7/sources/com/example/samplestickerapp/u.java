package com.example.samplestickerapp;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public class u {
    private static String a = "com.r3dliz4rd.deonism.stickercontentprovider";

    /* renamed from: b, reason: collision with root package name */
    public static String f1097b = "com.whatsapp";

    /* renamed from: c, reason: collision with root package name */
    public static String f1098c = "com.whatsapp.w4b";

    /* renamed from: d, reason: collision with root package name */
    private static String f1099d = ".provider.sticker_whitelist_check";
    private static String e = "is_whitelisted";
    private static String f = "result";

    public static boolean a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return applicationInfo.enabled;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean b(Context context, String str) {
        return g(context, str, f1097b);
    }

    public static boolean c(Context context, String str) {
        return g(context, str, f1098c);
    }

    public static boolean d(PackageManager packageManager) {
        return a(f1097b, packageManager);
    }

    public static boolean e(PackageManager packageManager) {
        return a(f1098c, packageManager);
    }

    static boolean f(Context context, String str) {
        try {
            if (d(context.getPackageManager()) || e(context.getPackageManager())) {
                return b(context, str) && c(context, str);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean g(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        if (!a(str2, packageManager)) {
            return true;
        }
        String str3 = str2 + f1099d;
        if (packageManager.resolveContentProvider(str3, 128) == null) {
            return false;
        }
        Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority(str3).appendPath(e).appendQueryParameter("authority", a).appendQueryParameter("identifier", str).build(), null, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    boolean z = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(f)) == 1;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return z;
                }
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }
}
