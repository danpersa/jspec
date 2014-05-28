package org.jspec.block.story;

import java.util.List;

import org.jspec.block.Block;
import org.jspec.block.PrefixedCompositeBlock;

/**
 * @author  dpersa
 */
public class Scenario extends PrefixedCompositeBlock {

    public Scenario(final String description, final List<Block> blocks) {
        super("Scenario:", description, blocks);
    }
}
