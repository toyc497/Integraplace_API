package com.api.integraplace.service;

import com.api.integraplace.entity.OPOREntity;
import com.api.integraplace.repository.OPORRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class OPORService {

    @Autowired
    private OPORRepository _OPORRepository;

    public List<OPOREntity> findAllOpportunities(){

        return _OPORRepository.findAll();

    }

    public List<OPOREntity> findParticipationOportunities(String participationAux){

        return this._OPORRepository.findByParticipationOption(participationAux);

    }

    public OPOREntity updateParticipation(OPOREntity opor_aux){

        Optional<OPOREntity> oporAuxBD = this._OPORRepository.findById(opor_aux.getId());
        OPOREntity opor_aux_founded = null;

        if(oporAuxBD.isPresent()){
            opor_aux_founded = oporAuxBD.get();
        }

        if(!Objects.equals(opor_aux.getParticipar(), "")){
            assert opor_aux_founded != null;
            opor_aux_founded.setParticipar(opor_aux.getParticipar());
        }

        return this._OPORRepository.save(opor_aux_founded);

    }

}
