package org.jspec.block.behavior;

import java.util.List;

import org.jspec.block.Block;
import org.jspec.block.PrefixedCompositeBlock;

/**
 * @author  dpersa
 */
public class Describe extends PrefixedCompositeBlock {

    public Describe(final String description, final Integer depth, final List<Block> blocks) {
        super("describe", description, blocks);
        setDepth(depth);
    }
}
