package d.b.a.a.e.e;

/* loaded from: classes.dex */
public enum m4 {
    DOUBLE(0, o4.SCALAR, a5.DOUBLE),
    FLOAT(1, o4.SCALAR, a5.FLOAT),
    INT64(2, o4.SCALAR, a5.LONG),
    UINT64(3, o4.SCALAR, a5.LONG),
    INT32(4, o4.SCALAR, a5.INT),
    FIXED64(5, o4.SCALAR, a5.LONG),
    FIXED32(6, o4.SCALAR, a5.INT),
    BOOL(7, o4.SCALAR, a5.BOOLEAN),
    STRING(8, o4.SCALAR, a5.STRING),
    MESSAGE(9, o4.SCALAR, a5.MESSAGE),
    BYTES(10, o4.SCALAR, a5.BYTE_STRING),
    UINT32(11, o4.SCALAR, a5.INT),
    ENUM(12, o4.SCALAR, a5.ENUM),
    SFIXED32(13, o4.SCALAR, a5.INT),
    SFIXED64(14, o4.SCALAR, a5.LONG),
    SINT32(15, o4.SCALAR, a5.INT),
    SINT64(16, o4.SCALAR, a5.LONG),
    GROUP(17, o4.SCALAR, a5.MESSAGE),
    DOUBLE_LIST(18, o4.VECTOR, a5.DOUBLE),
    FLOAT_LIST(19, o4.VECTOR, a5.FLOAT),
    INT64_LIST(20, o4.VECTOR, a5.LONG),
    UINT64_LIST(21, o4.VECTOR, a5.LONG),
    INT32_LIST(22, o4.VECTOR, a5.INT),
    FIXED64_LIST(23, o4.VECTOR, a5.LONG),
    FIXED32_LIST(24, o4.VECTOR, a5.INT),
    BOOL_LIST(25, o4.VECTOR, a5.BOOLEAN),
    STRING_LIST(26, o4.VECTOR, a5.STRING),
    MESSAGE_LIST(27, o4.VECTOR, a5.MESSAGE),
    BYTES_LIST(28, o4.VECTOR, a5.BYTE_STRING),
    UINT32_LIST(29, o4.VECTOR, a5.INT),
    ENUM_LIST(30, o4.VECTOR, a5.ENUM),
    SFIXED32_LIST(31, o4.VECTOR, a5.INT),
    SFIXED64_LIST(32, o4.VECTOR, a5.LONG),
    SINT32_LIST(33, o4.VECTOR, a5.INT),
    SINT64_LIST(34, o4.VECTOR, a5.LONG),
    DOUBLE_LIST_PACKED(35, o4.PACKED_VECTOR, a5.DOUBLE),
    FLOAT_LIST_PACKED(36, o4.PACKED_VECTOR, a5.FLOAT),
    INT64_LIST_PACKED(37, o4.PACKED_VECTOR, a5.LONG),
    UINT64_LIST_PACKED(38, o4.PACKED_VECTOR, a5.LONG),
    INT32_LIST_PACKED(39, o4.PACKED_VECTOR, a5.INT),
    FIXED64_LIST_PACKED(40, o4.PACKED_VECTOR, a5.LONG),
    FIXED32_LIST_PACKED(41, o4.PACKED_VECTOR, a5.INT),
    BOOL_LIST_PACKED(42, o4.PACKED_VECTOR, a5.BOOLEAN),
    UINT32_LIST_PACKED(43, o4.PACKED_VECTOR, a5.INT),
    ENUM_LIST_PACKED(44, o4.PACKED_VECTOR, a5.ENUM),
    SFIXED32_LIST_PACKED(45, o4.PACKED_VECTOR, a5.INT),
    SFIXED64_LIST_PACKED(46, o4.PACKED_VECTOR, a5.LONG),
    SINT32_LIST_PACKED(47, o4.PACKED_VECTOR, a5.INT),
    SINT64_LIST_PACKED(48, o4.PACKED_VECTOR, a5.LONG),
    GROUP_LIST(49, o4.VECTOR, a5.MESSAGE),
    MAP(50, o4.MAP, a5.VOID);

    private static final m4[] b0;

    /* renamed from: b, reason: collision with root package name */
    private final int f2765b;

    static {
        m4[] m4VarArrValues = values();
        b0 = new m4[m4VarArrValues.length];
        for (m4 m4Var : m4VarArrValues) {
            b0[m4Var.f2765b] = m4Var;
        }
    }

    m4(int i, o4 o4Var, a5 a5Var) {
        int i2;
        this.f2765b = i;
        int i3 = l4.a[o4Var.ordinal()];
        if (i3 == 1 || i3 == 2) {
            a5Var.f();
        }
        if (o4Var == o4.SCALAR && (i2 = l4.f2758b[a5Var.ordinal()]) != 1 && i2 == 2) {
        }
    }

    public final int a() {
        return this.f2765b;
    }
}
