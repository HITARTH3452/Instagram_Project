package com.geekster.Instagram_project.repos;

import com.geekster.Instagram_project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<IUserRepo,Long> {
    User findFirstByEmail(String email);

    User findByUserId(Long id);
}
