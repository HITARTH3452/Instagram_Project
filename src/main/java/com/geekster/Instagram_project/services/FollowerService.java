package com.geekster.Instagram_project.services;

import com.geekster.Instagram_project.models.InstagramFollower;
import com.geekster.Instagram_project.models.User;
import com.geekster.Instagram_project.repos.IFollowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowerService {

    @Autowired
    IFollowerRepo followerRepo;

    public void saveFollower(User myUser, User otherUser) {


        InstagramFollower follower = new InstagramFollower(null,myUser,otherUser);

        followerRepo.save(follower);
    }
}
