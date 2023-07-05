package org.example.service.impl;

import lombok.Data;
import org.example.props.EmailProperties;
import org.example.service.EmailService;

/**
 * @author Yan Jiale
 * @since 2023/07/05 15:19
 */
@Data
public class EmailServiceImpl implements EmailService {

    public EmailProperties emailProperties = null;


    @Override
    public void sendEmail() {

        System.out.println("Sending email... \n" +
                "username: " + emailProperties.getUsername() + "\n" +
                "password: " + emailProperties.getPassword() + "\n" +
                "host: " + emailProperties.getHost() + "\n" +
                "port: " + emailProperties.getPort());
    }
}
