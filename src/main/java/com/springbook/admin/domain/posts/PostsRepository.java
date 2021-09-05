package com.springbook.admin.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//주의 Entity 클래스와 기본 Entity Repository가 함께 위치해야 함
public interface PostsRepository extends JpaRepository<Posts,Long> {

}
