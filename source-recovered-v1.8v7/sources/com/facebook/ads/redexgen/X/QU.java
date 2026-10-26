package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class QU {
    public static boolean A00(JSONArray jSONArray, JSONArray jSONArray2) {
        int i = 0;
        QT qtA00 = null;
        char c2 = jSONArray.length() != jSONArray2.length() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    jSONArray = jSONArray;
                    if (i >= jSONArray.length()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    jSONArray = jSONArray;
                    jSONArray2 = jSONArray2;
                    qtA00 = QT.A00(jSONArray, i);
                    QT t2 = QT.A00(jSONArray2, i);
                    if (qtA00 == t2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    jSONArray = jSONArray;
                    jSONArray2 = jSONArray2;
                    qtA00 = qtA00;
                    if (!qtA00.A05(jSONArray, jSONArray2, i)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    return false;
                case '\t':
                    i++;
                    c2 = 4;
                    break;
                case '\n':
                    return true;
            }
        }
    }

    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        QT type1 = null;
        String next = null;
        Iterator<String> itKeys = null;
        char c2 = jSONObject.length() != jSONObject2.length() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    jSONObject = jSONObject;
                    itKeys = jSONObject.keys();
                    c2 = 4;
                    break;
                case 4:
                    itKeys = itKeys;
                    if (!itKeys.hasNext()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    jSONObject2 = jSONObject2;
                    itKeys = itKeys;
                    next = itKeys.next();
                    if (!jSONObject2.has(next)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    jSONObject = jSONObject;
                    jSONObject2 = jSONObject2;
                    next = next;
                    type1 = QT.A01(jSONObject, next);
                    if (type1 == QT.A01(jSONObject2, next)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return false;
                case '\t':
                    jSONObject = jSONObject;
                    jSONObject2 = jSONObject2;
                    next = next;
                    type1 = type1;
                    if (!type1.A07(jSONObject, jSONObject2, next)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case '\n':
                    return false;
                case 11:
                    return true;
            }
        }
    }
}
