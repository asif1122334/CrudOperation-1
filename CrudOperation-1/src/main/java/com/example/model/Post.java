package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Post")
public class Post {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

 	    private String title;

	     
	    private String content;


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getContent() {
			return content;
		}


		public void setContent(String content) {
			this.content = content;
		}


		public Post(Long id, String title, String content) {
			super();
			this.id = id;
			this.title = title;
			this.content = content;
		}


		public Post() {
			super();
			// TODO Auto-generated constructor stub
		}


		@Override
		public String toString() {
			return "Post [id=" + id + ", title=" + title + ", content=" + content + "]";
		}
	    

}
