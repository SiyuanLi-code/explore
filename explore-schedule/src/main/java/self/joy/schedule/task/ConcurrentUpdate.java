package self.joy.schedule.task;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import self.joy.common.entities.Classroom;
import self.joy.common.mapper.IClassroomMapper;

@Slf4j
@Component
public class ConcurrentUpdate extends ServiceImpl<IClassroomMapper, Classroom> {

    @Scheduled(cron = "0 03,04,05 11 * * ?")
    public void updateSomething() {
        this.lambdaUpdate().eq(Classroom::getId, 0).set(Classroom::getSize, 1).update();
        log.info("更新完毕");
    }
}
