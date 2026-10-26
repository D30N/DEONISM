package com.example.samplestickerapp;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class StickerPackDetailsActivity extends j {
    private d A;
    private AdView B;
    private final ViewTreeObserver.OnGlobalLayoutListener C = new b();
    private final RecyclerView.t D = new c();
    private RecyclerView s;
    private GridLayoutManager t;
    private s u;
    private int v;
    private View w;
    private View x;
    private n y;
    private View z;

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
            Toast.makeText(StickerPackDetailsActivity.this, "Error: " + adError.getErrorMessage(), 1).show();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            StickerPackDetailsActivity stickerPackDetailsActivity = StickerPackDetailsActivity.this;
            stickerPackDetailsActivity.Q(stickerPackDetailsActivity.s.getWidth() / StickerPackDetailsActivity.this.s.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_pack_details_image_size));
        }
    }

    class c extends RecyclerView.t {
        c() {
        }

        private void c(RecyclerView recyclerView) {
            boolean z = recyclerView.computeVerticalScrollOffset() > 0;
            if (StickerPackDetailsActivity.this.z != null) {
                StickerPackDetailsActivity.this.z.setVisibility(z ? 0 : 4);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            c(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            super.b(recyclerView, i, i2);
            c(recyclerView);
        }
    }

    static class d extends AsyncTask<n, Void, Boolean> {
        private final WeakReference<StickerPackDetailsActivity> a;

        d(StickerPackDetailsActivity stickerPackDetailsActivity) {
            this.a = new WeakReference<>(stickerPackDetailsActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean doInBackground(n... nVarArr) {
            n nVar = nVarArr[0];
            StickerPackDetailsActivity stickerPackDetailsActivity = this.a.get();
            return stickerPackDetailsActivity == null ? Boolean.FALSE : Boolean.valueOf(u.f(stickerPackDetailsActivity, nVar.f1090b));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            StickerPackDetailsActivity stickerPackDetailsActivity = this.a.get();
            if (stickerPackDetailsActivity != null) {
                stickerPackDetailsActivity.R(bool);
            }
        }
    }

    private void P(String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent(this, (Class<?>) StickerPackInfoActivity.class);
        intent.putExtra("sticker_pack_id", this.y.f1090b);
        intent.putExtra("sticker_pack_website", str);
        intent.putExtra("sticker_pack_email", str2);
        intent.putExtra("sticker_pack_privacy_policy", str3);
        intent.putExtra("sticker_pack_license_agreement", str4);
        intent.putExtra("sticker_pack_tray_icon", str5);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(int i) {
        if (this.v != i) {
            this.t.e3(i);
            this.v = i;
            s sVar = this.u;
            if (sVar != null) {
                sVar.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(Boolean bool) {
        if (bool.booleanValue()) {
            this.w.setVisibility(8);
            this.x.setVisibility(0);
        } else {
            this.w.setVisibility(0);
            this.x.setVisibility(8);
        }
    }

    public /* synthetic */ void O(View view) {
        n nVar = this.y;
        G(nVar.f1090b, nVar.f1091c);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sticker_pack_details);
        boolean booleanExtra = getIntent().getBooleanExtra("show_up_button", false);
        this.y = (n) getIntent().getParcelableExtra("sticker_pack");
        TextView textView = (TextView) findViewById(R.id.pack_name);
        TextView textView2 = (TextView) findViewById(R.id.author);
        ImageView imageView = (ImageView) findViewById(R.id.tray_image);
        TextView textView3 = (TextView) findViewById(R.id.pack_size);
        this.w = findViewById(R.id.add_to_whatsapp_button);
        this.x = findViewById(R.id.already_added_text);
        this.t = new GridLayoutManager(this, 1);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.sticker_list);
        this.s = recyclerView;
        recyclerView.setLayoutManager(this.t);
        this.s.getViewTreeObserver().addOnGlobalLayoutListener(this.C);
        this.s.addOnScrollListener(this.D);
        this.z = findViewById(R.id.divider);
        if (this.u == null) {
            s sVar = new s(getLayoutInflater(), R.drawable.sticker_error, getResources().getDimensionPixelSize(R.dimen.sticker_pack_details_image_size), getResources().getDimensionPixelSize(R.dimen.sticker_pack_details_image_padding), this.y);
            this.u = sVar;
            this.s.setAdapter(sVar);
        }
        textView.setText(this.y.f1091c);
        textView2.setText(this.y.f1092d);
        n nVar = this.y;
        imageView.setImageURI(q.e(nVar.f1090b, nVar.e));
        textView3.setText(Formatter.formatShortFileSize(this, this.y.c()));
        this.w.setOnClickListener(new View.OnClickListener() { // from class: com.example.samplestickerapp.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1078b.O(view);
            }
        });
        if (x() != null) {
            x().t(booleanExtra);
            x().v(booleanExtra ? getResources().getString(R.string.title_activity_sticker_pack_details_multiple_pack) : getResources().getQuantityString(R.plurals.title_activity_sticker_packs_list, 1));
        }
        this.B = new AdView(this, "612662979168079_969921636775543", AdSize.BANNER_HEIGHT_50);
        ((LinearLayout) findViewById(R.id.banner_container)).addView(this.B);
        this.B.loadAd();
        this.B.setAdListener(new a());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        AdView adView = this.B;
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        n nVar;
        if (menuItem.getItemId() != R.id.action_info || (nVar = this.y) == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        Uri uriE = q.e(nVar.f1090b, nVar.e);
        n nVar2 = this.y;
        P(nVar2.g, nVar2.f, nVar2.h, nVar2.i, uriE.toString());
        return true;
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onPause() {
        super.onPause();
        d dVar = this.A;
        if (dVar == null || dVar.isCancelled()) {
            return;
        }
        this.A.cancel(true);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        super.onResume();
        d dVar = new d(this);
        this.A = dVar;
        dVar.execute(this.y);
    }
}
