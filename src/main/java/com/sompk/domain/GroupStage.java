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
public class GroupStage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //    List<Druzyna/Zawodnik>uczestnicy;
//    Map<Integer, Druzyna/Zawodnik>miejceWgrupie;
//    private List<Battleground> pola;
}
