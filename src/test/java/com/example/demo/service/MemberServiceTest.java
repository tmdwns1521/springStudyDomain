package com.example.demo.service;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.demo.domain.Member;

// public class MemberServiceTest {

//     MemberService memberService;
    
//     @Test
//     void 회원가입() {
//         // given
//         Member member = new Member();
//         member.setName("OSJ");

//         // when
//         Long saveId = memberService.join(member);

//         // then
//         Member findMember = memberService.findOne(saveId).get();
//         Assertions.assertEquals(findMember.getId(), saveId); 
//     }

//     @Test
//     void 중복_회원_예외() {
//         // given
//         Member member1 = new Member();
//         member1.setName("OSJ");

//         Member member2 = new Member();
//         member2.setName("OSJ");

//         // when
//         Long saveId1 = memberService.join(member1);

//         Long saveId2 = memberService.join(member2);

//         // then
//         Member findMember1 = memberService.findOne(saveId1).get();
//         Member findMember2 = memberService.findOne(saveId2).get();
//         Assertions.assertEquals(findMember1.getId(), findMember2.getId()); 
//     }
    
//     @Test
//     void findMembers() {
//         // given

//         // when

//         // then
//     }

//     @Test
//     void findOne() {
//         // given

//         // when

//         // then
//     }
// }
