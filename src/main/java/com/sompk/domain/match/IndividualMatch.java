package com.sompk.domain.match;

import com.sompk.domain.participants.Player;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "IndividualMatch")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IndividualMatch extends Match {
    private Player player1;
    private Player player2;
}
