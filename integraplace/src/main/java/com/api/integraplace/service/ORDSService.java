package com.api.integraplace.service;

import com.api.integraplace.entity.ORDSEntity;
import com.api.integraplace.form.*;
import com.api.integraplace.repository.ORDSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ORDSService {

    @Autowired
    private ORDSRepository _ORDSRepository;

    @Autowired
    private ORITService _ORITService;

    public List<ORDSEntity> findAllORDS(){

        return _ORDSRepository.findAll();

    }

    public ORDSEntity createORDS(ORDSForm _ORDSForm){
        long idLastORDS = _ORDSRepository.count();
        String codeFormatted = "ORDS"+(idLastORDS+1);

        ORDSEntity ordsAux = new ORDSEntity();
        ordsAux.setCode(codeFormatted);
        ordsAux.setStatus("Open");
        ordsAux.setData_doc(new Date());
        ordsAux.setTotalprice(0.0);

        ORDSEntity orderResponse = _ORDSRepository.save(ordsAux);

        double totalValue = _ORITService.saveORITList(orderResponse, _ORDSForm.getItems_collection());

        orderResponse.setTotalprice(totalValue);

        return _ORDSRepository.save(orderResponse);
    }

}
