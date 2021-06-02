package com.kodlamaio.hrms.api.controllers;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kodlamaio.hrms.business.abstracts.ImageService;
import com.kodlamaio.hrms.core.services.CloudinaryService;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
@CrossOrigin
public class ImagesController {
		ImageService imageService;
	
		CloudinaryService cloudinaryService;
		
		
		
		@Autowired
		public ImagesController(ImageService imageService, CloudinaryService cloudinaryService) {
			super();
			this.imageService = imageService;
			this.cloudinaryService = cloudinaryService;
		}
		
		
		@PostMapping("/upload")
		public ResponseEntity<?> upload(@RequestParam MultipartFile multipartFile) throws IOException{
			
			BufferedImage bufferedImage = ImageIO.read(multipartFile.getInputStream());
			if(bufferedImage == null) {
				
				return new ResponseEntity("Resim validasyonu başarısız.", HttpStatus.BAD_REQUEST);
			}			
			
			Map result = cloudinaryService.upload(multipartFile);
			Image image = new Image((String)result.get("original_filename"),(String)result.get("url"),
					(String)result.get("public_id"));
			
			this.imageService.upload(image);
			
		
			return new ResponseEntity("Image saved.", HttpStatus.OK);
		}
		






	
	
}
