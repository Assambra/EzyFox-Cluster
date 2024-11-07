package com.assambra.ezyfoxcluster.common.factory;

import com.assambra.ezyfoxcluster.common.entity.*;
import com.assambra.ezyfoxcluster.common.enums.EntityType;

public class EntityFactory {
    public static BaseEntity createEntity(Long id, String entityTypeStr) {
        EntityType entityType = EntityType.valueOf(entityTypeStr.toUpperCase());
        switch (entityType) {
            case PLAYER:
                return new Player(id);
            case GUEST:
                return new Guest(id);
            case SERVER:
                return new Server(id);
            case ROOM:
                return new Room(id);
            case CONTROL:
                return new Control(id);
            default:
                throw new IllegalArgumentException("Unknown EntityType: " + entityTypeStr);
        }
    }
}