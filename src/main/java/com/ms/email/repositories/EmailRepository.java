package com.ms.email.repositories;

import com.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/*
 *@Author Leonardo Henrique Lopes
 *@Date 24/11/2021
 */

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
