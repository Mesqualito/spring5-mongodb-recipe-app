package com.eigenbaumarkt.spring5_mongodb_recipe_app.services;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    void saveImageFile(String recipeId, MultipartFile file);
}
