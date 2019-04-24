package pri.growup.util;

import pri.growup.constants.GrowUpConstants;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * The Class MessageUtils
 *
 * 获取信息工具类
 */
@Component
public class MessageUtils {

    /**
     * 中文错误信息读取bundle
     */
    private static ResourceBundle excResourceBundleCN;

    public MessageUtils() {
        excResourceBundleCN = PropertyResourceBundle.getBundle(GrowUpConstants.EXCEPTION_MESSAGE_CN);
    }

    /**
     * 根据key获取信息
     * @param message key
     * @return 信息
     */
    public static String getExcptionMessage(String message) {
        if(StringUtils.isEmpty(message)) {
            return null;
        } else {
            return excResourceBundleCN.getString(message);
        }
    }

}
