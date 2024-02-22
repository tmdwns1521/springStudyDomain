package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repository.JpaMemberRepository;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;

import jakarta.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private EntityManager em;
    
    @Autowired
    public SpringConfig(EntityManager em) { 
        this.em = em; 
    }

    @Bean
    public MemberService memberService() { return new MemberService(memberRepository()); }

    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }

}
