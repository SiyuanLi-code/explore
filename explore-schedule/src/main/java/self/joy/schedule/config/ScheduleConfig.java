package self.joy.schedule.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class ScheduleConfig implements SchedulingConfigurer {



    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {

    }
}
