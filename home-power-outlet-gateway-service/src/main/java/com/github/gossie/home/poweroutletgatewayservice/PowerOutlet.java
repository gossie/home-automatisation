package com.github.gossie.home.poweroutletgatewayservice;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PowerOutlet {

    private boolean enabled;
    private Room room;
}
