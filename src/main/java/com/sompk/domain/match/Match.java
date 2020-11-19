package com.sompk.domain.match;

import com.sompk.domain.Judge;
import com.sompk.domain.User;
import com.sompk.domain.enums.JudgeType;
import com.sompk.domain.enums.Points;
import com.sompk.domain.participants.Player;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Map;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "match_type",
        discriminatorType = DiscriminatorType.STRING)
public class Match {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
    private Map<JudgeType, Judge> judges;
    private Timestamp time;
    private User technician;
    private Map<Player, Points> result;

}
