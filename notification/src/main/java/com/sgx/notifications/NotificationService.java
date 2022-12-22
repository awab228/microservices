package com.sgx.notifications;

import com.sgx.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationsRepository;
    public void send(NotificationRequest notificationRequest) {
        Notification notification = Notification.builder()
                .toCustomerId(notificationRequest.toCustomerId())
                .toCustomerEmail(notificationRequest.toCustomerEmail())
                .sender("SGX Services")
                .message(notificationRequest.message())
                .sentAt(LocalDateTime.now())
                .build();
        notificationsRepository.save(notification);
}
}
