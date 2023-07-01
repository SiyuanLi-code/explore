package self.joy.mybp.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Slf4j
@Component
public class UpdateSub implements MessageListener {

    @Override
    public void onMessage(@NonNull Message message, byte[] pattern) {
        log.info(new String(message.getBody(), StandardCharsets.UTF_8));
        log.info(new String(message.getChannel(), StandardCharsets.UTF_8));
    }
}
