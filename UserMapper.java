package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dataInput.Input;
import com.example.demo.dataInput.UserInfo;




@Mapper
public interface  UserMapper {
	

	int doCheck(Input request);

	
	UserInfo getUserInfo(Input request);
}
