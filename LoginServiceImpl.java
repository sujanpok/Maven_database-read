//serivice/servicempl
package com.example.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.dataInput.Input;
import com.example.demo.dataInput.UserInfo;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;



	@Override
	public String checklogin(Input request,Model model) {
 	int i = userMapper.doCheck(request);
 	String msg;
    	if(i< 1) {
    		msg= "ない";
    	}else {
    		UserInfo userInfo =	userMapper.getUserInfo(request);
    		 model.addAttribute("userinfo",userInfo);
    		msg="OK";
    	}
		
    	 model.addAttribute("msg",msg);
		return msg;
	}
	
}
