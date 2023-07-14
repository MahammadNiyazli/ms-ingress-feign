package com.company.msingressfeign.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FeignTestRequest {
    String name;
    Integer age;
}
