package com.vs_api.app_images.dataprovider;

import com.vs_api.app_images.infra.dtos.AppImagesDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AppImagesDataprovider extends JpaRepository<AppImagesDto, UUID> {
}
