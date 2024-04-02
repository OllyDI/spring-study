package com.study.project.repository;

import com.study.project.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JpaRepository를 상속 받으면 자동으로 구현제를 만들고 스프링 빈에 등록해줌
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
