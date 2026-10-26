package d.b.a.a.e.e;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'l' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class y7 {

    /* renamed from: d, reason: collision with root package name */
    public static final y7 f2890d = new y7("DOUBLE", 0, g8.DOUBLE, 1);
    public static final y7 e = new y7("FLOAT", 1, g8.FLOAT, 5);
    public static final y7 f = new y7("INT64", 2, g8.LONG, 0);
    public static final y7 g = new y7("UINT64", 3, g8.LONG, 0);
    public static final y7 h = new y7("INT32", 4, g8.INT, 0);
    public static final y7 i = new y7("FIXED64", 5, g8.LONG, 1);
    public static final y7 j = new y7("FIXED32", 6, g8.INT, 5);
    public static final y7 k = new y7("BOOL", 7, g8.BOOLEAN, 0);
    public static final y7 l;
    public static final y7 m;
    public static final y7 n;
    public static final y7 o;
    public static final y7 p;
    public static final y7 q;
    public static final y7 r;
    public static final y7 s;
    public static final y7 t;
    public static final y7 u;
    private static final /* synthetic */ y7[] v;

    /* renamed from: b, reason: collision with root package name */
    private final g8 f2891b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2892c;

    static {
        final int i2 = 2;
        final int i3 = 3;
        final g8 g8Var = g8.STRING;
        final String str = "STRING";
        final int i4 = 8;
        l = new y7(str, i4, g8Var, i2) { // from class: d.b.a.a.e.e.b8
            {
                int i5 = 8;
                int i6 = 2;
            }
        };
        final g8 g8Var2 = g8.MESSAGE;
        final String str2 = "GROUP";
        final int i5 = 9;
        m = new y7(str2, i5, g8Var2, i3) { // from class: d.b.a.a.e.e.a8
            {
                int i6 = 9;
                int i7 = 3;
            }
        };
        final g8 g8Var3 = g8.MESSAGE;
        final String str3 = "MESSAGE";
        final int i6 = 10;
        n = new y7(str3, i6, g8Var3, i2) { // from class: d.b.a.a.e.e.d8
            {
                int i7 = 10;
                int i8 = 2;
            }
        };
        final g8 g8Var4 = g8.BYTE_STRING;
        final String str4 = "BYTES";
        final int i7 = 11;
        o = new y7(str4, i7, g8Var4, i2) { // from class: d.b.a.a.e.e.c8
            {
                int i8 = 11;
                int i9 = 2;
            }
        };
        p = new y7("UINT32", 12, g8.INT, 0);
        q = new y7("ENUM", 13, g8.ENUM, 0);
        r = new y7("SFIXED32", 14, g8.INT, 5);
        s = new y7("SFIXED64", 15, g8.LONG, 1);
        t = new y7("SINT32", 16, g8.INT, 0);
        y7 y7Var = new y7("SINT64", 17, g8.LONG, 0);
        u = y7Var;
        v = new y7[]{f2890d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, y7Var};
    }

    private y7(String str, int i2, g8 g8Var, int i3) {
        this.f2891b = g8Var;
        this.f2892c = i3;
    }

    public static y7[] values() {
        return (y7[]) v.clone();
    }

    public final g8 f() {
        return this.f2891b;
    }

    public final int g() {
        return this.f2892c;
    }
}
