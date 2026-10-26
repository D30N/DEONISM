package com.example.samplestickerapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.facebook.animated.webp.WebPImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class r {
    private static void a(String str) {
        if (!str.matches("[\\w-.,'\\s]+")) {
            throw new IllegalStateException(str + " contains invalid characters, allowed characters are a to z, A to Z, _ , ' - . and space character");
        }
        if (str.contains("..")) {
            throw new IllegalStateException(str + " cannot contain ..");
        }
    }

    private static boolean b(String str, String str2) {
        try {
            return str2.equals(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            Log.e("StickerPackValidator", "url: " + str + " is malformed");
            throw new IllegalStateException("url: " + str + " is malformed");
        }
    }

    private static boolean c(String str) {
        try {
            new URL(str);
            return URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str);
        } catch (MalformedURLException e) {
            Log.e("StickerPackValidator", "url: " + str + " is malformed");
            throw new IllegalStateException("url: " + str + " is malformed", e);
        }
    }

    private static void d(Context context, String str, m mVar) {
        if (mVar.f1088c.size() > 3) {
            throw new IllegalStateException("emoji count exceed limit, sticker pack identifier:" + str + ", filename:" + mVar.f1087b);
        }
        if (!TextUtils.isEmpty(mVar.f1087b)) {
            e(context, str, mVar.f1087b);
            return;
        }
        throw new IllegalStateException("no file path for sticker, sticker pack identifier:" + str);
    }

    private static void e(Context context, String str, String str2) {
        try {
            byte[] bArrC = q.c(str, str2, context.getContentResolver());
            if (bArrC.length > 819200) {
                throw new IllegalStateException("sticker should be less than 100KB, sticker pack identifier:" + str + ", filename:" + str2);
            }
            try {
                WebPImage webPImageL = WebPImage.l(bArrC);
                if (webPImageL.getHeight() != 512) {
                    throw new IllegalStateException("sticker height should be 512, sticker pack identifier:" + str + ", filename:" + str2);
                }
                if (webPImageL.getWidth() != 512) {
                    throw new IllegalStateException("sticker width should be 512, sticker pack identifier:" + str + ", filename:" + str2);
                }
                if (webPImageL.a() <= 1) {
                    return;
                }
                throw new IllegalStateException("sticker should be a static image, no animated sticker support at the moment, sticker pack identifier:" + str + ", filename:" + str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("Error parsing webp image, sticker pack identifier:" + str + ", filename:" + str2, e);
            }
        } catch (IOException e2) {
            throw new IllegalStateException("cannot open sticker file: sticker pack identifier:" + str + ", filename:" + str2, e2);
        }
    }

    static void f(Context context, n nVar) {
        if (TextUtils.isEmpty(nVar.f1090b)) {
            throw new IllegalStateException("sticker pack identifier is empty");
        }
        if (nVar.f1090b.length() > 128) {
            throw new IllegalStateException("sticker pack identifier cannot exceed 128 characters");
        }
        a(nVar.f1090b);
        if (TextUtils.isEmpty(nVar.f1092d)) {
            throw new IllegalStateException("sticker pack publisher is empty, sticker pack identifier:" + nVar.f1090b);
        }
        if (nVar.f1092d.length() > 128) {
            throw new IllegalStateException("sticker pack publisher cannot exceed 128 characters, sticker pack identifier:" + nVar.f1090b);
        }
        if (TextUtils.isEmpty(nVar.f1091c)) {
            throw new IllegalStateException("sticker pack name is empty, sticker pack identifier:" + nVar.f1090b);
        }
        if (nVar.f1091c.length() > 128) {
            throw new IllegalStateException("sticker pack name cannot exceed 128 characters, sticker pack identifier:" + nVar.f1090b);
        }
        if (TextUtils.isEmpty(nVar.e)) {
            throw new IllegalStateException("sticker pack tray id is empty, sticker pack identifier:" + nVar.f1090b);
        }
        if (!TextUtils.isEmpty(nVar.m) && !c(nVar.m)) {
            throw new IllegalStateException("Make sure to include http or https in url links, android play store link is not a valid url: " + nVar.m);
        }
        if (!TextUtils.isEmpty(nVar.m) && !b(nVar.m, "play.google.com")) {
            throw new IllegalStateException("android play store link should use play store domain: play.google.com");
        }
        if (!TextUtils.isEmpty(nVar.j) && !c(nVar.j)) {
            throw new IllegalStateException("Make sure to include http or https in url links, ios app store link is not a valid url: " + nVar.j);
        }
        if (!TextUtils.isEmpty(nVar.j) && !b(nVar.j, "itunes.apple.com")) {
            throw new IllegalStateException("iOS app store link should use app store domain: itunes.apple.com");
        }
        if (!TextUtils.isEmpty(nVar.i) && !c(nVar.i)) {
            throw new IllegalStateException("Make sure to include http or https in url links, license agreement link is not a valid url: " + nVar.i);
        }
        if (!TextUtils.isEmpty(nVar.h) && !c(nVar.h)) {
            throw new IllegalStateException("Make sure to include http or https in url links, privacy policy link is not a valid url: " + nVar.h);
        }
        if (!TextUtils.isEmpty(nVar.g) && !c(nVar.g)) {
            throw new IllegalStateException("Make sure to include http or https in url links, publisher website link is not a valid url: " + nVar.g);
        }
        if (!TextUtils.isEmpty(nVar.f) && !Patterns.EMAIL_ADDRESS.matcher(nVar.f).matches()) {
            throw new IllegalStateException("publisher email does not seem valid, email is: " + nVar.f);
        }
        try {
            byte[] bArrC = q.c(nVar.f1090b, nVar.e, context.getContentResolver());
            if (bArrC.length > 409600) {
                throw new IllegalStateException("tray image should be less than 50 KB, tray image file: " + nVar.e);
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
            if (bitmapDecodeByteArray.getHeight() > 512 || bitmapDecodeByteArray.getHeight() < 24) {
                throw new IllegalStateException("tray image height should between 24 and 512 pixels, current tray image height is " + bitmapDecodeByteArray.getHeight() + ", tray image file: " + nVar.e);
            }
            if (bitmapDecodeByteArray.getWidth() > 512 || bitmapDecodeByteArray.getWidth() < 24) {
                throw new IllegalStateException("tray image width should be between 24 and 512 pixels, current tray image width is " + bitmapDecodeByteArray.getWidth() + ", tray image file: " + nVar.e);
            }
            List<m> listB = nVar.b();
            if (listB.size() >= 3 && listB.size() <= 30) {
                Iterator<m> it = listB.iterator();
                while (it.hasNext()) {
                    d(context, nVar.f1090b, it.next());
                }
                return;
            }
            throw new IllegalStateException("sticker pack sticker count should be between 3 to 30 inclusive, it currently has " + listB.size() + ", sticker pack identifier:" + nVar.f1090b);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot open tray image, " + nVar.e, e);
        }
    }
}
