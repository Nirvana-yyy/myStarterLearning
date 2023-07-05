package org.example.conf;

import org.example.props.EmailProperties;
import org.example.service.EmailService;
import org.example.service.impl.EmailServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yan Jiale
 * @since 2023/07/05 15:25
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(EmailService.class)//表示只有存在EmailService类时才生效自动配置类
@EnableConfigurationProperties(EmailProperties.class)//使EmailProperties配置类生效
public class EmailAutoConfiguration {

    private EmailProperties emailProperties;

    public EmailAutoConfiguration(EmailProperties emailProperties){
        this.emailProperties = emailProperties;
    }

    @Bean
    @ConditionalOnMissingBean//当放在一个@Bean的方法上时，Bean类默认为工厂方法的返回类型
    public EmailService emailService(){
        EmailServiceImpl emailService = new EmailServiceImpl();
        emailService.setEmailProperties(emailProperties);
        return emailService;
    }

}
