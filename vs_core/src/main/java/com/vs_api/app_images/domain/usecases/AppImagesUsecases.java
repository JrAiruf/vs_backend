package com.vs_api.app_images.domain.usecases;

import com.vs_api.app_images.controllers.IAppImagesController;
import com.vs_api.app_images.domain.contract.AppImagesContract;
import com.vs_api.app_images.domain.entities.AppImagesEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppImagesUsecases implements IAppImagesController {

    public AppImagesUsecases(AppImagesContract repository) {
        this.repository = repository;
    }

    final AppImagesContract repository;


    @Override
    public List<AppImagesEntity> getImages() {
        return repository.getImages();
    }

    @Override
    public void saveImage(AppImagesEntity image) {
        repository.saveImage(image);
    }
}
