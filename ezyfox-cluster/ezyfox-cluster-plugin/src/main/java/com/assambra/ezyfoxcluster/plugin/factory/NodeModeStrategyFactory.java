package com.assambra.ezyfoxcluster.plugin.factory;

import com.assambra.ezyfoxcluster.plugin.enums.NodeMode;
import com.assambra.ezyfoxcluster.plugin.strategy.LeaderNodeStrategy;
import com.assambra.ezyfoxcluster.plugin.strategy.NodeStrategy;
import com.assambra.ezyfoxcluster.plugin.strategy.SingleNodeStrategy;
import com.assambra.ezyfoxcluster.plugin.strategy.WorkerNodeStrategy;
import com.tvd12.ezyfox.bean.annotation.EzySingleton;

@EzySingleton
public class NodeModeStrategyFactory {

    public NodeStrategy getStrategy(NodeMode nodeMode) {
        switch (nodeMode) {
            case LEADER:
                return new LeaderNodeStrategy();
            case WORKER:
                return new WorkerNodeStrategy();
            default:
                return new SingleNodeStrategy();
        }
    }
}
