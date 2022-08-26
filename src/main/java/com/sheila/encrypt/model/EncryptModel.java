package com.sheila.encrypt.model;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
@Data
@Entity
@Table (name = "tb_encrypt")
public class EncryptModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String senha;
}
