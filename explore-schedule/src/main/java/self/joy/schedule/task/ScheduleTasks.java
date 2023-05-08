package self.joy.schedule.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class ScheduleTasks {

    @Value("${schedule-time.taskA:5000}")
    private int taskAMillSecond;

    @Scheduled(fixedRate = 5000)
    public void taskA() {
        log.info("hell task");
        log.info("good!!");
    }

}
