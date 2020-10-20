import com.lbry.pm.PmApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// Some conditions
public class MyAutoConfiguration {

    // Auto-configured beans

    @Configuration
    @ConditionalOnClass(PmApplication.class)
    static class EmbeddedConfiguration {

        @Bean
        @ConditionalOnMissingBean
        public PmApplication pmApplication() {
            return null;
        }

    }

}