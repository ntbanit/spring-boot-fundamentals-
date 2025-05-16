package com.example.demo.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.book.entity.Borrowing;

public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {
	List<Borrowing> findByBookId(Long bookId);

	List<Borrowing> findByMemberId(Long memberId);
}
