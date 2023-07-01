package self.joy.mybp.redis;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import self.joy.common.constants.RedisKey;

@Configuration
@AutoConfigureAfter({UpdateSub.class})
public class RedisConfig {

    /**
     * 注入消息监听适配器, 监听非MessageListener的类才要
     */
 /*   @Bean
    public MessageListenerAdapter getMessageListenerAdapter(MessageListener messageListener) {
        return new MessageListenerAdapter(messageListener);
    }*/

    /**
     * 注入消息监听容器
     */
    /*@Bean
    public RedisMessageListenerContainer getRedisMessageListenerContainer(RedisConnectionFactory redisConnectionFactory, MessageListenerAdapter messageListenerAdapter) {
        RedisMessageListenerContainer redisMessageListenerContainer = new RedisMessageListenerContainer();
        redisMessageListenerContainer.setConnectionFactory(redisConnectionFactory);

        //处理的名单
        redisMessageListenerContainer.addMessageListener(messageListenerAdapter, new PatternTopic(RedisKey.UPDATE_SIZE_SUB.getKey()));
        return redisMessageListenerContainer;
    }*/
    @Bean
    public RedisMessageListenerContainer container(RedisConnectionFactory redisConnectionFactory) {
        RedisMessageListenerContainer redisMessageListenerContainer = new RedisMessageListenerContainer();
        redisMessageListenerContainer.setConnectionFactory(redisConnectionFactory);

        //处理的名单
        redisMessageListenerContainer.addMessageListener(new UpdateSub(), new PatternTopic(RedisKey.UPDATE_SIZE_SUB.getKey()));
        return redisMessageListenerContainer;
    }


}
