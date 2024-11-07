package com.assambra.ezyfoxcluster.common.entity;

import com.assambra.ezyfoxcluster.common.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.common.enums.EntityType;

public class Server extends BaseEntity{
    public Server(Long id) {
        super(id, EntityType.SERVER, CommunicationChannel.SERVER_COM);
    }
}
