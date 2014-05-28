package org.jspec.block;

/**
 * @author  dpersa
 */
public abstract class PrefixedBlock extends DefaultBlock {

    private final String prefix;

    protected PrefixedBlock(final String prefix, final String description) {
        super(description);
        this.prefix = prefix;
    }

    @Override
    public String prefix() {
        return prefix;
    }
}
