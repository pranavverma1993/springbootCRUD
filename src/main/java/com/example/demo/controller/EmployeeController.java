package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.AppConstants;
import com.example.demo.constant.ErrorConstants;
import com.example.demo.constant.SuccessConstants;
import com.example.demo.constant.URIConstants;
import com.example.demo.dto.CommonResponseDto;
import com.example.demo.dto.EmployeeInputDto;
import com.example.demo.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {
	
@Autowired	
EmployeeService employeeService;

@RequestMapping(method = RequestMethod.POST, value = URIConstants.SAVE_USER_DATA)
public CommonResponseDto saveEmployeelist( @RequestBody EmployeeInputDto EmployeeInputDto) {
	CommonResponseDto response = new CommonResponseDto();
	
	try {
		response = employeeService.fetchlist(EmployeeInputDto);
		response.setResponseCode(AppConstants.SUCCESS_CODE);
		response.setResponseMessage(SuccessConstants.SAVE_EMPLOYEE);
	} catch (Exception e) {
		
		response.setResponseCode(AppConstants.FAILURE_CODE);
		response.setResponseMessage(ErrorConstants.SAVE_EMPLOYEE_ERROR);
	}
	return response;
}
}