package org.quarkusCourse.entites;




import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
public class Customer extends PanacheEntity {

    private String code;
    private String accountNumber;
    private String names;
    private String surname;
    private String phone;
    private String address;
    @OneToMany(mappedBy = "customer",cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Product> products;

}
