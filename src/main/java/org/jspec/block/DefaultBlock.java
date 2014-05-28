package org.jspec.block;

/**
 * @author  dpersa
 */
public abstract class DefaultBlock implements Block {

    private final String description;
    private Integer depth;

    protected DefaultBlock(final String description) {
        this.description = description;
        this.depth = 1;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public Integer depth() {
        return depth;
    }

    @Override
    public void setDepth(final Integer depth) {
        this.depth = depth;
    }
}
