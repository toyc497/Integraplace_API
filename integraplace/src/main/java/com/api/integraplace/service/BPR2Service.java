package com.api.integraplace.service;

import com.api.integraplace.entity.BPR2Entity;
import com.api.integraplace.repository.BPR2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BPR2Service {

    @Autowired
    private BPR2Repository _BPR2Repository;

    public BPR2Entity createBussinessPartner(BPR2Entity bpr2){

        long idLastBP = _BPR2Repository.count();

        String codeFormatted = "BPR2"+(idLastBP+1);
        bpr2.setCode(codeFormatted);

        return _BPR2Repository.save(bpr2);

    }

    public List<BPR2Entity> findAllBPR2(){

        return _BPR2Repository.findAll();

    }

}
