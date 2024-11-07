package com.assambra.ezyfoxcluster.common.entity;

import com.assambra.ezyfoxcluster.common.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.common.enums.EntityType;

public class Room extends BaseEntity{
    public Room(Long id) {
        super(id, EntityType.ROOM, CommunicationChannel.ROOM_COM);
    }
}
