package com.sheila.encrypt.controller;

import com.sheila.encrypt.model.EncryptModel;
import com.sheila.encrypt.service.EncryptService;
import com.sheila.encrypt.util.CaesarCipher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/encrypt-supremo")
public class EncryptController {
    final EncryptService encryptService;

    public EncryptController(EncryptService encryptService) {
        this.encryptService = encryptService;
    }
    @PostMapping
    public ResponseEntity<Object> saveEncrypt(@RequestBody EncryptModel encryptModel) {
        encryptModel.setSenha(CaesarCipher.encrypt(encryptModel.getSenha(),7));
        return ResponseEntity.status(HttpStatus.CREATED).body(encryptService.save((encryptModel)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getEncrypt(@PathVariable(value = "id") UUID id) {
        Optional<EncryptModel> encryptModelOptional = encryptService.findById(id);
        System.out.println(CaesarCipher.decrypt(encryptModelOptional.get().getSenha(),7));
        return ResponseEntity.status(HttpStatus.OK).body(encryptModelOptional.get());
    }


}
