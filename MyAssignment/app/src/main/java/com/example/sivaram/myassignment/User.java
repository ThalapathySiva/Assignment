package com.example.sivaram.myassignment;

import java.lang.ref.SoftReference;

public class User {
    private String name;
    private String role;
    private String timestamp;
    private String status;
    private String billno;
    private String rate;
    private String ad1;
    private String ad2;
    private String ad3;
    private String position;
    private String tax;
    private String discount;
    private String tt;
    private String start;
    private String end;
    private String rateamount;
    private String payment;
    private String service;
    private String total;
    private String cancel;

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public User() {

    }

    public User(String cancel,String name, String role, String timestamp, String status, String billno, String rate, String ad1, String ad2, String ad3, String position, String tax, String discount, String tt, String start, String end, String rateamount, String payment, String service, String total) {
        this.name = name;
        this.cancel=cancel;
        this.role = role;
        this.timestamp = timestamp;
        this.status = status;
        this.billno = billno;
        this.rate = rate;
        this.ad1 = ad1;
        this.ad2 = ad2;
        this.ad3 = ad3;
        this.position = position;
        this.tax = tax;
        this.discount = discount;
        this.tt = tt;
        this.start = start;
        this.end = end;
        this.rateamount = rateamount;
        this.payment = payment;
        this.service = service;
        this.total = total;
    }

    public String getAd1() {
        return ad1;
    }

    public void setAd1(String ad1) {
        this.ad1 = ad1;
    }

    public String getAd2() {
        return ad2;
    }

    public void setAd2(String ad2) {
        this.ad2 = ad2;
    }

    public String getAd3() {
        return ad3;
    }

    public void setAd3(String ad3) {
        this.ad3 = ad3;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRateamount() {
        return rateamount;
    }

    public void setRateamount(String rateamount) {
        this.rateamount = rateamount;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
