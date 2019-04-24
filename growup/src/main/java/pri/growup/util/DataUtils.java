package pri.growup.util;

import java.util.UUID;

/**
 * The Class DataUtils
 * 数据工具类
 */
public class DataUtils {

    public static String getNewID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
