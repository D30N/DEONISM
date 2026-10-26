package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import d.b.a.b.k;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6E {
    public final C02525u A00;
    public final Map<Integer, C02586a> A01;
    public final AtomicBoolean A02 = new AtomicBoolean();

    public C6E(C02525u c02525u, Map<Integer, C02586a> map) {
        this.A00 = c02525u;
        this.A01 = map;
        this.A02.compareAndSet(false, true);
    }

    private int A00(int i) {
        if (this.A00.A0e(i) != null) {
            return this.A00.A0e(i).intValue();
        }
        return this.A00.A0R();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5z != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A01(AbstractC02766s abstractC02766s, C02586a c02586a) {
        int iA00 = c02586a.A00();
        Map<Integer, C02575z<AbstractC02766s>> mapA03 = C02636f.A01().A03();
        if (mapA03.containsKey(Integer.valueOf(iA00))) {
            C02575z<AbstractC02766s> c02575z = mapA03.get(Integer.valueOf(iA00));
            AbstractC02766s abstractC02766sA02 = c02575z != null ? c02575z.A02() : null;
            if (c02575z == null) {
                c02575z = new C02575z<>(A00(iA00));
            }
            if (!abstractC02766s.A0B(abstractC02766sA02, c02586a.A03())) {
                c02575z.A04(abstractC02766s);
                C02636f.A01().A04(iA00, c02575z, abstractC02766s.A05());
            }
        } else {
            C02575z<AbstractC02766s> c02575z2 = new C02575z<>(A00(iA00));
            c02575z2.A04(abstractC02766s);
            C02636f.A01().A04(iA00, c02575z2, abstractC02766s.A05());
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A02(AbstractC02766s abstractC02766s, C6D c6d) {
        C02586a c02586a = null;
        C02586a c02586a2 = null;
        C02586a c02586a3 = null;
        C02586a c02586a4 = null;
        C02586a c02586a5 = null;
        C02586a c02586a6 = null;
        C02586a c02586a7 = null;
        C02586a c02586a8 = null;
        C02586a c02586a9 = null;
        C02586a c02586a10 = null;
        C02586a c02586a11 = null;
        char c2 = !this.A02.get() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    try {
                        switch (c6d) {
                            case A0D:
                                c02586a = this.A01.get(10800);
                                if (abstractC02766s == null) {
                                    c2 = ']';
                                    break;
                                } else {
                                    c2 = '\\';
                                    break;
                                }
                            case A02:
                                c02586a2 = this.A01.get(10810);
                                if (abstractC02766s == null) {
                                    c2 = 'U';
                                    break;
                                } else {
                                    c2 = 'T';
                                    break;
                                }
                            case A08:
                                c02586a3 = this.A01.get(10812);
                                if (abstractC02766s == null) {
                                    c2 = 'M';
                                    break;
                                } else {
                                    c2 = 'L';
                                    break;
                                }
                            case A05:
                                c02586a4 = this.A01.get(10813);
                                if (abstractC02766s == null) {
                                    c2 = 'E';
                                    break;
                                } else {
                                    c2 = 'D';
                                    break;
                                }
                            case A09:
                                c02586a5 = this.A01.get(10814);
                                if (abstractC02766s == null) {
                                    c2 = '=';
                                    break;
                                } else {
                                    c2 = '<';
                                    break;
                                }
                            case A0A:
                                c02586a11 = this.A01.get(10815);
                                if (abstractC02766s == null) {
                                    c2 = '5';
                                    break;
                                } else {
                                    c2 = '4';
                                    break;
                                }
                            case A0C:
                                c02586a10 = this.A01.get(10816);
                                if (abstractC02766s == null) {
                                    c2 = '-';
                                    break;
                                } else {
                                    c2 = ',';
                                    break;
                                }
                            case A07:
                                c02586a9 = this.A01.get(10817);
                                if (abstractC02766s == null) {
                                    c2 = '%';
                                    break;
                                } else {
                                    c2 = '$';
                                    break;
                                }
                            case A04:
                                c02586a7 = this.A01.get(10818);
                                if (abstractC02766s == null) {
                                    c2 = 29;
                                    break;
                                } else {
                                    c2 = 28;
                                    break;
                                }
                            case A03:
                                c02586a8 = this.A01.get(10819);
                                if (abstractC02766s == null) {
                                    c2 = 21;
                                    break;
                                } else {
                                    c2 = 20;
                                    break;
                                }
                            case A0B:
                                c02586a6 = this.A01.get(10820);
                                if (abstractC02766s == null) {
                                    c2 = '\r';
                                    break;
                                } else {
                                    c2 = '\f';
                                    break;
                                }
                            default:
                                return;
                        }
                    } catch (Throwable th) {
                        AnonymousClass66.A03(th);
                        return;
                    }
                case '\f':
                    c02586a6 = c02586a6;
                    if (c02586a6 != null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    return;
                case 14:
                    A01(abstractC02766s, c02586a6);
                    return;
                case 20:
                    c02586a8 = c02586a8;
                    if (c02586a8 != null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    return;
                case 22:
                    A01(abstractC02766s, c02586a8);
                    return;
                case 28:
                    c02586a7 = c02586a7;
                    if (c02586a7 != null) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    return;
                case 30:
                    A01(abstractC02766s, c02586a7);
                    return;
                case '$':
                    c02586a9 = c02586a9;
                    if (c02586a9 != null) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '%':
                    return;
                case '&':
                    A01(abstractC02766s, c02586a9);
                    return;
                case ',':
                    c02586a10 = c02586a10;
                    if (c02586a10 != null) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '-';
                        break;
                    }
                case '-':
                    return;
                case '.':
                    A01(abstractC02766s, c02586a10);
                    return;
                case '4':
                    c02586a11 = c02586a11;
                    if (c02586a11 != null) {
                        c2 = '6';
                        break;
                    } else {
                        c2 = '5';
                        break;
                    }
                case '5':
                    return;
                case '6':
                    A01(abstractC02766s, c02586a11);
                    return;
                case '<':
                    c02586a5 = c02586a5;
                    if (c02586a5 != null) {
                        c2 = '>';
                        break;
                    } else {
                        c2 = '=';
                        break;
                    }
                case '=':
                    return;
                case '>':
                    A01(abstractC02766s, c02586a5);
                    return;
                case 'D':
                    c02586a4 = c02586a4;
                    if (c02586a4 != null) {
                        c2 = 'F';
                        break;
                    } else {
                        c2 = 'E';
                        break;
                    }
                case 'E':
                    return;
                case 'F':
                    A01(abstractC02766s, c02586a4);
                    return;
                case 'L':
                    c02586a3 = c02586a3;
                    if (c02586a3 != null) {
                        c2 = 'N';
                        break;
                    } else {
                        c2 = 'M';
                        break;
                    }
                case 'M':
                    return;
                case 'N':
                    A01(abstractC02766s, c02586a3);
                    return;
                case k.AppCompatTheme_panelBackground /* 84 */:
                    c02586a2 = c02586a2;
                    if (c02586a2 != null) {
                        c2 = 'V';
                        break;
                    } else {
                        c2 = 'U';
                        break;
                    }
                case 'U':
                    return;
                case 'V':
                    A01(abstractC02766s, c02586a2);
                    return;
                case '\\':
                    c02586a = c02586a;
                    if (c02586a != null) {
                        c2 = '^';
                        break;
                    } else {
                        c2 = ']';
                        break;
                    }
                case ']':
                    return;
                case '^':
                    A01(abstractC02766s, c02586a);
                    return;
            }
        }
    }
}
