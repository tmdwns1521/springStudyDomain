package com.example.demo.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.demo.domain.Member;

public class MemoryMemberRepositoryTest {
    
    MemoryMemberRepository memberRepository = new MemoryMemberRepository();

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        memberRepository.save(member);
        Member result = memberRepository.findById(member.getId()).get();
        Assertions.assertEquals(member, result);
    }

}
