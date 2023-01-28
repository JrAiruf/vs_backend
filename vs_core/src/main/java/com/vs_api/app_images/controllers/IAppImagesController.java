package com.vs_api.app_images.controllers;

import com.vs_api.app_images.domain.entities.AppImagesEntity;
import java.util.List;

public interface IAppImagesController {
    public List<AppImagesEntity> getImages();
    public void saveImage(AppImagesEntity image);
}
