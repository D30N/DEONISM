package com.example.samplestickerapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class EntryActivity extends k {
    private View s;
    private a t;

    static class a extends AsyncTask<Void, Void, Pair<String, ArrayList<n>>> {
        private final WeakReference<EntryActivity> a;

        a(EntryActivity entryActivity) {
            this.a = new WeakReference<>(entryActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair<String, ArrayList<n>> doInBackground(Void... voidArr) {
            try {
                EntryActivity entryActivity = this.a.get();
                if (entryActivity == null) {
                    return new Pair<>("could not fetch sticker packs", null);
                }
                ArrayList<n> arrayListD = q.d(entryActivity);
                if (arrayListD.size() == 0) {
                    return new Pair<>("could not find any packs", null);
                }
                Iterator<n> it = arrayListD.iterator();
                while (it.hasNext()) {
                    r.f(entryActivity, it.next());
                }
                return new Pair<>(null, arrayListD);
            } catch (Exception e) {
                Log.e("EntryActivity", "error fetching sticker packs", e);
                return new Pair<>(e.getMessage(), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair<String, ArrayList<n>> pair) {
            EntryActivity entryActivity = this.a.get();
            if (entryActivity != null) {
                Object obj = pair.first;
                if (obj != null) {
                    entryActivity.I((String) obj);
                } else {
                    entryActivity.J((ArrayList) pair.second);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(String str) {
        this.s.setVisibility(8);
        Log.e("EntryActivity", "error fetching sticker packs, " + str);
        ((TextView) findViewById(R.id.error_message)).setText(getString(R.string.error_message, new Object[]{str}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(ArrayList<n> arrayList) {
        Intent intent;
        this.s.setVisibility(8);
        if (arrayList.size() > 1) {
            intent = new Intent(this, (Class<?>) StickerPackListActivity.class);
            intent.putParcelableArrayListExtra("sticker_pack_list", arrayList);
        } else {
            intent = new Intent(this, (Class<?>) StickerPackDetailsActivity.class);
            intent.putExtra("show_up_button", false);
            intent.putExtra("sticker_pack", arrayList.get(0));
        }
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AudienceNetworkAds.initialize(this);
        setContentView(R.layout.activity_entry);
        overridePendingTransition(0, 0);
        if (x() != null) {
            x().l();
        }
        this.s = findViewById(R.id.entry_activity_progress);
        a aVar = new a(this);
        this.t = aVar;
        aVar.execute(new Void[0]);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a aVar = this.t;
        if (aVar == null || aVar.isCancelled()) {
            return;
        }
        this.t.cancel(true);
    }
}
