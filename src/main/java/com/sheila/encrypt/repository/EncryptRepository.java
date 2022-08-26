package com.sheila.encrypt.repository;

import com.sheila.encrypt.model.EncryptModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.UUID;

@Repository
public interface EncryptRepository extends JpaRepository<EncryptModel, UUID> {

}
