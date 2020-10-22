package validation;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/**
 * javax.validation参数校验顺序
 *
 * @author pycrab
 * @version 1.0
 */
@GroupSequence({EditGroup.class, SaveGroup.class, Default.class})
public interface Group {
}
