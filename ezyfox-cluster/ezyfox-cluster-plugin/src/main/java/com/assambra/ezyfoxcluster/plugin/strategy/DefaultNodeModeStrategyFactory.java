package com.assambra.ezyfoxcluster.plugin.strategy;

import com.assambra.ezyfoxcluster.plugin.enums.NodeMode;

public class DefaultNodeModeStrategyFactory implements NodeModeStrategyFactory {
    public NodeStrategy getStrategy(NodeMode nodeMode) {
        switch (nodeMode) {
            case LEADER:
                return new LeaderNodeStrategy();
            case WORKER:
                return new WorkerNodeStrategy();
            case SINGLE:
                return new SingleNodeStrategy();
            default:
                throw new IllegalArgumentException("Unknown NodeMode: " + nodeMode);
        }
    }
}
