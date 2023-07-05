package com.nirvana.Cotroller;

import org.example.service.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yan Jiale
 * @since 2023/07/05 16:18
 */

@RestController()
@RequestMapping("/email")
public class EmailController {

    private EmailService emailService;

    public EmailController(EmailService emailService){
        this.emailService = emailService;
    }

    @GetMapping("/get")
    public void get(){
        emailService.sendEmail();
    }


}
