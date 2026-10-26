package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import d.b.a.a.e.e.a1;
import d.b.a.a.e.e.b1;
import d.b.a.a.e.e.c1;
import d.b.a.a.e.e.g1;
import d.b.a.a.e.e.ta;
import d.b.a.a.e.e.y0;
import d.b.a.a.e.e.ya;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class r9 implements a6 {
    private static volatile r9 x;
    private y4 a;

    /* renamed from: b, reason: collision with root package name */
    private h4 f1881b;

    /* renamed from: c, reason: collision with root package name */
    private e f1882c;

    /* renamed from: d, reason: collision with root package name */
    private k4 f1883d;
    private n9 e;
    private ga f;
    private final v9 g;
    private o7 h;
    private final d5 i;
    private boolean j;
    private boolean k;
    private long l;
    private List<Runnable> m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private FileLock s;
    private FileChannel t;
    private List<Long> u;
    private List<Long> v;
    private long w;

    class a implements g {
        d.b.a.a.e.e.c1 a;

        /* renamed from: b, reason: collision with root package name */
        List<Long> f1884b;

        /* renamed from: c, reason: collision with root package name */
        List<d.b.a.a.e.e.y0> f1885c;

        /* renamed from: d, reason: collision with root package name */
        private long f1886d;

        private a(r9 r9Var) {
        }

        /* synthetic */ a(r9 r9Var, q9 q9Var) {
            this(r9Var);
        }

        private static long c(d.b.a.a.e.e.y0 y0Var) {
            return ((y0Var.Y() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.g
        public final void a(d.b.a.a.e.e.c1 c1Var) {
            com.google.android.gms.common.internal.q.k(c1Var);
            this.a = c1Var;
        }

        @Override // com.google.android.gms.measurement.internal.g
        public final boolean b(long j, d.b.a.a.e.e.y0 y0Var) {
            com.google.android.gms.common.internal.q.k(y0Var);
            if (this.f1885c == null) {
                this.f1885c = new ArrayList();
            }
            if (this.f1884b == null) {
                this.f1884b = new ArrayList();
            }
            if (this.f1885c.size() > 0 && c(this.f1885c.get(0)) != c(y0Var)) {
                return false;
            }
            long jC = this.f1886d + y0Var.c();
            if (jC >= Math.max(0, r.i.a(null).intValue())) {
                return false;
            }
            this.f1886d = jC;
            this.f1885c.add(y0Var);
            this.f1884b.add(Long.valueOf(j));
            return this.f1885c.size() < Math.max(1, r.j.a(null).intValue());
        }
    }

    private r9(w9 w9Var) {
        this(w9Var, null);
    }

    private r9(w9 w9Var, d5 d5Var) {
        this.j = false;
        com.google.android.gms.common.internal.q.k(w9Var);
        this.i = d5.a(w9Var.a, null, null);
        this.w = -1L;
        v9 v9Var = new v9(this);
        v9Var.t();
        this.g = v9Var;
        h4 h4Var = new h4(this);
        h4Var.t();
        this.f1881b = h4Var;
        y4 y4Var = new y4(this);
        y4Var.t();
        this.a = y4Var;
        this.i.j().z(new q9(this, w9Var));
    }

    private final boolean C(int i, FileChannel fileChannel) throws IOException {
        j0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.i.m().G().a("Bad channel to read from");
            return false;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.flip();
        try {
            fileChannel.truncate(0L);
            if (this.i.x().t(r.z0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0L);
            }
            fileChannel.write(byteBufferAllocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.i.m().G().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.i.m().G().b("Failed to write to channel", e);
            return false;
        }
    }

    private final boolean D(y0.a aVar, y0.a aVar2) {
        com.google.android.gms.common.internal.q.a("_e".equals(aVar.J()));
        Z();
        d.b.a.a.e.e.a1 a1VarZ = v9.z((d.b.a.a.e.e.y0) ((d.b.a.a.e.e.r4) aVar.i()), "_sc");
        String strV = a1VarZ == null ? null : a1VarZ.V();
        Z();
        d.b.a.a.e.e.a1 a1VarZ2 = v9.z((d.b.a.a.e.e.y0) ((d.b.a.a.e.e.r4) aVar2.i()), "_pc");
        String strV2 = a1VarZ2 != null ? a1VarZ2.V() : null;
        if (strV2 == null || !strV2.equals(strV)) {
            return false;
        }
        J(aVar, aVar2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0265 A[Catch: all -> 0x0f34, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x059b A[Catch: all -> 0x0f34, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0672 A[Catch: all -> 0x0f34, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[Catch: all -> 0x0f34, PHI: r5
      0x0086: PHI (r5v115 android.database.Cursor) = 
      (r5v5 android.database.Cursor)
      (r5v124 android.database.Cursor)
      (r5v129 android.database.Cursor)
      (r5v130 android.database.Cursor)
      (r5v130 android.database.Cursor)
      (r5v130 android.database.Cursor)
      (r5v129 android.database.Cursor)
      (r5v137 android.database.Cursor)
     binds: [B:90:0x024f, B:41:0x00dd, B:78:0x022b, B:75:0x0216, B:69:0x01f9, B:62:0x01c4, B:48:0x0123, B:22:0x0084] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0819 A[Catch: all -> 0x0f34, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08ca A[Catch: all -> 0x0f34, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0b7d A[Catch: all -> 0x0f34, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0b90  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0b93 A[Catch: all -> 0x0f34, TRY_LEAVE, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0bb7 A[Catch: all -> 0x0d6f, TRY_ENTER, TryCatch #10 {all -> 0x0d6f, blocks: (B:365:0x0a44, B:366:0x0a59, B:368:0x0a5f, B:459:0x0d30, B:387:0x0aed, B:417:0x0bb7, B:419:0x0bc3, B:421:0x0bd7, B:422:0x0c15, B:426:0x0c2e, B:428:0x0c35, B:430:0x0c46, B:432:0x0c4a, B:434:0x0c4e, B:436:0x0c52, B:437:0x0c5e, B:438:0x0c63, B:440:0x0c69, B:442:0x0c89, B:443:0x0c92, B:458:0x0d2d, B:444:0x0ca5, B:446:0x0cac, B:450:0x0cd0, B:452:0x0cfc, B:453:0x0d07, B:454:0x0d17, B:456:0x0d1d, B:447:0x0cb7, B:460:0x0d3a, B:462:0x0d47, B:463:0x0d4d, B:464:0x0d55, B:466:0x0d5b), top: B:553:0x0a44 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110 A[Catch: SQLiteException -> 0x022f, all -> 0x0f2c, TryCatch #6 {SQLiteException -> 0x022f, blocks: (B:26:0x008f, B:44:0x00e6, B:46:0x0110, B:49:0x0125, B:50:0x0129, B:51:0x013a, B:53:0x0140, B:54:0x0151, B:56:0x015d, B:58:0x0183, B:60:0x01b1, B:63:0x01c6, B:64:0x01d0, B:66:0x01da, B:72:0x020e, B:71:0x01fc, B:57:0x0174, B:77:0x0219), top: B:547:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125 A[Catch: SQLiteException -> 0x022f, all -> 0x0f2c, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x022f, blocks: (B:26:0x008f, B:44:0x00e6, B:46:0x0110, B:49:0x0125, B:50:0x0129, B:51:0x013a, B:53:0x0140, B:54:0x0151, B:56:0x015d, B:58:0x0183, B:60:0x01b1, B:63:0x01c6, B:64:0x01d0, B:66:0x01da, B:72:0x020e, B:71:0x01fc, B:57:0x0174, B:77:0x0219), top: B:547:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0f1c A[Catch: all -> 0x0f34, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0f30 A[Catch: all -> 0x0f34, TRY_ENTER, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:595:? A[Catch: all -> 0x0f34, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0257 A[Catch: all -> 0x0f34, TryCatch #4 {all -> 0x0f34, blocks: (B:3:0x000d, B:23:0x0086, B:92:0x0253, B:94:0x0257, B:100:0x0265, B:101:0x028b, B:104:0x02a3, B:107:0x02c9, B:109:0x0300, B:115:0x0316, B:117:0x0320, B:300:0x0891, B:119:0x0346, B:122:0x035e, B:151:0x03c1, B:154:0x03cb, B:156:0x03d9, B:161:0x0424, B:157:0x03f7, B:159:0x0406, B:165:0x0431, B:168:0x0468, B:170:0x0497, B:172:0x04cb, B:174:0x04d1, B:177:0x04dd, B:179:0x0512, B:180:0x052f, B:182:0x0535, B:184:0x0543, B:188:0x0557, B:185:0x054c, B:191:0x055e, B:193:0x0564, B:194:0x0580, B:196:0x059b, B:197:0x05a7, B:200:0x05b1, B:206:0x05d4, B:203:0x05c3, B:209:0x05da, B:211:0x05e6, B:213:0x05f2, B:229:0x0641, B:232:0x065e, B:234:0x0672, B:236:0x067f, B:239:0x0692, B:241:0x06a4, B:243:0x06b2, B:288:0x0819, B:290:0x0823, B:292:0x0829, B:293:0x083f, B:294:0x0843, B:296:0x0857, B:297:0x086e, B:299:0x0877, B:248:0x06d8, B:250:0x06e8, B:253:0x06fd, B:255:0x070f, B:257:0x071d, B:260:0x0730, B:262:0x0748, B:264:0x0754, B:267:0x0767, B:269:0x077b, B:271:0x07c6, B:273:0x07cd, B:275:0x07d3, B:277:0x07de, B:279:0x07e5, B:281:0x07eb, B:283:0x07f6, B:284:0x0807, B:217:0x0613, B:221:0x0627, B:223:0x062d, B:226:0x0638, B:129:0x0380, B:132:0x038a, B:135:0x0394, B:305:0x08ab, B:307:0x08b9, B:309:0x08c2, B:320:0x08f4, B:310:0x08ca, B:312:0x08d3, B:314:0x08d9, B:317:0x08e5, B:319:0x08ef, B:323:0x08fb, B:324:0x0907, B:326:0x090d, B:332:0x0926, B:333:0x0931, B:338:0x093e, B:342:0x0965, B:344:0x0984, B:346:0x0992, B:348:0x0998, B:350:0x09a2, B:351:0x09d1, B:353:0x09d7, B:355:0x09e5, B:359:0x09f0, B:356:0x09ea, B:360:0x09f3, B:362:0x0a05, B:363:0x0a08, B:371:0x0a77, B:373:0x0a93, B:374:0x0aa4, B:376:0x0aa8, B:378:0x0ab4, B:379:0x0abd, B:381:0x0ac1, B:383:0x0ac9, B:384:0x0ad8, B:385:0x0ae3, B:391:0x0b23, B:392:0x0b2b, B:394:0x0b31, B:396:0x0b43, B:398:0x0b47, B:412:0x0b7d, B:415:0x0b93, B:400:0x0b55, B:402:0x0b59, B:404:0x0b63, B:406:0x0b67, B:472:0x0d79, B:474:0x0d8b, B:475:0x0d8e, B:477:0x0da0, B:497:0x0e15, B:499:0x0e1b, B:501:0x0e30, B:504:0x0e37, B:509:0x0e6a, B:505:0x0e3f, B:507:0x0e4b, B:508:0x0e51, B:510:0x0e7b, B:511:0x0e92, B:514:0x0e9a, B:515:0x0e9f, B:516:0x0eaf, B:518:0x0ec9, B:519:0x0ee2, B:520:0x0eea, B:525:0x0f0c, B:524:0x0efb, B:478:0x0dba, B:480:0x0dc0, B:482:0x0dca, B:484:0x0dd1, B:490:0x0de1, B:492:0x0de8, B:494:0x0e07, B:496:0x0e0e, B:495:0x0e0b, B:491:0x0de5, B:483:0x0dce, B:339:0x0943, B:341:0x0949, B:528:0x0f1c, B:534:0x0f30, B:535:0x0f33), top: B:546:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0262  */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.measurement.internal.q9] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean E(java.lang.String r44, long r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.E(java.lang.String, long):boolean");
    }

    private final void F() {
        j0();
        if (this.p || this.q || this.r) {
            this.i.m().O().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r));
            return;
        }
        this.i.m().O().a("Stopping uploading service(s)");
        List<Runnable> list = this.m;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.m.clear();
    }

    private final boolean G() throws IOException {
        b4 b4VarJ;
        String str;
        FileLock fileLock;
        j0();
        if (this.i.x().t(r.m0) && (fileLock = this.s) != null && fileLock.isValid()) {
            this.i.m().O().a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.i.f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.t = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.s = fileLockTryLock;
            if (fileLockTryLock != null) {
                this.i.m().O().a("Storage concurrent access okay");
                return true;
            }
            this.i.m().G().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            b4VarJ = this.i.m().G();
            str = "Failed to acquire storage lock";
            b4VarJ.b(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            b4VarJ = this.i.m().G();
            str = "Failed to access storage lock file";
            b4VarJ.b(str, e);
            return false;
        } catch (OverlappingFileLockException e3) {
            e = e3;
            b4VarJ = this.i.m().J();
            str = "Storage lock already acquired";
            b4VarJ.b(str, e);
            return false;
        }
    }

    private final Boolean I(f4 f4Var) {
        try {
            if (f4Var.V() != -2147483648L) {
                if (f4Var.V() == d.b.a.a.c.n.c.a(this.i.f()).e(f4Var.t(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = d.b.a.a.c.n.c.a(this.i.f()).e(f4Var.t(), 0).versionName;
                if (f4Var.T() != null && f4Var.T().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void J(y0.a aVar, y0.a aVar2) {
        com.google.android.gms.common.internal.q.a("_e".equals(aVar.J()));
        Z();
        d.b.a.a.e.e.a1 a1VarZ = v9.z((d.b.a.a.e.e.y0) ((d.b.a.a.e.e.r4) aVar.i()), "_et");
        if (!a1VarZ.Y() || a1VarZ.Z() <= 0) {
            return;
        }
        long jZ = a1VarZ.Z();
        Z();
        d.b.a.a.e.e.a1 a1VarZ2 = v9.z((d.b.a.a.e.e.y0) ((d.b.a.a.e.e.r4) aVar2.i()), "_et");
        if (a1VarZ2 != null && a1VarZ2.Z() > 0) {
            jZ += a1VarZ2.Z();
        }
        Z().I(aVar2, "_et", Long.valueOf(jZ));
        Z().I(aVar, "_fr", 1L);
    }

    private final void K(p pVar, fa faVar) {
        if (ya.b() && this.i.x().t(r.O0)) {
            d4 d4VarB = d4.b(pVar);
            this.i.G().M(d4VarB.f1663d, V().B0(faVar.f1702b));
            this.i.G().V(d4VarB, this.i.x().o(faVar.f1702b));
            pVar = d4VarB.a();
        }
        p(pVar, faVar);
    }

    private static void L(o9 o9Var) {
        if (o9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (o9Var.r()) {
            return;
        }
        String strValueOf = String.valueOf(o9Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031b A[Catch: all -> 0x093e, TRY_LEAVE, TryCatch #2 {all -> 0x093e, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:73:0x01c4, B:75:0x01ce, B:77:0x01dc, B:82:0x020d, B:84:0x0213, B:86:0x0221, B:88:0x022d, B:90:0x0237, B:92:0x0242, B:95:0x0249, B:104:0x02da, B:106:0x02e4, B:110:0x031b, B:114:0x032d, B:116:0x0341, B:118:0x0351, B:120:0x0362, B:122:0x0394, B:124:0x0399, B:125:0x03b2, B:129:0x03c3, B:131:0x03d7, B:133:0x03dc, B:134:0x03f5, B:138:0x0418, B:142:0x043d, B:143:0x0456, B:146:0x0465, B:149:0x0488, B:150:0x04a4, B:152:0x04ae, B:154:0x04ba, B:156:0x04c0, B:157:0x04cb, B:159:0x04d7, B:160:0x04ee, B:162:0x0515, B:165:0x052e, B:168:0x0572, B:170:0x059a, B:172:0x05d2, B:173:0x05d7, B:175:0x05df, B:176:0x05e4, B:178:0x05ec, B:179:0x05f1, B:181:0x05fa, B:182:0x0600, B:184:0x060d, B:185:0x0612, B:187:0x0618, B:189:0x0628, B:191:0x0632, B:193:0x063a, B:194:0x063f, B:196:0x0649, B:198:0x0653, B:200:0x065b, B:201:0x065d, B:207:0x0676, B:209:0x067e, B:210:0x0683, B:212:0x0698, B:214:0x06a2, B:215:0x06a5, B:217:0x06b3, B:219:0x06bd, B:221:0x06c1, B:223:0x06cc, B:235:0x073a, B:237:0x077f, B:238:0x0784, B:240:0x078c, B:242:0x0795, B:243:0x079a, B:245:0x07a6, B:247:0x080a, B:248:0x080f, B:249:0x081b, B:251:0x0825, B:252:0x082c, B:254:0x0836, B:255:0x083d, B:256:0x0848, B:258:0x084e, B:260:0x087d, B:261:0x088d, B:263:0x0895, B:264:0x089b, B:266:0x08a1, B:275:0x08e9, B:277:0x08ef, B:280:0x090b, B:269:0x08af, B:271:0x08d4, B:279:0x08f3, B:224:0x06d8, B:226:0x06ea, B:228:0x06ee, B:230:0x0700, B:234:0x0737, B:231:0x071a, B:233:0x0720, B:202:0x0661, B:204:0x066b, B:206:0x0673, B:169:0x058c, B:97:0x0273, B:98:0x0291, B:103:0x02bf, B:102:0x02ae, B:89:0x0232, B:80:0x01e6, B:81:0x0203), top: B:291:0x0135, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x08ef A[Catch: all -> 0x093e, TryCatch #2 {all -> 0x093e, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:73:0x01c4, B:75:0x01ce, B:77:0x01dc, B:82:0x020d, B:84:0x0213, B:86:0x0221, B:88:0x022d, B:90:0x0237, B:92:0x0242, B:95:0x0249, B:104:0x02da, B:106:0x02e4, B:110:0x031b, B:114:0x032d, B:116:0x0341, B:118:0x0351, B:120:0x0362, B:122:0x0394, B:124:0x0399, B:125:0x03b2, B:129:0x03c3, B:131:0x03d7, B:133:0x03dc, B:134:0x03f5, B:138:0x0418, B:142:0x043d, B:143:0x0456, B:146:0x0465, B:149:0x0488, B:150:0x04a4, B:152:0x04ae, B:154:0x04ba, B:156:0x04c0, B:157:0x04cb, B:159:0x04d7, B:160:0x04ee, B:162:0x0515, B:165:0x052e, B:168:0x0572, B:170:0x059a, B:172:0x05d2, B:173:0x05d7, B:175:0x05df, B:176:0x05e4, B:178:0x05ec, B:179:0x05f1, B:181:0x05fa, B:182:0x0600, B:184:0x060d, B:185:0x0612, B:187:0x0618, B:189:0x0628, B:191:0x0632, B:193:0x063a, B:194:0x063f, B:196:0x0649, B:198:0x0653, B:200:0x065b, B:201:0x065d, B:207:0x0676, B:209:0x067e, B:210:0x0683, B:212:0x0698, B:214:0x06a2, B:215:0x06a5, B:217:0x06b3, B:219:0x06bd, B:221:0x06c1, B:223:0x06cc, B:235:0x073a, B:237:0x077f, B:238:0x0784, B:240:0x078c, B:242:0x0795, B:243:0x079a, B:245:0x07a6, B:247:0x080a, B:248:0x080f, B:249:0x081b, B:251:0x0825, B:252:0x082c, B:254:0x0836, B:255:0x083d, B:256:0x0848, B:258:0x084e, B:260:0x087d, B:261:0x088d, B:263:0x0895, B:264:0x089b, B:266:0x08a1, B:275:0x08e9, B:277:0x08ef, B:280:0x090b, B:269:0x08af, B:271:0x08d4, B:279:0x08f3, B:224:0x06d8, B:226:0x06ea, B:228:0x06ee, B:230:0x0700, B:234:0x0737, B:231:0x071a, B:233:0x0720, B:202:0x0661, B:204:0x066b, B:206:0x0673, B:169:0x058c, B:97:0x0273, B:98:0x0291, B:103:0x02bf, B:102:0x02ae, B:89:0x0232, B:80:0x01e6, B:81:0x0203), top: B:291:0x0135, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void S(com.google.android.gms.measurement.internal.p r27, com.google.android.gms.measurement.internal.fa r28) {
        /*
            Method dump skipped, instructions count: 2378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.S(com.google.android.gms.measurement.internal.p, com.google.android.gms.measurement.internal.fa):void");
    }

    private final boolean W(fa faVar) {
        return (ta.b() && this.i.x().C(faVar.f1702b, r.o0)) ? (TextUtils.isEmpty(faVar.f1703c) && TextUtils.isEmpty(faVar.w) && TextUtils.isEmpty(faVar.s)) ? false : true : (TextUtils.isEmpty(faVar.f1703c) && TextUtils.isEmpty(faVar.s)) ? false : true;
    }

    private final int a(FileChannel fileChannel) throws IOException {
        j0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.i.m().G().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int i = fileChannel.read(byteBufferAllocate);
            if (i == 4) {
                byteBufferAllocate.flip();
                return byteBufferAllocate.getInt();
            }
            if (i != -1) {
                this.i.m().J().b("Unexpected data length. Bytes read", Integer.valueOf(i));
            }
            return 0;
        } catch (IOException e) {
            this.i.m().G().b("Failed to read from channel", e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.f4 b(com.google.android.gms.measurement.internal.fa r9, com.google.android.gms.measurement.internal.f4 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.b(com.google.android.gms.measurement.internal.fa, com.google.android.gms.measurement.internal.f4, java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    public static r9 c(Context context) {
        com.google.android.gms.common.internal.q.k(context);
        com.google.android.gms.common.internal.q.k(context.getApplicationContext());
        if (x == null) {
            synchronized (r9.class) {
                if (x == null) {
                    x = new r9(new w9(context));
                }
            }
        }
        return x;
    }

    private final fa d(String str) {
        f4 f4VarJ0 = V().j0(str);
        if (f4VarJ0 == null || TextUtils.isEmpty(f4VarJ0.T())) {
            this.i.m().N().b("No app data available; dropping", str);
            return null;
        }
        Boolean boolI = I(f4VarJ0);
        if (boolI == null || boolI.booleanValue()) {
            return new fa(str, f4VarJ0.A(), f4VarJ0.T(), f4VarJ0.V(), f4VarJ0.X(), f4VarJ0.Z(), f4VarJ0.b0(), (String) null, f4VarJ0.e0(), false, f4VarJ0.M(), f4VarJ0.k(), 0L, 0, f4VarJ0.l(), f4VarJ0.m(), false, f4VarJ0.D(), f4VarJ0.n(), f4VarJ0.d0(), f4VarJ0.o(), (ta.b() && this.i.x().C(str, r.o0)) ? f4VarJ0.G() : null);
        }
        this.i.m().G().b("App version does not match; dropping. appId", z3.x(str));
        return null;
    }

    private final k4 h0() {
        k4 k4Var = this.f1883d;
        if (k4Var != null) {
            return k4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private static void i(y0.a aVar, int i, String str) {
        List<d.b.a.a.e.e.a1> listE = aVar.E();
        for (int i2 = 0; i2 < listE.size(); i2++) {
            if ("_err".equals(listE.get(i2).P())) {
                return;
            }
        }
        a1.a aVarG0 = d.b.a.a.e.e.a1.g0();
        aVarG0.B("_err");
        aVarG0.y(Long.valueOf(i).longValue());
        d.b.a.a.e.e.a1 a1Var = (d.b.a.a.e.e.a1) ((d.b.a.a.e.e.r4) aVarG0.i());
        a1.a aVarG02 = d.b.a.a.e.e.a1.g0();
        aVarG02.B("_ev");
        aVarG02.D(str);
        d.b.a.a.e.e.a1 a1Var2 = (d.b.a.a.e.e.a1) ((d.b.a.a.e.e.r4) aVarG02.i());
        aVar.A(a1Var);
        aVar.A(a1Var2);
    }

    private final n9 i0() {
        L(this.e);
        return this.e;
    }

    private final void j0() {
        this.i.j().c();
    }

    private final long k0() {
        long jA = this.i.k().a();
        m4 m4VarA = this.i.A();
        m4VarA.p();
        m4VarA.c();
        long jA2 = m4VarA.i.a();
        if (jA2 == 0) {
            jA2 = 1 + m4VarA.g().H0().nextInt(86400000);
            m4VarA.i.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    private static void l(y0.a aVar, String str) {
        List<d.b.a.a.e.e.a1> listE = aVar.E();
        for (int i = 0; i < listE.size(); i++) {
            if (str.equals(listE.get(i).P())) {
                aVar.G(i);
                return;
            }
        }
    }

    private final boolean l0() {
        j0();
        c0();
        return V().G0() || !TextUtils.isEmpty(V().x());
    }

    private final void m0() {
        s3<Long> s3Var;
        long jMax;
        j0();
        c0();
        if (this.l > 0) {
            long jAbs = 3600000 - Math.abs(this.i.k().b() - this.l);
            if (jAbs > 0) {
                this.i.m().O().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                h0().c();
                i0().w();
                return;
            }
            this.l = 0L;
        }
        if (!this.i.u() || !l0()) {
            this.i.m().O().a("Nothing to upload or uploading impossible");
            h0().c();
            i0().w();
            return;
        }
        long jA = this.i.k().a();
        long jMax2 = Math.max(0L, r.A.a(null).longValue());
        boolean z = V().H0() || V().C0();
        if (z) {
            String strP = this.i.x().P();
            s3Var = (TextUtils.isEmpty(strP) || ".none.".equals(strP)) ? r.u : r.v;
        } else {
            s3Var = r.t;
        }
        long jMax3 = Math.max(0L, s3Var.a(null).longValue());
        long jA2 = this.i.A().e.a();
        long jA3 = this.i.A().f.a();
        long jMax4 = Math.max(V().E0(), V().F0());
        if (jMax4 == 0) {
            jMax = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = jA - Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            long jMax5 = Math.max(jAbs3, jAbs4);
            jMax = jAbs2 + jMax2;
            if (z && jMax5 > 0) {
                jMax = Math.min(jAbs2, jMax5) + jMax3;
            }
            if (!Z().R(jMax5, jMax3)) {
                jMax = jMax5 + jMax3;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                for (int i = 0; i < Math.min(20, Math.max(0, r.C.a(null).intValue())); i++) {
                    jMax += Math.max(0L, r.B.a(null).longValue()) * (1 << i);
                    if (jMax > jAbs4) {
                        break;
                    }
                }
                jMax = 0;
            }
        }
        if (jMax == 0) {
            this.i.m().O().a("Next upload time is 0");
            h0().c();
            i0().w();
            return;
        }
        if (!T().y()) {
            this.i.m().O().a("No network");
            h0().b();
            i0().w();
            return;
        }
        long jA4 = this.i.A().g.a();
        long jMax6 = Math.max(0L, r.r.a(null).longValue());
        if (!Z().R(jA4, jMax6)) {
            jMax = Math.max(jMax, jA4 + jMax6);
        }
        h0().c();
        long jA5 = jMax - this.i.k().a();
        if (jA5 <= 0) {
            jA5 = Math.max(0L, r.w.a(null).longValue());
            this.i.A().e.b(this.i.k().a());
        }
        this.i.m().O().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        i0().v(jA5);
    }

    private static void n(c1.a aVar) {
        aVar.J(Long.MAX_VALUE);
        aVar.O(Long.MIN_VALUE);
        for (int i = 0; i < aVar.H(); i++) {
            d.b.a.a.e.e.y0 y0VarI = aVar.I(i);
            if (y0VarI.Y() < aVar.a0()) {
                aVar.J(y0VarI.Y());
            }
            if (y0VarI.Y() > aVar.e0()) {
                aVar.O(y0VarI.Y());
            }
        }
    }

    private final void o(c1.a aVar, long j, boolean z) {
        String str = z ? "_se" : "_lte";
        aa aaVarO0 = V().o0(aVar.s0(), str);
        aa aaVar = (aaVarO0 == null || aaVarO0.e == null) ? new aa(aVar.s0(), "auto", str, this.i.k().a(), Long.valueOf(j)) : new aa(aVar.s0(), "auto", str, this.i.k().a(), Long.valueOf(((Long) aaVarO0.e).longValue() + j));
        g1.a aVarA0 = d.b.a.a.e.e.g1.a0();
        aVarA0.z(str);
        aVarA0.y(this.i.k().a());
        aVarA0.B(((Long) aaVar.e).longValue());
        d.b.a.a.e.e.g1 g1Var = (d.b.a.a.e.e.g1) ((d.b.a.a.e.e.r4) aVarA0.i());
        boolean z2 = false;
        int iV = v9.v(aVar, str);
        if (iV >= 0) {
            aVar.y(iV, g1Var);
            z2 = true;
        }
        if (!z2) {
            aVar.C(g1Var);
        }
        if (j > 0) {
            V().S(aaVar);
            this.i.m().O().c("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", aaVar.e);
        }
    }

    private final void r(f4 f4Var) {
        b.d.a aVar;
        j0();
        if (ta.b() && this.i.x().C(f4Var.t(), r.o0)) {
            if (TextUtils.isEmpty(f4Var.A()) && TextUtils.isEmpty(f4Var.G()) && TextUtils.isEmpty(f4Var.D())) {
                A(f4Var.t(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(f4Var.A()) && TextUtils.isEmpty(f4Var.D())) {
            A(f4Var.t(), 204, null, null, null);
            return;
        }
        String strR = this.i.x().r(f4Var);
        try {
            URL url = new URL(strR);
            this.i.m().O().b("Fetching remote configuration", f4Var.t());
            d.b.a.a.e.e.r0 r0VarV = R().v(f4Var.t());
            String strA = R().A(f4Var.t());
            if (r0VarV == null || TextUtils.isEmpty(strA)) {
                aVar = null;
            } else {
                b.d.a aVar2 = new b.d.a();
                aVar2.put("If-Modified-Since", strA);
                aVar = aVar2;
            }
            this.p = true;
            h4 h4VarT = T();
            String strT = f4Var.t();
            s9 s9Var = new s9(this);
            h4VarT.c();
            h4VarT.s();
            com.google.android.gms.common.internal.q.k(url);
            com.google.android.gms.common.internal.q.k(s9Var);
            h4VarT.j().C(new l4(h4VarT, strT, url, null, aVar, s9Var));
        } catch (MalformedURLException unused) {
            this.i.m().G().c("Failed to parse config URL. Not fetching. appId", z3.x(f4Var.t()), strR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(w9 w9Var) {
        this.i.j().c();
        e eVar = new e(this);
        eVar.t();
        this.f1882c = eVar;
        this.i.x().s(this.a);
        ga gaVar = new ga(this);
        gaVar.t();
        this.f = gaVar;
        o7 o7Var = new o7(this);
        o7Var.t();
        this.h = o7Var;
        n9 n9Var = new n9(this);
        n9Var.t();
        this.e = n9Var;
        this.f1883d = new k4(this);
        if (this.n != this.o) {
            this.i.m().G().c("Not all upload components initialized", Integer.valueOf(this.n), Integer.valueOf(this.o));
        }
        this.j = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0132 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:6:0x0029, B:15:0x0045, B:62:0x016d, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x011c, B:55:0x0132, B:57:0x015a, B:59:0x0164, B:61:0x016a, B:56:0x0142, B:47:0x0103, B:49:0x010d), top: B:72:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:6:0x0029, B:15:0x0045, B:62:0x016d, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x011c, B:55:0x0132, B:57:0x015a, B:59:0x0164, B:61:0x016a, B:56:0x0142, B:47:0x0103, B:49:0x010d), top: B:72:0x0029, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void A(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    final void B(boolean z) {
        m0();
    }

    public final qa H() {
        return this.i.x();
    }

    final void M(y9 y9Var, fa faVar) {
        j0();
        c0();
        if (W(faVar)) {
            if (!faVar.i) {
                Q(faVar);
                return;
            }
            if ("_npa".equals(y9Var.f1965c) && faVar.t != null) {
                this.i.m().N().a("Falling back to manifest metadata value for ad personalization");
                v(new y9("_npa", this.i.k().a(), Long.valueOf(faVar.t.booleanValue() ? 1L : 0L), "auto"), faVar);
                return;
            }
            this.i.m().N().b("Removing user property", this.i.H().A(y9Var.f1965c));
            V().v0();
            try {
                Q(faVar);
                V().l0(faVar.f1702b, y9Var.f1965c);
                V().v();
                this.i.m().N().b("User property removed", this.i.H().A(y9Var.f1965c));
            } finally {
                V().A0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x044e A[Catch: all -> 0x04ae, TryCatch #3 {all -> 0x04ae, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01a4, B:54:0x01b7, B:57:0x01cb, B:59:0x01d6, B:64:0x01e5, B:66:0x01ed, B:68:0x01f3, B:72:0x0202, B:74:0x0205, B:76:0x0229, B:78:0x022e, B:79:0x0236, B:85:0x024a, B:88:0x025e, B:90:0x0281, B:91:0x028f, B:93:0x02c2, B:95:0x02ca, B:97:0x02ce, B:98:0x02d1, B:100:0x02f2, B:140:0x03cc, B:141:0x03cf, B:142:0x03e0, B:153:0x043e, B:155:0x044e, B:157:0x0468, B:158:0x046f, B:159:0x0480, B:163:0x049f, B:102:0x030b, B:107:0x0336, B:109:0x033e, B:111:0x0348, B:116:0x035e, B:120:0x0368, B:124:0x0373, B:127:0x0385, B:132:0x03b0, B:134:0x03b6, B:135:0x03bb, B:137:0x03c1, B:130:0x0398, B:105:0x031e, B:145:0x03e7, B:147:0x041d, B:149:0x0425, B:151:0x0429, B:152:0x042c, B:160:0x0484, B:162:0x0488, B:82:0x023e, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:176:0x009f, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0484 A[Catch: all -> 0x04ae, TryCatch #3 {all -> 0x04ae, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01a4, B:54:0x01b7, B:57:0x01cb, B:59:0x01d6, B:64:0x01e5, B:66:0x01ed, B:68:0x01f3, B:72:0x0202, B:74:0x0205, B:76:0x0229, B:78:0x022e, B:79:0x0236, B:85:0x024a, B:88:0x025e, B:90:0x0281, B:91:0x028f, B:93:0x02c2, B:95:0x02ca, B:97:0x02ce, B:98:0x02d1, B:100:0x02f2, B:140:0x03cc, B:141:0x03cf, B:142:0x03e0, B:153:0x043e, B:155:0x044e, B:157:0x0468, B:158:0x046f, B:159:0x0480, B:163:0x049f, B:102:0x030b, B:107:0x0336, B:109:0x033e, B:111:0x0348, B:116:0x035e, B:120:0x0368, B:124:0x0373, B:127:0x0385, B:132:0x03b0, B:134:0x03b6, B:135:0x03bb, B:137:0x03c1, B:130:0x0398, B:105:0x031e, B:145:0x03e7, B:147:0x041d, B:149:0x0425, B:151:0x0429, B:152:0x042c, B:160:0x0484, B:162:0x0488, B:82:0x023e, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:176:0x009f, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0205 A[Catch: all -> 0x04ae, TryCatch #3 {all -> 0x04ae, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01a4, B:54:0x01b7, B:57:0x01cb, B:59:0x01d6, B:64:0x01e5, B:66:0x01ed, B:68:0x01f3, B:72:0x0202, B:74:0x0205, B:76:0x0229, B:78:0x022e, B:79:0x0236, B:85:0x024a, B:88:0x025e, B:90:0x0281, B:91:0x028f, B:93:0x02c2, B:95:0x02ca, B:97:0x02ce, B:98:0x02d1, B:100:0x02f2, B:140:0x03cc, B:141:0x03cf, B:142:0x03e0, B:153:0x043e, B:155:0x044e, B:157:0x0468, B:158:0x046f, B:159:0x0480, B:163:0x049f, B:102:0x030b, B:107:0x0336, B:109:0x033e, B:111:0x0348, B:116:0x035e, B:120:0x0368, B:124:0x0373, B:127:0x0385, B:132:0x03b0, B:134:0x03b6, B:135:0x03bb, B:137:0x03c1, B:130:0x0398, B:105:0x031e, B:145:0x03e7, B:147:0x041d, B:149:0x0425, B:151:0x0429, B:152:0x042c, B:160:0x0484, B:162:0x0488, B:82:0x023e, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:176:0x009f, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a A[Catch: all -> 0x04ae, TRY_LEAVE, TryCatch #3 {all -> 0x04ae, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01a4, B:54:0x01b7, B:57:0x01cb, B:59:0x01d6, B:64:0x01e5, B:66:0x01ed, B:68:0x01f3, B:72:0x0202, B:74:0x0205, B:76:0x0229, B:78:0x022e, B:79:0x0236, B:85:0x024a, B:88:0x025e, B:90:0x0281, B:91:0x028f, B:93:0x02c2, B:95:0x02ca, B:97:0x02ce, B:98:0x02d1, B:100:0x02f2, B:140:0x03cc, B:141:0x03cf, B:142:0x03e0, B:153:0x043e, B:155:0x044e, B:157:0x0468, B:158:0x046f, B:159:0x0480, B:163:0x049f, B:102:0x030b, B:107:0x0336, B:109:0x033e, B:111:0x0348, B:116:0x035e, B:120:0x0368, B:124:0x0373, B:127:0x0385, B:132:0x03b0, B:134:0x03b6, B:135:0x03bb, B:137:0x03c1, B:130:0x0398, B:105:0x031e, B:145:0x03e7, B:147:0x041d, B:149:0x0425, B:151:0x0429, B:152:0x042c, B:160:0x0484, B:162:0x0488, B:82:0x023e, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:176:0x009f, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void N(com.google.android.gms.measurement.internal.fa r22) {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.N(com.google.android.gms.measurement.internal.fa):void");
    }

    final void O(oa oaVar) {
        fa faVarD = d(oaVar.f1829b);
        if (faVarD != null) {
            P(oaVar, faVarD);
        }
    }

    final void P(oa oaVar, fa faVar) {
        com.google.android.gms.common.internal.q.k(oaVar);
        com.google.android.gms.common.internal.q.g(oaVar.f1829b);
        com.google.android.gms.common.internal.q.k(oaVar.f1831d);
        com.google.android.gms.common.internal.q.g(oaVar.f1831d.f1965c);
        j0();
        c0();
        if (W(faVar)) {
            if (!faVar.i) {
                Q(faVar);
                return;
            }
            V().v0();
            try {
                Q(faVar);
                oa oaVarP0 = V().p0(oaVar.f1829b, oaVar.f1831d.f1965c);
                if (oaVarP0 != null) {
                    this.i.m().N().c("Removing conditional user property", oaVar.f1829b, this.i.H().A(oaVar.f1831d.f1965c));
                    V().r0(oaVar.f1829b, oaVar.f1831d.f1965c);
                    if (oaVarP0.f) {
                        V().l0(oaVar.f1829b, oaVar.f1831d.f1965c);
                    }
                    if (oaVar.l != null) {
                        S(this.i.G().E(oaVar.f1829b, oaVar.l.f1832b, oaVar.l.f1833c != null ? oaVar.l.f1833c.l() : null, oaVarP0.f1830c, oaVar.l.e, true, false), faVar);
                    }
                } else {
                    this.i.m().J().c("Conditional user property doesn't exist", z3.x(oaVar.f1829b), this.i.H().A(oaVar.f1831d.f1965c));
                }
                V().v();
            } finally {
                V().A0();
            }
        }
    }

    final f4 Q(fa faVar) {
        j0();
        c0();
        com.google.android.gms.common.internal.q.k(faVar);
        com.google.android.gms.common.internal.q.g(faVar.f1702b);
        f4 f4VarJ0 = V().j0(faVar.f1702b);
        String strX = this.i.A().x(faVar.f1702b);
        if (!d.b.a.a.e.e.fa.b() || !this.i.x().t(r.u0)) {
            return b(faVar, f4VarJ0, strX);
        }
        if (f4VarJ0 == null) {
            f4VarJ0 = new f4(this.i, faVar.f1702b);
            f4VarJ0.c(this.i.G().N0());
            f4VarJ0.C(strX);
        } else if (!strX.equals(f4VarJ0.J())) {
            f4VarJ0.C(strX);
            f4VarJ0.c(this.i.G().N0());
        }
        f4VarJ0.r(faVar.f1703c);
        f4VarJ0.v(faVar.s);
        if (ta.b() && this.i.x().C(f4VarJ0.t(), r.o0)) {
            f4VarJ0.z(faVar.w);
        }
        if (!TextUtils.isEmpty(faVar.l)) {
            f4VarJ0.F(faVar.l);
        }
        long j = faVar.f;
        if (j != 0) {
            f4VarJ0.y(j);
        }
        if (!TextUtils.isEmpty(faVar.f1704d)) {
            f4VarJ0.I(faVar.f1704d);
        }
        f4VarJ0.u(faVar.k);
        String str = faVar.e;
        if (str != null) {
            f4VarJ0.L(str);
        }
        f4VarJ0.B(faVar.g);
        f4VarJ0.e(faVar.i);
        if (!TextUtils.isEmpty(faVar.h)) {
            f4VarJ0.O(faVar.h);
        }
        if (!this.i.x().t(r.M0)) {
            f4VarJ0.c0(faVar.m);
        }
        f4VarJ0.s(faVar.p);
        f4VarJ0.w(faVar.q);
        f4VarJ0.b(faVar.t);
        f4VarJ0.E(faVar.u);
        if (f4VarJ0.f()) {
            V().N(f4VarJ0);
        }
        return f4VarJ0;
    }

    public final y4 R() {
        L(this.a);
        return this.a;
    }

    public final h4 T() {
        L(this.f1881b);
        return this.f1881b;
    }

    final String U(fa faVar) {
        try {
            return (String) this.i.j().w(new u9(this, faVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.i.m().G().c("Failed to get app instance id. appId", z3.x(faVar.f1702b), e);
            return null;
        }
    }

    public final e V() {
        L(this.f1882c);
        return this.f1882c;
    }

    public final ga X() {
        L(this.f);
        return this.f;
    }

    public final o7 Y() {
        L(this.h);
        return this.h;
    }

    public final v9 Z() {
        L(this.g);
        return this.g;
    }

    public final x3 a0() {
        return this.i.H();
    }

    public final z9 b0() {
        return this.i.G();
    }

    final void c0() {
        if (!this.j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void d0() {
        f4 f4VarJ0;
        String strB0;
        b4 b4VarO;
        String str;
        j0();
        c0();
        this.r = true;
        try {
            this.i.h();
            Boolean boolB0 = this.i.P().b0();
            if (boolB0 == null) {
                b4VarO = this.i.m().J();
                str = "Upload data called on the client side before use of service was decided";
            } else {
                if (!boolB0.booleanValue()) {
                    if (this.l > 0) {
                        m0();
                    } else {
                        j0();
                        if (this.u != null) {
                            b4VarO = this.i.m().O();
                            str = "Uploading requested multiple times";
                        } else if (T().y()) {
                            long jA = this.i.k().a();
                            int iV = this.i.x().v(null, r.Q);
                            long jO = jA - qa.O();
                            for (int i = 0; i < iV && E(null, jO); i++) {
                            }
                            long jA2 = this.i.A().e.a();
                            if (jA2 != 0) {
                                this.i.m().N().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jA - jA2)));
                            }
                            String strX = V().x();
                            if (TextUtils.isEmpty(strX)) {
                                this.w = -1L;
                                String strG = V().G(jA - qa.O());
                                if (!TextUtils.isEmpty(strG) && (f4VarJ0 = V().j0(strG)) != null) {
                                    r(f4VarJ0);
                                }
                            } else {
                                if (this.w == -1) {
                                    this.w = V().Y();
                                }
                                List<Pair<d.b.a.a.e.e.c1, Long>> listI = V().I(strX, this.i.x().v(strX, r.g), Math.max(0, this.i.x().v(strX, r.h)));
                                if (!listI.isEmpty()) {
                                    Iterator<Pair<d.b.a.a.e.e.c1, Long>> it = listI.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            strB0 = null;
                                            break;
                                        }
                                        d.b.a.a.e.e.c1 c1Var = (d.b.a.a.e.e.c1) it.next().first;
                                        if (!TextUtils.isEmpty(c1Var.b0())) {
                                            strB0 = c1Var.b0();
                                            break;
                                        }
                                    }
                                    if (strB0 != null) {
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= listI.size()) {
                                                break;
                                            }
                                            d.b.a.a.e.e.c1 c1Var2 = (d.b.a.a.e.e.c1) listI.get(i2).first;
                                            if (!TextUtils.isEmpty(c1Var2.b0()) && !c1Var2.b0().equals(strB0)) {
                                                listI = listI.subList(0, i2);
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                    b1.a aVarI = d.b.a.a.e.e.b1.I();
                                    int size = listI.size();
                                    ArrayList arrayList = new ArrayList(listI.size());
                                    boolean zG = this.i.x().G(strX);
                                    for (int i3 = 0; i3 < size; i3++) {
                                        c1.a aVarA = ((d.b.a.a.e.e.c1) listI.get(i3).first).A();
                                        arrayList.add((Long) listI.get(i3).second);
                                        aVarA.g0(this.i.x().D());
                                        aVarA.z(jA);
                                        this.i.h();
                                        aVarA.L(false);
                                        if (!zG) {
                                            aVarA.B0();
                                        }
                                        if (this.i.x().C(strX, r.Z)) {
                                            aVarA.w0(Z().w(((d.b.a.a.e.e.c1) ((d.b.a.a.e.e.r4) aVarA.i())).n()));
                                        }
                                        aVarI.w(aVarA);
                                    }
                                    String strD = this.i.m().C(2) ? Z().D((d.b.a.a.e.e.b1) ((d.b.a.a.e.e.r4) aVarI.i())) : null;
                                    Z();
                                    byte[] bArrN = ((d.b.a.a.e.e.b1) ((d.b.a.a.e.e.r4) aVarI.i())).n();
                                    String strA = r.q.a(null);
                                    try {
                                        URL url = new URL(strA);
                                        com.google.android.gms.common.internal.q.a(!arrayList.isEmpty());
                                        if (this.u != null) {
                                            this.i.m().G().a("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.u = new ArrayList(arrayList);
                                        }
                                        this.i.A().f.b(jA);
                                        this.i.m().O().d("Uploading data. app, uncompressed size, data", size > 0 ? aVarI.x(0).I2() : "?", Integer.valueOf(bArrN.length), strD);
                                        this.q = true;
                                        h4 h4VarT = T();
                                        t9 t9Var = new t9(this, strX);
                                        h4VarT.c();
                                        h4VarT.s();
                                        com.google.android.gms.common.internal.q.k(url);
                                        com.google.android.gms.common.internal.q.k(bArrN);
                                        com.google.android.gms.common.internal.q.k(t9Var);
                                        h4VarT.j().C(new l4(h4VarT, strX, url, bArrN, null, t9Var));
                                    } catch (MalformedURLException unused) {
                                        this.i.m().G().c("Failed to parse upload URL. Not uploading. appId", z3.x(strX), strA);
                                    }
                                }
                            }
                        } else {
                            this.i.m().O().a("Network not connected, ignoring upload request");
                            m0();
                        }
                    }
                }
                b4VarO = this.i.m().G();
                str = "Upload called in the client side when service should be used";
            }
            b4VarO.a(str);
        } finally {
            this.r = false;
            F();
        }
    }

    protected final void e() {
        this.i.j().c();
        V().D0();
        if (this.i.A().e.a() == 0) {
            this.i.A().e.b(this.i.k().a());
        }
        m0();
    }

    final void e0() {
        b4 b4VarG;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        j0();
        c0();
        if (this.k) {
            return;
        }
        this.k = true;
        if (G()) {
            int iA = a(this.t);
            int iH = this.i.R().H();
            j0();
            if (iA > iH) {
                b4VarG = this.i.m().G();
                numValueOf = Integer.valueOf(iA);
                numValueOf2 = Integer.valueOf(iH);
                str = "Panic: can't downgrade version. Previous, current version";
            } else {
                if (iA >= iH) {
                    return;
                }
                if (C(iH, this.t)) {
                    b4VarG = this.i.m().O();
                    numValueOf = Integer.valueOf(iA);
                    numValueOf2 = Integer.valueOf(iH);
                    str = "Storage version upgraded. Previous, current version";
                } else {
                    b4VarG = this.i.m().G();
                    numValueOf = Integer.valueOf(iA);
                    numValueOf2 = Integer.valueOf(iH);
                    str = "Storage version upgrade failed. Previous, current version";
                }
            }
            b4VarG.c(str, numValueOf, numValueOf2);
        }
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final Context f() {
        return this.i.f();
    }

    final void f0() {
        this.o++;
    }

    final void g(int i, Throwable th, byte[] bArr, String str) {
        e eVarV;
        long jLongValue;
        j0();
        c0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.q = false;
                F();
            }
        }
        List<Long> list = this.u;
        this.u = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.i.A().e.b(this.i.k().a());
                this.i.A().f.b(0L);
                m0();
                this.i.m().O().c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                V().v0();
                try {
                    for (Long l : list) {
                        try {
                            eVarV = V();
                            jLongValue = l.longValue();
                            eVarV.c();
                            eVarV.s();
                            try {
                            } catch (SQLiteException e) {
                                eVarV.m().G().b("Failed to delete a bundle in a queue table", e);
                                throw e;
                            }
                        } catch (SQLiteException e2) {
                            if (this.v == null || !this.v.contains(l)) {
                                throw e2;
                            }
                        }
                        if (eVarV.w().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    }
                    V().v();
                    V().A0();
                    this.v = null;
                    if (T().y() && l0()) {
                        d0();
                    } else {
                        this.w = -1L;
                        m0();
                    }
                    this.l = 0L;
                } catch (Throwable th2) {
                    V().A0();
                    throw th2;
                }
            } catch (SQLiteException e3) {
                this.i.m().G().b("Database error while trying to delete uploaded bundles", e3);
                this.l = this.i.k().b();
                this.i.m().O().b("Disable upload, time", Long.valueOf(this.l));
            }
        } else {
            this.i.m().O().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.i.A().f.b(this.i.k().a());
            if (i != 503 && i != 429) {
                z = false;
            }
            if (z) {
                this.i.A().g.b(this.i.k().a());
            }
            V().P(list);
            m0();
        }
    }

    final d5 g0() {
        return this.i;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final pa h() {
        return this.i.h();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final a5 j() {
        return this.i.j();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final com.google.android.gms.common.util.e k() {
        return this.i.k();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final z3 m() {
        return this.i.m();
    }

    final void p(p pVar, fa faVar) {
        List<oa> listK;
        List<oa> listK2;
        List<oa> listK3;
        b4 b4VarG;
        String str;
        Object objX;
        String strA;
        Object obj;
        List<String> list;
        p pVar2 = pVar;
        com.google.android.gms.common.internal.q.k(faVar);
        com.google.android.gms.common.internal.q.g(faVar.f1702b);
        j0();
        c0();
        String str2 = faVar.f1702b;
        long j = pVar2.e;
        Z();
        if (v9.S(pVar, faVar)) {
            if (!faVar.i) {
                Q(faVar);
                return;
            }
            if (this.i.x().C(str2, r.c0) && (list = faVar.v) != null) {
                if (!list.contains(pVar2.f1832b)) {
                    this.i.m().N().d("Dropping non-safelisted event. appId, event name, origin", str2, pVar2.f1832b, pVar2.f1834d);
                    return;
                } else {
                    Bundle bundleL = pVar2.f1833c.l();
                    bundleL.putLong("ga_safelisted", 1L);
                    pVar2 = new p(pVar2.f1832b, new o(bundleL), pVar2.f1834d, pVar2.e);
                }
            }
            V().v0();
            try {
                e eVarV = V();
                com.google.android.gms.common.internal.q.g(str2);
                eVarV.c();
                eVarV.s();
                if (j < 0) {
                    eVarV.m().J().c("Invalid time querying timed out conditional properties", z3.x(str2), Long.valueOf(j));
                    listK = Collections.emptyList();
                } else {
                    listK = eVarV.K("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (oa oaVar : listK) {
                    if (oaVar != null) {
                        this.i.m().O().d("User property timed out", oaVar.f1829b, this.i.H().A(oaVar.f1831d.f1965c), oaVar.f1831d.h());
                        if (oaVar.h != null) {
                            S(new p(oaVar.h, j), faVar);
                        }
                        V().r0(str2, oaVar.f1831d.f1965c);
                    }
                }
                e eVarV2 = V();
                com.google.android.gms.common.internal.q.g(str2);
                eVarV2.c();
                eVarV2.s();
                if (j < 0) {
                    eVarV2.m().J().c("Invalid time querying expired conditional properties", z3.x(str2), Long.valueOf(j));
                    listK2 = Collections.emptyList();
                } else {
                    listK2 = eVarV2.K("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listK2.size());
                for (oa oaVar2 : listK2) {
                    if (oaVar2 != null) {
                        this.i.m().O().d("User property expired", oaVar2.f1829b, this.i.H().A(oaVar2.f1831d.f1965c), oaVar2.f1831d.h());
                        V().l0(str2, oaVar2.f1831d.f1965c);
                        if (oaVar2.l != null) {
                            arrayList.add(oaVar2.l);
                        }
                        V().r0(str2, oaVar2.f1831d.f1965c);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    S(new p((p) obj2, j), faVar);
                }
                e eVarV3 = V();
                String str3 = pVar2.f1832b;
                com.google.android.gms.common.internal.q.g(str2);
                com.google.android.gms.common.internal.q.g(str3);
                eVarV3.c();
                eVarV3.s();
                if (j < 0) {
                    eVarV3.m().J().d("Invalid time querying triggered conditional properties", z3.x(str2), eVarV3.e().w(str3), Long.valueOf(j));
                    listK3 = Collections.emptyList();
                } else {
                    listK3 = eVarV3.K("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listK3.size());
                for (oa oaVar3 : listK3) {
                    if (oaVar3 != null) {
                        y9 y9Var = oaVar3.f1831d;
                        aa aaVar = new aa(oaVar3.f1829b, oaVar3.f1830c, y9Var.f1965c, j, y9Var.h());
                        if (V().S(aaVar)) {
                            b4VarG = this.i.m().O();
                            str = "User property triggered";
                            objX = oaVar3.f1829b;
                            strA = this.i.H().A(aaVar.f1625c);
                            obj = aaVar.e;
                        } else {
                            b4VarG = this.i.m().G();
                            str = "Too many active user properties, ignoring";
                            objX = z3.x(oaVar3.f1829b);
                            strA = this.i.H().A(aaVar.f1625c);
                            obj = aaVar.e;
                        }
                        b4VarG.d(str, objX, strA, obj);
                        if (oaVar3.j != null) {
                            arrayList2.add(oaVar3.j);
                        }
                        oaVar3.f1831d = new y9(aaVar);
                        oaVar3.f = true;
                        V().T(oaVar3);
                    }
                }
                S(pVar2, faVar);
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    S(new p((p) obj3, j), faVar);
                }
                V().v();
            } finally {
                V().A0();
            }
        }
    }

    final void q(p pVar, String str) {
        f4 f4VarJ0 = V().j0(str);
        if (f4VarJ0 == null || TextUtils.isEmpty(f4VarJ0.T())) {
            this.i.m().N().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolI = I(f4VarJ0);
        if (boolI == null) {
            if (!"_ui".equals(pVar.f1832b)) {
                this.i.m().J().b("Could not find package. appId", z3.x(str));
            }
        } else if (!boolI.booleanValue()) {
            this.i.m().G().b("App version does not match; dropping event. appId", z3.x(str));
            return;
        }
        K(pVar, new fa(str, f4VarJ0.A(), f4VarJ0.T(), f4VarJ0.V(), f4VarJ0.X(), f4VarJ0.Z(), f4VarJ0.b0(), (String) null, f4VarJ0.e0(), false, f4VarJ0.M(), f4VarJ0.k(), 0L, 0, f4VarJ0.l(), f4VarJ0.m(), false, f4VarJ0.D(), f4VarJ0.n(), f4VarJ0.d0(), f4VarJ0.o(), (ta.b() && this.i.x().C(f4VarJ0.t(), r.o0)) ? f4VarJ0.G() : null));
    }

    final void s(o9 o9Var) {
        this.n++;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void v(com.google.android.gms.measurement.internal.y9 r13, com.google.android.gms.measurement.internal.fa r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.v(com.google.android.gms.measurement.internal.y9, com.google.android.gms.measurement.internal.fa):void");
    }

    final void w(fa faVar) {
        if (this.u != null) {
            ArrayList arrayList = new ArrayList();
            this.v = arrayList;
            arrayList.addAll(this.u);
        }
        e eVarV = V();
        String str = faVar.f1702b;
        com.google.android.gms.common.internal.q.g(str);
        eVarV.c();
        eVarV.s();
        try {
            SQLiteDatabase sQLiteDatabaseW = eVarV.w();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseW.delete("apps", "app_id=?", strArr) + 0 + sQLiteDatabaseW.delete("events", "app_id=?", strArr) + sQLiteDatabaseW.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseW.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseW.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseW.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseW.delete("queue", "app_id=?", strArr) + sQLiteDatabaseW.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseW.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseW.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                eVarV.m().O().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            eVarV.m().G().c("Error resetting analytics data. appId, error", z3.x(str), e);
        }
        if (faVar.i) {
            N(faVar);
        }
    }

    final void x(oa oaVar) {
        fa faVarD = d(oaVar.f1829b);
        if (faVarD != null) {
            y(oaVar, faVarD);
        }
    }

    final void y(oa oaVar, fa faVar) {
        b4 b4VarG;
        String str;
        Object objX;
        String strA;
        Object objH;
        b4 b4VarG2;
        String str2;
        Object objX2;
        String strA2;
        Object obj;
        com.google.android.gms.common.internal.q.k(oaVar);
        com.google.android.gms.common.internal.q.g(oaVar.f1829b);
        com.google.android.gms.common.internal.q.k(oaVar.f1830c);
        com.google.android.gms.common.internal.q.k(oaVar.f1831d);
        com.google.android.gms.common.internal.q.g(oaVar.f1831d.f1965c);
        j0();
        c0();
        if (W(faVar)) {
            if (!faVar.i) {
                Q(faVar);
                return;
            }
            oa oaVar2 = new oa(oaVar);
            boolean z = false;
            oaVar2.f = false;
            V().v0();
            try {
                oa oaVarP0 = V().p0(oaVar2.f1829b, oaVar2.f1831d.f1965c);
                if (oaVarP0 != null && !oaVarP0.f1830c.equals(oaVar2.f1830c)) {
                    this.i.m().J().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.i.H().A(oaVar2.f1831d.f1965c), oaVar2.f1830c, oaVarP0.f1830c);
                }
                if (oaVarP0 != null && oaVarP0.f) {
                    oaVar2.f1830c = oaVarP0.f1830c;
                    oaVar2.e = oaVarP0.e;
                    oaVar2.i = oaVarP0.i;
                    oaVar2.g = oaVarP0.g;
                    oaVar2.j = oaVarP0.j;
                    oaVar2.f = oaVarP0.f;
                    oaVar2.f1831d = new y9(oaVar2.f1831d.f1965c, oaVarP0.f1831d.f1966d, oaVar2.f1831d.h(), oaVarP0.f1831d.g);
                } else if (TextUtils.isEmpty(oaVar2.g)) {
                    oaVar2.f1831d = new y9(oaVar2.f1831d.f1965c, oaVar2.e, oaVar2.f1831d.h(), oaVar2.f1831d.g);
                    oaVar2.f = true;
                    z = true;
                }
                if (oaVar2.f) {
                    y9 y9Var = oaVar2.f1831d;
                    aa aaVar = new aa(oaVar2.f1829b, oaVar2.f1830c, y9Var.f1965c, y9Var.f1966d, y9Var.h());
                    if (V().S(aaVar)) {
                        b4VarG2 = this.i.m().N();
                        str2 = "User property updated immediately";
                        objX2 = oaVar2.f1829b;
                        strA2 = this.i.H().A(aaVar.f1625c);
                        obj = aaVar.e;
                    } else {
                        b4VarG2 = this.i.m().G();
                        str2 = "(2)Too many active user properties, ignoring";
                        objX2 = z3.x(oaVar2.f1829b);
                        strA2 = this.i.H().A(aaVar.f1625c);
                        obj = aaVar.e;
                    }
                    b4VarG2.d(str2, objX2, strA2, obj);
                    if (z && oaVar2.j != null) {
                        S(new p(oaVar2.j, oaVar2.e), faVar);
                    }
                }
                if (V().T(oaVar2)) {
                    b4VarG = this.i.m().N();
                    str = "Conditional property added";
                    objX = oaVar2.f1829b;
                    strA = this.i.H().A(oaVar2.f1831d.f1965c);
                    objH = oaVar2.f1831d.h();
                } else {
                    b4VarG = this.i.m().G();
                    str = "Too many conditional properties, ignoring";
                    objX = z3.x(oaVar2.f1829b);
                    strA = this.i.H().A(oaVar2.f1831d.f1965c);
                    objH = oaVar2.f1831d.h();
                }
                b4VarG.d(str, objX, strA, objH);
                V().v();
            } finally {
                V().A0();
            }
        }
    }

    final void z(Runnable runnable) {
        j0();
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(runnable);
    }
}
