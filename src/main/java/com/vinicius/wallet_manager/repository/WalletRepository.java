package com.vinicius.wallet_manager.repository;

import com.vinicius.wallet_manager.domain.WalletDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<WalletDomain, Long> {
}
