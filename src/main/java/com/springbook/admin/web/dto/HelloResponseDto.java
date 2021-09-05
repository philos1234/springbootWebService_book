package com.springbook.admin.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //모든 final 필드가 포함된 생성자 형성
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
