package com.study.project.repository;

import com.study.project.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    // NULL이 반환될 가능성이 있는 메서드는 Optional로 묶어서 사용
    Optional<Member> findById(Long id);
    Optional<Member> finByName(String name);
    List<Member> findAll();

}
