package com.api.integraplace.form;

import com.api.integraplace.entity.BPR1Entity;
import com.api.integraplace.entity.BPR2Entity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ORDSForm {

    private String code;
    private String status;
    private Date data_doc;
    private Double totalprice;
    private String bpr1Client;
    private String bpr2Client;
    private List<ORITForm> items_collection;

}
