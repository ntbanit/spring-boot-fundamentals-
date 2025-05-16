package com.example.demo.book.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.book.entity.Borrowing;
import com.example.demo.book.repository.BookRepository;
import com.example.demo.book.repository.BorrowingRepository;
import com.example.demo.book.repository.MemberRepository;

public class BorrowingServiceImpl implements BorrowingService {
	@Autowired
	BorrowingRepository borrowingRepository;

	@Autowired
	BookRepository bookRepository;
	@Autowired
	MemberRepository memberRepository;

	@Override
	public Borrowing brrowBook(Long bookId, Long memberId) {
		Borrowing borrowing = new Borrowing() ;
		borrowing.setBook(bookRepository.findById(bookId).get());
		borrowing.setMember(memberRepository.findById(memberId).get());
		borrowing.setBorrowedDate(new Date());
		
		return borrowingRepository.save(borrowing);
	}

	@Override
	public Borrowing returnBook(Long borrowingId) {
		// TODO Auto-generated method stub
		return null;
	}

}
