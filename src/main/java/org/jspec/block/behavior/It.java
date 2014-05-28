package org.jspec.block.behavior;

import org.jspec.block.Block;
import org.jspec.block.PrefixedBlock;

/**
 * @author  dpersa
 */
public class It extends PrefixedBlock {

    private final Block block;

    public It(final String description, final Block block) {
        super("it", description);
        this.block = block;
    }

    @Override
    public void execute() {
        block.execute();
    }
}
