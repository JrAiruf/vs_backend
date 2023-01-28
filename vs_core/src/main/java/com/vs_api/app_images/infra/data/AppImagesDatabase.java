package com.vs_api.app_images.infra.data;

import com.vs_api.app_images.infra.dtos.AppImagesDto;

import java.util.List;

public interface AppImagesDatabase {
    public List<AppImagesDto> getImages();
    public void saveImage(AppImagesDto image);
}
