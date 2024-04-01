package com.study.project.service;

import com.study.project.domain.Member;
import com.study.project.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    // Dependency Injection

    public MemberService(MemberRepository memberRepository) { this.memberRepository = memberRepository; }

    /*
    회원 가입 구현

    중복되는 회원은 가입X
     */
    public Long join(Member member) {
        extractedMember(member);    // 중복회원 검증 메서드
        memberRepository.save(member);
        return member.getId();
    }

    private void extractedMember(Member member) {

        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /*
    전체 회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
