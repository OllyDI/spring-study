package com.study.project.service;

import com.study.project.domain.Member;
import com.study.project.repository.MemberRepository;
import com.study.project.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 SpringBootTest : 스프링 컨테이너와 테스트를 함께 실행.

 Transactional : 테스트 시작 전에 트랜잭션을 실행하고 db쿼리를 모두 실행한 다음 롤백해줌
 -> 즉 테스트 케이스의 내용이 db에 반영이 안되어 반복적 테스트 가능
 */
@SpringBootTest
@Transactional
class MemberServiceIntegrationTest {


    // 테스트 시에는 편한게 최고! 그냥 오토 와이어드로 묶어버려라
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    // 테스트는 메서드 이름을 한글로 작성해도 상관 없음
    @Test
    void 회원가입() {
        /*
        given -> 이거가 주어지고
        when -> 이거를 실행했을 때
        then -> 이 결과가 나와야 된다

        테스트 케이스는 이런 패턴을 작성하는 것이 좋음
         */

        // given
        Member member = new Member();
        member.setName("spring");

        //when
        Long saveId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());

    }

    @Test
    void 중복_회원_예외() {
        // given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member1));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

//        try {
//            memberService.join(member2);
//            fail();
//        } catch (IllegalStateException e) {
//            Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재한다.");
//        }
    }
}