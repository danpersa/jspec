package org.jspec.block;


import org.jspec.block.behavior.Before;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dpersa
 */
public abstract class CompositeBlock extends DefaultBlock {

    private final List<Block> blocks;

    protected CompositeBlock(String description, final List<Block> blocks) {
        super(description);
        this.blocks = blocks;
    }

    @Override
    public void execute() {
        print();
        List<Block> beforeBlocks = blocks.stream().filter(b -> b instanceof Before).collect(Collectors.toList());
        List<Block> childBlocks = blocks.stream().filter(b -> !(b instanceof Before)).collect(Collectors.toList());

        childBlocks.forEach(it -> {
            beforeBlocks.forEach(before -> before.execute());
            it.setDepth(depth() + 1);
            if (!(it instanceof CompositeBlock)) {
                it.print();
            }
            it.execute();
        });
    }
}
