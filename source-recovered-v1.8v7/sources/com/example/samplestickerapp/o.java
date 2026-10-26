package com.example.samplestickerapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.format.Formatter;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.R;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;

/* loaded from: classes.dex */
public class o extends RecyclerView.g<p> {

    /* renamed from: c, reason: collision with root package name */
    private List<n> f1093c;

    /* renamed from: d, reason: collision with root package name */
    private final a f1094d;
    private int e;
    private int f;

    public interface a {
        void a(n nVar);
    }

    o(List<n> list, a aVar) {
        this.f1093c = list;
        this.f1094d = aVar;
    }

    static /* synthetic */ void u(n nVar, View view) {
        Intent intent = new Intent(view.getContext(), (Class<?>) StickerPackDetailsActivity.class);
        intent.putExtra("show_up_button", true);
        intent.putExtra("sticker_pack", nVar);
        view.getContext().startActivity(intent);
    }

    private void y(ImageView imageView, final n nVar) {
        if (nVar.a()) {
            imageView.setImageResource(R.drawable.sticker_3rdparty_added);
            imageView.setClickable(false);
            imageView.setOnClickListener(null);
            z(imageView, null);
            return;
        }
        imageView.setImageResource(R.drawable.sticker_3rdparty_add);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.example.samplestickerapp.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1084b.v(nVar, view);
            }
        });
        TypedValue typedValue = new TypedValue();
        imageView.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        imageView.setBackgroundResource(typedValue.resourceId);
    }

    private void z(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    void A(int i, int i2) {
        this.f = i2;
        if (this.e != i) {
            this.e = i;
            h();
        }
    }

    public void B(List<n> list) {
        this.f1093c = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f1093c.size();
    }

    public /* synthetic */ void v(n nVar, View view) {
        this.f1094d.a(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void j(p pVar, int i) {
        final n nVar = this.f1093c.get(i);
        Context context = pVar.v.getContext();
        pVar.v.setText(nVar.f1092d);
        pVar.w.setText(Formatter.formatShortFileSize(context, nVar.c()));
        pVar.u.setText(nVar.f1091c);
        pVar.t.setOnClickListener(new View.OnClickListener() { // from class: com.example.samplestickerapp.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.u(nVar, view);
            }
        });
        pVar.y.removeAllViews();
        int iMin = Math.min(this.e, nVar.b().size());
        for (int i2 = 0; i2 < iMin; i2++) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) LayoutInflater.from(context).inflate(R.layout.sticker_pack_list_item_image, (ViewGroup) pVar.y, false);
            simpleDraweeView.setImageURI(q.e(nVar.f1090b, nVar.b().get(i2).f1087b));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) simpleDraweeView.getLayoutParams();
            int i3 = this.f;
            int i4 = layoutParams.leftMargin;
            int i5 = layoutParams.rightMargin;
            int i6 = (i3 - i4) - i5;
            if (i2 != iMin - 1 && i6 > 0) {
                layoutParams.setMargins(i4, layoutParams.topMargin, i5 + i6, layoutParams.bottomMargin);
                simpleDraweeView.setLayoutParams(layoutParams);
            }
            pVar.y.addView(simpleDraweeView);
        }
        y(pVar.x, nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public p l(ViewGroup viewGroup, int i) {
        return new p(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_packs_list_item, viewGroup, false));
    }
}
