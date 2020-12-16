package com.springwalk.sample.repo;

import java.util.ArrayList;
import java.util.List;

import com.springwalk.sample.model.UserModel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<UserModel,Long> {
    List<UserModel> findByUsuarioAndSenha(String usuario, String senha);
}
