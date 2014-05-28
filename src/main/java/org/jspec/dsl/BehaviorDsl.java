package org.jspec.dsl;


import org.jspec.block.Block;
import org.jspec.block.behavior.Before;
import org.jspec.block.behavior.Context;
import org.jspec.block.behavior.Describe;
import org.jspec.block.behavior.It;

import java.util.Arrays;
import java.util.List;

/**
 * @author  dpersa
 */
public class BehaviorDsl {

    private static ThreadLocal<Integer> depth = ThreadLocal.withInitial(() -> 0);

    public static Block describe(final String description, final Block... blocks) {
        List<Block> blocksList = Arrays.asList(blocks);
        depth.set(depth.get() + 1);
        Describe block = new Describe(description, depth.get(), blocksList);
        depth.set(depth.get() - 1);
        return block;
    }

    public static Block context(final String description, final Block... blocks) {
        List<Block> blocksList = Arrays.asList(blocks);
        depth.set(depth.get() + 1);
        Context block = new Context(description, depth.get(), blocksList);
        depth.set(depth.get() - 1);
        return block;
    }

    public static Before before(final Before before) {
        return before;
    }

    public static It it(final String description, final Block block) {
        return new It(description, block);
    }
}
