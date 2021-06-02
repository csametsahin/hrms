package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="images")
@Entity
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="image_id")
	private int imageId;
	@Column(name="image_name")
	private String imageName;
	@Column(name="image_url")
	private String imageUrl;
	@Column(name="image_cloudinary_id")
	private String imageCloudinaryId;
	
	@ManyToOne()
	@JoinColumn(name="candidate_user_id")
	private CandidateUser candidateUser;

	public Image(String imageName, String imageUrl, String imageCloudinaryId) {
		super();
		this.imageName = imageName;
		this.imageUrl = imageUrl;
		this.imageCloudinaryId = imageCloudinaryId;
	}
	
	

}
