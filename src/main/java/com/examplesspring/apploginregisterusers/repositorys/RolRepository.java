package com.examplesspring.apploginregisterusers.repositorys;

import com.examplesspring.apploginregisterusers.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Long> {
}
