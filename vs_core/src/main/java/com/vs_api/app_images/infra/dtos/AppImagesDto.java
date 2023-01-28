package com.vs_api.app_images.infra.dtos;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
public class AppImagesDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID imageId;
    @Column(nullable = false, unique = true)
    private String url;
    @Column(nullable = false)
    private int xAxis;
    @Column(nullable = false)
    private int yAxis;
    @Column(nullable = false, unique = true)
    private int position;

    public UUID getImageId() {
        return imageId;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String value) {
        url = value;
    }

    public int getXAxis() {
        return xAxis;
    }

    public void setXAxis(int value) {
        xAxis = value;
    }

    public int getYAXis() {
        return yAxis;
    }

    public void setYAxis(int value) {
        yAxis = value;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int value) {
        position = value;
    }
}
