package self.joy.mybp.task;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import self.joy.common.constants.RedisKey;
import self.joy.common.entities.Classroom;
import self.joy.common.mapper.IClassroomMapper;

@Slf4j
@Component
public class ConcurrentUpdate extends ServiceImpl<IClassroomMapper, Classroom> {

    @Scheduled(cron = "0 15 16 * * ?")
    public void updateSomething() {
        this.lambdaUpdate().eq(Classroom::getId, 0).set(Classroom::getSize, 31).update();
        log.info("更新完毕");
    }

    @Resource
    private RedisTemplate<String, Long> redisTemplate;

    public void addRedis(Long id) {
        redisTemplate.convertAndSend(RedisKey.UPDATE_SIZE_SUB.getKey(), String.valueOf(id));
        log.info("redis 发送");
    }

    @Scheduled(fixedRate = 5000)
    public void trySub() {
        addRedis(3L);
        log.info("更新完毕");
    }
}
