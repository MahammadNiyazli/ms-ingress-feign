package com.company.msingressfeign.rest.client;

import com.company.msingressfeign.rest.request.EmployeeSaveRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ms-employees", url = "${client.urls.ms-employees}")
public interface EmployeeClient {

    @PostMapping("v1/employee")
    void saveEmployee(@RequestBody EmployeeSaveRequest employeeSaveRequest);

}
