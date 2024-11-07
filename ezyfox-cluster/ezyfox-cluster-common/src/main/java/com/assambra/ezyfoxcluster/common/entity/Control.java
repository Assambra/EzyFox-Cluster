package com.assambra.ezyfoxcluster.common.entity;

import com.assambra.ezyfoxcluster.common.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.common.enums.EntityType;

public class Control extends BaseEntity{
    public Control(Long id) {
        super(id, EntityType.CONTROL, CommunicationChannel.CONTROL_COM);
    }
}
