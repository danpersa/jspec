package org.jspec.block.story;

import org.jspec.block.Block;
import org.jspec.block.PrefixedBlock;

/**
 * @author  dpersa
 */
public class Given extends PrefixedBlock {

    private final Block block;

    public Given(final String description, final Block block) {
        super("Given", description);
        this.block = block;
    }

    @Override
    public void execute() {
        block.execute();
    }
}
