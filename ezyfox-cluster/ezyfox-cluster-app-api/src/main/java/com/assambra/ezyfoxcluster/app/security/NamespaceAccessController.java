package com.assambra.ezyfoxcluster.app.security;

import com.assambra.ezyfoxcluster.common.entity.BaseEntity;
import com.assambra.ezyfoxcluster.common.enums.CommunicationChannel;
import com.assambra.ezyfoxcluster.common.exception.NamespaceAccessException;
import com.tvd12.ezyfoxserver.context.EzyAppContext;
import com.tvd12.ezyfoxserver.controller.EzyAbstractAppEventController;
import com.tvd12.ezyfoxserver.entity.EzyUser;
import com.tvd12.ezyfoxserver.event.EzyUserAccessAppEvent;

public class NamespaceAccessController extends EzyAbstractAppEventController<EzyUserAccessAppEvent> {

    @Override
    public void handle(EzyAppContext context, EzyUserAccessAppEvent event) {
        EzyUser user = event.getUser();
        String appName = context.getApp().getSetting().getName();

        BaseEntity entity = (BaseEntity) user.getProperty("entity");
        CommunicationChannel userChannel = entity.getCommunicationChannel();

        if (!appName.equals(userChannel.getChannelName())) {
            throw new NamespaceAccessException(user.getName(), userChannel.getChannelName(), "User not authorized for this namespace");
        }
    }
}
