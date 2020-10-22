package r;

/**
 * {@code ExBase}作为简单异常直接使用
 * 或者自定义业务异常类继承自该类，禁止直接继承RuntimeException类
 * <p>
 * 约束：强制提前声明所有异常信息
 *
 * @author pycrab
 * @version 1.0
 * @see RCode
 */
public class BasicEx extends RuntimeException {

    private RCode ex;

    public RCode getEx() {
        return ex;
    }

    private BasicEx() {
    }

    public BasicEx(RCode ex) {
        super(ex.getTips());
        this.ex = ex;
    }

    public BasicEx(RCode ex, Throwable cause) {
        super(ex.getTips(), cause);
        this.ex = ex;
    }
}
