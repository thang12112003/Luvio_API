package com.example.Luvio.controllers;

import com.example.Luvio.dtos.LikeDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/like")
public class LikeController {

    // Hiển thị tất cả lượt thích
    @GetMapping("") // http://localhost:8088/api/v1/like
    public ResponseEntity<String> getAllLikes(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ) {
        return ResponseEntity.ok("get All Likes");
    }

    // Tạo lượt thích mới
    @PostMapping("") // http://localhost:8088/api/v1/like
    public ResponseEntity<?> createLike(
            @Valid @RequestBody LikeDTO likeDTO,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            List<String> errorMessage = result.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .toList();
            return ResponseEntity.badRequest().body(errorMessage);
        }
        return ResponseEntity.ok("create Like " + likeDTO);
    }

    // Cập nhật trạng thái lượt thích (pending -> matched)
    @PutMapping("/{id}") // http://localhost:8088/api/v1/like/{id}
    public ResponseEntity<String> updateLike(@PathVariable Long id) {
        return ResponseEntity.ok("update Like status for ID: " + id);
    }

    // Xóa lượt thích
    @DeleteMapping("/{id}") // http://localhost:8088/api/v1/like/{id}
    public ResponseEntity<String> deleteLike(@PathVariable Long id) {
        return ResponseEntity.ok("delete Like with ID: " + id);
    }
}
