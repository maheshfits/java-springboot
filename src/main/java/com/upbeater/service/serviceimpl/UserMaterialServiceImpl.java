package com.upbeater.service.serviceimpl;

import com.upbeater.model.UserMaterial;
import com.upbeater.repository.UserMaterialRepository;
import com.upbeater.service.UserMaterialService;
import com.upbeater.utility.StatusTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMaterialServiceImpl implements UserMaterialService {

    private final UserMaterialRepository userMaterialRepository;

    @Autowired
    public UserMaterialServiceImpl(UserMaterialRepository userMaterialRepository) {
        this.userMaterialRepository = userMaterialRepository;
    }

    @Override
    public List<UserMaterial> getAllUserMaterials(int id) {
        return this.userMaterialRepository.findAllByUserIdAndStatusNot(id, StatusTypes.DEACTIVATE.getStatusId());
    }
}
