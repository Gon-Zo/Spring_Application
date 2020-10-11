package com.example.springjpa.repository;

import com.example.springjpa.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by park031517@gmail.com on 2020-10-10, 토
 * Blog : https://zzz-oficial.tistory.com
 * Github : https://github.com/Gon-Zo
 */
@Repository
public interface PostRepository extends JpaRepository<Post , Long> {
}
