package r;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * {@code ExHandler}统一异常处理类
 * 自定义异常及未知异常都会在这里进行格式化返回
 *
 * @author pycrab
 * @version 1.0
 * @since 1.5
 * @see RCode
 * @see BasicEx
 */
@RestControllerAdvice
public final class ExHandler {

    Logger log = LoggerFactory.getLogger(ExHandler.class);

    @ExceptionHandler(BasicEx.class)
    public R baseEx(BasicEx ex) {
        return R.error(ex.getEx());
    }

    @ExceptionHandler(Exception.class)
    public R exception(Exception e) {
        log.error("UNDEFINED EX:[{}]", ReflectionToStringBuilder.toString(e));
        return R.error(RCode.C_500);
    }
}
