package com.company.msingressfeign.rest.request;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class EmployeeSaveRequest {
    String name;
    Integer age;
}
