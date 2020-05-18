package com.model;

import lombok.*;
import org.bouncycastle.asn1.x500.X500Name;

import java.security.PrivateKey;


@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IssuerData {
    private PrivateKey privateKey;
    private X500Name x500name;

}
