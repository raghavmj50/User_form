package com.avaali.form_details.Controller;

import com.avaali.form_details.DTO.UserRequestDTO;
import com.avaali.form_details.DTO.UserResposneDTO;
import com.avaali.form_details.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService us ;

    @PostMapping("/details")
    public String insertdetails( @RequestBody @Valid UserRequestDTO ur){
        us.create(ur);
        return "Insertion Done";
    }
}
