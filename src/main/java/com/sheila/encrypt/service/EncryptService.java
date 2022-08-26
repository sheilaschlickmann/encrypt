package com.sheila.encrypt.service;

import com.sheila.encrypt.model.EncryptModel;
import com.sheila.encrypt.repository.EncryptRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class EncryptService {
    final EncryptRepository encryptRepository;

    public EncryptService(EncryptRepository encryptRepository) {
        this.encryptRepository = encryptRepository;
    }
    @Transactional
    public EncryptModel save(EncryptModel encryptModel) {
        return encryptRepository.save(encryptModel);
    }
    public Optional <EncryptModel> findById (UUID id) {
        return encryptRepository.findById(id);

    }
}
