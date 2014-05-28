package org.jspec.dsl;


import org.jspec.block.Block;
import org.jspec.block.story.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author  dpersa
 */
public class StoryDsl {

    private static ThreadLocal<Integer> depth = ThreadLocal.withInitial(() -> 0);

    public static Block scenario(final String description, final Block... blocks) {
        List<Block> blocksList = Arrays.asList(blocks);
        Scenario block = new Scenario(description, blocksList);
        return block;
    }

    public static Given given(final String description, final Block block) {
        return new Given(description, block);
    }

    public static And and(final String description, final Block block) {
        return new And(description, block);
    }

    public static When when(final String description, final Block block) {
        return new When(description, block);
    }

    public static Then then(final String description, final Block block) {
        return new Then(description, block);
    }
}
