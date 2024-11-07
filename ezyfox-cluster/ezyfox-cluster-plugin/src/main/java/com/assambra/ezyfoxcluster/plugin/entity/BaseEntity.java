package com.assambra.ezyfoxcluster.plugin.entity;

import com.assambra.ezyfoxcluster.plugin.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.plugin.enums.EntityType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class BaseEntity {
    protected Long id;
    protected EntityType entityType;
    protected CommunicationChannel communicationChannel;
}
