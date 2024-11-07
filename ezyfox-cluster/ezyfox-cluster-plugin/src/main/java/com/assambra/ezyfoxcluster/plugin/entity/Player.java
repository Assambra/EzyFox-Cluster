package com.assambra.ezyfoxcluster.plugin.entity;

import com.assambra.ezyfoxcluster.plugin.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.plugin.enums.EntityType;

public class Player extends BaseEntity{
    public Player(Long id) {
        super(id, EntityType.PLAYER, CommunicationChannel.PLAYER_COM);
    }
}
