package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.constant.AppConstants;
import com.example.demo.constant.ErrorConstants;
import com.example.demo.dto.CommonResponseDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.dto.EmployeeDtoList;
import com.example.demo.dto.EmployeeInputDto;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	public CommonResponseDto fetchlist(EmployeeInputDto employeeInputDto) throws Exception {
		
		CommonResponseDto response = new CommonResponseDto();
		EmployeeEntity employeeEntity = new EmployeeEntity();
		
		try {
//			employeeEntity.setId(employeeInputDto.getId());
			employeeEntity.setFirstName(employeeInputDto.getFirstName());
			employeeEntity.setLastName(employeeInputDto.getLastName());
			employeeRepo.save(employeeEntity);
		}
		catch (Exception exception) {
			response.setResponseCode(AppConstants.FAILURE_CODE);
			response.setResponseMessage(ErrorConstants.SAVE_EMPLOYEE_ERROR);
	
	}
		return response;
	}


}