package com.assambra.ezyfoxcluster.common.entity;

import com.assambra.ezyfoxcluster.common.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.common.enums.EntityType;

public class Guest extends BaseEntity{
    public Guest(Long id) {
        super(id, EntityType.GUEST, CommunicationChannel.GUEST_COM);
    }
}
