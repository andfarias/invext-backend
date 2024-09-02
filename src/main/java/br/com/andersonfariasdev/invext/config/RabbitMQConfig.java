package br.com.andersonfariasdev.invext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public ConnectionFactory connectionFactory() {
        // Configuração da conexão com o RabbitMQ
        ConnectionFactory factory = new CachingConnectionFactory();
        // ...
        return factory;
    }

    @Bean
    public SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory() {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();

        factory.setConnectionFactory(connectionFactory());

        // ...
        return factory;
    }
}