package b.g.l.a0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d {
    private final Object a;

    static class a extends AccessibilityNodeProvider {
        final d a;

        a(d dVar) {
            this.a = dVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            c cVarA = this.a.a(i);
            if (cVarA == null) {
                return null;
            }
            return cVarA.r0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<c> listB = this.a.b(str, i);
            if (listB == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listB.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listB.get(i2).r0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.e(i, i2, bundle);
        }
    }

    static class b extends a {
        b(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            c cVarC = this.a.c(i);
            if (cVarC == null) {
                return null;
            }
            return cVarC.r0();
        }
    }

    public d() {
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 19 ? new b(this) : i >= 16 ? new a(this) : null;
    }

    public d(Object obj) {
        this.a = obj;
    }

    public c a(int i) {
        return null;
    }

    public List<c> b(String str, int i) {
        return null;
    }

    public c c(int i) {
        return null;
    }

    public Object d() {
        return this.a;
    }

    public boolean e(int i, int i2, Bundle bundle) {
        return false;
    }
}
