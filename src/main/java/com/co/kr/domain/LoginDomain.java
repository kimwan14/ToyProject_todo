package com.co.kr.domain;

import groovy.transform.builder.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder(builderMethodName = "builder")
public class LoginDomain {
	private Integer mbSeq;
	private String mbId;
	private String mbPw;
	private String mbLevel;
	private String mbIp;
	private String mbUse;
	private String mbCreateAt;
	private String mbUpdateAt;
}

//member 테이블에서 data 가져올 때 담을 domain 작성