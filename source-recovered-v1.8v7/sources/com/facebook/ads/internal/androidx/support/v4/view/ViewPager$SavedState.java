package com.facebook.ads.internal.androidx.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ViewPager$SavedState extends AbsSavedState {
    public static byte[] A03;
    public static final Parcelable.Creator<ViewPager$SavedState> CREATOR;
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{28, 76, 83, 79, 85, 72, 85, 83, 82, 1, 122, 88, 108, Byte.MAX_VALUE, 121, 115, 123, 112, 106, 78, Byte.MAX_VALUE, 121, 123, 108, 48, 77, Byte.MAX_VALUE, 104, 123, 122, 77, 106, Byte.MAX_VALUE, 106, 123, 101};
    }

    static {
        A02();
        CREATOR = new Parcelable.ClassLoaderCreator<ViewPager$SavedState>() { // from class: com.facebook.ads.redexgen.X.37
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final ViewPager$SavedState createFromParcel(Parcel parcel) {
                return new ViewPager$SavedState(parcel, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final ViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ViewPager$SavedState(parcel, classLoader);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final ViewPager$SavedState[] newArray(int i) {
                return new ViewPager$SavedState[i];
            }
        };
    }

    public ViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readParcelable(classLoader);
        this.A02 = classLoader;
    }

    public ViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        return A01(11, 25, 80) + Integer.toHexString(System.identityHashCode(this)) + A01(0, 10, k.AppCompatTheme_viewInflaterClass) + this.A00 + A01(10, 1, 73);
    }

    @Override // com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }
}
