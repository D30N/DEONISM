package com.example.samplestickerapp;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.R;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes.dex */
public class t extends RecyclerView.d0 {
    public SimpleDraweeView t;

    t(View view) {
        super(view);
        this.t = (SimpleDraweeView) view.findViewById(R.id.sticker_preview);
    }
}
