package com.example.demo.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.book.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	Member findByMemberId(String memberId);
}
