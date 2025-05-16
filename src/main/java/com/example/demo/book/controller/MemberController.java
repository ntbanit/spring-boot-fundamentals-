package com.example.demo.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.book.entity.Book;
import com.example.demo.book.entity.Member;
import com.example.demo.book.repository.BookRepository;
import com.example.demo.book.repository.MemberRepository;

@Controller
public class MemberController {
	@Autowired
	private MemberRepository memberRepository;

	@GetMapping("/members")
	public String getBooks(Model model) throws Exception {
		model.addAttribute("members", memberRepository.findAll());
		return "members";
	}
	
	@GetMapping("/member/new")
	public String showCreateForm(Model model) {
		model.addAttribute("member", new Member());
		return "create_member" ;
	}
	
	@PostMapping("/members")
	public String saveBook(Member member) {
		memberRepository.save(member);
		return "redirect:/members";
	}
}
