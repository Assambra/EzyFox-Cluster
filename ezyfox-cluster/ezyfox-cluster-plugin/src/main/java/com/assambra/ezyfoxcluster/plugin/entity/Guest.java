package com.assambra.ezyfoxcluster.plugin.entity;

import com.assambra.ezyfoxcluster.plugin.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.plugin.enums.EntityType;

public class Guest extends BaseEntity{
    public Guest(Long id) {
        super(id, EntityType.GUEST, CommunicationChannel.GUEST_COM);
    }
}
