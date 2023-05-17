package com.josi.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.ToString;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@CrossOrigin
@ToString
@Entity
@Table(name = "Course")
public class Course
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String imageUrl;

	// @OneToMany(fetch = FetchType.LAZY, mappedBy = "course", cascade = CascadeType.ALL)
	// private Set<Topic> topics;

	public Course(String name, String imageUrl)
	{
		this.name = name;
		this.imageUrl=imageUrl;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getImageUrl(String imageUrl)
	{
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl)
	{
		this.imageUrl = imageUrl ;
	}

	// public Set<Topic> getTopics()
	// {
	// 	return topics;
	// }

	// public void setTopics(Set<Topic> topics)
	// {
	// 	this.topics = topics;
	// }

	// @Override
	// public String toString()
	// {
	// 	String result = String.format("Category[id=%d, name='%s']%n", id, name,imageUrl);
	// 	if (topics != null)
	// 	{
	// 		for (Topic topic : topics)
	// 		{
	// 			result += String.format("Book[id=%d, title='%s']%n", topic.getId(), topic.getTitle());
	// 		}
	// 	}

	// 	return result;
	// }

	public Course()
	{
	}

}
