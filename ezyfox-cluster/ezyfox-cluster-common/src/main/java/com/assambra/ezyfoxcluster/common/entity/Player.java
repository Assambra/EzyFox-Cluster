package com.assambra.ezyfoxcluster.common.entity;

import com.assambra.ezyfoxcluster.common.enums.EntityType;

public class Player extends BaseEntity {
    public Player(Long id) {
        super(id, EntityType.PLAYER);
    }
}
