package com.backend.fpl.Repositories;

import com.backend.fpl.Models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

}
