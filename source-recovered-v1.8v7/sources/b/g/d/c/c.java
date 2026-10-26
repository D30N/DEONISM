package b.g.d.c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    public interface a {
    }

    public static final class b implements a {
        private final C0022c[] a;

        public b(C0022c[] c0022cArr) {
            this.a = c0022cArr;
        }

        public C0022c[] a() {
            return this.a;
        }
    }

    /* renamed from: b.g.d.c.c$c, reason: collision with other inner class name */
    public static final class C0022c {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private int f836b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f837c;

        /* renamed from: d, reason: collision with root package name */
        private String f838d;
        private int e;
        private int f;

        public C0022c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.f836b = i;
            this.f837c = z;
            this.f838d = str2;
            this.e = i2;
            this.f = i3;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.f838d;
        }

        public int e() {
            return this.f836b;
        }

        public boolean f() {
            return this.f837c;
        }
    }

    public static final class d implements a {
        private final b.g.i.a a;

        /* renamed from: b, reason: collision with root package name */
        private final int f839b;

        /* renamed from: c, reason: collision with root package name */
        private final int f840c;

        public d(b.g.i.a aVar, int i, int i2) {
            this.a = aVar;
            this.f840c = i;
            this.f839b = i2;
        }

        public int a() {
            return this.f840c;
        }

        public b.g.i.a b() {
            return this.a;
        }

        public int c() {
            return this.f839b;
        }
    }

    private static int a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.g.c.FontFamily);
        String string = typedArrayObtainAttributes.getString(b.g.c.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(b.g.c.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(b.g.c.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(b.g.c.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(b.g.c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(b.g.c.FontFamily_fontProviderFetchTimeout, 500);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new b.g.i.a(string, string2, string3, c(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((C0022c[]) arrayList.toArray(new C0022c[arrayList.size()]));
    }

    private static C0022c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.g.c.FontFamilyFont);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(b.g.c.FontFamilyFont_fontWeight) ? b.g.c.FontFamilyFont_fontWeight : b.g.c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(b.g.c.FontFamilyFont_fontStyle) ? b.g.c.FontFamilyFont_fontStyle : b.g.c.FontFamilyFont_android_fontStyle, 0);
        int i2 = typedArrayObtainAttributes.hasValue(b.g.c.FontFamilyFont_ttcIndex) ? b.g.c.FontFamilyFont_ttcIndex : b.g.c.FontFamilyFont_android_ttcIndex;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(b.g.c.FontFamilyFont_fontVariationSettings) ? b.g.c.FontFamilyFont_fontVariationSettings : b.g.c.FontFamilyFont_android_fontVariationSettings);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(b.g.c.FontFamilyFont_font) ? b.g.c.FontFamilyFont_font : b.g.c.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0022c(string2, i, z, string, i3, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
