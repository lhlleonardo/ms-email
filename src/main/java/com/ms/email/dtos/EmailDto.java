package com.ms.email.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/*
 *@Author Leonardo Henrique Lopes
 *@Date 24/11/2021
 */

@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;

    @Email
    @NotBlank
    private String emailFrom;

    @Email
    @NotBlank
    private String emailTo;

    @NotBlank
    private String subject;

    @NotBlank
    private String text;
}
