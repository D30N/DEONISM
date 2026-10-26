package d.a.b.k;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class f {
    private static final Uri a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    @Nullable
    public static AssetFileDescriptor a(ContentResolver contentResolver, Uri uri) {
        if (i(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Nullable
    public static String b(ContentResolver contentResolver, Uri uri) throws Throwable {
        int columnIndex;
        Cursor cursor = null;
        string = null;
        string = null;
        String string = null;
        if (!i(uri)) {
            if (j(uri)) {
                return uri.getPath();
            }
            return null;
        }
        try {
            Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) != -1) {
                        string = cursorQuery.getString(columnIndex);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery == null) {
                return string;
            }
            cursorQuery.close();
            return string;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    public static String c(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri d(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    public static boolean e(@Nullable Uri uri) {
        return "data".equals(c(uri));
    }

    public static boolean f(@Nullable Uri uri) {
        return "asset".equals(c(uri));
    }

    public static boolean g(Uri uri) {
        String string = uri.toString();
        return string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean h(Uri uri) {
        return i(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(a.getPath());
    }

    public static boolean i(@Nullable Uri uri) {
        return "content".equals(c(uri));
    }

    public static boolean j(@Nullable Uri uri) {
        return "file".equals(c(uri));
    }

    public static boolean k(@Nullable Uri uri) {
        return "res".equals(c(uri));
    }

    public static boolean l(@Nullable Uri uri) {
        String strC = c(uri);
        return "https".equals(strC) || "http".equals(strC);
    }

    public static boolean m(@Nullable Uri uri) {
        return "android.resource".equals(c(uri));
    }

    @Nullable
    public static URL n(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
