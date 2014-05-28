package org.jspec.block;

import java.util.List;

/**
 * @author  dpersa
 */
public class PrefixedCompositeBlock extends CompositeBlock {

    private final String prefix;

    protected PrefixedCompositeBlock(final String prefix, final String description, final List<Block> blocks) {
        super(description, blocks);
        this.prefix = prefix;
    }

    @Override
    public String prefix() {
        return prefix;
    }
}
