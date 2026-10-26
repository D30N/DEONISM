package com.example.samplestickerapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.R;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes.dex */
public class s extends RecyclerView.g<t> {

    /* renamed from: c, reason: collision with root package name */
    private n f1095c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1096d;
    private int e = 0;
    private int f;
    private final int g;
    private final LayoutInflater h;

    s(LayoutInflater layoutInflater, int i, int i2, int i3, n nVar) {
        this.f1096d = i2;
        this.f = i3;
        this.h = layoutInflater;
        this.g = i;
        this.f1095c = nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        int size = this.f1095c.b().size();
        int i = this.e;
        return i > 0 ? Math.min(size, i) : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void j(t tVar, int i) {
        tVar.t.setImageResource(this.g);
        SimpleDraweeView simpleDraweeView = tVar.t;
        n nVar = this.f1095c;
        simpleDraweeView.setImageURI(q.e(nVar.f1090b, nVar.b().get(i).f1087b));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public t l(ViewGroup viewGroup, int i) {
        t tVar = new t(this.h.inflate(R.layout.sticker_image, viewGroup, false));
        ViewGroup.LayoutParams layoutParams = tVar.t.getLayoutParams();
        int i2 = this.f1096d;
        layoutParams.height = i2;
        layoutParams.width = i2;
        tVar.t.setLayoutParams(layoutParams);
        SimpleDraweeView simpleDraweeView = tVar.t;
        int i3 = this.f;
        simpleDraweeView.setPadding(i3, i3, i3, i3);
        return tVar;
    }
}
