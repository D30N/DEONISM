package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.redexgen.X.YT;
import com.facebook.ads.redexgen.X.YU;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: assets/audience_network.dex */
public abstract class YV<I extends YT, O extends YU, E extends Exception> implements BV<I, O, E> {
    public int A00;
    public int A01;
    public int A02;
    public I A03;
    public E A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    public abstract I A0T();

    public abstract O A0V();

    public abstract E A0W(I i, O o, boolean z);

    public abstract E A0X(Throwable th);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    public YV(I[] iArr, O[] oArr) {
        this.A0B = iArr;
        this.A00 = iArr.length;
        for (int i = 0; i < this.A00; i++) {
            ((I[]) this.A0B)[i] = A0T();
        }
        this.A0C = oArr;
        this.A01 = oArr.length;
        for (int i2 = 0; i2 < this.A01; i2++) {
            ((O[]) this.A0C)[i2] = A0V();
        }
        this.A08 = new BY(this);
        this.A08.start();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    private void A0K() {
        if (A0Q()) {
            this.A07.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    private void A0L() throws Exception {
        E e = this.A04;
        if (e == null) {
        } else {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    public void A0M() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (A0R());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    private void A0N(I i) {
        i.A07();
        I[] iArr = this.A0B;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    private void A0O(O o) {
        o.A07();
        O[] oArr = this.A0C;
        int i = this.A01;
        this.A01 = i + 1;
        oArr[i] = o;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    private boolean A0Q() {
        YV<I, O, E> yv = this;
        boolean z = false;
        char c2 = !yv.A09.isEmpty() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yv = yv;
                    if (yv.A01 <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    private boolean A0R() throws InterruptedException {
        synchronized (this.A07) {
            while (!this.A06 && !A0Q()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I iRemoveFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i = this.A01 - 1;
            this.A01 = i;
            O o = oArr[i];
            boolean z = this.A05;
            this.A05 = false;
            if (iRemoveFirst.A04()) {
                o.A00(4);
            } else {
                if (iRemoveFirst.A03()) {
                    o.A00(RecyclerView.UNDEFINED_DURATION);
                }
                try {
                    this.A04 = (E) A0W(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e) {
                    this.A04 = (E) A0X(e);
                } catch (RuntimeException e2) {
                    this.A04 = (E) A0X(e2);
                }
                if (this.A04 != null) {
                    synchronized (this.A07) {
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                if (this.A05) {
                    A0O(o);
                } else if (o.A03()) {
                    this.A02++;
                    A0O(o);
                } else {
                    o.A00 = this.A02;
                    this.A02 = 0;
                    this.A0A.addLast(o);
                }
                A0N(iRemoveFirst);
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BV
    /* renamed from: A0S, reason: merged with bridge method [inline-methods] */
    public final I A4h() throws Exception {
        I i;
        I i2;
        synchronized (this.A07) {
            A0L();
            IJ.A04(this.A03 == null);
            if (this.A00 == 0) {
                i = null;
            } else {
                I[] iArr = this.A0B;
                int i3 = this.A00 - 1;
                this.A00 = i3;
                i = iArr[i3];
            }
            this.A03 = i;
            i2 = this.A03;
        }
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BV
    /* renamed from: A0U, reason: merged with bridge method [inline-methods] */
    public final O A4i() throws Exception {
        synchronized (this.A07) {
            A0L();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    public final void A0Y(int i) throws IllegalStateException {
        YV<I, O, E> yv = this;
        int length = 0;
        YT[] ytArr = null;
        boolean z = false;
        int i2 = 0;
        char c2 = yv.A00 == yv.A0B.length ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    yv = yv;
                    IJ.A04(z);
                    ytArr = yv.A0B;
                    length = ytArr.length;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ytArr = ytArr;
                    ytArr[i2].A09(i);
                    i2++;
                    c2 = 4;
                    break;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
                case 7:
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BV
    /* renamed from: A0Z, reason: merged with bridge method [inline-methods] */
    public final void AC2(I i) throws Exception {
        synchronized (this.A07) {
            A0L();
            I inputBuffer = this.A03;
            IJ.A03(i == inputBuffer);
            this.A09.addLast(i);
            A0K();
            this.A03 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    public void A0a(O o) {
        synchronized (this.A07) {
            A0O(o);
            A0K();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BV
    public final void ACJ() throws InterruptedException {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YV != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YT, O extends com.facebook.ads.redexgen.X.YU, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BV
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            if (this.A03 != null) {
                A0N(this.A03);
                this.A03 = null;
            }
            while (!this.A09.isEmpty()) {
                A0N(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                A0O(this.A0A.removeFirst());
            }
        }
    }
}
