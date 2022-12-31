package com.sao.springbootbookseller.repository.projection;/*
 * @created 26/12/2022 - 11:09
 * @project spring-boot-book-seller
 * @author Azzouz
 */

import java.time.LocalDateTime;

public interface IPurchaseItem {
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
