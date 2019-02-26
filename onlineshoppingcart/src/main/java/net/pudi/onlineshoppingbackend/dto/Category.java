package net.pudi.onlineshoppingbackend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private String name;
	@Column(name = "is_active")
	private boolean active = true;
	@Column(name= "image_url")
	private String imageURL;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getImage() {
		return imageURL;
	}
	public void setImage(String image) {
		this.imageURL = image;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", description=" + description + ", name=" + name + ", active=" + active
				+ ", imageURL=" + imageURL + "]";
	}
	
	
}

