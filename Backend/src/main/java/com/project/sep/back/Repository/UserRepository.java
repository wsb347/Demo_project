package com.project.sep.back.Repository;

import com.project.sep.back.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
