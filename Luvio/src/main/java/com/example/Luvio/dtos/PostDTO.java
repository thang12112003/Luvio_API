package com.example.Luvio.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    @NotEmpty(message = "không được bỏ trống content")
    private String content;
    private List<MultipartFile> files;
}
