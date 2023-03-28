package edu.bip.client.entity;

import lombok.Data;

import java.util.List;

@Data
public class PublishingEntity {
    private Long publisher_id;
    private String publisher;
    private String city;

    @Override
    public String toString() {
        return publisher;
    }
}
