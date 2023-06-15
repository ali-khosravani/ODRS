package com.odrs.paziresh247365.repository;

import com.odrs.paziresh247365.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
