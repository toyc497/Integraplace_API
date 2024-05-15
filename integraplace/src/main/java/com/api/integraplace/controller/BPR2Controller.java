package com.api.integraplace.controller;

import com.api.integraplace.entity.BPR2Entity;
import com.api.integraplace.service.BPR2Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BussinessPartner2")
public class BPR2Controller {

    @Autowired
    private BPR2Service _BPR2Service;

    @PostMapping("/create")
    public ResponseEntity<BPR2Entity> saveBussinessPartner2(@RequestBody @Valid BPR2Entity bpr2){
        BPR2Entity bpr2Response = _BPR2Service.createBussinessPartner(bpr2);

        return ResponseEntity.status(HttpStatus.CREATED).body(bpr2Response);

    }

    @GetMapping("/all")
    public ResponseEntity<List<BPR2Entity>> findAllBussinessPartner2(){
        List<BPR2Entity> bprsResponseList = _BPR2Service.findAllBPR2();

        return ResponseEntity.status(HttpStatus.OK).body(bprsResponseList);

    }

}
