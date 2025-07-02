package com.erdoganpacaci.exception;

import lombok.Getter;

@Getter
public enum MessageType {

    NO_RECORD_EXIST("1004", "kayıt bulunamadı"),
    TOKEN_IS_EXPIRED("1005", "Tokenın süresi bitmistir"),
    GENERAL_EXCEPTION("9999", "genel bir hata olustu"),
    USERNAME_NOT_FOUND("1006", "usename bulunmadı"),
    REFRESH_TOKEN_NOT_FOUND("1008", "refresh token bulunamadı"),
    REFRESH_TOKEN_IS_EXPIRED("1009", "Refresh tokenin süresi bitmistir"),
    CURRENCY_RATES_IS_OCCURED("1010", "DOVİZ KURU ALINAMADI"),
    CUSTOMER_AMOUNT_IS_NOT_ENOUGH("1011", "musterinin parası yeterli değildir"),
    CAR_STATUS_IS_ALREADY_SALED("1012" ,"araba satılmıs göründügü için satılamaz"),
    USERNAME_OR_PASSWORD_INVALID("1007", "kullanıcı adı veya sifre hatalı"),
    CAR_IS_ON_SALE("1013","Araba bir galeride satısta"),
    GALLERIST_IS_ACTIVE("1014","Galerici suan aktif olarak satıs yapıyor"),
    DATA_IS_ALREADY_USED("1015","Data suan kullanılıyor");

    private String code;

    private String message;

     MessageType (String code, String message){

        this.code = code;
        this.message = message;
    }
}
