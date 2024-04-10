package io.github.yaowenbin.snowflake.starter;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.entropyvalley.snowflake.core.IDGenerator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@ConditionalOnClass({IDGenerator.class})
@Configuration(
    proxyBeanMethods = false
)
public class IdentifierGeneratorAutoConfiguration {

    public IdentifierGeneratorAutoConfiguration() {
    }

    @Bean
    @ConditionalOnMissingBean
    public IdentifierGenerator identifierGenerator() {
        return new IdentifierGeneratorImpl();
    }
}
