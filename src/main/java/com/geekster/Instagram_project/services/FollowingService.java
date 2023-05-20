package com.geekster.Instagram_project.services;

import com.geekster.Instagram_project.models.InstagramFollowing;
import com.geekster.Instagram_project.models.User;
import com.geekster.Instagram_project.repos.IFollowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {

    @Autowired
    IFollowingRepo followingRepo;

    public void saveFollowing(User myUser, User otherUser) {
        InstagramFollowing followingRecord = new InstagramFollowing(null,myUser,otherUser);
        followingRepo.save(followingRecord);
    }
}
