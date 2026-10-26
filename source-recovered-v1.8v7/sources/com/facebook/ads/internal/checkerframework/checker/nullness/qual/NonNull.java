package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.X.AnonymousClass86;
import com.facebook.ads.redexgen.X.AnonymousClass87;
import com.facebook.ads.redexgen.X.EnumC02957s;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {AnonymousClass86.A0H, AnonymousClass86.A0B, AnonymousClass86.A03, AnonymousClass86.A05, AnonymousClass86.A07, AnonymousClass86.A0A, AnonymousClass86.A0D, AnonymousClass86.A0I, AnonymousClass86.A04})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({EnumC02957s.A0B})
@DefaultFor({AnonymousClass87.A04})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({AnonymousClass87.A0D, AnonymousClass87.A0B})
@Documented
/* loaded from: assets/audience_network.dex */
public @interface NonNull {
}
