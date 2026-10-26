package com.example.samplestickerapp;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.b;
import com.facebook.ads.R;

/* loaded from: classes.dex */
public abstract class j extends k {

    public static final class a extends androidx.fragment.app.c {
        private void w1(String str) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setPackage("com.android.vending");
            try {
                l1(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(i(), R.string.cannot_find_play_store, 1).show();
            }
        }

        private void x1() throws PackageManager.NameNotFoundException {
            StringBuilder sb;
            String str;
            String string;
            if (i() != null) {
                PackageManager packageManager = i().getPackageManager();
                boolean zA = u.a(u.f1097b, packageManager);
                boolean zA2 = u.a(u.f1098c, packageManager);
                if (zA && zA2) {
                    string = "https://play.google.com/store/apps/developer?id=WhatsApp+Inc.";
                } else {
                    if (zA) {
                        sb = new StringBuilder();
                        sb.append("http://play.google.com/store/apps/details?id=");
                        str = u.f1097b;
                    } else {
                        if (!zA2) {
                            return;
                        }
                        sb = new StringBuilder();
                        sb.append("http://play.google.com/store/apps/details?id=");
                        str = u.f1098c;
                    }
                    sb.append(str);
                    string = sb.toString();
                }
                w1(string);
            }
        }

        @Override // androidx.fragment.app.c
        public Dialog q1(Bundle bundle) {
            b.a aVar = new b.a(i());
            aVar.g(R.string.add_pack_fail_prompt_update_whatsapp);
            aVar.d(true);
            aVar.j(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.example.samplestickerapp.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f1077b.u1(dialogInterface, i);
                }
            });
            aVar.h(R.string.add_pack_fail_prompt_update_play_link, new DialogInterface.OnClickListener() { // from class: com.example.samplestickerapp.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) throws PackageManager.NameNotFoundException {
                    this.f1076b.v1(dialogInterface, i);
                }
            });
            return aVar.a();
        }

        public /* synthetic */ void u1(DialogInterface dialogInterface, int i) {
            o1();
        }

        public /* synthetic */ void v1(DialogInterface dialogInterface, int i) throws PackageManager.NameNotFoundException {
            x1();
        }
    }

    private Intent H(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.whatsapp.intent.action.ENABLE_STICKER_PACK");
        intent.putExtra("sticker_pack_id", str);
        intent.putExtra("sticker_pack_authority", "com.r3dliz4rd.deonism.stickercontentprovider");
        intent.putExtra("sticker_pack_name", str2);
        return intent;
    }

    private void I(String str, String str2) {
        try {
            startActivityForResult(Intent.createChooser(H(str, str2), getString(R.string.add_to_whatsapp)), 200);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, R.string.add_pack_fail_prompt_update_whatsapp, 1).show();
        }
    }

    private void J(String str, String str2, String str3) {
        Intent intentH = H(str, str2);
        intentH.setPackage(str3);
        try {
            startActivityForResult(intentH, 200);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, R.string.add_pack_fail_prompt_update_whatsapp, 1).show();
        }
    }

    protected void G(String str, String str2) {
        String str3;
        try {
            if (!u.d(getPackageManager()) && !u.e(getPackageManager())) {
                Toast.makeText(this, R.string.add_pack_fail_prompt_update_whatsapp, 1).show();
                return;
            }
            boolean zB = u.b(this, str);
            boolean zC = u.c(this, str);
            if (!zB && !zC) {
                I(str, str2);
                return;
            }
            if (!zB) {
                str3 = u.f1097b;
            } else {
                if (zC) {
                    Toast.makeText(this, R.string.add_pack_fail_prompt_update_whatsapp, 1).show();
                    return;
                }
                str3 = u.f1098c;
            }
            J(str, str2, str3);
        } catch (Exception e) {
            Log.e("AddStickerPackActivity", "error adding sticker pack to WhatsApp", e);
            Toast.makeText(this, R.string.add_pack_fail_prompt_update_whatsapp, 1).show();
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200 && i2 == 0) {
            if (intent == null) {
                new a().t1(o(), "sticker_pack_not_added");
                return;
            }
            String stringExtra = intent.getStringExtra("validation_error");
            if (stringExtra != null) {
                Log.e("AddStickerPackActivity", "Validation failed:" + stringExtra);
            }
        }
    }
}
