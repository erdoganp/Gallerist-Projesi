package com.erdoganpacaci.dto;

import com.erdoganpacaci.exception.MessageType;
import lombok.Data;

import java.util.Date;

@Data
public class DtoBase {

    private Long id;

    private Date createTime;


}
