package com.geekster.Instagram_project.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InstagramComment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private String commentBody;

    @ManyToOne
    @JoinColumn(nullable = false , name = "fk_post_ID")
    private Post post;

    @ManyToOne
    @JoinColumn(nullable = false , name = "fk_user_ID")
    private User user;


}
