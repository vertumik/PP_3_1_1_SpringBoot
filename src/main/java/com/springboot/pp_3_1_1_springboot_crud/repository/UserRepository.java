package com.springboot.pp_3_1_1_springboot_crud.repository;

import com.springboot.pp_3_1_1_springboot_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
