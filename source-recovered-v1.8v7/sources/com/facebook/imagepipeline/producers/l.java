package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public class l extends b0 {
    public l(d.a.b.g.h hVar) {
        super(d.a.b.b.a.a(), hVar);
    }

    static byte[] g(String str) {
        d.a.b.d.i.b(str.substring(0, 5).equals("data:"));
        int iIndexOf = str.indexOf(44);
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        return h(str.substring(0, iIndexOf)) ? Base64.decode(strSubstring, 0) : Uri.decode(strSubstring).getBytes();
    }

    static boolean h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        return str.split(";")[r2.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected d.a.e.j.e d(d.a.e.l.a aVar) {
        byte[] bArrG = g(aVar.p().toString());
        return c(new ByteArrayInputStream(bArrG), bArrG.length);
    }

    @Override // com.facebook.imagepipeline.producers.b0
    protected String f() {
        return "DataFetchProducer";
    }
}
