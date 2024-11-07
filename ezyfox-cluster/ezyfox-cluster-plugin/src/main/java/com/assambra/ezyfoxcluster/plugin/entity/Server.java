package com.assambra.ezyfoxcluster.plugin.entity;

import com.assambra.ezyfoxcluster.plugin.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.plugin.enums.EntityType;

public class Server extends BaseEntity{
    public Server(Long id) {
        super(id, EntityType.SERVER, CommunicationChannel.SERVER_COM);
    }
}
