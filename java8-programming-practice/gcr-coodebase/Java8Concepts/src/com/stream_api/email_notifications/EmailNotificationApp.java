package com.stream_api.email_notifications;

import java.util.*;

public class EmailNotificationApp {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "sanya@gmail.com",
                "krishna@gmail.com",
                "ak@gmail.com",
                "riya@gmail.com"
        );

        // Send notification email to each user
        emails.forEach(email -> sendEmailNotification(email));
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Notification email sent to: " + email);
    }
}

