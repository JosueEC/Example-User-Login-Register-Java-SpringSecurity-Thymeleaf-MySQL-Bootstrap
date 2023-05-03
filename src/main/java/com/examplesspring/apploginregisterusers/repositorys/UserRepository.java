package com.examplesspring.apploginregisterusers.repositorys;

import com.examplesspring.apploginregisterusers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
