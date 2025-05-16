package com.example.demo.book.service;

import com.example.demo.book.entity.Borrowing;

public interface BorrowingService {
	Borrowing brrowBook(Long bookId, Long memberId);

	Borrowing returnBook(Long borrowingId);
}
