package com.geekster.Instagram_project.repos;

import com.geekster.Instagram_project.models.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITokenRepo extends JpaRepository<ITokenRepo,Long> {
    AuthenticationToken findFirstByToken(String token);
}
