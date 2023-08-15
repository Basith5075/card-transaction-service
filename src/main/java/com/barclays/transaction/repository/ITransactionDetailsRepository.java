package com.barclays.transaction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barclays.transaction.model.Transactions;import jakarta.transaction.Transaction;

@Repository
public interface ITransactionDetailsRepository extends JpaRepository<Transactions, Integer>{
	List<Transactions> findByCardNumber(Double cardNumber);
}
