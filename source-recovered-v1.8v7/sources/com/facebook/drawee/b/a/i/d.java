package com.facebook.drawee.b.a.i;

/* loaded from: classes.dex */
public class d {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 1
            r2 = 6
            r3 = 2
            r4 = 3
            r5 = 4
            r6 = 5
            switch(r0) {
                case -1917159454: goto La6;
                case -1914072202: goto L9c;
                case -1683996557: goto L91;
                case -1579985851: goto L86;
                case -1307634203: goto L7c;
                case -1224383234: goto L72;
                case 473552259: goto L67;
                case 656304759: goto L5d;
                case 957714404: goto L53;
                case 1019542023: goto L48;
                case 1023071510: goto L3d;
                case 1721672898: goto L32;
                case 1793127518: goto L26;
                case 2109593398: goto L1b;
                case 2113652014: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto Lb1
        Lf:
            java.lang.String r0 = "LocalContentUriFetchProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 9
            goto Lb2
        L1b:
            java.lang.String r0 = "PartialDiskCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 5
            goto Lb2
        L26:
            java.lang.String r0 = "LocalContentUriThumbnailFetchProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 10
            goto Lb2
        L32:
            java.lang.String r0 = "DataFetchProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 7
            goto Lb2
        L3d:
            java.lang.String r0 = "PostprocessedBitmapMemoryCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 2
            goto Lb2
        L48:
            java.lang.String r0 = "LocalAssetFetchProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 8
            goto Lb2
        L53:
            java.lang.String r0 = "BitmapMemoryCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 1
            goto Lb2
        L5d:
            java.lang.String r0 = "DiskCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 4
            goto Lb2
        L67:
            java.lang.String r0 = "VideoThumbnailProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 13
            goto Lb2
        L72:
            java.lang.String r0 = "NetworkFetchProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 6
            goto Lb2
        L7c:
            java.lang.String r0 = "EncodedMemoryCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 3
            goto Lb2
        L86:
            java.lang.String r0 = "LocalFileFetchProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 11
            goto Lb2
        L91:
            java.lang.String r0 = "LocalResourceFetchProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 12
            goto Lb2
        L9c:
            java.lang.String r0 = "BitmapMemoryCacheGetProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 0
            goto Lb2
        La6:
            java.lang.String r0 = "QualifiedResourceFetchProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb1
            r7 = 14
            goto Lb2
        Lb1:
            r7 = -1
        Lb2:
            switch(r7) {
                case 0: goto Lba;
                case 1: goto Lba;
                case 2: goto Lba;
                case 3: goto Lb9;
                case 4: goto Lb8;
                case 5: goto Lb8;
                case 6: goto Lb7;
                case 7: goto Lb6;
                case 8: goto Lb6;
                case 9: goto Lb6;
                case 10: goto Lb6;
                case 11: goto Lb6;
                case 12: goto Lb6;
                case 13: goto Lb6;
                case 14: goto Lb6;
                default: goto Lb5;
            }
        Lb5:
            return r1
        Lb6:
            return r2
        Lb7:
            return r3
        Lb8:
            return r4
        Lb9:
            return r5
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.b.a.i.d.a(java.lang.String):int");
    }

    public static String b(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "unknown" : "local" : "memory_bitmap" : "memory_encoded" : "disk" : "network";
    }
}
