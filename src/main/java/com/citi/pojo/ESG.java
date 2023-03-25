package com.citi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ESG {
    private Integer id;
    private Integer code;
    private String market;
    private String name;
    private Integer year;
    private Integer score;
}
