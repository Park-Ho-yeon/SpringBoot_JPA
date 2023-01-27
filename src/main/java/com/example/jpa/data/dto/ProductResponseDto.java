package com.example.jpa.data.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ProductResponseDto {

    private Long number;
    private String name;
    private int price;
    private int stock;


}
