package com.assambra.ezyfoxcluster.plugin.entity;

import com.assambra.ezyfoxcluster.plugin.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.plugin.enums.EntityType;

public class Control extends BaseEntity{
    public Control(Long id) {
        super(id, EntityType.CONTROL, CommunicationChannel.CONTROL_COM);
    }
}
