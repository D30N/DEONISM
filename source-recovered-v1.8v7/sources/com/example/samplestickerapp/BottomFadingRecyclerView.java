package com.example.samplestickerapp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class BottomFadingRecyclerView extends RecyclerView {
    public BottomFadingRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        return 0.0f;
    }
}
