package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class x {
    private TextView a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f315b;

    x(TextView textView) {
        b.g.k.h.c(textView);
        this.a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f315b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f315b = textClassifier;
    }
}
