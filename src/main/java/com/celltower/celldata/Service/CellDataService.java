package com.celltower.celldata.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celltower.celldata.Repository.CellDataRepository;
import com.celltower.celldata.entity.CellData;

@Service
public class CellDataService {

    private final CellDataRepository cellDataRepository;

    @Autowired
    public CellDataService(CellDataRepository cellDataRepository) {
        this.cellDataRepository = cellDataRepository;
    }

    public CellData saveCellData(CellData cellData) {
        return cellDataRepository.save(cellData);
    }
}