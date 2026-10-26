package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class M5 {
    @TargetApi(18)
    public static Bitmap A00(XI xi, Bitmap bitmap, int i) throws RSRuntimeException {
        RenderScript renderScriptCreate = null;
        Allocation allocationCreateFromBitmap = null;
        Allocation allocationCreateTyped = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            renderScriptCreate = RenderScript.create(xi);
            renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
            allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmap);
            renderScriptCreate.destroy();
            allocationCreateFromBitmap.destroy();
            allocationCreateTyped.destroy();
            scriptIntrinsicBlurCreate.destroy();
            return bitmap;
        } catch (Throwable th) {
            if (renderScriptCreate != null) {
                renderScriptCreate.destroy();
            }
            if (allocationCreateFromBitmap != null) {
                allocationCreateFromBitmap.destroy();
            }
            if (allocationCreateTyped != null) {
                allocationCreateTyped.destroy();
            }
            if (scriptIntrinsicBlurCreate != null) {
                scriptIntrinsicBlurCreate.destroy();
            }
            throw th;
        }
    }

    @Nullable
    public static Bitmap A01(XI xi, Bitmap bitmap, int i, int i2) {
        boolean z = false;
        Bitmap scaled = null;
        Bitmap bitmapCreateBitmap = null;
        int width = bitmap.getWidth() / i2;
        int height = bitmap.getHeight() / i2;
        char c2 = width != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (height == 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (Build.VERSION.SDK_INT >= 18) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return (Bitmap) null;
                case 5:
                    bitmap = bitmap;
                    bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.scale(1.0f / i2, 1.0f / i2);
                    Paint paint = new Paint();
                    paint.setFlags(3);
                    paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    c2 = 6;
                    break;
                case 6:
                    try {
                        xi = xi;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        scaled = A00(xi, bitmapCreateBitmap, i);
                        z = true;
                        if (i2 == 1) {
                            c2 = '\t';
                            break;
                        } else {
                            c2 = '\b';
                            break;
                        }
                    } catch (RSRuntimeException unused) {
                        return new C1166cr().A02(bitmapCreateBitmap, i);
                    }
                case '\b':
                    bitmap = bitmap;
                    Bitmap scaled2 = scaled;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(scaled2, bitmap.getWidth(), bitmap.getHeight(), z);
                    scaled2.recycle();
                    scaled = bitmapCreateScaledBitmap;
                    c2 = '\t';
                    break;
                case '\t':
                    return scaled;
            }
        }
    }
}
