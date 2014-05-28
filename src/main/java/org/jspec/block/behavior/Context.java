package org.jspec.block.behavior;

import java.util.List;

import org.jspec.block.Block;
import org.jspec.block.PrefixedCompositeBlock;

/**
 * @author  dpersa
 */
public class Context extends PrefixedCompositeBlock {

    public Context(final String description, final Integer depth, final List<Block> blocks) {
        super("context", description, blocks);
        setDepth(depth);
    }
}
