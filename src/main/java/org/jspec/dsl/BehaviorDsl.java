package org.jspec.dsl;

import java.util.Arrays;
import java.util.List;

import org.jspec.block.Block;
import org.jspec.block.behavior.Before;
import org.jspec.block.behavior.Context;
import org.jspec.block.behavior.Describe;
import org.jspec.block.behavior.It;

/**
 * @author  dpersa
 */
public class BehaviorDsl {

    public static Block describe(final String description, final Block... blocks) {
        List<Block> blocksList = Arrays.asList(blocks);
        Describe block = new Describe(description, 1, blocksList);
        return block;
    }

    public static Block context(final String description, final Block... blocks) {
        List<Block> blocksList = Arrays.asList(blocks);
        Context block = new Context(description, 1, blocksList);
        return block;
    }

    public static Before before(final Before before) {
        return before;
    }

    public static It it(final String description, final Block block) {
        return new It(description, block);
    }
}
