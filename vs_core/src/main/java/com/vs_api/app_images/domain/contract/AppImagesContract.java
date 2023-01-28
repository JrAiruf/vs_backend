package com.vs_api.app_images.domain.contract;

import com.vs_api.app_images.domain.entities.AppImagesEntity;

import java.util.List;

public interface AppImagesContract {
    public List<AppImagesEntity> getImages();
    public void saveImage(AppImagesEntity image);
}
