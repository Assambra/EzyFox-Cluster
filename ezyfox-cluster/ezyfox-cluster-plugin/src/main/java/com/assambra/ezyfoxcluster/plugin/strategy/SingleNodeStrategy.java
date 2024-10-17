package com.assambra.ezyfoxcluster.plugin.strategy;

import com.tvd12.ezyfox.util.EzyLoggable;
import com.tvd12.ezyfoxserver.context.EzyPluginContext;

public class SingleNodeStrategy extends EzyLoggable implements NodeStrategy {

    private final LeaderNodeStrategy leaderNodeStrategy;
    private final WorkerNodeStrategy workerNodeStrategy;

    public SingleNodeStrategy() {
        this.leaderNodeStrategy = new LeaderNodeStrategy();
        this.workerNodeStrategy = new WorkerNodeStrategy();
    }

    @Override
    public void initialize(EzyPluginContext context) {
        logger.info("Initializing Single Node");
        leaderNodeStrategy.initialize(context);
        workerNodeStrategy.initialize(context);
    }
}
