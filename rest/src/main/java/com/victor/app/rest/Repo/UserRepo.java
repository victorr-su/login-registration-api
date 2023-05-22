package com.victor.app.rest.Repo;

import com.victor.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
