package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class h7 {
    static String a(l3 l3Var) {
        String str;
        g7 g7Var = new g7(l3Var);
        StringBuilder sb = new StringBuilder(g7Var.a());
        for (int i = 0; i < g7Var.a(); i++) {
            int iF = g7Var.f(i);
            if (iF == 34) {
                str = "\\\"";
            } else if (iF == 39) {
                str = "\\'";
            } else if (iF != 92) {
                switch (iF) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iF < 32 || iF > 126) {
                            sb.append('\\');
                            sb.append((char) (((iF >>> 6) & 3) + 48));
                            sb.append((char) (((iF >>> 3) & 7) + 48));
                            iF = (iF & 7) + 48;
                        }
                        sb.append((char) iF);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
