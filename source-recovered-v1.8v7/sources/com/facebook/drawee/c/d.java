package com.facebook.drawee.c;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static final d f1161b = new d();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1162c = true;
    private final Queue<a> a = new ArrayBlockingQueue(20);

    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private d() {
    }

    public static d a() {
        return f1162c ? new d() : f1161b;
    }

    public void b(a aVar) {
        if (f1162c) {
            if (this.a.size() + 1 > 20) {
                this.a.poll();
            }
            this.a.add(aVar);
        }
    }

    public String toString() {
        return this.a.toString();
    }
}
