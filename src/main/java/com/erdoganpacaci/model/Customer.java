package com.erdoganpacaci.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseEntity{

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="tckn")
    private String tckn;

    @Column(name="birth_of_date")
    private Date birthOfDate;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true) //ilişkili address tablosundaki veriyide siler
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)//ilişkili account tablosundaki veriyide siler
    @JoinColumn(name = "account_id")
    private Account account;



}
