package org.jspec.block.story;

import org.jspec.block.Block;
import org.jspec.block.PrefixedBlock;

/**
 * @author  dpersa
 */
public class When extends PrefixedBlock {

    private final Block block;

    public When(final String description, final Block block) {
        super("When", description);
        this.block = block;
    }

    @Override
    public void execute() {
        block.execute();
    }
}
