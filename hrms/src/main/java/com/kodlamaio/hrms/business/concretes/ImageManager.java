package com.kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.ImageService;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.ImageDao;
import com.kodlamaio.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{
	ImageDao imageDao;
	
	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}


	@Override
	public Result upload(Image image) {
		 this.imageDao.save(image);
		 return new SuccessResult("image başarıyla yüklendi");
	}

}
