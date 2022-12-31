package com.sao.springbootbookseller.repository;/*
 * @created 26/12/2022 - 11:06
 * @project spring-boot-book-seller
 * @author Azouz
 */

import com.sao.springbootbookseller.model.PurchaseHistory;
import com.sao.springbootbookseller.repository.projection.IPurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistory,Long> {
    @Query("select " +
            "b.title as title, ph.price as price, ph.purchaseTime " + "as purchaseTime  " +
            "from PurchaseHistory ph left join Book b on b.id = ph.bookId " +
            "where ph.userId = :userId")
    List<IPurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);
}
