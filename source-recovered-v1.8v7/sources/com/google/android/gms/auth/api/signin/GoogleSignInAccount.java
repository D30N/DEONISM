package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.v.a;
import com.google.android.gms.common.internal.v.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b();
    private static e o = h.d();

    /* renamed from: b, reason: collision with root package name */
    private final int f1472b;

    /* renamed from: c, reason: collision with root package name */
    private String f1473c;

    /* renamed from: d, reason: collision with root package name */
    private String f1474d;
    private String e;
    private String f;
    private Uri g;
    private String h;
    private long i;
    private String j;
    private List<Scope> k;
    private String l;
    private String m;
    private Set<Scope> n = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f1472b = i;
        this.f1473c = str;
        this.f1474d = str2;
        this.e = str3;
        this.f = str4;
        this.g = uri;
        this.h = str5;
        this.i = j;
        this.j = str6;
        this.k = list;
        this.l = str7;
        this.m = str8;
    }

    public static GoogleSignInAccount y(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl", null);
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccountZ = z(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountZ.h = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccountZ;
    }

    private static GoogleSignInAccount z(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long jLongValue = (l == null ? Long.valueOf(o.a() / 1000) : l).longValue();
        q.g(str7);
        q.k(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, jLongValue, str7, new ArrayList(set), str5, str6);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.j.equals(this.j) && googleSignInAccount.w().equals(w());
    }

    public Account h() {
        if (this.e == null) {
            return null;
        }
        return new Account(this.e, "com.google");
    }

    public int hashCode() {
        return ((this.j.hashCode() + 527) * 31) + w().hashCode();
    }

    public String i() {
        return this.f;
    }

    public String k() {
        return this.e;
    }

    public String l() {
        return this.m;
    }

    public String m() {
        return this.l;
    }

    public String p() {
        return this.f1473c;
    }

    public String r() {
        return this.f1474d;
    }

    public Uri v() {
        return this.g;
    }

    public Set<Scope> w() {
        HashSet hashSet = new HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = c.a(parcel);
        c.j(parcel, 1, this.f1472b);
        c.n(parcel, 2, p(), false);
        c.n(parcel, 3, r(), false);
        c.n(parcel, 4, k(), false);
        c.n(parcel, 5, i(), false);
        c.m(parcel, 6, v(), i, false);
        c.n(parcel, 7, x(), false);
        c.k(parcel, 8, this.i);
        c.n(parcel, 9, this.j, false);
        c.q(parcel, 10, this.k, false);
        c.n(parcel, 11, m(), false);
        c.n(parcel, 12, l(), false);
        c.b(parcel, iA);
    }

    public String x() {
        return this.h;
    }
}
