package com.crud.koctasbackend.service;


import com.crud.koctasbackend.model.User;

public interface IAuthenticationService
{
    String signInAndReturnJWT(User signInRequest);
}
