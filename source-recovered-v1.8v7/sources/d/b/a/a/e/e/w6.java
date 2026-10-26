package d.b.a.a.e.e;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes.dex */
final class w6<FieldDescriptorType> extends t6<FieldDescriptorType, Object> {
    w6(int i) {
        super(i, null);
    }

    @Override // d.b.a.a.e.e.t6
    public final void e() {
        if (!i()) {
            for (int i = 0; i < j(); i++) {
                Map.Entry<FieldDescriptorType, Object> entryH = h(i);
                if (((j4) entryH.getKey()).d()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                if (((j4) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}
