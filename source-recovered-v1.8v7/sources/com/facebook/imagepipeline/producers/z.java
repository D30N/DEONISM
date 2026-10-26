package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class z extends b0 {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f1431d = {"_id", "_data"};

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f1432c;

    public z(Executor executor, d.a.b.g.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f1432c = contentResolver;
    }

    @Nullable
    private d.a.e.j.e g(Uri uri) {
        Cursor cursorQuery = this.f1432c.query(uri, f1431d, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.getCount() == 0) {
                return null;
            }
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            if (string != null) {
                return e(new FileInputStream(this.f1432c.openFileDescriptor(uri, "r").getFileDescriptor()), h(string));
            }
            return null;
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

    @Override // com.facebook.imagepipeline.producers.b0
    protected d.a.e.j.e d(d.a.e.l.a aVar) throws IOException {
        d.a.e.j.e eVarG;
        InputStream inputStreamCreateInputStream;
        Uri uriP = aVar.p();
        if (!d.a.b.k.f.h(uriP)) {
            return (!d.a.b.k.f.g(uriP) || (eVarG = g(uriP)) == null) ? e(this.f1432c.openInputStream(uriP), -1) : eVarG;
        }
        if (uriP.toString().endsWith("/photo")) {
            inputStreamCreateInputStream = this.f1432c.openInputStream(uriP);
        } else if (uriP.toString().endsWith("/display_photo")) {
            try {
                inputStreamCreateInputStream = this.f1432c.openAssetFileDescriptor(uriP, "r").createInputStream();
            } catch (IOException unused) {
                throw new IOException("Contact photo does not exist: " + uriP);
            }
        } else {
            InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f1432c, uriP);
            if (inputStreamOpenContactPhotoInputStream == null) {
                throw new IOException("Contact photo does not exist: " + uriP);
            }
            inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
        }
        return e(inputStreamCreateInputStream, -1);
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected String f() {
        return "LocalContentUriFetchProducer";
    }
}
