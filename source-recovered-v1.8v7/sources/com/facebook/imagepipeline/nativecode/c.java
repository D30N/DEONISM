package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class c {
    public static d.a.e.n.d a(int i, boolean z) {
        try {
            return (d.a.e.n.d) Class.forName("com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory").getConstructor(Integer.TYPE, Boolean.TYPE).newInstance(Integer.valueOf(i), Boolean.valueOf(z));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        }
    }
}
