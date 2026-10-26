package b.g.j;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final d f881d = e.f899c;
    private static final String e = Character.toString(8206);
    private static final String f = Character.toString(8207);
    static final a g = new a(false, 2, f881d);
    static final a h = new a(true, 2, f881d);
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final int f882b;

    /* renamed from: c, reason: collision with root package name */
    private final d f883c;

    /* renamed from: b.g.j.a$a, reason: collision with other inner class name */
    public static final class C0027a {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private int f884b;

        /* renamed from: c, reason: collision with root package name */
        private d f885c;

        public C0027a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z) {
            return z ? a.h : a.g;
        }

        private void c(boolean z) {
            this.a = z;
            this.f885c = a.f881d;
            this.f884b = 2;
        }

        public a a() {
            return (this.f884b == 2 && this.f885c == a.f881d) ? b(this.a) : new a(this.a, this.f884b, this.f885c);
        }
    }

    private static class b {
        private static final byte[] f = new byte[1792];
        private final CharSequence a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f886b;

        /* renamed from: c, reason: collision with root package name */
        private final int f887c;

        /* renamed from: d, reason: collision with root package name */
        private int f888d;
        private char e;

        static {
            for (int i = 0; i < 1792; i++) {
                f[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.f886b = z;
            this.f887c = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < 1792 ? f[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char cCharAt;
            int i = this.f888d;
            do {
                int i2 = this.f888d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.f888d = i3;
                cCharAt = charSequence.charAt(i3);
                this.e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f888d = i;
            this.e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i = this.f888d;
                if (i >= this.f887c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.a;
                this.f888d = i + 1;
                cCharAt = charSequence.charAt(i);
                this.e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i = this.f888d;
            while (true) {
                int i2 = this.f888d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.f888d = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    char c2 = this.e;
                    do {
                        int i4 = this.f888d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.a;
                            int i5 = i4 - 1;
                            this.f888d = i5;
                            cCharAt = charSequence2.charAt(i5);
                            this.e = cCharAt;
                        }
                    } while (cCharAt != c2);
                }
            }
            this.f888d = i;
            this.e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i = this.f888d;
            while (true) {
                int i2 = this.f888d;
                if (i2 >= this.f887c) {
                    this.f888d = i;
                    this.e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.a;
                this.f888d = i2 + 1;
                char cCharAt2 = charSequence.charAt(i2);
                this.e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    char c2 = this.e;
                    do {
                        int i3 = this.f888d;
                        if (i3 < this.f887c) {
                            CharSequence charSequence2 = this.a;
                            this.f888d = i3 + 1;
                            cCharAt = charSequence2.charAt(i3);
                            this.e = cCharAt;
                        }
                    } while (cCharAt != c2);
                }
            }
        }

        byte a() {
            char cCharAt = this.a.charAt(this.f888d - 1);
            this.e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.a, this.f888d);
                this.f888d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f888d--;
            byte bC = c(this.e);
            if (!this.f886b) {
                return bC;
            }
            char c2 = this.e;
            return c2 == '>' ? h() : c2 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.a.charAt(this.f888d);
            this.e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.a, this.f888d);
                this.f888d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f888d++;
            byte bC = c(this.e);
            if (!this.f886b) {
                return bC;
            }
            char c2 = this.e;
            return c2 == '<' ? i() : c2 == '&' ? g() : bC;
        }

        int d() {
            this.f888d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f888d < this.f887c && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f888d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        int e() {
            this.f888d = this.f887c;
            int i = 0;
            int i2 = 0;
            while (this.f888d > 0) {
                byte bA = a();
                if (bA != 0) {
                    if (bA == 1 || bA == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            i2 = i;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            }
            return 0;
        }
    }

    a(boolean z, int i, d dVar) {
        this.a = z;
        this.f882b = i;
        this.f883c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0027a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        return (this.a || !(zA || b(charSequence) == 1)) ? this.a ? (!zA || b(charSequence) == -1) ? f : "" : "" : e;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        return (this.a || !(zA || a(charSequence) == 1)) ? this.a ? (!zA || a(charSequence) == -1) ? f : "" : "" : e;
    }

    public boolean d() {
        return (this.f882b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f883c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? e.f898b : e.a));
        }
        if (zA != this.a) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? e.f898b : e.a));
        }
        return spannableStringBuilder;
    }
}
