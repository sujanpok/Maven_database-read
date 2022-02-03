//service

package com.example.demo.service;

import org.springframework.ui.Model;

import com.example.demo.dataInput.Input;

public interface LoginService {

	String checklogin(Input request, Model model);
}
