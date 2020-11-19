package com.sompk.domain.match;

import com.sompk.domain.enums.Points;
import com.sompk.domain.participants.Player;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Map;

@Entity
@DiscriminatorValue(value = "TeamMatch")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeamMatch extends Match {
    //miejsce odpowiada pozycji startujacego
    private Map<Integer, Player> team1;
    private Map<Integer, Player> druzyna2;
    private Map<Player, Points> wynik;
}
