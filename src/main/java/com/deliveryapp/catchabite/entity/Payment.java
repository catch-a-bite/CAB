package com.deliveryapp.catchabite.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "PAYMENT")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    @Id
    @Column(name = "PAYMENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="ORDER_ID", nullable = false)
    private StoreOrder storeOrder;

    @Column(name = "PAYMENT_METHOD", nullable = false, length = 100)
    private String paymentMethod;

    @Column(name = "PAYMENT_AMOUNT", nullable = false)
    private Integer paymentAmount;

    @Column(name = "PAYMENT_STATUS", nullable = false, length = 50)
    private String paymentStatus;

    @Column(name = "PAYMENT_PAID_AT", nullable = false)
    private LocalDateTime paymentPaidAt;

    /**
     * 주문 최초 저장(INSERT) 직전에 paymentPaidAt를 자동 세팅합니다.
     * 이미 paymentPaidAt가 지정된 경우(외부 입력/특수 케이스)에는 덮어쓰이지 않습니다.
     */
    @PrePersist
    private void prePersist() {
        if (paymentPaidAt == null) 
        {
            paymentPaidAt = LocalDateTime.now();        
        }
    }
}