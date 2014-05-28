package org.jspec.block.story;

import org.jspec.block.Block;
import org.jspec.block.PrefixedBlock;

/**
 * @author  dpersa
 */
public class And extends PrefixedBlock {

    private final Block block;

    public And(final String description, final Block block) {
        super("And", description);
        this.block = block;
    }

    @Override
    public void execute() {
        block.execute();
    }
}
