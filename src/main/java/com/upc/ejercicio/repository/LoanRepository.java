package com.upc.ejercicio.repository;

import com.upc.ejercicio.model.Book;
import com.upc.ejercicio.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Long>{
    boolean existsByCodeStudent(String codeStudent);
    boolean existsByCodeStudentAndBookAndBookLoan(String codeStudent, Book book, Boolean bookLoan);
    List<Loan> findByCodeStudent(String codeStudent);
}
