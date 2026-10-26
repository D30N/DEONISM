package com.example.samplestickerapp;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class StickerContentProvider extends ContentProvider {

    /* renamed from: c, reason: collision with root package name */
    public static Uri f1072c = new Uri.Builder().scheme("content").authority("com.r3dliz4rd.deonism.stickercontentprovider").appendPath("metadata").build();

    /* renamed from: d, reason: collision with root package name */
    private static final UriMatcher f1073d = new UriMatcher(-1);

    /* renamed from: b, reason: collision with root package name */
    private List<n> f1074b;

    private AssetFileDescriptor a(Uri uri, AssetManager assetManager, String str, String str2) {
        try {
            return assetManager.openFd(str2 + "/" + str);
        } catch (IOException e) {
            Context context = getContext();
            context.getClass();
            Log.e(context.getPackageName(), "IOException when getting asset file, uri:" + uri, e);
            return null;
        }
    }

    private Cursor b(Uri uri) {
        List<n> arrayList;
        String lastPathSegment = uri.getLastPathSegment();
        Iterator<n> it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                arrayList = new ArrayList<>();
                break;
            }
            n next = it.next();
            if (lastPathSegment.equals(next.f1090b)) {
                arrayList = Collections.singletonList(next);
                break;
            }
        }
        return e(uri, arrayList);
    }

    private AssetFileDescriptor c(Uri uri) {
        Context context = getContext();
        context.getClass();
        AssetManager assets = context.getAssets();
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 3) {
            throw new IllegalArgumentException("path segments should be 3, uri is: " + uri);
        }
        String str = pathSegments.get(pathSegments.size() - 1);
        String str2 = pathSegments.get(pathSegments.size() - 2);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("identifier is empty, uri: " + uri);
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("file name is empty, uri: " + uri);
        }
        for (n nVar : f()) {
            if (str2.equals(nVar.f1090b)) {
                if (str.equals(nVar.e)) {
                    return a(uri, assets, str, str2);
                }
                Iterator<m> it = nVar.b().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().f1087b)) {
                        return a(uri, assets, str, str2);
                    }
                }
            }
        }
        return null;
    }

    private Cursor d(Uri uri) {
        return e(uri, f());
    }

    private Cursor e(Uri uri, List<n> list) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"sticker_pack_identifier", "sticker_pack_name", "sticker_pack_publisher", "sticker_pack_icon", "android_play_store_link", "ios_app_download_link", "sticker_pack_publisher_email", "sticker_pack_publisher_website", "sticker_pack_privacy_policy_website", "sticker_pack_license_agreement_website"});
        for (n nVar : list) {
            MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
            rowBuilderNewRow.add(nVar.f1090b);
            rowBuilderNewRow.add(nVar.f1091c);
            rowBuilderNewRow.add(nVar.f1092d);
            rowBuilderNewRow.add(nVar.e);
            rowBuilderNewRow.add(nVar.m);
            rowBuilderNewRow.add(nVar.j);
            rowBuilderNewRow.add(nVar.f);
            rowBuilderNewRow.add(nVar.g);
            rowBuilderNewRow.add(nVar.h);
            rowBuilderNewRow.add(nVar.i);
        }
        Context context = getContext();
        context.getClass();
        matrixCursor.setNotificationUri(context.getContentResolver(), uri);
        return matrixCursor;
    }

    private Cursor g(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"sticker_file_name", "sticker_emoji"});
        for (n nVar : f()) {
            if (lastPathSegment.equals(nVar.f1090b)) {
                for (m mVar : nVar.b()) {
                    matrixCursor.addRow(new Object[]{mVar.f1087b, TextUtils.join(",", mVar.f1088c)});
                }
            }
        }
        Context context = getContext();
        context.getClass();
        matrixCursor.setNotificationUri(context.getContentResolver(), uri);
        return matrixCursor;
    }

    private synchronized void h(Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open("contents.json");
            try {
                this.f1074b = l.a(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException | IllegalStateException e) {
            throw new RuntimeException("contents.json file has some issues: " + e.getMessage(), e);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not supported");
    }

    public List<n> f() {
        if (this.f1074b == null) {
            Context context = getContext();
            context.getClass();
            h(context);
        }
        return this.f1074b;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = f1073d.match(uri);
        if (iMatch == 1) {
            return "vnd.android.cursor.dir/vnd.com.r3dliz4rd.deonism.stickercontentprovider.metadata";
        }
        if (iMatch == 2) {
            return "vnd.android.cursor.item/vnd.com.r3dliz4rd.deonism.stickercontentprovider.metadata";
        }
        if (iMatch == 3) {
            return "vnd.android.cursor.dir/vnd.com.r3dliz4rd.deonism.stickercontentprovider.stickers";
        }
        if (iMatch == 4) {
            return "image/webp";
        }
        if (iMatch == 5) {
            return "image/png";
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        context.getClass();
        if (!"com.r3dliz4rd.deonism.stickercontentprovider".startsWith(context.getPackageName())) {
            throw new IllegalStateException("your authority (com.r3dliz4rd.deonism.stickercontentprovider) for the content provider should start with your package name: " + getContext().getPackageName());
        }
        f1073d.addURI("com.r3dliz4rd.deonism.stickercontentprovider", "metadata", 1);
        f1073d.addURI("com.r3dliz4rd.deonism.stickercontentprovider", "metadata/*", 2);
        f1073d.addURI("com.r3dliz4rd.deonism.stickercontentprovider", "stickers/*", 3);
        for (n nVar : f()) {
            f1073d.addURI("com.r3dliz4rd.deonism.stickercontentprovider", "stickers_asset/" + nVar.f1090b + "/" + nVar.e, 5);
            for (m mVar : nVar.b()) {
                f1073d.addURI("com.r3dliz4rd.deonism.stickercontentprovider", "stickers_asset/" + nVar.f1090b + "/" + mVar.f1087b, 4);
            }
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str) {
        int iMatch = f1073d.match(uri);
        if (iMatch == 4 || iMatch == 5) {
            return c(uri);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = f1073d.match(uri);
        if (iMatch == 1) {
            return d(uri);
        }
        if (iMatch == 2) {
            return b(uri);
        }
        if (iMatch == 3) {
            return g(uri);
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not supported");
    }
}
