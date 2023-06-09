package com.josi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@CrossOrigin
@Entity
@Table(name = "SubTopic")

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sub_topic_name;
    private String description;
    private String content_url;
    private int is_done;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "topic_id",nullable = false)
    private Topic topic;
    @ManyToOne
    private Course course;
}
