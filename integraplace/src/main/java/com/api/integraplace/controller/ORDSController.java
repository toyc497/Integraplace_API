package com.api.integraplace.controller;

import com.api.integraplace.entity.ORDSEntity;
import com.api.integraplace.form.ORDSForm;
import com.api.integraplace.service.ORDSService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class ORDSController {

    @Autowired
    private ORDSService _ORDSService;

    @GetMapping("/all")
    public ResponseEntity<List<ORDSEntity>> getAllORDS(){

        List<ORDSEntity> ordsListResponse = _ORDSService.findAllORDS();

        return ResponseEntity.status(HttpStatus.OK).body(ordsListResponse);
    }

    @PostMapping("/create")
    public ResponseEntity<ORDSEntity> saveORDS(@RequestBody @Valid ORDSForm _ORDSForm){

        ORDSEntity ordsResponse = _ORDSService.createORDS(_ORDSForm);

        return ResponseEntity.status(HttpStatus.CREATED).body(ordsResponse);
    }

}
