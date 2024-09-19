package com.example.Luvio.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/post")
public class PostController {
    //Hiện tất cả các post
    @GetMapping("")//http://localhost:8088/api/v1/post
    public ResponseEntity<String> getAllPost(){
        return ResponseEntity.ok("get All Post");
    }

    //Tạo post
    @PostMapping("")//http://localhost:8088/api/v1/post
    public ResponseEntity<String> createPost(){
        return ResponseEntity.ok("create Post");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePost(@PathVariable Long id){
        return ResponseEntity.ok("update Post" + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable Long id){
        return ResponseEntity.ok("delete Post" + id);
    }
}
