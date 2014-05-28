package org.jspec.block.story;

import org.jspec.block.Block;
import org.jspec.block.PrefixedBlock;

/**
 * @author  dpersa
 */
public class Then extends PrefixedBlock {

    private final Block block;

    public Then(final String description, final Block block) {
        super("Then", description);
        this.block = block;
    }

    @Override
    public void execute() {
        block.execute();
    }
}
