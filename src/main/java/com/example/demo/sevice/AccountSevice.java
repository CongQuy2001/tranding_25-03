package com.example.demo.sevice;

import com.example.demo.entity.Acount;

public interface AccountSevice {
Acount save(Acount account);
Acount update(Acount account);
Acount getById(Long accountId);
static void deleteById(String accountId) {
	// TODO Auto-generated method stub
	
}

}
