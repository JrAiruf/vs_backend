package com.vs_api.app_images.infra.repositories;
import com.vs_api.app_images.domain.contract.AppImagesContract;
import com.vs_api.app_images.domain.entities.AppImagesEntity;
import com.vs_api.app_images.infra.data.AppImagesDatabase;
import com.vs_api.app_images.infra.dtos.AppImagesDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppImagesRepository implements AppImagesContract {
    public AppImagesRepository(AppImagesDatabase database) {
        this.database = database;
    }
    final AppImagesDatabase database;

    @Override
    public List<AppImagesEntity> getImages() {
        var images = new AppImagesEntity();
        var imagesList = database.getImages().stream().map(item -> {
        BeanUtils.copyProperties(item,images);
            return images;
        }).collect(Collectors.toList());
        return imagesList;
    }

    @Override
    public void saveImage(AppImagesEntity image) {
        var dbImage = new AppImagesDto();
        BeanUtils.copyProperties(image, dbImage);
        database.saveImage(dbImage);
    }
}
