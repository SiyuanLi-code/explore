package self.joy.common.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
import self.joy.common.constants.TimeEnum;

import java.time.LocalDate;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 插入策略
     *
     * @param metaObject 原数据
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", LocalDate.now(TimeEnum.zoneId), metaObject);
        this.setFieldValByName("updateTime", LocalDate.now(TimeEnum.zoneId), metaObject);
    }


    /**
     * 更新策略
     *
     * @param metaObject 原数据
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", LocalDate.now(TimeEnum.zoneId), metaObject);
    }
}
