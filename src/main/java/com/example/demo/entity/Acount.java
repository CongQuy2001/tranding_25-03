package com.example.demo.entity;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.tool.schema.internal.exec.GenerationTarget;

import lombok.Data;
@Data
@Entity
@Table(name="account")
//@GeneratedValue(strategy = Genaration)
public class Acount {
	@Id
	@Column(name="account_id")
private Long accountId;
	@Column(name="account_no")
private String accountNo;
	@Column(name="card_no")
private String cardNo;
	@Column(name="fullname")
private String fullName;
	@Column(name="a,ount")
private Long amount;
	@Column(name="isusedate")
private Date issuedDate;
}
