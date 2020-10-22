package r;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author pycrab
 * @version 1.0
 * @see RCode
 * @since 1.5
 */
public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    private R() {
    }

    @Override
    public R put(String k, Object v) {
        super.put(k, v);
        return this;
    }

    public static R ok() {
        return new R().put("code", RCode.C_200.name()).put("tips", RCode.C_200.getTips());
    }

    public static R error(RCode rCode) {
        return new R().put("code", rCode.name()).put("tips", rCode.getTips());
    }

    public static R okWithMap(Map<String, Object> o) {
        R r = ok();
        r.putAll(o);
        return r;
    }

    public static R okWithList(List o) {
        return ok().put("list", o == null ? Collections.EMPTY_LIST : o);
    }

    public static R okWithPage(List o, long total) {
        return okWithList(o).put("total", total);
    }
}
