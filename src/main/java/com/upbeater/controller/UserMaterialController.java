package com.upbeater.controller;

import com.upbeater.model.UserMaterial;
import com.upbeater.service.UserMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/userMaterialController")
public class UserMaterialController {

    private final String APPLICATION_JSON = "application/json";

    private final UserMaterialService userMaterialService;

    @Autowired
    public UserMaterialController(UserMaterialService userMaterialService) {
        this.userMaterialService = userMaterialService;
    }

    @RequestMapping(value = "/getAllUserMaterials/{id}", method = RequestMethod.GET, produces = {APPLICATION_JSON})
    public List<UserMaterial> getAllUserMaterials(@PathVariable(value = "id") int id) {
        return userMaterialService.getAllUserMaterials(id);
    }
}
