package com.zee.store.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContactRequestDto {

    @NotBlank(message = "Name must not be blank.")
    @Size(min = 5,max = 20,message = "Name must be between 5 and 20 characters")
    private String name;

    @NotBlank(message = "Email must not be blank.")
    @Email(message = "Invalid email address.")
    private String email;

    @NotBlank(message = "Mobile Number must not be blank.")
    private String mobileNumber;

    @NotBlank(message = "Message must not be blank.")
    @Size(min = 5,max = 500,message = "Name must be between 5 and 500 characters")
    private String message;
}
