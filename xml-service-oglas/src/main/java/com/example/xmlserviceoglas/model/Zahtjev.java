package com.example.xmlserviceoglas.model;

import java.util.Date;
import java.util.Set;

public class Zahtjev {
    private StatusZahtjeva statusZahtjeva;
    private Date datumKreiranja;
    private boolean potvrdjen;
    private boolean bandle;
    private Set<Oglas> oglasi;
}
