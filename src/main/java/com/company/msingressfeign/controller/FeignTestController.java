package com.company.msingressfeign.controller;

import com.company.msingressfeign.dto.request.FeignTestRequest;
import com.company.msingressfeign.rest.client.EmployeeClient;
import com.company.msingressfeign.rest.request.EmployeeSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/employee-client")
@RequiredArgsConstructor
public class FeignTestController {

    private final EmployeeClient employeeClient;

    @PostMapping
    public void feignTest(@RequestBody FeignTestRequest feignTestRequest){
        EmployeeSaveRequest request = EmployeeSaveRequest.builder()
                .name(feignTestRequest.getName())
                .age(feignTestRequest.getAge())
                .build();
        employeeClient.saveEmployee(request);
    }


}
