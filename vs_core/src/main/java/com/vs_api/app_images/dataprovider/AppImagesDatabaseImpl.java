package com.vs_api.app_images.dataprovider;

import com.vs_api.app_images.infra.data.AppImagesDatabase;
import com.vs_api.app_images.infra.dtos.AppImagesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppImagesDatabaseImpl implements AppImagesDatabase {

    public AppImagesDatabaseImpl(AppImagesDataprovider dataprovider) {
        this.dataprovider = dataprovider;
    }

    final AppImagesDataprovider dataprovider;


    @Override
    public List<AppImagesDto> getImages() {
        return dataprovider.findAll();
    }

    @Override
    public void saveImage(AppImagesDto image) {
dataprovider.save(image);
    }
}
