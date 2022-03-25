package com.example.demo.sevice.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Acount;
import com.example.demo.sevice.AccountSevice;

public class AccountSeviceImpl implements AccountSevice {
  @Autowired
	Acount accountRepo;
	@Override
	public Acount save(Acount account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acount update(Acount account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acount getById(Long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
