package com.example.kingsTravel.CONSTANTS;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

@MappedSuperclass
public class BaseEntity {
    @Column
    String createdAt;

    @Column
    String updatedAt;

    @Column
    String timeZone;

    public BaseEntity() {
    }

    public BaseEntity(String createdAt, String updatedAt, String timeZone) {
        this.createdAt = new Date().toString();
        this.updatedAt = updatedAt;
        this.timeZone = TimeZone.getDefault().getDisplayName();
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
