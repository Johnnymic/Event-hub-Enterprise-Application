package com.decagon.eventhubbe.dto.request;import lombok.Getter;import lombok.Setter;@Setter@Getterpublic class BankData {    private int id;    private String name;    private String slug;    private String code;    private String longcode;    private String gateway;    private boolean pay_with_bank;    private boolean active;    private String country;    private String currency;    private String type;    private boolean _deleted;    private String is_deleted;    private String createdAt;    private String updatedAt;}