package guru.springframework.demo.config;

import guru.springframework.demo.examplebeans.FakeDataSource;
import guru.springframework.demo.examplebeans.FakeHosanna;
import guru.springframework.demo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 12/3/2019.
 */
@Configuration
public class PropertyConfig {


    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUsername;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.url}")
    String jmsUrl;

    @Value("${hosanna}")
    String hozay;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }

    @Bean
    public FakeHosanna fakeHosanna(){
        FakeHosanna fakeHosanna = new FakeHosanna();
        fakeHosanna.setName(hozay);
        return fakeHosanna;
    }

    
}
