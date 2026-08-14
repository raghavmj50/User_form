package com.avaali.form_details.Service;

import com.avaali.form_details.DTO.UserRequestDTO;
import com.avaali.form_details.DTO.UserResposneDTO;
import com.avaali.form_details.Entity.User;
import com.avaali.form_details.Repository.UserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository urt ;


    public void create( UserRequestDTO ur) {

        User u = new User();
        u.setName(ur.getName());
        u.setEmail(ur.getEmail());
        u.setPhone(ur.getPhone());
        u.setAge(ur.getAge());
        u.setCountry(ur.getCountry());
        u.setCity(ur.getCity());

         urt.save(u);

    }
}
