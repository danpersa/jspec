package org.jspec.block;

import java.util.stream.IntStream;

/**
 * @author  dpersa
 */
@FunctionalInterface
public interface Block {

    void execute();
    
    default String description() {
        return "no description";
    }
    
    default Integer depth() {
        return 0;
    }
    
    default void setDepth(Integer depth) {
        
    }
    
    default String prefix() {
        return "";
    }
    
    default void print() {
        print(description());
    }

    default void print(String message) {
        IntStream.range(0, (depth() - 1) * 4).forEach(i -> System.out.print(" "));
        System.out.println(prefix() + " " + message);
    }
}
