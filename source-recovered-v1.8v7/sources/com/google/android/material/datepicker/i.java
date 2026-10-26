package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
final class i implements Comparable<i>, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Calendar f2060b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2061c;

    /* renamed from: d, reason: collision with root package name */
    final int f2062d;
    final int e;
    final int f;
    final int g;

    static class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return i.g(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    private i(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = o.d(calendar);
        this.f2060b = calendarD;
        this.f2062d = calendarD.get(2);
        this.e = this.f2060b.get(1);
        this.f = this.f2060b.getMaximum(7);
        this.g = this.f2060b.getActualMaximum(5);
        this.f2061c = o.n().format(this.f2060b.getTime());
        this.f2060b.getTimeInMillis();
    }

    static i g(int i, int i2) {
        Calendar calendarK = o.k();
        calendarK.set(1, i);
        calendarK.set(2, i2);
        return new i(calendarK);
    }

    static i t() {
        return new i(o.i());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f2062d == iVar.f2062d && this.e == iVar.e;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f2060b.compareTo(iVar.f2060b);
    }

    int h() {
        int firstDayOfWeek = this.f2060b.get(7) - this.f2060b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f : firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2062d), Integer.valueOf(this.e)});
    }

    long i(int i) {
        Calendar calendarD = o.d(this.f2060b);
        calendarD.set(5, i);
        return calendarD.getTimeInMillis();
    }

    String l() {
        return this.f2061c;
    }

    long m() {
        return this.f2060b.getTimeInMillis();
    }

    i p(int i) {
        Calendar calendarD = o.d(this.f2060b);
        calendarD.add(2, i);
        return new i(calendarD);
    }

    int q(i iVar) {
        if (this.f2060b instanceof GregorianCalendar) {
            return ((iVar.e - this.e) * 12) + (iVar.f2062d - this.f2062d);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.f2062d);
    }
}
