package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//1
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {
	private String userid;
	private String name;
	private String gender;
	private String city;
}
