package com.geekster.Instagram_project.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PostLike {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeId;


    @ManyToOne
    @JoinColumn(nullable = false , name = "fk_post_ID")
    private Post post;

    @ManyToOne
    @JoinColumn(nullable = false , name = "fk_user_ID")
    private User user;
}
