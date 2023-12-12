package com.celltower.celldata.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celltower.celldata.Service.CellDataService;
import com.celltower.celldata.entity.CellData;

@RestController
@RequestMapping("/api/cell_data")
public class CellDataController {

    private final CellDataService cellDataService;

    @Autowired
    public CellDataController(CellDataService cellDataService) {
        this.cellDataService = cellDataService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveCellData(@RequestBody CellData cellData) {
        // Save the cell data to the database using a service
        cellDataService.saveCellData(cellData);
        return ResponseEntity.ok("Data saved successfully");
    }
}
