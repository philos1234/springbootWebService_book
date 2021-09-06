package com.springbook.admin.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//주의 Entity 클래스와 기본 Entity Repository가 함께 위치해야 함
public interface PostsRepository extends JpaRepository<Posts,Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

    //실제로는 조회용 프레임워크를 사용함  querydsl , jooq, MyBatis etc...
    // < Querydsl>
}
