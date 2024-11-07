package com.assambra.ezyfoxcluster.plugin.entity;

import com.assambra.ezyfoxcluster.plugin.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.plugin.enums.EntityType;

public class Room extends BaseEntity{
    public Room(Long id) {
        super(id, EntityType.ROOM, CommunicationChannel.ROOM_COM);
    }
}
