package com.upbeater.service;

import com.upbeater.model._aux.ResetPassword;
import com.upbeater.model.User;
import com.upbeater.model.request.UserRequest;
import com.upbeater.utility.ResponseObject;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<ResponseObject> createUser(UserRequest userRequest);

    List<User> getAllUsers();

    ResponseEntity<ResponseObject> resetUserPassword(ResetPassword resetPassword);

    ResponseEntity<ResponseObject> updateUser(User user);

    ResponseEntity<ResponseObject> deleteUser(int id);
}
