package com.geekster.Instagram_project.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;

    @Column(nullable = false)
    private LocalDateTime createdDate;


    @Column(nullable = false)
    @NotEmpty
    private String postData;

    private String postCaption;

    //add regex here
    private String location;


    @ManyToOne(fetch = FetchType.LAZY)// remove this ...not needed...why ??
    @JoinColumn(nullable = false , name = "fk_user_ID")
    private User user;

}
