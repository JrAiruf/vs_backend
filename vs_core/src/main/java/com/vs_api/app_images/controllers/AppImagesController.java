package com.vs_api.app_images.controllers;

import com.vs_api.app_images.domain.entities.AppImagesEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/images")
@CrossOrigin(origins = "*")
public class AppImagesController {

    public AppImagesController(IAppImagesController controller) {
        this.controller = controller;
    }

    final IAppImagesController controller;

@GetMapping
    ResponseEntity<List<AppImagesEntity>> getImages(){
    var response = controller.getImages();
    return ResponseEntity.status(HttpStatus.OK).body(response);
}

@PostMapping
    ResponseEntity<Object> saveImage(@RequestBody AppImagesEntity image){
    controller.saveImage(image);
    return ResponseEntity.status(HttpStatus.CREATED).body("Image Saved!");
}

}
