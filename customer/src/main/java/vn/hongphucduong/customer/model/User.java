package vn.hongphucduong.customer.model;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import vn.hongphucduong.customer.util.StringPrefixedSequenceIdGenerator;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cus_seq")
    @GenericGenerator(
            name = "cus_seq",
            strategy = "vn.hongphucduong.customer.util.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "HPD"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%07d") })
    private String id;

    private String name;

    private String address;

    private String parentId;

    private String bankAccountNumber;

    private String fullName;

    private String phoneNumber;

    private String email;

    private String password;

}
