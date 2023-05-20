package com.geekster.Instagram_project.repos;

import com.geekster.Instagram_project.models.Post;
import com.geekster.Instagram_project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepo extends JpaRepository<IPostRepo,Long> {
    List<Post> findByUser(User user);
}
