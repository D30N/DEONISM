package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class b extends Exception {
    public b(Status status) {
        int iH = status.h();
        String strI = status.i() != null ? status.i() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(strI).length() + 13);
        sb.append(iH);
        sb.append(": ");
        sb.append(strI);
        super(sb.toString());
    }
}
