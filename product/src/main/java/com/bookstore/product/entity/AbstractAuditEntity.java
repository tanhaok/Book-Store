package com.bookstore.product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import java.time.ZonedDateTime;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
@Getter
@Setter
public class AbstractAuditEntity {
    @Column(name = "create_by")
    private String createBy;
    @Column(name = "last_modify_by")
    private String lastModifyBy;
    @Column(name = "create_at")
    @CreationTimestamp
    private ZonedDateTime createAt;
    @Column(name = "last_modify_at")
    @UpdateTimestamp
    private ZonedDateTime lastModifyAt;
}
