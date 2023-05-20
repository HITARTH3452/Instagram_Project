package com.geekster.Instagram_project.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILikeRepo extends JpaRepository<ILikeRepo,Long> {
    long countByPost_PostId(Long postId);
}
