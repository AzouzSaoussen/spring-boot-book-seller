package com.sao.springbootbookseller.service;/*
 * @created 26/12/2022 - 11:32
 * @project spring-boot-book-seller
 * @author Azouz
 */

import com.sao.springbootbookseller.model.PurchaseHistory;
import com.sao.springbootbookseller.repository.IPurchaseHistoryRepository;
import com.sao.springbootbookseller.repository.projection.IPurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class PurchaseHistoryService implements IPurchaseHistoryService{
    private final IPurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseHistoryService(IPurchaseHistoryRepository purchaseHistoryRepository)
    {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }
    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {
        purchaseHistory.setPurchaseTime(LocalDateTime.now());

        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemsOfUser(Long userId) {
        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }
}
