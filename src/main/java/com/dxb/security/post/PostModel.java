package com.dxb.security.post;

import com.dxb.security.user.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post_table")
public class PostModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;

    private String postTitle;

    private String postContent;

    @Enumerated(EnumType.STRING)
    private Topic topic;

    @ManyToOne(cascade = CascadeType.ALL)
    private UserModel userModel;
}
