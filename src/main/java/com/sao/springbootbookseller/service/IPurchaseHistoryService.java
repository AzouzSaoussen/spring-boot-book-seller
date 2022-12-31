package com.sao.springbootbookseller.service;/*
 * @created 26/12/2022 - 11:30
 * @project spring-boot-book-seller
 * @author Azouz
 */

import com.sao.springbootbookseller.model.PurchaseHistory;
import com.sao.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
