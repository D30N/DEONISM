package com.example.samplestickerapp;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.R;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public class StickerPackInfoActivity extends k {
    private AdView s;
    private InterstitialAd t;

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
            Toast.makeText(StickerPackInfoActivity.this, "Error: " + adError.getErrorMessage(), 1).show();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }
    }

    private Drawable G(int i) {
        return Build.VERSION.SDK_INT >= 21 ? getDrawable(i) : getResources().getDrawable(i);
    }

    private void J(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str, null));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        startActivity(Intent.createChooser(intent, getResources().getString(R.string.info_send_email_to_prompt)));
    }

    private void K(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    private void L(final String str, int i) {
        TextView textView = (TextView) findViewById(i);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.example.samplestickerapp.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f1079b.I(str, view);
                }
            });
        }
    }

    public /* synthetic */ void H(String str, View view) {
        J(str);
    }

    public /* synthetic */ void I(String str, View view) {
        K(str);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) throws FileNotFoundException {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sticker_pack_info);
        String stringExtra = getIntent().getStringExtra("sticker_pack_tray_icon");
        String stringExtra2 = getIntent().getStringExtra("sticker_pack_website");
        final String stringExtra3 = getIntent().getStringExtra("sticker_pack_email");
        String stringExtra4 = getIntent().getStringExtra("sticker_pack_privacy_policy");
        String stringExtra5 = getIntent().getStringExtra("sticker_pack_license_agreement");
        TextView textView = (TextView) findViewById(R.id.tray_icon);
        try {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), getContentResolver().openInputStream(Uri.parse(stringExtra)));
            Drawable drawableG = G(R.drawable.sticker_3rdparty_email);
            bitmapDrawable.setBounds(new Rect(0, 0, drawableG.getIntrinsicWidth(), drawableG.getIntrinsicHeight()));
            textView.setCompoundDrawables(bitmapDrawable, null, null, null);
        } catch (FileNotFoundException unused) {
            Log.e("StickerPackInfoActivity", "could not find the uri for the tray image:" + stringExtra);
        }
        L(stringExtra2, R.id.view_webpage);
        TextView textView2 = (TextView) findViewById(R.id.send_email);
        if (TextUtils.isEmpty(stringExtra3)) {
            textView2.setVisibility(8);
        } else {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.example.samplestickerapp.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f1081b.H(stringExtra3, view);
                }
            });
        }
        L(stringExtra4, R.id.privacy_policy);
        L(stringExtra5, R.id.license_agreement);
        this.s = new AdView(this, "612662979168079_969926990108341", AdSize.BANNER_HEIGHT_50);
        this.t = new InterstitialAd(this, "612662979168079_970594910041549");
        ((LinearLayout) findViewById(R.id.banner_container)).addView(this.s);
        this.s.loadAd();
        this.s.setAdListener(new a());
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        InterstitialAd interstitialAd = this.t;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        super.onDestroy();
    }
}
