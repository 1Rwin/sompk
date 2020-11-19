package com.sompk.domain;

import com.sompk.domain.match.Match;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FightsOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Map<Integer, Match> order;
}
