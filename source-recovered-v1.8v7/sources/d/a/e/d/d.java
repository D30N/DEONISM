package d.a.e.d;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public enum d {
    LOW,
    MEDIUM,
    HIGH;

    public static d f(@Nullable d dVar, @Nullable d dVar2) {
        return dVar == null ? dVar2 : (dVar2 != null && dVar.ordinal() <= dVar2.ordinal()) ? dVar2 : dVar;
    }
}
