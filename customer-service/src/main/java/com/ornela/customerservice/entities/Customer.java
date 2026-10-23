package com.ornela.customerservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CUSTOMERS")
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
}
