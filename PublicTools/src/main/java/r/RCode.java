package r;

/**
 * {@code ExCode}定义所有提示信息
 * 枚举值都是唯一，防止定义重复值
 *
 * @author pycrab
 * @version 1.0
 * @since 1.5
 */
public enum RCode {
    /**
     * 预定义提示信息
     */
    C_200("请求成功"),
    C_400(""),
    C_401(""),
    C_403(""),
    C_404("请求的资源不存在"),
    C_413(""),
    C_500(" 内部服务器错误，请联系管理员"),
    C_501(" 内部服务器错误，请联系管理员"),
    C_502(" 内部服务器错误，请联系管理员"),
    C_503(" 内部服务器错误，请联系管理员"),
    C_504(" 内部服务器错误，请联系管理员"),
    C_505(" 内部服务器错误，请联系管理员"),

    /**
     * 这里枚举自定义提示信息
     */
    C_600(""),


    ;
    private String tips;

    RCode(String tips) {
        this.tips = tips;
    }

    public String getTips() {
        return tips;
    }
}
