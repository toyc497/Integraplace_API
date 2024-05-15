package com.api.integraplace.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="BPR2")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Data
public class BPR2Entity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="code",length = 20,unique=true)
    private String code;

    @Column(name="fullname",length = 50,unique=true)
    @NotNull
    private String fullname;

    @Column(name = "cnpj", length = 14, unique = true)
    @NotNull
    private Long cnpj;

    @Column(name="customer")
    private boolean customer;

    @Column(name="supplier")
    private boolean supplier;

    @Column(name = "email", length = 50, unique = false)
    @Email
    @NotNull
    private String email;

    @Column(name = "phone1", length = 11, unique = false)
    @NotNull
    private Long phone1;

    @Column(name = "phone2", length = 11, unique = false)
    private Long phone2;

    @Column(name = "cep", length = 8, unique = false)
    @NotNull
    private Long cep;

    @Column(name="address", length = 50, unique=false)
    @NotNull
    private String address;

    @Column(name = "streetnum", length = 5, unique = false)
    @NotNull
    private Integer streetnum;

    @Column(name="city", length = 50, unique=false)
    @NotNull
    private String city;

    @Column(name="block", length = 50, unique=false)
    @NotNull
    private String block;

    @Column(name="uf", length = 2, unique=false)
    @NotNull
    private String uf;

    @OneToMany(mappedBy = "bpr2Client",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<ORDSEntity> orders = new ArrayList<>();

}
