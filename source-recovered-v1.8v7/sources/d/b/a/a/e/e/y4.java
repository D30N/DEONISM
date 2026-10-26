package d.b.a.a.e.e;

import java.io.IOException;

/* loaded from: classes.dex */
public class y4 extends IOException {
    public y4(String str) {
        super(str);
    }

    static y4 a() {
        return new y4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static y4 b() {
        return new y4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static y4 c() {
        return new y4("Protocol message contained an invalid tag (zero).");
    }

    static b5 d() {
        return new b5("Protocol message tag had invalid wire type.");
    }

    static y4 e() {
        return new y4("Failed to parse the message.");
    }

    static y4 f() {
        return new y4("Protocol message had invalid UTF-8.");
    }
}
