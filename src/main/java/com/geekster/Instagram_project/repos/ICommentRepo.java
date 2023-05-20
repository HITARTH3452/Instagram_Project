package com.geekster.Instagram_project.repos;

import com.geekster.Instagram_project.models.InstagramComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentRepo extends JpaRepository<InstagramComment, Long> {
}
