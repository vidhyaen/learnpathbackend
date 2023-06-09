package com.josi.RequestDTO;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubTopicRequest {
   
    private String sub_topic_name;
    
    private String description;
  
    private String content_url;
    
    private int topic_id;
   
    private int course_id;
}
