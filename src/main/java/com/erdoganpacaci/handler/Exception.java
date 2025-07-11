package com.erdoganpacaci.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exception <E>{

    private String path;

    private Date createTime;

    private String hostname;

    private E message;
}
