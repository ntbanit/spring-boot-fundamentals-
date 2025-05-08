package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.jpa.entity.Student;
import com.example.demo.jpa.repo.StudentRepository;


/** SECTION #5: Spring Data JPA*/
@SpringBootTest
class Section5DataJPATests {

	@Autowired
	StudentRepository studentRepository;

	@Test
	void testRepoInsert() {
		// insert
		Student student = new Student(1L, "An", 100);
		studentRepository.save(student);

		Optional<Student> optional = studentRepository.findById(1L);
		Student actualInsert = optional.get();
		assertNotNull(actualInsert);
		assertEquals(actualInsert.getName(), "An");
		assertEquals(actualInsert.getTestScore(), 100);

	}

	@Test
	void testRepoUpdate() {
		// insert
		Student student = new Student(2L, "An", 100);
		studentRepository.save(student);

		// update
		student.setName("NguyenThiBinhAn");
		student.setTestScore(99);
		studentRepository.save(student);

		Optional<Student> optional = studentRepository.findById(2L);
		Student actualUpdate = optional.get();
		assertEquals(actualUpdate.getName(), "NguyenThiBinhAn");
		assertEquals(actualUpdate.getTestScore(), 99);

	}

	@Test
	void testRepoDelete() {
		// insert
		Student student = new Student(3L, "An", 100);
		studentRepository.save(student);
		// delete
		studentRepository.deleteById(3L);
		Optional<Student> optional = studentRepository.findById(3L);
		assertThrows(NoSuchElementException.class, () -> {
			optional.get();
		});

	}
}
