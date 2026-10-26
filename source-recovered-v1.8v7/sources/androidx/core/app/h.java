package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class h implements f {
    private final Notification.Builder a;

    /* renamed from: b, reason: collision with root package name */
    private final g.c f395b;

    /* renamed from: c, reason: collision with root package name */
    private RemoteViews f396c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f397d;
    private final List<Bundle> e = new ArrayList();
    private final Bundle f = new Bundle();
    private int g;
    private RemoteViews h;

    h(g.c cVar) {
        ArrayList<String> arrayList;
        Bundle bundle;
        String str;
        this.f395b = cVar;
        this.a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(cVar.a, cVar.I) : new Notification.Builder(cVar.a);
        Notification notification = cVar.N;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f391d).setContentText(cVar.e).setContentInfo(cVar.j).setContentIntent(cVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.g, (notification.flags & 128) != 0).setLargeIcon(cVar.i).setNumber(cVar.k).setProgress(cVar.r, cVar.s, cVar.t);
        if (Build.VERSION.SDK_INT < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setSubText(cVar.p).setUsesChronometer(cVar.n).setPriority(cVar.l);
            Iterator<g.a> it = cVar.f389b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = cVar.B;
            if (bundle2 != null) {
                this.f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (cVar.x) {
                    this.f.putBoolean("android.support.localOnly", true);
                }
                String str2 = cVar.u;
                if (str2 != null) {
                    this.f.putString("android.support.groupKey", str2);
                    if (cVar.v) {
                        bundle = this.f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = cVar.w;
                if (str3 != null) {
                    this.f.putString("android.support.sortKey", str3);
                }
            }
            this.f396c = cVar.F;
            this.f397d = cVar.G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setShowWhen(cVar.m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = cVar.O) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f;
                ArrayList<String> arrayList2 = cVar.O;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.a.setLocalOnly(cVar.x).setGroup(cVar.u).setGroupSummary(cVar.v).setSortKey(cVar.w);
            this.g = cVar.M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setCategory(cVar.A).setColor(cVar.C).setVisibility(cVar.D).setPublicVersion(cVar.E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = cVar.O.iterator();
            while (it2.hasNext()) {
                this.a.addPerson(it2.next());
            }
            this.h = cVar.H;
            if (cVar.f390c.size() > 0) {
                Bundle bundle4 = cVar.c().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i = 0; i < cVar.f390c.size(); i++) {
                    bundle5.putBundle(Integer.toString(i), i.b(cVar.f390c.get(i)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                cVar.c().putBundle("android.car.EXTENSIONS", bundle4);
                this.f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.setExtras(cVar.B).setRemoteInputHistory(cVar.q);
            RemoteViews remoteViews = cVar.F;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = cVar.G;
            if (remoteViews2 != null) {
                this.a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = cVar.H;
            if (remoteViews3 != null) {
                this.a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(cVar.J).setShortcutId(cVar.K).setTimeoutAfter(cVar.L).setGroupAlertBehavior(cVar.M);
            if (cVar.z) {
                this.a.setColorized(cVar.y);
            }
            if (TextUtils.isEmpty(cVar.I)) {
                return;
            }
            this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
    }

    private void b(g.a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            if (i >= 16) {
                this.e.add(i.f(this.a, aVar));
                return;
            }
            return;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(aVar.e(), aVar.i(), aVar.a());
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : j.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        if (Build.VERSION.SDK_INT >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.a.addAction(builder.build());
    }

    private void e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }

    @Override // androidx.core.app.f
    public Notification.Builder a() {
        return this.a;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsE;
        RemoteViews remoteViewsC;
        g.d dVar = this.f395b.o;
        if (dVar != null) {
            dVar.b(this);
        }
        RemoteViews remoteViewsD = dVar != null ? dVar.d(this) : null;
        Notification notificationD = d();
        if (remoteViewsD != null || (remoteViewsD = this.f395b.F) != null) {
            notificationD.contentView = remoteViewsD;
        }
        if (Build.VERSION.SDK_INT >= 16 && dVar != null && (remoteViewsC = dVar.c(this)) != null) {
            notificationD.bigContentView = remoteViewsC;
        }
        if (Build.VERSION.SDK_INT >= 21 && dVar != null && (remoteViewsE = this.f395b.o.e(this)) != null) {
            notificationD.headsUpContentView = remoteViewsE;
        }
        if (Build.VERSION.SDK_INT >= 16 && dVar != null && (bundleA = g.a(notificationD)) != null) {
            dVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.a.build();
        }
        if (i >= 24) {
            Notification notificationBuild = this.a.build();
            if (this.g != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.g == 2) {
                    e(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.g == 1) {
                    e(notificationBuild);
                }
            }
            return notificationBuild;
        }
        if (i >= 21) {
            this.a.setExtras(this.f);
            Notification notificationBuild2 = this.a.build();
            RemoteViews remoteViews = this.f396c;
            if (remoteViews != null) {
                notificationBuild2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f397d;
            if (remoteViews2 != null) {
                notificationBuild2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.h;
            if (remoteViews3 != null) {
                notificationBuild2.headsUpContentView = remoteViews3;
            }
            if (this.g != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && this.g == 2) {
                    e(notificationBuild2);
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && this.g == 1) {
                    e(notificationBuild2);
                }
            }
            return notificationBuild2;
        }
        if (i >= 20) {
            this.a.setExtras(this.f);
            Notification notificationBuild3 = this.a.build();
            RemoteViews remoteViews4 = this.f396c;
            if (remoteViews4 != null) {
                notificationBuild3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f397d;
            if (remoteViews5 != null) {
                notificationBuild3.bigContentView = remoteViews5;
            }
            if (this.g != 0) {
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) != 0 && this.g == 2) {
                    e(notificationBuild3);
                }
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) == 0 && this.g == 1) {
                    e(notificationBuild3);
                }
            }
            return notificationBuild3;
        }
        if (i >= 19) {
            SparseArray<Bundle> sparseArrayA = i.a(this.e);
            if (sparseArrayA != null) {
                this.f.putSparseParcelableArray("android.support.actionExtras", sparseArrayA);
            }
            this.a.setExtras(this.f);
            Notification notificationBuild4 = this.a.build();
            RemoteViews remoteViews6 = this.f396c;
            if (remoteViews6 != null) {
                notificationBuild4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f397d;
            if (remoteViews7 != null) {
                notificationBuild4.bigContentView = remoteViews7;
            }
            return notificationBuild4;
        }
        if (i < 16) {
            return this.a.getNotification();
        }
        Notification notificationBuild5 = this.a.build();
        Bundle bundleA = g.a(notificationBuild5);
        Bundle bundle = new Bundle(this.f);
        for (String str : this.f.keySet()) {
            if (bundleA.containsKey(str)) {
                bundle.remove(str);
            }
        }
        bundleA.putAll(bundle);
        SparseArray<Bundle> sparseArrayA2 = i.a(this.e);
        if (sparseArrayA2 != null) {
            g.a(notificationBuild5).putSparseParcelableArray("android.support.actionExtras", sparseArrayA2);
        }
        RemoteViews remoteViews8 = this.f396c;
        if (remoteViews8 != null) {
            notificationBuild5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.f397d;
        if (remoteViews9 != null) {
            notificationBuild5.bigContentView = remoteViews9;
        }
        return notificationBuild5;
    }
}
