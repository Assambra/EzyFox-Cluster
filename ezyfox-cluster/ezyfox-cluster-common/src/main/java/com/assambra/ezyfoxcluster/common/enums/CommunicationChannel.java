package com.assambra.ezyfoxcluster.common.enums;

import lombok.Getter;

@Getter
public enum CommunicationChannel {
    PLAYER_COM("player_com"),
    GUEST_COM("guest_com"),
    SERVER_COM("server_com"),
    ROOM_COM("room_com"),
    CONTROL_COM("control_com");

    private final String channelName;

    CommunicationChannel(String channelName) {
        this.channelName = channelName;
    }
}
