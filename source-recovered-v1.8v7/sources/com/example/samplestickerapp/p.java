package com.example.samplestickerapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.R;

/* loaded from: classes.dex */
public class p extends RecyclerView.d0 {
    View t;
    TextView u;
    TextView v;
    TextView w;
    ImageView x;
    LinearLayout y;

    p(View view) {
        super(view);
        this.t = view;
        this.u = (TextView) view.findViewById(R.id.sticker_pack_title);
        this.v = (TextView) view.findViewById(R.id.sticker_pack_publisher);
        this.w = (TextView) view.findViewById(R.id.sticker_pack_filesize);
        this.x = (ImageView) view.findViewById(R.id.add_button_on_list);
        this.y = (LinearLayout) view.findViewById(R.id.sticker_packs_list_item_image_list);
    }
}
