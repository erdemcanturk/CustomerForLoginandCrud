package com.crud.koctasbackend.controller;

import com.crud.koctasbackend.model.User;
import com.crud.koctasbackend.service.IAuthenticationService;
import com.crud.koctasbackend.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/authentication") // pre-path
public class AuthenticationController {

    @Autowired
    private IAuthenticationService authenticationService;

    @Autowired
    private IUserService userService;


    @PostMapping("sign-up") // kayit olma
    public ResponseEntity<?> signUp(@RequestBody User user) {
        if (userService.findByUsername(user.getUserName()).isPresent())
        {
            return new ResponseEntity<>(HttpStatus.CONFLICT); // kullanici adi daha onceden alindiysa conflict donecektir.
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("sign-in") //oturum acma
        public ResponseEntity<?> signIn(@RequestBody User user) {
        return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user), HttpStatus.OK);

        }


}
