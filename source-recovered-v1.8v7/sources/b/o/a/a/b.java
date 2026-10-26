package b.o.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class b extends g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    private C0043b f1033c;

    /* renamed from: d, reason: collision with root package name */
    private Context f1034d;
    private ArgbEvaluator e;
    final Drawable.Callback f;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            b.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: b.o.a.a.b$b, reason: collision with other inner class name */
    private static class C0043b extends Drawable.ConstantState {
        int a;

        /* renamed from: b, reason: collision with root package name */
        h f1036b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f1037c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f1038d;
        b.d.a<Animator, String> e;

        public C0043b(Context context, C0043b c0043b, Drawable.Callback callback, Resources resources) {
            if (c0043b != null) {
                this.a = c0043b.a;
                h hVar = c0043b.f1036b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    this.f1036b = (h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    h hVar2 = this.f1036b;
                    hVar2.mutate();
                    h hVar3 = hVar2;
                    this.f1036b = hVar3;
                    hVar3.setCallback(callback);
                    this.f1036b.setBounds(c0043b.f1036b.getBounds());
                    this.f1036b.h(false);
                }
                ArrayList<Animator> arrayList = c0043b.f1038d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f1038d = new ArrayList<>(size);
                    this.e = new b.d.a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c0043b.f1038d.get(i);
                        Animator animatorClone = animator.clone();
                        String str = c0043b.e.get(animator);
                        animatorClone.setTarget(this.f1036b.d(str));
                        this.f1038d.add(animatorClone);
                        this.e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f1037c == null) {
                this.f1037c = new AnimatorSet();
            }
            this.f1037c.playTogether(this.f1038d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class c extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable drawableNewDrawable = this.a.newDrawable();
            bVar.f1040b = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.a.newDrawable(resources);
            bVar.f1040b = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.a.newDrawable(resources, theme);
            bVar.f1040b = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f);
            return bVar;
        }
    }

    b() {
        this(null, null, null);
    }

    private b(Context context) {
        this(context, null, null);
    }

    private b(Context context, C0043b c0043b, Resources resources) {
        this.e = null;
        this.f = new a();
        this.f1034d = context;
        if (c0043b != null) {
            this.f1033c = c0043b;
        } else {
            this.f1033c = new C0043b(context, c0043b, this.f, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f1033c.f1036b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0043b c0043b = this.f1033c;
        if (c0043b.f1038d == null) {
            c0043b.f1038d = new ArrayList<>();
            this.f1033c.e = new b.d.a<>();
        }
        this.f1033c.f1038d.add(animator);
        this.f1033c.e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.e == null) {
                    this.e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.e);
            }
        }
    }

    @Override // b.o.a.a.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f1033c.f1036b.draw(canvas);
        if (this.f1033c.f1037c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1040b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f1033c.f1036b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1033c.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1040b;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f1033c.f1036b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1040b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f1040b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1033c.f1036b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1033c.f1036b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.getOpacity() : this.f1033c.f1036b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainAttributes;
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    typedArrayObtainAttributes = b.g.d.c.g.k(resources, theme, attributeSet, b.o.a.a.a.e);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h hVarB = h.b(resources, resourceId, theme);
                        hVarB.h(false);
                        hVarB.setCallback(this.f);
                        h hVar = this.f1033c.f1036b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f1033c.f1036b = hVarB;
                    }
                } else if ("target".equals(name)) {
                    typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, b.o.a.a.a.f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1034d;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                typedArrayObtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f1033c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1040b;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f1033c.f1036b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f1040b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1033c.f1037c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.isStateful() : this.f1033c.f1036b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1033c.f1036b.setBounds(rect);
        }
    }

    @Override // b.o.a.a.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.setLevel(i) : this.f1033c.f1036b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.setState(iArr) : this.f1033c.f1036b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f1033c.f1036b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f1033c.f1036b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1033c.f1036b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i);
        } else {
            this.f1033c.f1036b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f1033c.f1036b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f1033c.f1036b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1033c.f1036b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f1033c.f1037c.isStarted()) {
                return;
            }
            this.f1033c.f1037c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1033c.f1037c.end();
        }
    }
}
