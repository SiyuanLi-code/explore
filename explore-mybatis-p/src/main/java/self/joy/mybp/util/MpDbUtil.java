package self.joy.mybp.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

public class MpDbUtil {
    private static final Snowflake snowflake = IdUtil.getSnowflake(1, 1);

    public static Long getId() {
        return snowflake.nextId();
    }

}
