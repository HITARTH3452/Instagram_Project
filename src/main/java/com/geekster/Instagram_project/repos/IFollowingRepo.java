package com.geekster.Instagram_project.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFollowingRepo extends JpaRepository<IFollowerRepo,Long> {
}
