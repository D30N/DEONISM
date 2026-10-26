package com.facebook.imageformat;

/* loaded from: classes.dex */
public final class b {
    public static final c a = new c("JPEG", "jpeg");

    /* renamed from: b, reason: collision with root package name */
    public static final c f1242b = new c("PNG", "png");

    /* renamed from: c, reason: collision with root package name */
    public static final c f1243c = new c("GIF", "gif");

    /* renamed from: d, reason: collision with root package name */
    public static final c f1244d = new c("BMP", "bmp");
    public static final c e = new c("ICO", "ico");
    public static final c f = new c("WEBP_SIMPLE", "webp");
    public static final c g = new c("WEBP_LOSSLESS", "webp");
    public static final c h = new c("WEBP_EXTENDED", "webp");
    public static final c i = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
    public static final c j = new c("WEBP_ANIMATED", "webp");
    public static final c k = new c("HEIF", "heif");
    public static final c l = new c("DNG", "dng");

    public static boolean a(c cVar) {
        return cVar == f || cVar == g || cVar == h || cVar == i;
    }

    public static boolean b(c cVar) {
        return a(cVar) || cVar == j;
    }
}
