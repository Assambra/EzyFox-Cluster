package com.assambra.ezyfoxcluster.plugin.strategy;

import com.tvd12.ezyfox.util.EzyLoggable;
import com.tvd12.ezyfoxserver.context.EzyPluginContext;

public class WorkerNodeStrategy extends EzyLoggable implements NodeStrategy {
    @Override
    public void initialize(EzyPluginContext context) {
        logger.info("Initializing Worker Node");
    }
}
