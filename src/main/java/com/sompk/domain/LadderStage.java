package com.sompk.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LadderStage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    List<Zawodnik> uczestnicy;
//    List<Mecz> 1stage;
//    List<Mecz> 2stage;
//    List<Mecz> 3stage;
//    List<Mecz>final;
//    List<Pole> pola;
}
