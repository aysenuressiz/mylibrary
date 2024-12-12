package com.dao;

import com.beans.BookLoans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookLoansDao extends JpaRepository<BookLoans, Integer> {
    // Örneğin, bir kullanıcının ödünç aldığı tüm kitapları listeleme
    List<BookLoans> findByUserId(int userId);
}
