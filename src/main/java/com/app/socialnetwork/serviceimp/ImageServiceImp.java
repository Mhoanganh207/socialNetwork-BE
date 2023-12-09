package com.app.socialnetwork.serviceimp;

import com.app.socialnetwork.services.ImageService;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImp implements ImageService {

    private final Cloudinary cloudinary = new Cloudinary(
            ObjectUtils.asMap(
                    "cloud_name", "ddhbygccz",
                    "api_key", "636942678911383",
                    "api_secret", "TD4RfgoGU4LepnnhD5uGkHB8kqc"
            ));




    public Object getKey() throws Exception {
        return this.cloudinary.searchFolders().execute();
    }

    @Override
    public Object uploadImage(Object file) throws Exception {
        return null;
    }
}
