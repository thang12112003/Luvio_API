package com.example.Luvio.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LikeDTO {
    @NotNull(message = "Liker ID is required")
    private Long likerId;

    @NotNull(message = "Liked user ID is required")
    private Long likedUserId;

    // Getters and setters
}
