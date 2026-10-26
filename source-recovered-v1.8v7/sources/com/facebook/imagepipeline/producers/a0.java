package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a0 extends b0 implements z0<d.a.e.j.e> {

    /* renamed from: d, reason: collision with root package name */
    private static final Class<?> f1310d = a0.class;
    private static final String[] e = {"_id", "_data"};
    private static final String[] f = {"_data"};
    private static final Rect g = new Rect(0, 0, 512, 384);
    private static final Rect h = new Rect(0, 0, 96, 96);

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f1311c;

    public a0(Executor executor, d.a.b.g.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f1311c = contentResolver;
    }

    @Nullable
    private d.a.e.j.e g(Uri uri, d.a.e.d.e eVar) {
        d.a.e.j.e eVarJ;
        Cursor cursorQuery = this.f1311c.query(uri, e, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.getCount() == 0) {
                return null;
            }
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            if (eVar == null || (eVarJ = j(eVar, cursorQuery.getInt(cursorQuery.getColumnIndex("_id")))) == null) {
                return null;
            }
            eVarJ.G(i(string));
            return eVarJ;
        } finally {
            cursorQuery.close();
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int i(String str) {
        if (str != null) {
            try {
                return com.facebook.imageutils.c.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e2) {
                d.a.b.e.a.g(f1310d, e2, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    @Nullable
    private d.a.e.j.e j(d.a.e.d.e eVar, int i) throws Throwable {
        int iK = k(eVar);
        Cursor cursor = null;
        if (iK == 0) {
            return null;
        }
        try {
            Cursor cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f1311c, i, iK, f);
            if (cursorQueryMiniThumbnail == null) {
                if (cursorQueryMiniThumbnail != null) {
                    cursorQueryMiniThumbnail.close();
                }
                return null;
            }
            try {
                cursorQueryMiniThumbnail.moveToFirst();
                if (cursorQueryMiniThumbnail.getCount() > 0) {
                    String string = cursorQueryMiniThumbnail.getString(cursorQueryMiniThumbnail.getColumnIndex("_data"));
                    if (new File(string).exists()) {
                        d.a.e.j.e eVarE = e(new FileInputStream(string), h(string));
                        if (cursorQueryMiniThumbnail != null) {
                            cursorQueryMiniThumbnail.close();
                        }
                        return eVarE;
                    }
                }
                if (cursorQueryMiniThumbnail != null) {
                    cursorQueryMiniThumbnail.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                cursor = cursorQueryMiniThumbnail;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static int k(d.a.e.d.e eVar) {
        if (a1.b(h.width(), h.height(), eVar)) {
            return 3;
        }
        return a1.b(g.width(), g.height(), eVar) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public boolean b(d.a.e.d.e eVar) {
        return a1.b(g.width(), g.height(), eVar);
    }

    @Override // com.facebook.imagepipeline.producers.b0
    @Nullable
    protected d.a.e.j.e d(d.a.e.l.a aVar) {
        d.a.e.j.e eVarG;
        Uri uriP = aVar.p();
        if (!d.a.b.k.f.g(uriP) || (eVarG = g(uriP, aVar.l())) == null) {
            return null;
        }
        return eVarG;
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
