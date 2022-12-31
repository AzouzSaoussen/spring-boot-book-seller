package com.sao.springbootbookseller.controller;/*
 * @created 29/12/2022 - 12:40 PM
 * @project spring-boot-book-seller
 * @author Azzouz
 */

import com.sao.springbootbookseller.model.PurchaseHistory;
import com.sao.springbootbookseller.security.UserPrincipal;
import com.sao.springbootbookseller.service.IPurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase-history")//pre-path
public class PurchaseHistoryController {
    @Autowired
    private IPurchaseHistoryService purchaseHistoryService;

    @PostMapping //api/purchase-history
    public ResponseEntity<?> savePurchaseHistory(@RequestBody PurchaseHistory purchaseHistory) {
        return new ResponseEntity<>(purchaseHistoryService.savePurchaseHistory(purchaseHistory), HttpStatus.CREATED);
    }

    @GetMapping //api/purchase-history
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return ResponseEntity.ok(purchaseHistoryService.findPurchasedItemsOfUser(userPrincipal.getId()));
    }
}
