package com.josi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@CrossOrigin
@Entity
@Table(name = "SubTopic")

public class SubTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sub_topic_name;
    private String description;
    private String content_url;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "topic_id",nullable = false)
    private Topic topic;
    @ManyToOne
    private Course course;
    public SubTopic() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSub_topic_name() {
        return sub_topic_name;
    }
    public void setSub_topic_name(String sub_topic_name) {
        this.sub_topic_name = sub_topic_name;
    }
    public String getContent_url() {
        return content_url;
    }
    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }
    public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
    
    public Topic getTopic() {
        return topic;
    }
    public void setTopic(Topic topic) {
        this.topic = topic;
    }



}
