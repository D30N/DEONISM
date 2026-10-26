package d.a.b.k;

import com.facebook.infer.annotation.Functional;

/* loaded from: classes.dex */
public enum e {
    YES,
    NO,
    UNSET;

    @Functional
    public static e f(boolean z) {
        return z ? YES : NO;
    }
}
