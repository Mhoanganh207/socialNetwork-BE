package com.app.socialnetwork.controllers;

import com.app.socialnetwork.services.ImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }


    @GetMapping("/api/image/demo")
    public ResponseEntity<Object> demo() throws Exception {
        System.out.println("demo");
        return ResponseEntity.ok(imageService.getKey());
    }
}
