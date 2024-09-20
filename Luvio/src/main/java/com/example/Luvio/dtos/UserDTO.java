package com.example.Luvio.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("phone_number")
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    @JsonProperty("email")
//    @NotBlank(message = "email number is required")
    private String email;

    @NotBlank(message = "Password cannot be blank")
    private String password;

    @JsonProperty("retype_password")
    private String retypePassword;

    @JsonProperty("know_as")
    private String knowAs;

    private String gender ;

    @JsonProperty("date_of_birth ")
    private Date dateOfBirth;

    private String introduction ;

    private String interests  ;

    @JsonProperty("looking_for")
    private String lookingFor;

    private String city ;

    private String country ;

    @NotNull(message = "Role ID is required")
    @JsonProperty("role_id")
    private Long roleId;
}
