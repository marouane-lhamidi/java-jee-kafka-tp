package com.example.demospringcloudstreamkafka.entities;


import lombok.*;

import java.util.Date;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;
}
