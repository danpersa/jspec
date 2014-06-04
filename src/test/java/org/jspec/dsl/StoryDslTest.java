package org.jspec.dsl;

import org.jspec.Test;

import java.util.Stack;


import static org.hamcrest.CoreMatchers.is;
import static org.jspec.dsl.StoryDsl.and;
import static org.jspec.dsl.StoryDsl.given;
import static org.jspec.dsl.StoryDsl.scenario;
import static org.jspec.dsl.StoryDsl.then;
import static org.jspec.dsl.StoryDsl.when;
import static org.jspec.Assert.assertThat;

/**
 * @author dpersa
 */
public class StoryDslTest {

    private Stack<Integer> stack;

    @Test
    public void testStack() {
        scenario("Stack push operation",
                given("a new stack", () -> {
                    stack = new Stack<>();
                }),
                when("a new element is pushed", () -> {
                    stack.push(10);
                }),
                then("the size of the stack should be one", () -> {
                    assertThat(stack.size(), is(1));
                }),
                and("the peek of the stack should be the pushed element", () -> {
                    assertThat(stack.peek(), is(10));
                })
        ).execute();
    }
}
