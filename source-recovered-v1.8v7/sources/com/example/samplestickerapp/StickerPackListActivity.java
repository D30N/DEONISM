package com.example.samplestickerapp;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.samplestickerapp.o;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class StickerPackListActivity extends j {
    private LinearLayoutManager s;
    private RecyclerView t;
    private o u;
    private b v;
    private ArrayList<n> w;
    private AdView x;
    private final o.a y = new o.a() { // from class: com.example.samplestickerapp.f
        @Override // com.example.samplestickerapp.o.a
        public final void a(n nVar) {
            this.a.M(nVar);
        }
    };

    class a implements AdListener {
        a() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            Toast.makeText(StickerPackListActivity.this, "Error: " + adError.getErrorMessage(), 1).show();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }
    }

    static class b extends AsyncTask<n, Void, List<n>> {
        private final WeakReference<StickerPackListActivity> a;

        b(StickerPackListActivity stickerPackListActivity) {
            this.a = new WeakReference<>(stickerPackListActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<n> doInBackground(n... nVarArr) {
            StickerPackListActivity stickerPackListActivity = this.a.get();
            if (stickerPackListActivity == null) {
                return Arrays.asList(nVarArr);
            }
            for (n nVar : nVarArr) {
                nVar.f(u.f(stickerPackListActivity, nVar.f1090b));
            }
            return Arrays.asList(nVarArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<n> list) {
            StickerPackListActivity stickerPackListActivity = this.a.get();
            if (stickerPackListActivity != null) {
                stickerPackListActivity.u.B(list);
                stickerPackListActivity.u.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sticker_pack_list_item_preview_image_size);
        p pVar = (p) this.t.findViewHolderForAdapterPosition(this.s.Z1());
        if (pVar != null) {
            int measuredWidth = pVar.y.getMeasuredWidth();
            int iMin = Math.min(5, Math.max(measuredWidth / dimensionPixelSize, 1));
            this.u.A(iMin, (measuredWidth - (dimensionPixelSize * iMin)) / (iMin - 1));
        }
    }

    private void O(List<n> list) {
        o oVar = new o(list, this.y);
        this.u = oVar;
        this.t.setAdapter(oVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.s = linearLayoutManager;
        linearLayoutManager.C2(1);
        this.t.addItemDecoration(new androidx.recyclerview.widget.d(this.t.getContext(), this.s.p2()));
        this.t.setLayoutManager(this.s);
        this.t.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.example.samplestickerapp.g
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() throws Resources.NotFoundException {
                this.f1083b.N();
            }
        });
    }

    public /* synthetic */ void M(n nVar) {
        G(nVar.f1090b, nVar.f1091c);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sticker_pack_list);
        this.t = (RecyclerView) findViewById(R.id.sticker_pack_list);
        ArrayList<n> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("sticker_pack_list");
        this.w = parcelableArrayListExtra;
        O(parcelableArrayListExtra);
        if (x() != null) {
            x().v(getResources().getQuantityString(R.plurals.title_activity_sticker_packs_list, this.w.size()));
        }
        this.x = new AdView(this, "612662979168079_969927620108278", AdSize.BANNER_HEIGHT_50);
        ((LinearLayout) findViewById(R.id.banner_container)).addView(this.x);
        this.x.loadAd();
        this.x.setAdListener(new a());
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onPause() {
        super.onPause();
        b bVar = this.v;
        if (bVar == null || bVar.isCancelled()) {
            return;
        }
        this.v.cancel(true);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        super.onResume();
        b bVar = new b(this);
        this.v = bVar;
        ArrayList<n> arrayList = this.w;
        bVar.execute(arrayList.toArray(new n[arrayList.size()]));
    }
}
