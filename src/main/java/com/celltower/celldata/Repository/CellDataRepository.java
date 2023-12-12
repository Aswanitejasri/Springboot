package com.celltower.celldata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celltower.celldata.entity.CellData;

public interface CellDataRepository extends JpaRepository<CellData, Long> {
    // You can add custom queries if needed
}
