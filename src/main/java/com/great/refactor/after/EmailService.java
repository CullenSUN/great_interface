package com.great.refactor.after;

public interface EmailService {
    public boolean sendEmail(String receiver, String subject, String content);
}

class EmailImplementation implements EmailService {
    public EmailImplementation() {
        System.out.println("configure and setup up email connection");
    }

    @Override
    public boolean sendEmail(String receiver, String subject, String content) {
        System.out.printf("send email to %s \nsubject: %s \ncontent: %s\n", receiver, subject, content);
        return true;
    }
}
