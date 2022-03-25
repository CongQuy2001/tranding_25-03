package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Acount;
import com.example.demo.sevice.AccountSevice;
@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountSevice accountsevice;
	
	@PostMapping("/save")
	@ResponseBody
public ResponseEntity<?> save(@RequestBody Acount acount) {
	return null;
	
}
	@PostMapping("/update")
	@ResponseBody
	public ResponseEntity<?> update(@RequestBody Acount acount) {
		return null;
		
	}
	@PostMapping("/delete/{accountId}")
	@ResponseBody
	public ResponseEntity<?> delete(@PathVariable String accountId) {
		AccountSevice.deleteById()
		return null;
		
	}

}
