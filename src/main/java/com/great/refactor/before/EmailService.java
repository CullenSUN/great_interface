package com.great.refactor.before;

public class EmailService {
    public EmailService() {
        System.out.println("configure and setup up email connection");
    }

    public boolean sendEmail(String receiver, String subject, String content) {
        System.out.printf("send email to %s \nsubject: %s \ncontent: %s\n", receiver, subject, content);
        return true;
    }
}
