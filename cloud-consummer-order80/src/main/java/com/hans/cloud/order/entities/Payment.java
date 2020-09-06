package com.hans.cloud.order.entities;

/**
 * @Author: hans
 * @Date: 2020/9/6 14:46
 */
public class Payment {
    
    private Long id;

    private String serial;

    private String description;

    public Payment() {
    }

    public Payment(Long id, String serial, String description) {
        this.id = id;
        this.serial = serial;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
