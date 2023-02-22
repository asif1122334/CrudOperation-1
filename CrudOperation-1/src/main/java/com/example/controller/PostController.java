package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PostDao;
import com.example.model.Post;

@RestController
@RequestMapping("/api")
public class PostController {

	@Autowired
	PostDao p;
	
	@GetMapping("/getAll")
	public List<Post> getAllPost(){
		return p.findAll();
	}
	
	@PostMapping("/createPost")
	public Post createPost(@RequestBody Post post) {
		return p.save(post);
	}
	
	@GetMapping("/{id}")
	public Optional<Post> getById(@PathVariable Long id) {
		return p.findById(id);
	}
	
//	 @DeleteMapping("/{id}")
//	    public ResponseEntity<?> deletePost(@PathVariable Long id) {
//	   Optional<Post> findById = p.findById(id);
//	                 
//
//	        p.delete(findById);
//
//	        return ResponseEntity.ok().build();
//	    }
}
