package com.upbeater.service;

import com.upbeater.model.UserType;
import com.upbeater.utility.ResponseObject;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserTypeService {
    ResponseEntity<ResponseObject> createUserType(UserType userType);

    List<UserType> getAllUserTypes();

    ResponseEntity<ResponseObject> updateUserType(UserType userType);

    ResponseEntity<ResponseObject> deleteUserType(int id);
}
