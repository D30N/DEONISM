package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class e0 implements l0<d.a.b.h.a<d.a.e.j.c>> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f1321b;

    class a extends t0<d.a.b.h.a<d.a.e.j.c>> {
        final /* synthetic */ o0 g;
        final /* synthetic */ m0 h;
        final /* synthetic */ d.a.e.l.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, o0 o0Var, m0 m0Var, String str, o0 o0Var2, m0 m0Var2, d.a.e.l.a aVar) {
            super(kVar, o0Var, m0Var, str);
            this.g = o0Var2;
            this.h = m0Var2;
            this.i = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.t0, d.a.b.b.f
        protected void e(Exception exc) {
            super.e(exc);
            this.g.b(this.h, "VideoThumbnailProducer", false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d.a.b.b.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(d.a.b.h.a<d.a.e.j.c> aVar) {
            d.a.b.h.a.o(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.t0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> i(d.a.b.h.a<d.a.e.j.c> aVar) {
            return d.a.b.d.f.c("createdThumbnail", String.valueOf(aVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d.a.b.b.f
        @Nullable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public d.a.b.h.a<d.a.e.j.c> c() {
            String strI;
            Bitmap bitmapCreateVideoThumbnail;
            if (this.i.c().j && d.a.b.k.f.i(this.i.p())) {
                bitmapCreateVideoThumbnail = MediaStore.Video.Thumbnails.getThumbnail(e0.this.f1321b, ContentUris.parseId(this.i.p()), e0.g(this.i), null);
            } else {
                try {
                    strI = e0.this.i(this.i);
                } catch (IllegalArgumentException unused) {
                    strI = null;
                }
                bitmapCreateVideoThumbnail = strI != null ? ThumbnailUtils.createVideoThumbnail(strI, e0.g(this.i)) : e0.h(e0.this.f1321b, this.i.p());
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            return d.a.b.h.a.v(new d.a.e.j.d(bitmapCreateVideoThumbnail, d.a.e.b.h.b(), d.a.e.j.h.f2568d, 0));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.t0, d.a.b.b.f
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(d.a.b.h.a<d.a.e.j.c> aVar) {
            super.f(aVar);
            this.g.b(this.h, "VideoThumbnailProducer", aVar != null);
        }
    }

    class b extends e {
        final /* synthetic */ t0 a;

        b(e0 e0Var, t0 t0Var) {
            this.a = t0Var;
        }

        @Override // com.facebook.imagepipeline.producers.n0
        public void b() {
            this.a.a();
        }
    }

    public e0(Executor executor, ContentResolver contentResolver) {
        this.a = executor;
        this.f1321b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(d.a.e.l.a aVar) {
        return (aVar.h() > 96 || aVar.g() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Bitmap h(ContentResolver contentResolver, Uri uri) throws IllegalArgumentException, FileNotFoundException {
        if (Build.VERSION.SDK_INT >= 10) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                return mediaMetadataRetriever.getFrameAtTime(-1L);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public String i(d.a.e.l.a aVar) {
        Uri uri;
        String str;
        String[] strArr;
        Uri uriP = aVar.p();
        if (d.a.b.k.f.j(uriP)) {
            return aVar.o().getPath();
        }
        if (d.a.b.k.f.i(uriP)) {
            if (Build.VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(uriP.getAuthority())) {
                uri = uriP;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(uriP);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
            }
            Cursor cursorQuery = this.f1321b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        return cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.b.h.a<d.a.e.j.c>> kVar, m0 m0Var) {
        o0 o0VarL = m0Var.l();
        a aVar = new a(kVar, o0VarL, m0Var, "VideoThumbnailProducer", o0VarL, m0Var, m0Var.c());
        m0Var.f(new b(this, aVar));
        this.a.execute(aVar);
    }
}
